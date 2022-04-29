package taxi.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;

import javax.naming.AuthenticationException;
import java.util.Optional;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        logger.info("Method login was called by user with login: {}", login);
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isPresent() && driver.get().getPassword().equals(password)) {
            return driver.get();
        }
        logger.error("Driver failed to authorize with login = {}", login);
        throw new AuthenticationException("Username or password was incorrect!");
    }
}
