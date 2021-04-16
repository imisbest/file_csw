import com.csw.service.FileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;

/**
 * Created by Administrator on 2019/10/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class FileDelete {
    @Autowired
    private FileService fileService;


    /*   public static void main(String[] args,HttpServletRequest request) {
           FileService fileService = new FileServiceImpl();
           String realPath = request.getSession().getServletContext().getRealPath("/upDown");
           File1 ff = fileService.queryById("d510d696-b215-45e0-b3b9-772b25bccd22");
           String path = realPath + ff.getPath() + "/" + ff.getNname();
           System.out.println("path//:" + path);
           File aa = new File("path");
           aa.delete();
       }*/
    @Test
    public void testq() {
        String path = "D:\\身份证正面照片 - 副本.png";
        //System.out.println("path//:" + path.replace("\\", "\\\\"));
        //String patha=path.replace("\\", "//");
        File aa = new File(path);
        aa.delete();
    }


}
