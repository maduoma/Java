class While{
    public static void main(String[] args) {
        String googol = "1";
        int len = googol.length();
        while(len < 101){
            googol = googol + "0";
            len = googol.length();
        }
        System.out.println(googol);
        System.out.println(System.currentTimeMillis());
        System.out.println(len);
    }
}