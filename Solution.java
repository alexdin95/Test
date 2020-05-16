class Solution {
    public static boolean isUgly(int num) {boolean isUgly = false;
        while(num > 1){

            System.out.println(num);

            if(num % 2 == 0){
                num = num / 2;
                System.out.println(num);

            }else if(num % 3 == 0){
                num = num / 3;
                System.out.println(num);

            }else if(num % 5 == 0){
                num = num / 5;
                System.out.println(num);
            }else{
                break;
            }
        }

        if(num == 1){
            System.out.println("num is ugly");
            isUgly = true;
        }else if(num != 1 ){
            System.out.println("num is preeety!");
            isUgly = false;
        }
        return isUgly;

    }

    public static void main(String[] args) {
        isUgly(6);
        isUgly(8);
        isUgly(14);

    }

}