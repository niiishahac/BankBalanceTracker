package PACKAGE_NAME;

public class BankBalanceTracker {
  static int rangesum(int[] prefix,int l,int r){
        if(l==0)
            return prefix[r];
        return prefix[r]-prefix[l-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        enter the length of transaction
        System.out.println("length of transaction");
        int n=sc.nextInt();
        int[] transaction=new int[n];
        int[] prefix=new int[n];
//        input from user
        System.out.println("enter transaction number");
        for(int i=0;i<n;i++){
            transaction[i]=sc.nextInt();

        }
//        prefixsum calcution(running transaction)
        prefix[0]=transaction[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+transaction[i];
        }
//        display running balance
        System.out.println("running balance :");
        for(int i=0;i<n;i++){
            System.out.println("day:"+(i+1)+" "+prefix[i]);
        }
        int sum = rangesum(prefix, 1, 3);
        System.out.println("sum:"+sum);
    }
}
