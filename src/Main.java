import miniProject.dao.PostInterface;
import miniProject.dao.UserInterface;
import miniProject.dao.imp.PostInterfaceImp;
import miniProject.dao.imp.UserInterfaceImp;
import miniProject.module.Post;
import miniProject.module.User;

import java.util.*;

public class Main {
    static UserInterface userInterface = new UserInterfaceImp();
    static PostInterface postInterface = new PostInterfaceImp();

    public static void main(String[] args) {
//
//        ArrayList<String> arr = new ArrayList<>(List.of("cat", "dog", "horse", "dog"));
//        System.out.println(arr);
//
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = i + 1 ; j < arr.size(); j++) {
//                if (arr.get(i).equals(arr.get(j))){
//                    arr.remove(j);
//                }
//            }
//        }
//        System.out.println(arr);

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
            users.add(new User(
                    "user01@gmail.com",
                    "fullNameUser01",
                    false,
                    "password01",
                    "ID" + random.nextInt(10000),
                    new ArrayList<Post>()
            ));
            users.add(new User(
                  "user02@gmail.com",
                  "fullNameUser02",
                  true ,
                  "password02",
                  "ID" + random.nextInt(10000),
                    new ArrayList<Post>()
            ));
            users.add(new User(
                    "user03@gmail.com",
                    "fullNameUser03",
                    true ,
                    "password03",
                    "ID" + random.nextInt(10000),
                    new ArrayList<Post>()
            ));
            users.add(new User(
                    "user04@gmail.com",
                    "fullNameUser04",
                    true ,
                    "password04",
                    "ID" + random.nextInt(10000),
                    new ArrayList<Post>()
            ));
            users.add(new User(
                    "user02@gmail.com",
                    "fullNameUser05",
                    true ,
                    "password05",
                    "ID" + random.nextInt(10000),
                    new ArrayList<Post>()
            ));



            boolean isTrue = true;

            while(isTrue){

                firstMenu();

                int choice = scanner.nextInt();

                switch (choice){
                    case 1:

                        scanner.nextLine();
                        System.out.println("Введите ваше имя");
                        String fullName = scanner.nextLine();
                        System.out.println("Введите свое емайл");
                        String email = scanner.nextLine();
                        System.out.println("Введите свой пол ");
                        boolean gender = scanner.nextBoolean();
                        scanner.nextLine();
                        System.out.println("Придумайте пароль");
                        String password = scanner.nextLine();


                        ArrayList<User> newUsers =  userInterface.register(users,email, fullName, password, gender);
                        User user  = newUsers.get(newUsers.size() - 1);

                        menu();
                        int choiceOption = scanner.nextInt();
                        switch (choiceOption){
                            case 1:

                                System.out.println("Введите емайл");
                                scanner.nextLine();
                                String emailS = scanner.nextLine();


                                User foundedUserByEmail = userInterface.getUserByEmail(emailS, users);
                                System.out.println(foundedUserByEmail);
                                isTrue = false;


                                break;


                            case 2:


                                System.out.println(users);

                                isTrue = false;

                                break;



                            case 3:

                                System.out.println("Напишите описание ");
                                scanner.nextLine();
                                String description = scanner.nextLine();


                                ArrayList<Post> newPost =  postInterface.addPostToUser(user.getPosts(), description);
                                System.out.println(newPost);


                                isTrue = false;
                                break;


                            case 4 :

                                System.out.println("Введите айди поста");
                                scanner.nextLine();
                                String id = scanner.nextLine();

                                postInterface.deletePostById(user.getPosts(), id);
                                isTrue = false;

                                break;

                            case 5 :

                                System.out.println(user.getPosts());

                                isTrue = false;
                                break;

                            case 6:

                                break;

                        }


                        break;
                    case 2 :

                        scanner.nextLine();
                        System.out.println("Введите ваше имя");
                        String fullNameL = scanner.nextLine();
                        System.out.println("Введите свое емайл");
                        String emailL = scanner.nextLine();
                        System.out.println("Введите пароль");
                        String passwordL = scanner.nextLine();


                        User userLogin = userInterface.login(users, emailL, passwordL, fullNameL);


                        if (userLogin != null) {








                            menu();
                            int choiceActon = scanner.nextInt();

                            switch (choiceActon){
                                case 1:

                                    System.out.println("Введите емайл");
                                    scanner.nextLine();
                                    String emailS = scanner.nextLine();

                                    User foundedUserByEmail = userInterface.getUserByEmail(emailS, users);
                                    System.out.println(foundedUserByEmail);




                                    break;


                                case 2:


                                    System.out.println(users);


                                    break;



                                case 3:

                                    System.out.println("Напишите описание ");
                                    scanner.nextLine();
                                    String description = scanner.nextLine();


                                    ArrayList<Post> newPosts =  postInterface.addPostToUser(userLogin.getPosts(), description);
                                    System.out.println(newPosts);

                                    isTrue = false;
                                    break;


                                case 4 :

                                    System.out.println("Введите айди поста");
                                    scanner.nextLine();
                                    String id = scanner.nextLine();

                                    postInterface.deletePostById(userLogin.getPosts(), id);

                                    isTrue = false;
                                    break;

                                case 5 :

                                    System.out.println(userLogin.getPosts());
                                    isTrue = false;

                                    break;

                                case 6:

                                    break;

                            }







                        } else {
                            System.out.println("Вы что то не верно ввели");
                        }


                        break;
                }

            }















    }


    public static void firstMenu(){
        System.out.println("""
                1.Зарегистироваться
                2.Войти
                """);
    }

    public static void menu(){
        System.out.println("""
                1.Найти пользователей по емаил
                2.Показать всех пользоваталей
                3.Добавить пост
                4.Удалить пост
                5.Показать все свои посты
                6.Выход
                """);
    }

    public static void action (ArrayList<User> users, User user){
        Scanner scanner = new Scanner(System.in);




    }}