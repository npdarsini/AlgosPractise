package com.company.leetcode;

import java.util.Date;

public class CommentsSection {

    public static void main(String args[]) {

        User user = new User("Normal");
        Comment comment = new Comment(user, "Normal user comment");
        System.out.println(comment.toString());

        Moderator moderator = new Moderator("Moderator");
        Comment moderatorComment = new Comment(moderator, "Moderator", comment);

        System.out.println(moderatorComment.toString());

        User moderateUser = new Moderator("Moderate User");
        Comment comment1 = new Comment(moderateUser, "Test");

        System.out.println(comment1.toString());
        System.out.println(comment1.message);
        System.out.println(comment1.createdDate);
        System.out.println(moderateUser.getName() + " " + moderateUser.isLoggedIn);
        moderateUser.logIn();
        System.out.println(moderateUser.getName() + " " + moderateUser.isLoggedIn);
        System.out.println(user.canDelete(comment));
        System.out.println(moderator.canDelete(comment));
        System.out.println(moderateUser.canDelete(comment));

        System.out.println(moderator.equals(moderateUser));


    }


    public static class User {

        private boolean isLoggedIn = false;
        private Date lastLoggedIn = null;
        private String uName;

        public User(String name) {
            this.uName = name;
            setName(name);
        }

        public boolean isLoggedIn() {
            if (!isLoggedIn)
                isLoggedIn = true;
            return isLoggedIn;
        }

        public Date getLastLoggedInAt() {
            return lastLoggedIn;
        }

        public void logIn() {
            isLoggedIn();
            lastLoggedIn = new Date();
        }

        public void logOut() {
            isLoggedIn = false;
        }

        public String getName() {
            return this.uName;
        }

        public void setName(String name) {
            this.uName = name;
        }

        public boolean canEdit(Comment comment) {

            User user = comment.getAuthor();
            if (user.getName().equals(this.uName)) {
                return true;
            }
            return false;
        }

        public boolean canDelete(Comment comment) {
            return false;
        }
    }

    public static class Moderator extends User {

        private String name;

        public Moderator(String name) {
            super(name);
            //   this.name = name;
        }


        public boolean canDelete(Comment comment) {
            return true;
        }
    }

    public static class Admin extends User {
        private String name;

        public Admin(String name) {
            super(name);
            // this.name = name;
        }

        public boolean canEdit(Comment comment) {

            return true;
        }

        public boolean canDelete(Comment comment) {
            return true;
        }

    }

    public static class Comment {

        private User user;
        private String message;
        private Comment repliedTo = null;
        private Date createdDate;

        public Comment(User author, String message) {
            this.user = author;
            this.message = message;
            this.createdDate = new Date();
        }

        public Comment(User author, String message, Comment repliedTo) {
            this.user = author;
            this.message = message;
            this.repliedTo = repliedTo;
            this.createdDate = new Date();
        }

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Date getCreatedAt() {
            return this.createdDate;
        }

        public User getAuthor() {
            return this.user;
        }

        public Comment getRepliedTo() {
            return this.repliedTo;
        }

        public String toString() {
            return repliedTo == null ? this.message + " by " + this.user.getName() :
                    this.message + " by " + this.user.getName() + " (replied to " + this.repliedTo.user.getName() + ")";

        }
    }


}