package steps;

import context.ContextStore;
import io.cucumber.datatable.DataTable;
import models.CreateUserRequestModel;
import models.CreateUserResponseModel;
import models.UpdateUserRequestModel;
import models.UpdateUserResponseModel;
import org.junit.Assert;
import reqres.Reqres;
import io.cucumber.java.en.Given;
import retrofit2.Response;
import utils.Printer;
import utils.StringUtilities;

import java.util.Map;

public class ReqresAPISteps {

    Printer log = new Printer(Reqres.class);
    Reqres reqres = new Reqres();

    @Given("Create user with parameter:")
    public void createUser(DataTable table) {
        Map<String, String> tableMap = table.asMap();
        String name = tableMap.get("name");
        String job = tableMap.get("job");

        CreateUserRequestModel createUserRequestModel = new CreateUserRequestModel(name, job);
        CreateUserResponseModel userResponseModel = reqres.createUser(createUserRequestModel);
        ContextStore.put("userID", userResponseModel.getId());
        log.success("User created!");
    }

    @Given("Update user with parameters:")
    public void updateUser(DataTable table) {
        Map<String, String> tableMap = table.asMap();
        String name = tableMap.get("name");
        String job = tableMap.get("job");

        UpdateUserRequestModel updateUserRequestModel = new UpdateUserRequestModel(name, job);
        UpdateUserResponseModel updateUserResponseModel = reqres.updateUser(updateUserRequestModel);
        ContextStore.put("userUpdatedModel", updateUserResponseModel);
        log.success("User updated!");

        Assert.assertEquals("Name is not match",updateUserResponseModel.getName(), name);
        log.info("Name is verified" );
        Assert.assertEquals("Job is not match",updateUserResponseModel.getJob(), job);
        log.info("Job is verified" );
    }

    @Given("Delete user with id {}")
    public void deleteUser(String userID) {
        userID = StringUtilities.contextCheck(userID);
        reqres.deleteUser(userID);
        log.success("User deleted!");
    }

    @Given("Create and verify user with parameter after {} seconds:")
    public void createDelayedUser(String seconds, DataTable table) {
        Map<String, String> tableMap = table.asMap();
        String name = tableMap.get("name");
        String job = tableMap.get("job");

        CreateUserRequestModel createUserRequestModel = new CreateUserRequestModel(name, job);
        Response<CreateUserResponseModel> userResponseModel = reqres.createDelayedUser(createUserRequestModel,seconds);
        ContextStore.put("userID", userResponseModel.body().getId());
        log.success("User created!");

        Assert.assertEquals("Status code is not 201!", userResponseModel.code(), 201);
        log.success("Status code is verified!");
        Assert.assertEquals("Name is not match",userResponseModel.body().getName(), name);
        log.info("Name is verified" );
        Assert.assertEquals("Job is not match",userResponseModel.body().getJob(), job);
        log.info("Job is verified" );

    }

}
