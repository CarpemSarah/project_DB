public class AccountDAO {
    public void insert(AccountDTO dto) throws Exception {
        StringBuilder sql = new StringBuilder();

        sql.append("insert into account");
        sql.append("(accountName, accountPassword, phoneNumber, isAdmin)");
        sql.append("values (?, ?, ?, ?)");

        new AbstractDAO() {
            @Override
            public void query() throws Exception {
                pstmt = con.prepareStatement(sql.toString());
                pstmt.setString(1, dto.getAccountName());
                pstmt.setInt(2, dto.getAccountPassword());
                pstmt.setString(3, dto.getPhoneNumber());
                pstmt.setBoolean(4, dto.isAdmin());
                pstmt.executeUpdate();
            }
        }.execute();
    }
}
