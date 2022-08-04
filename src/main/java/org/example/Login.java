package org.example;

import org.example.domain.User;

import javax.swing.*;

public class Login extends JFrame {

    private int yValue = 20;
    private static final int boxHeight = 30;
    private static final int boxWidth = 200;

    public Login() {

        final Frame loginFrame = new Frame();
        JLabel email =  loginFrame.getLabel("Email:", 20, yValue, 70, 70);
        loginFrame.add(email);


        JTextField emailTB =  loginFrame.getTextField( 120, yValue + 20, boxWidth, boxHeight);
        loginFrame.add(emailTB);

        JLabel password =  loginFrame.getLabel("Password:", 20, shiftYValue(), 70, 70);
        loginFrame.add(password);

        JTextField passwordTB =  loginFrame.getTextField( 120,yValue + 20, boxWidth, boxHeight);
        loginFrame.add(passwordTB);

        JButton loginButton =  loginFrame.getButton( "Login" ,140,yValue + 100, boxWidth, boxHeight);
        loginFrame.add(loginButton);

        JButton registrationButton =  loginFrame.getButton( "Registration" ,140,yValue + 300, boxWidth, boxHeight);
        loginFrame.add(registrationButton);

        JButton homeButton =  loginFrame.getButton( "Home" ,140,yValue + 100, boxWidth, boxHeight);
        loginFrame.add(homeButton);

        homeButton.addActionListener(e -> {
            loginFrame.dispose();
            new welcome();

        });


        loginButton.addActionListener(e -> {




            LoginController loginController = new LoginController();

            String email2 = emailTB.getText();
            String password2 = passwordTB.getText();

            String userMail = loginController.validation(email2, password2).getEmail();
            loginFrame.dispose();
            User user = loginController.getUserByEmail(userMail);
            user.setEmail(userMail);
            //System.out.println(user.getUsertype());

                switch (user.getUsertype()) {
                    case "Admin":

                        loginFrame.dispose();
                        new AdminProfile(user);

                        break;
                    case "Donner":

                        loginFrame.dispose();
                        new DonnerProfile(user);

                        break;
                    default:

                        loginFrame.dispose();
                        new ClientProfile(user);
                        break;
                }


















  /*
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
            UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
           List<User> users = userDao.getAll();


            for (User user: users) {
                System.out.println(user.getName() + "  " + user.getEmail() + "  " + user.getNid() + "  " + user.getBirthdate() + "  " + user.getBloodgroup() + "  " + user.getPhone() + "  " + user.getAddress() + "  " + user.getUsertype() + "  " + user.getGender() + "  " + user.getPassword());
            }


            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
            UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
            List<User> users = userDao.getAll();

            */
/*

            for (User user: users) {

                System.out.println(user.getName() + "  " + user.getEmail() + "  " + user.getNid() + "  " + user.getBirthdate() + "  " + user.getBloodgroup() + "  " + user.getPhone() + "  " + user.getAddress() + "  " + user.getUsertype() + "  " + user.getGender() + "  " + user.getPassword());
            if (emailTB.getText().equals(user.getEmail()) && passwordTB.getText().equals(user.getPassword())){
//
//                if(user.getUsertype().equals("Admin"))
//
//                    loginFrame.dispose();
//                    new DonorDash(user);



                 switch (user.getUsertype()) {
                     case "Admin":

                         loginFrame.dispose();
                         new AdminProfile(user);

                         break;
                     case "Donner":

                         loginFrame.dispose();
                         new DonnerProfile(user);

                         break;
                    default:

                        loginFrame.dispose();
                        new ClientProfile(user);
                        break;
                }
                System.out.println( emailTB.getText() + "   " + user.getEmail() + "   "+passwordTB.getText() + "  "+user.getPassword());

            }
            else {

                JFrame jFrame = new JFrame("Loin");
                jFrame.setSize(200, 100);
                jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                jFrame.setVisible(true);
                LayoutManager layoutManager = new FlowLayout(FlowLayout.LEFT, 0, 20);
                jFrame.setLayout(layoutManager);


                final JLabel jLabel = new JLabel("\n \n \n   Login Failed!    \n \n \n");
                jFrame.add(jLabel);
                loginFrame.dispose();
                new Login();
            }
            }

*/

        });


      /*  registrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                loginFrame.dispose();
                new Reg();
            }
        });

*/

        registrationButton.addActionListener(e -> {
            loginFrame.dispose();
            new Reg();

        });

    }

    public int shiftYValue () {
        yValue = yValue + 40;
        return yValue;

    }
}