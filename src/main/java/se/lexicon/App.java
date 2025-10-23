package se.lexicon;


public class App {
    public static void main(String[] args) {

        int size = NameRepository.getSize();
        System.out.println(size);
        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan"});
        System.out.println(NameRepository.getSize());
        // call more methods as needed
        String findFullName = NameRepository.find("Erid Svensson");
        System.out.println(findFullName);

        boolean addFullName = NameRepository.add("Erik Svensson");
        System.out.println(addFullName);


    }
}
