package com.alura.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/contrl_de_stock?useTimeZone=true&serverTimeZone=UTC", "root", "W0l0w1tz19*.95");
		con.close();
	}

}
