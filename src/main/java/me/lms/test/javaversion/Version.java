package me.lms.test.javaversion;

public class Version {

    public static void main(String[] args) {

        // 텍스트 블록
        String query = """
                SELECT * FROM FOOD
                WHERE FOOD_NAME = '치킨'
                """;
        System.out.println(query);

        String textBlock17 = """
                "id": %d,
                "name": "%s",
                """.formatted(2, "juice");
        System.out.println(textBlock17);

        // record
        Item juice = new Item("juice", 1000);
        System.out.println(juice);


        if(juice instanceof Item) {
            System.out.println(juice.name());
        }

    }



}
