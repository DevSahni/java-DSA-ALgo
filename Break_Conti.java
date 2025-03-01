public class Break_Conti {
    public static void main(String[] args){
        int i=1;
        while(true){
            if (i==3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            if (i>=5) {
                break;
            }
        }
    }
}
