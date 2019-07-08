package com.w8.sunfch.springbootweb;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class SpringbootwebApplicationTests {

    @Autowired
    private JavaMailSender mailSender;

    @Test
    public void contextLoads() {
    }


    @Test
    public void test2() {

        log.info("==========================================");
    }

    @Test
    public void sendMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("634580924@qq.com");
        message.setTo("634580924@qq.com");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");
        mailSender.send(message);
    }

    /**
     * 打水印功能
     *
     * @return void
     * @date 2019/7/3 21:10
     */
    @Test
    public void WatermarkTest() {

        System.out.println("==========");
        InputStream is = null;
        OutputStream os = null;

        Integer degree = 45;

        Color color = new Color(0, 0, 0);
        try {
            // 1、源图片
            java.awt.Image srcImg = ImageIO.read(new File("d:\\aaa.jpeg"));
            BufferedImage buffImg = new BufferedImage(srcImg.getWidth(null), srcImg.getHeight(null), BufferedImage.TYPE_INT_RGB);
            // 2、得到画笔对象
            Graphics2D g = buffImg.createGraphics();
            // 3、设置对线段的锯齿状边缘处理
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g.drawImage(srcImg.getScaledInstance(srcImg.getWidth(null), srcImg.getHeight(null), java.awt.Image.SCALE_SMOOTH), 0, 0, null);
            // 4、设置水印旋转
            if (null != degree) {
                g.rotate(Math.toRadians(degree), buffImg.getWidth() / 2, buffImg.getHeight() / 2);
            }
            // 5、设置水印文字颜色
            g.setColor(color);
            // 6、设置水印文字Font
            g.setFont(new java.awt.Font("宋体", java.awt.Font.BOLD, buffImg.getHeight() / 6));
            // 7、设置水印文字透明度
            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, 0.15f));
            // 8、第一参数->设置的内容，后面两个参数->文字在图片上的坐标位置(x,y)
            g.drawString("孙风川", buffImg.getWidth() / 2, buffImg.getHeight() / 2);
            // 9、释放资源
            g.dispose();
            // 10、生成图片
            os = new FileOutputStream("d:\\test.jpg");
            ImageIO.write(buffImg, "jpg", os);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != is)
                    is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (null != os)
                    os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}