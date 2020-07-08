class Pyramid {
    public static void main(String[] args) {
        countBlocks(3); 
    }
    public static int countBlocks(int levels){
        int total = 0;
        for (int i = 0; i <= levels; i++) {
            total = total + (i*i);
        }
        System.out.print(total);
        return total; 
    }

}