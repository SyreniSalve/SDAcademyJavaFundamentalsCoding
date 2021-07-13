package Task19;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Mačernis","lietuvis");
        Author author2 = new Author("Puškinas", "rusas");
        Author author3 = new Author("Baudelaire","prancūzas");

        Poem[] poems = new Poem[]{
                new Poem(author1,30),
                new Poem(author2,100),
                new Poem(author3,25)
        };

        Poem result = Poem.longestPoem(poems);
        System.out.println(result.creator.getSurname());
    }
}
