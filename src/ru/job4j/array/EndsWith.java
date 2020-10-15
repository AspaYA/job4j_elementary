package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean rst = true;
//        if (post.length > word.length) {
//            return false;
//        }
        for (int i = 0; i < post.length; i++) {
            int wordFakeI = word.length - 1 - i;
            int postFakeI = post.length - 1 - i;
            if (post[postFakeI] != word[wordFakeI]) {
                rst = false;
                break;
            }
        }
        return  rst;
    }
}
