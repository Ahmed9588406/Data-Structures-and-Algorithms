import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Stack: (LIFO)Is a data structure that store object in sort of vertical tower
        Stack<String> games = new Stack<String>();
        // Adding Elements to the stack
        games.push("Batman");
        games.push("SuperMan");
        games.push("Doom");
        games.push("Minecraft");
        System.out.println(games);
        // Search for an element in the stack (not zero based)
        System.out.println(games.search("Batman"));
        // pop (remove the element whose in the top of the stack and can store it in a variable)
        games.pop();
        games.pop();
        System.out.println(games);
        // The element in the top of the stack
        System.out.println(games.peek());



        System.out.println(games.isEmpty());

        }
    }
