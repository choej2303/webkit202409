package org.comstudy.myweb.model;

public class Memo {
    /*
    CREATE TABLE MEMO(
    ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    TITLE VARCHAR(50) NOT NULL,
    CONTENT VARCHAR(50)
    )

    INSERT INTO MEMO(TITLE, CONTENT) VALUES("TEST", "test content"), ("TEST2", "test content2"), ("TEST3", "test content3");

    select * from memo;
    */
    private int id;
    private String title;
    private String content;

    public Memo() {
        this(0, "", "");
    }

    public Memo(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Memo(String s, String s1) {
        this(0, s, s1);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
