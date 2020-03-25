package homework16.service;



import homework16.models.User;

import javax.servlet.ServletContext;
import java.util.Optional;

public interface RegisterService {
    Optional<User> getUser(Long id);

    Optional<User> setUser(User user, ServletContext servletContext);
}
