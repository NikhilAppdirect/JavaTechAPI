
import java.sql.SQLException;

import com.nikhil.bean.Company;
import com.nikhil.bean.Parent;
import com.nikhil.domain.CompanyDomain;
import com.nikhil.service.CompanyService;

public class CompanyUtil 
	{
		public void companyUtil(Parent parentObj) throws SQLException
		{
			Company companyObj = parentObj.getPayload().getCompany();
			CompanyService companyServiceObj = new CompanyService();
			CompanyDomain companyDomainObj = new CompanyDomain();
			companyDomainObj.setUuid(companyObj.getUuid());
			companyDomainObj.setExternalId(companyObj.getExternalId());
			companyDomainObj.setName(companyObj.getName());
			companyDomainObj.setEmail(companyObj.getEmail());
			companyDomainObj.setPhoneNumber(companyObj.getPhoneNumber());
			companyDomainObj.setWebsite(companyObj.getWebsite());
			companyDomainObj.setCountry(companyObj.getCountry());
			companyServiceObj.companyService(companyDomainObj);
		}
	}
