package howto.inheritance.basic;

class MainClass {

    public static void main(String[] args) {
        Human firstKid = new Kid();


        //ANSWER:

        System.out.println("Do you still play with toys?\n" + ((Kid) firstKid).playsWithToys());

    }
}
