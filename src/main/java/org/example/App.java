package org.example;
import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

/*
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        userDao.create(new User("DEB", "deb6@aiub.edu", "11111111111111", "01-Jun-98", "AB-", "01900000000", "Chittagong", "Donner", "Male", "123"));
        List<User> users = userDao.getAll();

        for (User user: users) {
            System.out.println(user.getName() + "  " + user.getEmail() + "  " + user.getNid() + "  " + user.getBirthdate() + "  " + user.getBloodgroup() + "  " + user.getPhone() + "  " + user.getAddress() + "  " + user.getUsertype() + "  " + user.getGender() + "  " + user.getPassword());
        }

     */

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new welcome();
            }
        });

    }
}
