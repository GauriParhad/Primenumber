public class Primenumber {
    public static void main(String args[]){
        int i,x=0,flag=0;
        int num=9;
        x=num/2;
        if(num==0||num==1){
            System.out.println(num+" It is not prime number");
        }
        else{
            for(i=2;i<=x;i++){
                if(num%i==0){
                    System.out.println(num+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(num+" is prime number"); }
        }//end of else
    }
}
