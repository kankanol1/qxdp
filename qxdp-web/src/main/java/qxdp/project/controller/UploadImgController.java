package qxdp.project.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
//import qxdp.project.dao.UserEntity;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api/sys/img")
@Api(value = "图片", tags = "图片上传API")
public class UploadImgController {
    public String FILE_PATH ="E:/webstorm/afork/project_pom/前端代码/WEB代码/granlandbo/public/imgtest/";


    @ResponseBody
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public Map upload(@RequestParam("file") MultipartFile file) {
        Map<String,Object> map= new HashMap<>();
        if (file == null) {
            map.put("msg","upload false");
            return map;
        }
        try {
            String filename = file.getOriginalFilename();
            String extFileName = filename.substring(filename.lastIndexOf(".") + 1, filename.length());
//            System.out.println("文件名:\t" + filename);
//            System.out.println("后缀名:\t" + extFileName);

            //上传到本地,模拟上传到fastdfs文件服务器
            String filePath = FILE_PATH;
            String path = filePath + filename;
            //文件存储路径
            File dest = new File(path);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdir();
            }
            file.transferTo(dest);
            map.put("mes","success");
            map.put("path",path);
            return map;
        } catch (IOException e) {
            e.printStackTrace();
        }
        map.put("mes","upload false");

        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/getlist", method = RequestMethod.POST)
    public Map getlist (){
        Map<String,Object> map= new HashMap<>();
        String filepath = FILE_PATH;


        return map;
    }

    public void saveFile() {

    }
}
