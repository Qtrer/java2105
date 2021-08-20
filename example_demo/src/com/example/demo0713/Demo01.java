package com.example.demo0713;

import com.example.demo0713.utils.DBUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo01 {
    public static void main(String[] args) throws SQLException, IOException {
        String sql = "insert emoji values(null,?,?)";
        Blob blob = DBUtils.getConnection().createBlob();
        OutputStream os = blob.setBinaryStream(1);
        FileInputStream fis = new FileInputStream("C:/Users/Qtrer/Desktop/emoji_Alet (8).png");
        byte[] bytes = new byte[1024];
        int len = -1;
        while((len = fis.read(bytes)) != -1){
            os.write(bytes,0,len);
        }
        os.close();
        fis.close();
        PreparedStatement ps = DBUtils.getConnection().prepareStatement(sql);
        ps.setString(1, "Alet_dame");
        ps.setBlob(2, blob);
        ps.executeUpdate();

    }
}
