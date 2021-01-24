package io.netalk.gb.prototype.util.bcrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class Main {
    public static void main(String ...args) {
        if (args.length <= 0) {
            System.err.println("Error");
            System.exit(1);
        }
        String in = args[0];
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode(in));
    }
}