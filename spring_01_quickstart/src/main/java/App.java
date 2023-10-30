import com.itheima.dao.BookDao;
import com.itheima.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        /**
         * 传统方式创建
         * */
//        BookServiceImpl bookService = new BookServiceImpl();
//        bookService.save();

        /**
         * 采用Spring方式获取对象*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicattionContext.xml");
        System.out.println(ctx);

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        System.out.println(bookDao);

        BookServiceImpl bookService = (BookServiceImpl) ctx.getBean("bookServiceImpl");
        System.out.println(bookService);
        bookService.save();
    }
}
