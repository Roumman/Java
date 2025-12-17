class User {
    private final String name;
    private final String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class UserValidator {

    public boolean isValid(User user) {
        if (user == null) {
            return false;
        }

        String name = user.getName();
        String email = user.getEmail();

        if (name == null || name.trim().isEmpty()) {
            return false;
        }

        if (email == null || !email.contains("@")) {
            return false;
        }

        return true;
    }
}

class UserPrinter {

    public void print(User user) {
        System.out.println("User: " + user.getName() + ", Email: " + user.getEmail());
    }
}
