package nullability;

public class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder badgeInfo = new StringBuilder();

        if (id != null) {
            badgeInfo.append("[").append(id).append("] - ");
        }

        badgeInfo.append(name);

        badgeInfo.append(" - ").append(department != null ? department.toUpperCase() : "OWNER");

        return badgeInfo.toString();
    }
}
