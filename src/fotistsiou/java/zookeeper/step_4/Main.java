package fotistsiou.java.zookeeper.step_4;

import java.util.Scanner;

/**
 * Set the program for zoo staff
 * -----------------------------
 * Description
 * Now it's time to make our project user-friendly. In this final stage, you'll make your software ready for the zoo
 * staff to use. Your program should understand the habitat numbers, show the animals, and be able to work continuously
 * without having to be restarted.
 * -----------------------------
 * Objectives
 * Your tasks at this point:
 * 1. Your program should repeat the behavior from the previous stage, but now in a loop.
 * 2. Do not forget to include an exit opportunity: inputting exit should end the program.
 * 3. When the program is done running, it should print: See you later!
 */

public class Main {
    public static void main(String[] args) {
        String camel = """
            Switching on the camera in the camel habitat...
             ___.-''''-.
            /___  @    |
            ',,,,.     |         _.'''''''._
                 '     |        /           \\
                 |     \\    _.-'             \\
                 |      '.-'                  '-.
                 |                               ',
                 |                                '',
                  ',,-,                           ':;
                       ',,| ;,,                 ,' ;;
                          ! ; !'',,,',',,,,'!  ;   ;:
                         : ;  ! !       ! ! ;  ;   :;
                         ; ;   ! !      ! !  ; ;   ;,
                        ; ;    ! !     ! !   ; ;
                        ; ;    ! !    ! !     ; ;
                       ;,,      !,!   !,!     ;,;
                       /_I      L_I   L_I     /_I
            Look at that! Our little camel is sunbathing!""";

        String lion = """
            Switching on the camera in the lion habitat...
                                                           ,w.
                                                         ,YWMMw  ,M  ,
                                    _.---.._   __..---._.'MMMMMw,wMWmW,
                               _.-""        '''           YP"WMMMMMMMMMb,
                            .-' __.'                   .'     MMMMW^WMMMM;
                _,        .'.-'"; `,       /`     .--""      :MMM[==MWMW^;
             ,mM^"     ,-'.'   /   ;      ;      /   ,       MMMMb_wMW"  @\\
            ,MM:.    .'.-'   .'     ;     `\\    ;     `,     MMMMMMMW `"=./`-,
            WMMm__,-'.'     /      _.\\      F'''-+,,   ;_,_.dMMMMMMMM[,_ / `=_}
            "^MP__.-'    ,-' _.--""   `-,   ;       \\  ; ;MMMMMMMMMMW^``; __|
                       /   .'            ; ;         )  )`{  \\ `"^W^`,   \\  :
                      /  .'             /  (       .'  /     Ww._     `.  `"
                     /  Y,              `,  `-,=,_{   ;      MMMP`""-,  `-._.-,
                    (--, )                `,_ / `) \\/"")      ^"      `-, -;"\\:
            The lion is roaring!""";

        String deer = """
            Switching on the camera in the deer habitat...
               /|       |\\
            `__\\       //__'
               ||      ||
             \\__`\\     |'__/
               `_\\   //_'
               _.,:---;,._
               \\_:     :_/
                 |@. .@|
                 |     |
                 ,\\.-./ \\
                 ;;`-'   `---__________-----.-.
                 ;;;                         \\_\\
                 ';;;                         |
                  ;    |                      ;
                   \\   \\     \\        |      /
                    \\_, \\    /        \\     |\\
                      |';|  |,,,,,,,,/ \\    \\ \\_
                      |  |  |           \\   /   |
                      \\  \\  |           |  / \\  |
                       | || |           | |   | |
                       | || |           | |   | |
                       | || |           | |   | |
                       |_||_|           |_|   |_|
                      /_//_/           /_/   /_/
            Our 'Bambi' looks hungry. Let's go to feed it!""";

        String goose = """
            Switching on the camera in the goose habitat...
            
                                                _
                                            ,-"" "".
                                          ,'  ____  `.
                                        ,'  ,'    `.  `._
               (`.         _..--.._   ,'  ,'        \\    \\
              (`-.\\    .-""        ""'   /          (  d _b
             (`._  `-"" ,._             (            `-(   \\
             <_  `     (  <`<            \\              `-._\\
              <`-       (__< <           :
               (__        (_<_<          ;
                `------------------------------------------
            The goose is staring intently at you... Maybe it's time to change the channel?""";

        String bat = """
            Switching on the camera in the bat habitat...
            _________________               _________________
             ~-.              \\  |\\___/|  /              .-~
                 ~-.           \\ / o o \\ /           .-~
                    >           \\  W  //           <
                   /             /~---~\\             \\
                  /_            |       |            _\\
                     ~-.        |       |        .-~
                        ;        \\     /        i
                       /___      /\\   /\\      ___\\
                            ~-. /  \\_/  \\ .-~
                               V         V
            This bat looks like it's doing fine.""";

        String rabbit = """
            Switching on the camera in the rabbit habitat...
                     ,
                    /|      __
                   / |   ,-~ /
                  Y :|  //  /
                  | jj /( .^
                  >-"~"-v"
                 /       Y
                jo  o    |
               ( ~T~     j
                >._-' _./
               /   "~"  |
              Y     _,  |
             /| ;-"~ _  l
            / l/ ,-"~    \\
            \\//\\/      .- \\
             Y        /    Y
             l       I     !
             ]\\      _\\    /"\\
            (" ~----( ~   Y.  )
            It looks like we will soon have more rabbits!""";

        String[] habitats = {camel, lion, deer, goose, bat, rabbit};
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter the number of the habitat you would like to view: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int index = Integer.parseInt(input);
                if (index >= 0 && index < habitats.length) {
                    System.out.println(habitats[index]);
                } else {
                    System.out.println("Please enter a number between 0 and " + (habitats.length - 1) + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number between 0 and " + (habitats.length - 1) + ", or type 'exit' to quit.");
            }
        }
        System.out.println("See you later!");
        scanner.close();
    }
}
