package alugames.dados

import jakarta.persistence.EntityManager
import jakarta.persistence.EntityManagerFactory
import jakarta.persistence.Persistence
import org.example.alugames.modelo.Jogo
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

//class Banco {}
object Banco {
//    fun obterConexao(): Connection? {
//        return try {
//            DriverManager.getConnection("jdbc:mysql://localhost:3306/alugames", "root", "")
//        } catch (e: SQLException) {
//            e.printStackTrace()
//            null
//        }
//    }
    fun getEntityManager(): EntityManager {
        val factory: EntityManagerFactory = Persistence.createEntityManagerFactory("alugames")
        return factory.createEntityManager()
    }
}