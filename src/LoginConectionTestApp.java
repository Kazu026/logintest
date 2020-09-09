import com.sun.crypto.provider.PBKDF2HmacSHA1Factory;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.spec.KeySpec;

public class LoginConectionTestApp {
    private static LoginConectionTestApp theApp = null;
    private String version = "1.1";
    private String user = "";
    private String password = "";
    private String key = "7bears@futlfutl$7@7@9m@tOmb12014";
    private String ssalt = "Sessame7";

    public LoginConectionTestApp(){

        char[] strBytes = password.toCharArray();
        //byte[] strBytes = Encoding.UTF8.GetBytes(uvi.password);//完了
        byte[] salt = ssalt.getBytes();
        //byte[] salt = Encoding.UTF8.GetBytes(@"Sessame");//完了
        KeySpec spec = new PBEKeySpec(strBytes,salt,65536,128);





        SymmetricAlgorithm algo = new AesManaged();

        Rfc2898DeriveBytes rfc2898DeriveBytes = new Rfc2898DeriveBytes(@"7bears@futlfutl$7@7@9m@t0mb12014", salt);
        rfc2898DeriveBytes.IterationCount = 1;
        algo.Key = rfc2898DeriveBytes.GetBytes(algo.KeySize / 8);
        algo.IV = rfc2898DeriveBytes.GetBytes(algo.BlockSize / 8);
        ICryptoTransform crypto_transform = algo.CreateEncryptor();
        byte[] encrypted = crypto_transform.TransformFinalBlock(strBytes, 0, strBytes.Length);
        crypto_transform.Dispose();
        string base64password = Convert.ToBase64String(encrypted);//暗号化したパスワードを文字列へ
        var json= $@

    }


    public static void main(String args[]){
        theApp =new LoginConectionTestApp();
    }

}
