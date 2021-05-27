package Day29_nestedLoops;

public class NestedCount {
    public static void main(String[] args) {
        String word="java";
        for(int outer=0;outer<word.length(); outer++){
            int count=0;
            //System.out.println("outer: "+word.charAt(outer));
            for(int inner=0;inner<word.length(); inner++){
              //  System.out.println("inner: "+word.charAt(inner));
                if(word.charAt(outer)==word.charAt(inner)){
                    count++;
                }
            }
            System.out.println(word.charAt(outer)+ "="+count);
        }
    }
}
