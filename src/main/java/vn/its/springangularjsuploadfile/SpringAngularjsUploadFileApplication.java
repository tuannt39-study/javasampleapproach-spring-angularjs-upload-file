package vn.its.springangularjsuploadfile;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.its.springangularjsuploadfile.storage.StorageService;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringAngularjsUploadFileApplication implements CommandLineRunner {

	@Resource
	StorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularjsUploadFileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}
}
