import java.util.*;

class Question1 {
    public static void main(String[] args) {
        int vector_size = 15;
        char answer = 'Y';
        int i = 0;
        System.out.println("Vector size defined by user: " + vector_size);
        Vector vec = new Vector(vector_size);
        for (;i<vector_size; i++){
            vec.addElement("User input");
            System.out.println(vec.elementAt(i));
            System.out.println("Do you want to add more elements - Y or N?");
            if (answer == 'N'){
                break;
            }
            }
            if (i==vector_size){
                System.out.println("Vector is filled, you cannot add more elements.");
        }
    }
}