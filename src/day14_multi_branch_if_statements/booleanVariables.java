package day14_multi_branch_if_statements;

public class booleanVariables {
    public static void main(String[] args){
        System.out.println("Are you sure you 'd like to delete this file?");
        char selection = 'n';
        boolean answer;
        String result;
        if(selection=='y') {
            System.out.println("your file will be deleted");
            answer = true;
            result = "deleted";
        }else {
            System.out.println("File wont be deleted");
            answer = false;
            result = "not deleted";
        }
        System.out.println("Was file deleted? - "+answer+", "+result);
        }

    }

