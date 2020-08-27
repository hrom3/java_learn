package cycles;

class returnMetod {
    void printFirstSevenElements(int c){
        for (int i = 1; i <=c; i++){
            System.out.println((i));
            if(i == 7) {
//                return;
                break;
            }
        }
        System.out.println("I'm finish!");
    }
}
