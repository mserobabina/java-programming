package Day32_array_split;

public class CountingUsingSplit {
    public static void main(String[] args) {
        String catTypes = "bengal cat tabby cat persian cat no cat here";
      /*  int count=0;
        for(int i = 0;i<cats.length()-2;i++){
            if(cats.substring(i,i+3).equals("cat")){
                count++;
                System.out.println(count);


            }
        }

        */
        String[] catsArray = catTypes.split("cat");
        System.out.println("number of cats = "+(catsArray.length-1));

    }

}

