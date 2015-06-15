package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: jacobs
 * Date: 6/11/15
 * Time: 10:32 AM
 */
@RestController
public class PoopController
{
    @RequestMapping(method={RequestMethod.GET},value={"/poop"})
    public String getVersion(HttpServletResponse response)
    {
        return "poop";
    }
}
