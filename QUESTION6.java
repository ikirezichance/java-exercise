
package question6;

public class QUESTION6 {
    public static void array(){
int arrayA[]={1,2,3,4,5,9};
        int arrayB[]={4,6,7,8,9};
        for(int i=0;i<arrayA.length;i++){
        for(int j=0;j<arrayB.length;j++){
            if(arrayA[i]==arrayB[j]){
                System.out.println(arrayA[i]);
            }
        }
        }
}

    public static void main(String[] args) {
         array();
    }
    
}
