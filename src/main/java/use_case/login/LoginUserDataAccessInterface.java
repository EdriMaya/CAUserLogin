package use_case.login;

import entity.User;

/**
 * DAO for the Login Use Case.
 */
public interface LoginUserDataAccessInterface {

    /**
     * Checks if the given username exists.
     * @param username the username to look for
     * @return true if a user with the given username exists; false otherwise
     */
    boolean existsByName(String username);

    /**
     * Saves the user.
     * @param user the user to save
     */
    void save(User user);

    /**
     * Returns the user with the given username.
     * @param username the username to look up
     * @return the user with the given username
     */
    User get(String username);

    /**
     * Sets the current user's name.
     *
     * @param name the name of the user to set as the current user
     */
    void setCurrentUser(String name);

    /**
     * Returns the name of the current user.
     *
     * @return the name of the current user, or {@code null} if no user is set
     */
    String getCurrentUser();
}
