public class simulacao {
    

        public static void main(String[] args) {
            computador pc = new computador(4096,512,4, 17.0);
            sistemaOperacional so = new sistemaOperacional(pc, "0", "asus");

            programa p1 = new programa(2048, 512, 0, 5000);

            programa p2 = new programa(8192, 512, 0, 5000);

            programa p3 = new programa(2048, 1024, 0, 5000);

            so.executarPrograma(p1);
            so.executarPrograma(p2);
            so.executarPrograma(p3);
        
    }
}
