public class Main {
    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<Integer>(5);
        System.out.println("pop: " + s1.pop());
        System.out.println("push: " + s1.push(10));
        System.out.println("push: " + s1.push(20));
        System.out.println("push: " + s1.push(30));
        System.out.println("push: " + s1.push(40));
        System.out.println("push: " + s1.push(50));
        System.out.println("push: " + s1.push(60));
        System.out.println("pop: " + s1.pop());
        System.out.println("pop: " + s1.pop());
        System.out.println("pop: " + s1.pop());
        System.out.println("pop: " + s1.pop());
        System.out.println("pop: " + s1.pop());
        System.out.println("pop: " + s1.pop());




        /*Pair<Integer, Student> p1 = new Pair<Integer, Student>(
                16,
                new Student(16, "Vishal")
        );
        System.out.println(p1.getKey());
        System.out.println(p1.getVal());

        Pair<Character, Integer> p2 = new Pair<>('A', 65);
        System.out.println(p2.getKey());
        System.out.println(p2.getVal());

        Pair p3 = new Pair("", "");*/


        /*Holder<String> h1 = new Holder<String>("BitCode");
        String str = h1.getData();
        System.out.println("length = " + str.length());
        //h1.setData(100); //will not work
        h1.setData("Vishal Jagtap");
        System.out.println(h1.getData().length());

        Holder<Integer> h2 = new Holder<Integer>(100);
        Integer iobj = h2.getData();
        System.out.println("int val = " + iobj.intValue());
        //h2.setData("Vishal"); //will not work
        h2.setData(200);
        System.out.println("int val = " + h2.getData().intValue());*/


        /*
        Holder h1 = new Holder("BitCode");
        Object obj = h1.getData();
        String str = (String) obj;
        System.out.println("length = " + str.length());

        Holder holderInt = new Holder(100);
        Integer iObj = (Integer) holderInt.getData();
        System.out.println("int val = " + iObj.intValue());

        h1.setData(200);
        holderInt.setData("Vishal");

        str = (String) h1.getData();
        System.out.println("length = " + str.length());
        iObj = (Integer) holderInt.getData();
        System.out.println("int val = " + iObj.intValue());
        */

    }
}
