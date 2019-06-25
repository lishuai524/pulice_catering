package com.huayu.JC_HY_DD.asset_information.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/mt")
public class Test {
    @Autowired
    HttpServletRequest request; //这里可以获取到request

    private String str(){
        return  request.getSession().getServletContext().getRealPath("");
    }

    public static void main(String[] args) throws Exception {
//        ObjectMapper mapper = new ObjectMapper();
//        Queue_state q = new Queue_state();
//        q.setQsid(1);
//        q.setName("555");
//        String s = mapper.writeValueAsString(q);
//        String text = s;
//        int width = 300;
//        int height = 300;
//        // 二维码的图片格式
//        String format = "jpeg";
//        Hashtable hints = new Hashtable();
//        // 内容所使用编码
//        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
//        BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height, hints);
//        // 生成二维码
//        File outputFile = new File("E:/项目/pulice_catering/src/main/webapp/img/" + File.separator + "new.jpeg");
//        MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);

        Test test = new Test();

        String s = test.str();

        System.out.println(s);
    }
}

