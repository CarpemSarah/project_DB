public class AccountMain {
    public static void main(String[] args){
        AccountDAO dao = new AccountDAO();
        AccountDTO dto = new AccountDTO(1, 1234, "hsr1203", "01053357978", true);
        try {
            dao.insert(dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
