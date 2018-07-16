package cn.jsxwsl.maven.ssm.utlis;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import com.swetake.util.Qrcode;

public class QrCoreUtil {
    
    
      
    /** 
     * 生成二维码 
     * @param content 存储内容 
     * @return 
     */  
    public static BufferedImage getQrCode(String content) {  
        BufferedImage bufImg = null;  
        try {  
        	int size = 7;
            Qrcode qrcodeHandler = new Qrcode();  
            qrcodeHandler.setQrcodeErrorCorrect('M');  
            qrcodeHandler.setQrcodeEncodeMode('B');  
            qrcodeHandler.setQrcodeVersion(size);  
            byte[] contentBytes = content.getBytes("utf-8");  
            int imgSize = 67 + 12 * (size - 1);  
            bufImg = new BufferedImage(imgSize, imgSize, BufferedImage.TYPE_INT_RGB);  
            Graphics2D gs = bufImg.createGraphics();  
            gs.setBackground(Color.WHITE);  
            gs.setColor(Color.BLACK);  
            gs.clearRect(0, 0, imgSize, imgSize);  
            int pixoff = 2;  
            if (contentBytes.length > 0 && contentBytes.length < 800) {  
                boolean[][] codeOut = qrcodeHandler.calQrcode(contentBytes);  
                for (int i = 0; i < codeOut.length; i++) {  
                    for (int j = 0; j < codeOut.length; j++) {  
                        if (codeOut[j][i]) {  
                            gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);  
                        }  
                    }  
                }  
            }
            gs.dispose();  
            bufImg.flush();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return bufImg;  
    }  

}
