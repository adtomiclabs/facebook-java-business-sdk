/**
 * Copyright (c) 2015-present, Facebook, Inc. All rights reserved.
 *
 * You are hereby granted a non-exclusive, worldwide, royalty-free license to
 * use, copy, modify, and distribute this software in source code or binary
 * form for use in connection with the web services and APIs provided by
 * Facebook.
 *
 * As with any software that integrates with the Facebook platform, your use
 * of this software is subject to the Facebook Developer Principles and
 * Policies [http://developers.facebook.com/policy/]. This copyright notice
 * shall be included in all copies or substantial portions of the software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 */

package com.facebook.ads.sdk;

import java.io.File;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Function;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import com.facebook.ads.sdk.APIException.MalformedResponseException;

/**
 * This class is auto-generated.
 *
 * For any issues or feature requests related to this class, please let us know
 * on github and we'll fix in our codegen framework. We'll not be able to accept
 * pull request for this class.
 *
 */
public class User extends APINode {
  @SerializedName("about")
  private String mAbout = null;
  @SerializedName("address")
  private Location mAddress = null;
  @SerializedName("admin_notes")
  private List<PageAdminNote> mAdminNotes = null;
  @SerializedName("age_range")
  private AgeRange mAgeRange = null;
  @SerializedName("birthday")
  private String mBirthday = null;
  @SerializedName("can_review_measurement_request")
  private Boolean mCanReviewMeasurementRequest = null;
  @SerializedName("cover")
  private UserCoverPhoto mCover = null;
  @SerializedName("currency")
  private Currency mCurrency = null;
  @SerializedName("devices")
  private List<UserDevice> mDevices = null;
  @SerializedName("education")
  private List<Object> mEducation = null;
  @SerializedName("email")
  private String mEmail = null;
  @SerializedName("employee_number")
  private String mEmployeeNumber = null;
  @SerializedName("favorite_athletes")
  private List<Experience> mFavoriteAthletes = null;
  @SerializedName("favorite_teams")
  private List<Experience> mFavoriteTeams = null;
  @SerializedName("first_name")
  private String mFirstName = null;
  @SerializedName("gender")
  private String mGender = null;
  @SerializedName("hometown")
  private Page mHometown = null;
  @SerializedName("id")
  private String mId = null;
  @SerializedName("inspirational_people")
  private List<Experience> mInspirationalPeople = null;
  @SerializedName("install_type")
  private String mInstallType = null;
  @SerializedName("installed")
  private Boolean mInstalled = null;
  @SerializedName("interested_in")
  private List<String> mInterestedIn = null;
  @SerializedName("is_famedeeplinkinguser")
  private Boolean mIsFamedeeplinkinguser = null;
  @SerializedName("is_shared_login")
  private Boolean mIsSharedLogin = null;
  @SerializedName("is_verified")
  private Boolean mIsVerified = null;
  @SerializedName("labels")
  private List<PageLabel> mLabels = null;
  @SerializedName("languages")
  private List<Experience> mLanguages = null;
  @SerializedName("last_name")
  private String mLastName = null;
  @SerializedName("link")
  private String mLink = null;
  @SerializedName("local_news_megaphone_dismiss_status")
  private Boolean mLocalNewsMegaphoneDismissStatus = null;
  @SerializedName("local_news_subscription_status")
  private Boolean mLocalNewsSubscriptionStatus = null;
  @SerializedName("locale")
  private String mLocale = null;
  @SerializedName("location")
  private Page mLocation = null;
  @SerializedName("meeting_for")
  private List<String> mMeetingFor = null;
  @SerializedName("middle_name")
  private String mMiddleName = null;
  @SerializedName("name")
  private String mName = null;
  @SerializedName("name_format")
  private String mNameFormat = null;
  @SerializedName("payment_pricepoints")
  private PaymentPricepoints mPaymentPricepoints = null;
  @SerializedName("political")
  private String mPolitical = null;
  @SerializedName("profile_pic")
  private String mProfilePic = null;
  @SerializedName("public_key")
  private String mPublicKey = null;
  @SerializedName("quotes")
  private String mQuotes = null;
  @SerializedName("relationship_status")
  private String mRelationshipStatus = null;
  @SerializedName("religion")
  private String mReligion = null;
  @SerializedName("security_settings")
  private SecuritySettings mSecuritySettings = null;
  @SerializedName("shared_login_upgrade_required_by")
  private String mSharedLoginUpgradeRequiredBy = null;
  @SerializedName("short_name")
  private String mShortName = null;
  @SerializedName("significant_other")
  private User mSignificantOther = null;
  @SerializedName("sports")
  private List<Experience> mSports = null;
  @SerializedName("test_group")
  private Long mTestGroup = null;
  @SerializedName("third_party_id")
  private String mThirdPartyId = null;
  @SerializedName("timezone")
  private Double mTimezone = null;
  @SerializedName("token_for_business")
  private String mTokenForBusiness = null;
  @SerializedName("updated_time")
  private String mUpdatedTime = null;
  @SerializedName("verified")
  private Boolean mVerified = null;
  @SerializedName("video_upload_limits")
  private VideoUploadLimits mVideoUploadLimits = null;
  @SerializedName("viewer_can_send_gift")
  private Boolean mViewerCanSendGift = null;
  @SerializedName("website")
  private String mWebsite = null;
  @SerializedName("work")
  private List<Object> mWork = null;
  protected static Gson gson = null;

  User() {
  }

  public User(Long id, APIContext context) {
    this(id.toString(), context);
  }

  public User(String id, APIContext context) {
    this.mId = id;

    this.context = context;
  }

  public User fetch() throws APIException{
    User newInstance = fetchById(this.getPrefixedId().toString(), this.context);
    this.copyFrom(newInstance);
    return this;
  }

  public static User fetchById(Long id, APIContext context) throws APIException {
    return fetchById(id.toString(), context);
  }

  public static ListenableFuture<User> fetchByIdAsync(Long id, APIContext context) throws APIException {
    return fetchByIdAsync(id.toString(), context);
  }

  public static User fetchById(String id, APIContext context) throws APIException {
    return
      new APIRequestGet(id, context)
      .requestAllFields()
      .execute();
  }

  public static ListenableFuture<User> fetchByIdAsync(String id, APIContext context) throws APIException {
    return
      new APIRequestGet(id, context)
      .requestAllFields()
      .executeAsync();
  }

  public static APINodeList<User> fetchByIds(List<String> ids, List<String> fields, APIContext context) throws APIException {
    return (APINodeList<User>)(
      new APIRequest<User>(context, "", "/", "GET", User.getParser())
        .setParam("ids", APIRequest.joinStringList(ids))
        .requestFields(fields)
        .execute()
    );
  }

  public static ListenableFuture<APINodeList<User>> fetchByIdsAsync(List<String> ids, List<String> fields, APIContext context) throws APIException {
    return
      new APIRequest(context, "", "/", "GET", User.getParser())
        .setParam("ids", APIRequest.joinStringList(ids))
        .requestFields(fields)
        .executeAsyncBase();
  }

  private String getPrefixedId() {
    return getId();
  }

  public String getId() {
    return getFieldId().toString();
  }
  public static User loadJSON(String json, APIContext context, String header) {
    User user = getGson().fromJson(json, User.class);
    if (context.isDebug()) {
      JsonParser parser = new JsonParser();
      JsonElement o1 = parser.parse(json);
      JsonElement o2 = parser.parse(user.toString());
      if (o1.getAsJsonObject().get("__fb_trace_id__") != null) {
        o2.getAsJsonObject().add("__fb_trace_id__", o1.getAsJsonObject().get("__fb_trace_id__"));
      }
      if (!o1.equals(o2)) {
        context.log("[Warning] When parsing response, object is not consistent with JSON:");
        context.log("[JSON]" + o1);
        context.log("[Object]" + o2);
      };
    }
    user.context = context;
    user.rawValue = json;
    user.header = header;
    return user;
  }

  public static APINodeList<User> parseResponse(String json, APIContext context, APIRequest request, String header) throws MalformedResponseException {
    APINodeList<User> users = new APINodeList<User>(request, json, header);
    JsonArray arr;
    JsonObject obj;
    JsonParser parser = new JsonParser();
    Exception exception = null;
    try{
      JsonElement result = parser.parse(json);
      if (result.isJsonArray()) {
        // First, check if it's a pure JSON Array
        arr = result.getAsJsonArray();
        for (int i = 0; i < arr.size(); i++) {
          users.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
        };
        return users;
      } else if (result.isJsonObject()) {
        obj = result.getAsJsonObject();
        if (obj.has("data")) {
          if (obj.has("paging")) {
            JsonObject paging = obj.get("paging").getAsJsonObject();
            if (paging.has("cursors")) {
                JsonObject cursors = paging.get("cursors").getAsJsonObject();
                String before = cursors.has("before") ? cursors.get("before").getAsString() : null;
                String after = cursors.has("after") ? cursors.get("after").getAsString() : null;
                users.setCursors(before, after);
            }
            String previous = paging.has("previous") ? paging.get("previous").getAsString() : null;
            String next = paging.has("next") ? paging.get("next").getAsString() : null;
            users.setPaging(previous, next);
            if (context.hasAppSecret()) {
              users.setAppSecret(context.getAppSecretProof());
            }
          }
          if (obj.get("data").isJsonArray()) {
            // Second, check if it's a JSON array with "data"
            arr = obj.get("data").getAsJsonArray();
            for (int i = 0; i < arr.size(); i++) {
              users.add(loadJSON(arr.get(i).getAsJsonObject().toString(), context, header));
            };
          } else if (obj.get("data").isJsonObject()) {
            // Third, check if it's a JSON object with "data"
            obj = obj.get("data").getAsJsonObject();
            boolean isRedownload = false;
            for (String s : new String[]{"campaigns", "adsets", "ads"}) {
              if (obj.has(s)) {
                isRedownload = true;
                obj = obj.getAsJsonObject(s);
                for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
                  users.add(loadJSON(entry.getValue().toString(), context, header));
                }
                break;
              }
            }
            if (!isRedownload) {
              users.add(loadJSON(obj.toString(), context, header));
            }
          }
          return users;
        } else if (obj.has("images")) {
          // Fourth, check if it's a map of image objects
          obj = obj.get("images").getAsJsonObject();
          for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
              users.add(loadJSON(entry.getValue().toString(), context, header));
          }
          return users;
        } else {
          // Fifth, check if it's an array of objects indexed by id
          boolean isIdIndexedArray = true;
          for (Map.Entry entry : obj.entrySet()) {
            String key = (String) entry.getKey();
            if (key.equals("__fb_trace_id__")) {
              continue;
            }
            JsonElement value = (JsonElement) entry.getValue();
            if (
              value != null &&
              value.isJsonObject() &&
              value.getAsJsonObject().has("id") &&
              value.getAsJsonObject().get("id") != null &&
              value.getAsJsonObject().get("id").getAsString().equals(key)
            ) {
              users.add(loadJSON(value.toString(), context, header));
            } else {
              isIdIndexedArray = false;
              break;
            }
          }
          if (isIdIndexedArray) {
            return users;
          }

          // Sixth, check if it's pure JsonObject
          users.clear();
          users.add(loadJSON(json, context, header));
          return users;
        }
      }
    } catch (Exception e) {
      exception = e;
    }
    throw new MalformedResponseException(
      "Invalid response string: " + json,
      exception
    );
  }

  @Override
  public APIContext getContext() {
    return context;
  }

  @Override
  public void setContext(APIContext context) {
    this.context = context;
  }

  @Override
  public String toString() {
    return getGson().toJson(this);
  }

  public APIRequestCreateAccessToken createAccessToken() {
    return new APIRequestCreateAccessToken(this.getPrefixedId().toString(), context);
  }

  public APIRequestDeleteAccessTokens deleteAccessTokens() {
    return new APIRequestDeleteAccessTokens(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAccounts getAccounts() {
    return new APIRequestGetAccounts(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAccount createAccount() {
    return new APIRequestCreateAccount(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateAchievement createAchievement() {
    return new APIRequestCreateAchievement(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdStudies getAdStudies() {
    return new APIRequestGetAdStudies(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAdAccounts getAdAccounts() {
    return new APIRequestGetAdAccounts(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAlbums getAlbums() {
    return new APIRequestGetAlbums(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateApplication createApplication() {
    return new APIRequestCreateApplication(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAppRequestFormerRecipients getAppRequestFormerRecipients() {
    return new APIRequestGetAppRequestFormerRecipients(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAppRequests getAppRequests() {
    return new APIRequestGetAppRequests(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAssignedAdAccounts getAssignedAdAccounts() {
    return new APIRequestGetAssignedAdAccounts(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAssignedPages getAssignedPages() {
    return new APIRequestGetAssignedPages(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetAssignedProductCatalogs getAssignedProductCatalogs() {
    return new APIRequestGetAssignedProductCatalogs(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetBooks getBooks() {
    return new APIRequestGetBooks(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetBusinessUsers getBusinessUsers() {
    return new APIRequestGetBusinessUsers(this.getPrefixedId().toString(), context);
  }

  public APIRequestDeleteBusinesses deleteBusinesses() {
    return new APIRequestDeleteBusinesses(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetBusinesses getBusinesses() {
    return new APIRequestGetBusinesses(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetConversations getConversations() {
    return new APIRequestGetConversations(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetEvents getEvents() {
    return new APIRequestGetEvents(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetFamily getFamily() {
    return new APIRequestGetFamily(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetFavoriteRequests getFavoriteRequests() {
    return new APIRequestGetFavoriteRequests(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateFeed createFeed() {
    return new APIRequestCreateFeed(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetFriendLists getFriendLists() {
    return new APIRequestGetFriendLists(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetFriends getFriends() {
    return new APIRequestGetFriends(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateGameItem createGameItem() {
    return new APIRequestCreateGameItem(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateGameTime createGameTime() {
    return new APIRequestCreateGameTime(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetGames getGames() {
    return new APIRequestGetGames(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateGamesAchieve createGamesAchieve() {
    return new APIRequestCreateGamesAchieve(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateGamesStat createGamesStat() {
    return new APIRequestCreateGamesStat(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateGamesPlay createGamesPlay() {
    return new APIRequestCreateGamesPlay(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetGroups getGroups() {
    return new APIRequestGetGroups(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetIdsForApps getIdsForApps() {
    return new APIRequestGetIdsForApps(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetIdsForBusiness getIdsForBusiness() {
    return new APIRequestGetIdsForBusiness(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetIdsForPages getIdsForPages() {
    return new APIRequestGetIdsForPages(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetLikes getLikes() {
    return new APIRequestGetLikes(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetLiveEncoders getLiveEncoders() {
    return new APIRequestGetLiveEncoders(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateLiveEncoder createLiveEncoder() {
    return new APIRequestCreateLiveEncoder(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetLiveVideos getLiveVideos() {
    return new APIRequestGetLiveVideos(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateLiveVideo createLiveVideo() {
    return new APIRequestCreateLiveVideo(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateMfsAccountPinReset createMfsAccountPinReset() {
    return new APIRequestCreateMfsAccountPinReset(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateMomentsLinkInviteConvert createMomentsLinkInviteConvert() {
    return new APIRequestCreateMomentsLinkInviteConvert(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateMomentsUniversalLinkInvite createMomentsUniversalLinkInvite() {
    return new APIRequestCreateMomentsUniversalLinkInvite(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetMovies getMovies() {
    return new APIRequestGetMovies(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetMusic getMusic() {
    return new APIRequestGetMusic(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateNotification createNotification() {
    return new APIRequestCreateNotification(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreatePaymentCurrency createPaymentCurrency() {
    return new APIRequestCreatePaymentCurrency(this.getPrefixedId().toString(), context);
  }

  public APIRequestDeletePermissions deletePermissions() {
    return new APIRequestDeletePermissions(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetPermissions getPermissions() {
    return new APIRequestGetPermissions(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetPersonalAdAccounts getPersonalAdAccounts() {
    return new APIRequestGetPersonalAdAccounts(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetPhotos getPhotos() {
    return new APIRequestGetPhotos(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreatePhoto createPhoto() {
    return new APIRequestCreatePhoto(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetPicture getPicture() {
    return new APIRequestGetPicture(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreatePlace createPlace() {
    return new APIRequestCreatePlace(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetPromotableDomains getPromotableDomains() {
    return new APIRequestGetPromotableDomains(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetPromotableEvents getPromotableEvents() {
    return new APIRequestGetPromotableEvents(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetRequestHistory getRequestHistory() {
    return new APIRequestGetRequestHistory(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateScreenName createScreenName() {
    return new APIRequestCreateScreenName(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateStagingResource createStagingResource() {
    return new APIRequestCreateStagingResource(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetTaggableFriends getTaggableFriends() {
    return new APIRequestGetTaggableFriends(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetTelevision getTelevision() {
    return new APIRequestGetTelevision(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetThreads getThreads() {
    return new APIRequestGetThreads(this.getPrefixedId().toString(), context);
  }

  public APIRequestGetVideos getVideos() {
    return new APIRequestGetVideos(this.getPrefixedId().toString(), context);
  }

  public APIRequestCreateVideo createVideo() {
    return new APIRequestCreateVideo(this.getPrefixedId().toString(), context);
  }

  public APIRequestDelete delete() {
    return new APIRequestDelete(this.getPrefixedId().toString(), context);
  }

  public APIRequestGet get() {
    return new APIRequestGet(this.getPrefixedId().toString(), context);
  }

  public APIRequestUpdate update() {
    return new APIRequestUpdate(this.getPrefixedId().toString(), context);
  }


  public String getFieldAbout() {
    return mAbout;
  }

  public Location getFieldAddress() {
    return mAddress;
  }

  public List<PageAdminNote> getFieldAdminNotes() {
    return mAdminNotes;
  }

  public AgeRange getFieldAgeRange() {
    return mAgeRange;
  }

  public String getFieldBirthday() {
    return mBirthday;
  }

  public Boolean getFieldCanReviewMeasurementRequest() {
    return mCanReviewMeasurementRequest;
  }

  public UserCoverPhoto getFieldCover() {
    return mCover;
  }

  public Currency getFieldCurrency() {
    return mCurrency;
  }

  public List<UserDevice> getFieldDevices() {
    return mDevices;
  }

  public List<Object> getFieldEducation() {
    return mEducation;
  }

  public String getFieldEmail() {
    return mEmail;
  }

  public String getFieldEmployeeNumber() {
    return mEmployeeNumber;
  }

  public List<Experience> getFieldFavoriteAthletes() {
    return mFavoriteAthletes;
  }

  public List<Experience> getFieldFavoriteTeams() {
    return mFavoriteTeams;
  }

  public String getFieldFirstName() {
    return mFirstName;
  }

  public String getFieldGender() {
    return mGender;
  }

  public Page getFieldHometown() {
    if (mHometown != null) {
      mHometown.context = getContext();
    }
    return mHometown;
  }

  public String getFieldId() {
    return mId;
  }

  public List<Experience> getFieldInspirationalPeople() {
    return mInspirationalPeople;
  }

  public String getFieldInstallType() {
    return mInstallType;
  }

  public Boolean getFieldInstalled() {
    return mInstalled;
  }

  public List<String> getFieldInterestedIn() {
    return mInterestedIn;
  }

  public Boolean getFieldIsFamedeeplinkinguser() {
    return mIsFamedeeplinkinguser;
  }

  public Boolean getFieldIsSharedLogin() {
    return mIsSharedLogin;
  }

  public Boolean getFieldIsVerified() {
    return mIsVerified;
  }

  public List<PageLabel> getFieldLabels() {
    return mLabels;
  }

  public List<Experience> getFieldLanguages() {
    return mLanguages;
  }

  public String getFieldLastName() {
    return mLastName;
  }

  public String getFieldLink() {
    return mLink;
  }

  public Boolean getFieldLocalNewsMegaphoneDismissStatus() {
    return mLocalNewsMegaphoneDismissStatus;
  }

  public Boolean getFieldLocalNewsSubscriptionStatus() {
    return mLocalNewsSubscriptionStatus;
  }

  public String getFieldLocale() {
    return mLocale;
  }

  public Page getFieldLocation() {
    if (mLocation != null) {
      mLocation.context = getContext();
    }
    return mLocation;
  }

  public List<String> getFieldMeetingFor() {
    return mMeetingFor;
  }

  public String getFieldMiddleName() {
    return mMiddleName;
  }

  public String getFieldName() {
    return mName;
  }

  public String getFieldNameFormat() {
    return mNameFormat;
  }

  public PaymentPricepoints getFieldPaymentPricepoints() {
    return mPaymentPricepoints;
  }

  public String getFieldPolitical() {
    return mPolitical;
  }

  public String getFieldProfilePic() {
    return mProfilePic;
  }

  public String getFieldPublicKey() {
    return mPublicKey;
  }

  public String getFieldQuotes() {
    return mQuotes;
  }

  public String getFieldRelationshipStatus() {
    return mRelationshipStatus;
  }

  public String getFieldReligion() {
    return mReligion;
  }

  public SecuritySettings getFieldSecuritySettings() {
    return mSecuritySettings;
  }

  public String getFieldSharedLoginUpgradeRequiredBy() {
    return mSharedLoginUpgradeRequiredBy;
  }

  public String getFieldShortName() {
    return mShortName;
  }

  public User getFieldSignificantOther() {
    if (mSignificantOther != null) {
      mSignificantOther.context = getContext();
    }
    return mSignificantOther;
  }

  public List<Experience> getFieldSports() {
    return mSports;
  }

  public Long getFieldTestGroup() {
    return mTestGroup;
  }

  public String getFieldThirdPartyId() {
    return mThirdPartyId;
  }

  public Double getFieldTimezone() {
    return mTimezone;
  }

  public String getFieldTokenForBusiness() {
    return mTokenForBusiness;
  }

  public String getFieldUpdatedTime() {
    return mUpdatedTime;
  }

  public Boolean getFieldVerified() {
    return mVerified;
  }

  public VideoUploadLimits getFieldVideoUploadLimits() {
    return mVideoUploadLimits;
  }

  public Boolean getFieldViewerCanSendGift() {
    return mViewerCanSendGift;
  }

  public String getFieldWebsite() {
    return mWebsite;
  }

  public List<Object> getFieldWork() {
    return mWork;
  }



  public static class APIRequestCreateAccessToken extends APIRequest<User> {

    User lastResponse = null;
    @Override
    public User getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "business_app",
      "page_id",
      "scope",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public User parseResponse(String response, String header) throws APIException {
      return User.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public User execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public User execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<User> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<User> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, User>() {
           public User apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAccessToken.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAccessToken(String nodeId, APIContext context) {
      super(context, nodeId, "/access_tokens", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAccessToken setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAccessToken setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAccessToken setBusinessApp (Long businessApp) {
      this.setParam("business_app", businessApp);
      return this;
    }
    public APIRequestCreateAccessToken setBusinessApp (String businessApp) {
      this.setParam("business_app", businessApp);
      return this;
    }

    public APIRequestCreateAccessToken setPageId (String pageId) {
      this.setParam("page_id", pageId);
      return this;
    }

    public APIRequestCreateAccessToken setScope (List<Permission> scope) {
      this.setParam("scope", scope);
      return this;
    }
    public APIRequestCreateAccessToken setScope (String scope) {
      this.setParam("scope", scope);
      return this;
    }

    public APIRequestCreateAccessToken requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAccessToken requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAccessToken requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAccessToken requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAccessToken requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAccessToken requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestDeleteAccessTokens extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestDeleteAccessTokens.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestDeleteAccessTokens(String nodeId, APIContext context) {
      super(context, nodeId, "/accesstokens", "DELETE", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestDeleteAccessTokens setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestDeleteAccessTokens setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestDeleteAccessTokens requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestDeleteAccessTokens requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAccessTokens requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestDeleteAccessTokens requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteAccessTokens requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestDeleteAccessTokens requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAccounts extends APIRequest<Page> {

    APINodeList<Page> lastResponse = null;
    @Override
    public APINodeList<Page> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "business_id",
      "is_business",
      "is_place",
      "is_promotable",
    };

    public static final String[] FIELDS = {
      "about",
      "access_token",
      "ad_campaign",
      "affiliation",
      "app_id",
      "app_links",
      "artists_we_like",
      "attire",
      "awards",
      "band_interests",
      "band_members",
      "best_page",
      "bio",
      "birthday",
      "booking_agent",
      "built",
      "business",
      "can_checkin",
      "can_post",
      "category",
      "category_list",
      "checkins",
      "company_overview",
      "connected_instagram_account",
      "contact_address",
      "copyright_attribution_insights",
      "copyright_whitelisted_ig_partners",
      "country_page_likes",
      "cover",
      "culinary_team",
      "current_location",
      "description",
      "description_html",
      "directed_by",
      "display_subtext",
      "displayed_message_response_time",
      "emails",
      "engagement",
      "fan_count",
      "featured_video",
      "features",
      "food_styles",
      "founded",
      "general_info",
      "general_manager",
      "genre",
      "global_brand_page_name",
      "global_brand_root_id",
      "has_added_app",
      "has_whatsapp_business_number",
      "has_whatsapp_number",
      "hometown",
      "hours",
      "id",
      "impressum",
      "influences",
      "instagram_business_account",
      "instant_articles_review_status",
      "is_always_open",
      "is_chain",
      "is_community_page",
      "is_eligible_for_branded_content",
      "is_messenger_bot_get_started_enabled",
      "is_messenger_platform_bot",
      "is_owned",
      "is_permanently_closed",
      "is_published",
      "is_unclaimed",
      "is_verified",
      "is_webhooks_subscribed",
      "keywords",
      "leadgen_form_preview_details",
      "leadgen_has_crm_integration",
      "leadgen_has_fat_ping_crm_integration",
      "leadgen_tos_acceptance_time",
      "leadgen_tos_accepted",
      "leadgen_tos_accepting_user",
      "link",
      "location",
      "members",
      "merchant_id",
      "merchant_review_status",
      "messenger_ads_default_icebreakers",
      "messenger_ads_default_page_welcome_message",
      "messenger_ads_default_quick_replies",
      "messenger_ads_quick_replies_type",
      "mission",
      "mpg",
      "name",
      "name_with_location_descriptor",
      "network",
      "new_like_count",
      "offer_eligible",
      "overall_star_rating",
      "page_about_story",
      "page_token",
      "parent_page",
      "parking",
      "payment_options",
      "personal_info",
      "personal_interests",
      "pharma_safety_info",
      "phone",
      "place_type",
      "plot_outline",
      "preferred_audience",
      "press_contact",
      "price_range",
      "privacy_info_url",
      "produced_by",
      "products",
      "promotion_eligible",
      "promotion_ineligible_reason",
      "public_transit",
      "rating_count",
      "recipient",
      "record_label",
      "release_date",
      "restaurant_services",
      "restaurant_specialties",
      "schedule",
      "screenplay_by",
      "season",
      "single_line_address",
      "starring",
      "start_info",
      "store_code",
      "store_location_descriptor",
      "store_number",
      "studio",
      "supports_instant_articles",
      "talking_about_count",
      "unread_message_count",
      "unread_notif_count",
      "unseen_message_count",
      "username",
      "verification_status",
      "voip_info",
      "website",
      "were_here_count",
      "whatsapp_number",
      "written_by",
    };

    @Override
    public APINodeList<Page> parseResponse(String response, String header) throws APIException {
      return Page.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Page> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Page> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Page>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Page>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Page>>() {
           public APINodeList<Page> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAccounts.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAccounts(String nodeId, APIContext context) {
      super(context, nodeId, "/accounts", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAccounts setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAccounts setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAccounts setBusinessId (String businessId) {
      this.setParam("business_id", businessId);
      return this;
    }

    public APIRequestGetAccounts setIsBusiness (Boolean isBusiness) {
      this.setParam("is_business", isBusiness);
      return this;
    }
    public APIRequestGetAccounts setIsBusiness (String isBusiness) {
      this.setParam("is_business", isBusiness);
      return this;
    }

    public APIRequestGetAccounts setIsPlace (Boolean isPlace) {
      this.setParam("is_place", isPlace);
      return this;
    }
    public APIRequestGetAccounts setIsPlace (String isPlace) {
      this.setParam("is_place", isPlace);
      return this;
    }

    public APIRequestGetAccounts setIsPromotable (Boolean isPromotable) {
      this.setParam("is_promotable", isPromotable);
      return this;
    }
    public APIRequestGetAccounts setIsPromotable (String isPromotable) {
      this.setParam("is_promotable", isPromotable);
      return this;
    }

    public APIRequestGetAccounts requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAccounts requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAccounts requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAccounts requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAccounts requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAccounts requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAccounts requestAboutField () {
      return this.requestAboutField(true);
    }
    public APIRequestGetAccounts requestAboutField (boolean value) {
      this.requestField("about", value);
      return this;
    }
    public APIRequestGetAccounts requestAccessTokenField () {
      return this.requestAccessTokenField(true);
    }
    public APIRequestGetAccounts requestAccessTokenField (boolean value) {
      this.requestField("access_token", value);
      return this;
    }
    public APIRequestGetAccounts requestAdCampaignField () {
      return this.requestAdCampaignField(true);
    }
    public APIRequestGetAccounts requestAdCampaignField (boolean value) {
      this.requestField("ad_campaign", value);
      return this;
    }
    public APIRequestGetAccounts requestAffiliationField () {
      return this.requestAffiliationField(true);
    }
    public APIRequestGetAccounts requestAffiliationField (boolean value) {
      this.requestField("affiliation", value);
      return this;
    }
    public APIRequestGetAccounts requestAppIdField () {
      return this.requestAppIdField(true);
    }
    public APIRequestGetAccounts requestAppIdField (boolean value) {
      this.requestField("app_id", value);
      return this;
    }
    public APIRequestGetAccounts requestAppLinksField () {
      return this.requestAppLinksField(true);
    }
    public APIRequestGetAccounts requestAppLinksField (boolean value) {
      this.requestField("app_links", value);
      return this;
    }
    public APIRequestGetAccounts requestArtistsWeLikeField () {
      return this.requestArtistsWeLikeField(true);
    }
    public APIRequestGetAccounts requestArtistsWeLikeField (boolean value) {
      this.requestField("artists_we_like", value);
      return this;
    }
    public APIRequestGetAccounts requestAttireField () {
      return this.requestAttireField(true);
    }
    public APIRequestGetAccounts requestAttireField (boolean value) {
      this.requestField("attire", value);
      return this;
    }
    public APIRequestGetAccounts requestAwardsField () {
      return this.requestAwardsField(true);
    }
    public APIRequestGetAccounts requestAwardsField (boolean value) {
      this.requestField("awards", value);
      return this;
    }
    public APIRequestGetAccounts requestBandInterestsField () {
      return this.requestBandInterestsField(true);
    }
    public APIRequestGetAccounts requestBandInterestsField (boolean value) {
      this.requestField("band_interests", value);
      return this;
    }
    public APIRequestGetAccounts requestBandMembersField () {
      return this.requestBandMembersField(true);
    }
    public APIRequestGetAccounts requestBandMembersField (boolean value) {
      this.requestField("band_members", value);
      return this;
    }
    public APIRequestGetAccounts requestBestPageField () {
      return this.requestBestPageField(true);
    }
    public APIRequestGetAccounts requestBestPageField (boolean value) {
      this.requestField("best_page", value);
      return this;
    }
    public APIRequestGetAccounts requestBioField () {
      return this.requestBioField(true);
    }
    public APIRequestGetAccounts requestBioField (boolean value) {
      this.requestField("bio", value);
      return this;
    }
    public APIRequestGetAccounts requestBirthdayField () {
      return this.requestBirthdayField(true);
    }
    public APIRequestGetAccounts requestBirthdayField (boolean value) {
      this.requestField("birthday", value);
      return this;
    }
    public APIRequestGetAccounts requestBookingAgentField () {
      return this.requestBookingAgentField(true);
    }
    public APIRequestGetAccounts requestBookingAgentField (boolean value) {
      this.requestField("booking_agent", value);
      return this;
    }
    public APIRequestGetAccounts requestBuiltField () {
      return this.requestBuiltField(true);
    }
    public APIRequestGetAccounts requestBuiltField (boolean value) {
      this.requestField("built", value);
      return this;
    }
    public APIRequestGetAccounts requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetAccounts requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetAccounts requestCanCheckinField () {
      return this.requestCanCheckinField(true);
    }
    public APIRequestGetAccounts requestCanCheckinField (boolean value) {
      this.requestField("can_checkin", value);
      return this;
    }
    public APIRequestGetAccounts requestCanPostField () {
      return this.requestCanPostField(true);
    }
    public APIRequestGetAccounts requestCanPostField (boolean value) {
      this.requestField("can_post", value);
      return this;
    }
    public APIRequestGetAccounts requestCategoryField () {
      return this.requestCategoryField(true);
    }
    public APIRequestGetAccounts requestCategoryField (boolean value) {
      this.requestField("category", value);
      return this;
    }
    public APIRequestGetAccounts requestCategoryListField () {
      return this.requestCategoryListField(true);
    }
    public APIRequestGetAccounts requestCategoryListField (boolean value) {
      this.requestField("category_list", value);
      return this;
    }
    public APIRequestGetAccounts requestCheckinsField () {
      return this.requestCheckinsField(true);
    }
    public APIRequestGetAccounts requestCheckinsField (boolean value) {
      this.requestField("checkins", value);
      return this;
    }
    public APIRequestGetAccounts requestCompanyOverviewField () {
      return this.requestCompanyOverviewField(true);
    }
    public APIRequestGetAccounts requestCompanyOverviewField (boolean value) {
      this.requestField("company_overview", value);
      return this;
    }
    public APIRequestGetAccounts requestConnectedInstagramAccountField () {
      return this.requestConnectedInstagramAccountField(true);
    }
    public APIRequestGetAccounts requestConnectedInstagramAccountField (boolean value) {
      this.requestField("connected_instagram_account", value);
      return this;
    }
    public APIRequestGetAccounts requestContactAddressField () {
      return this.requestContactAddressField(true);
    }
    public APIRequestGetAccounts requestContactAddressField (boolean value) {
      this.requestField("contact_address", value);
      return this;
    }
    public APIRequestGetAccounts requestCopyrightAttributionInsightsField () {
      return this.requestCopyrightAttributionInsightsField(true);
    }
    public APIRequestGetAccounts requestCopyrightAttributionInsightsField (boolean value) {
      this.requestField("copyright_attribution_insights", value);
      return this;
    }
    public APIRequestGetAccounts requestCopyrightWhitelistedIgPartnersField () {
      return this.requestCopyrightWhitelistedIgPartnersField(true);
    }
    public APIRequestGetAccounts requestCopyrightWhitelistedIgPartnersField (boolean value) {
      this.requestField("copyright_whitelisted_ig_partners", value);
      return this;
    }
    public APIRequestGetAccounts requestCountryPageLikesField () {
      return this.requestCountryPageLikesField(true);
    }
    public APIRequestGetAccounts requestCountryPageLikesField (boolean value) {
      this.requestField("country_page_likes", value);
      return this;
    }
    public APIRequestGetAccounts requestCoverField () {
      return this.requestCoverField(true);
    }
    public APIRequestGetAccounts requestCoverField (boolean value) {
      this.requestField("cover", value);
      return this;
    }
    public APIRequestGetAccounts requestCulinaryTeamField () {
      return this.requestCulinaryTeamField(true);
    }
    public APIRequestGetAccounts requestCulinaryTeamField (boolean value) {
      this.requestField("culinary_team", value);
      return this;
    }
    public APIRequestGetAccounts requestCurrentLocationField () {
      return this.requestCurrentLocationField(true);
    }
    public APIRequestGetAccounts requestCurrentLocationField (boolean value) {
      this.requestField("current_location", value);
      return this;
    }
    public APIRequestGetAccounts requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetAccounts requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetAccounts requestDescriptionHtmlField () {
      return this.requestDescriptionHtmlField(true);
    }
    public APIRequestGetAccounts requestDescriptionHtmlField (boolean value) {
      this.requestField("description_html", value);
      return this;
    }
    public APIRequestGetAccounts requestDirectedByField () {
      return this.requestDirectedByField(true);
    }
    public APIRequestGetAccounts requestDirectedByField (boolean value) {
      this.requestField("directed_by", value);
      return this;
    }
    public APIRequestGetAccounts requestDisplaySubtextField () {
      return this.requestDisplaySubtextField(true);
    }
    public APIRequestGetAccounts requestDisplaySubtextField (boolean value) {
      this.requestField("display_subtext", value);
      return this;
    }
    public APIRequestGetAccounts requestDisplayedMessageResponseTimeField () {
      return this.requestDisplayedMessageResponseTimeField(true);
    }
    public APIRequestGetAccounts requestDisplayedMessageResponseTimeField (boolean value) {
      this.requestField("displayed_message_response_time", value);
      return this;
    }
    public APIRequestGetAccounts requestEmailsField () {
      return this.requestEmailsField(true);
    }
    public APIRequestGetAccounts requestEmailsField (boolean value) {
      this.requestField("emails", value);
      return this;
    }
    public APIRequestGetAccounts requestEngagementField () {
      return this.requestEngagementField(true);
    }
    public APIRequestGetAccounts requestEngagementField (boolean value) {
      this.requestField("engagement", value);
      return this;
    }
    public APIRequestGetAccounts requestFanCountField () {
      return this.requestFanCountField(true);
    }
    public APIRequestGetAccounts requestFanCountField (boolean value) {
      this.requestField("fan_count", value);
      return this;
    }
    public APIRequestGetAccounts requestFeaturedVideoField () {
      return this.requestFeaturedVideoField(true);
    }
    public APIRequestGetAccounts requestFeaturedVideoField (boolean value) {
      this.requestField("featured_video", value);
      return this;
    }
    public APIRequestGetAccounts requestFeaturesField () {
      return this.requestFeaturesField(true);
    }
    public APIRequestGetAccounts requestFeaturesField (boolean value) {
      this.requestField("features", value);
      return this;
    }
    public APIRequestGetAccounts requestFoodStylesField () {
      return this.requestFoodStylesField(true);
    }
    public APIRequestGetAccounts requestFoodStylesField (boolean value) {
      this.requestField("food_styles", value);
      return this;
    }
    public APIRequestGetAccounts requestFoundedField () {
      return this.requestFoundedField(true);
    }
    public APIRequestGetAccounts requestFoundedField (boolean value) {
      this.requestField("founded", value);
      return this;
    }
    public APIRequestGetAccounts requestGeneralInfoField () {
      return this.requestGeneralInfoField(true);
    }
    public APIRequestGetAccounts requestGeneralInfoField (boolean value) {
      this.requestField("general_info", value);
      return this;
    }
    public APIRequestGetAccounts requestGeneralManagerField () {
      return this.requestGeneralManagerField(true);
    }
    public APIRequestGetAccounts requestGeneralManagerField (boolean value) {
      this.requestField("general_manager", value);
      return this;
    }
    public APIRequestGetAccounts requestGenreField () {
      return this.requestGenreField(true);
    }
    public APIRequestGetAccounts requestGenreField (boolean value) {
      this.requestField("genre", value);
      return this;
    }
    public APIRequestGetAccounts requestGlobalBrandPageNameField () {
      return this.requestGlobalBrandPageNameField(true);
    }
    public APIRequestGetAccounts requestGlobalBrandPageNameField (boolean value) {
      this.requestField("global_brand_page_name", value);
      return this;
    }
    public APIRequestGetAccounts requestGlobalBrandRootIdField () {
      return this.requestGlobalBrandRootIdField(true);
    }
    public APIRequestGetAccounts requestGlobalBrandRootIdField (boolean value) {
      this.requestField("global_brand_root_id", value);
      return this;
    }
    public APIRequestGetAccounts requestHasAddedAppField () {
      return this.requestHasAddedAppField(true);
    }
    public APIRequestGetAccounts requestHasAddedAppField (boolean value) {
      this.requestField("has_added_app", value);
      return this;
    }
    public APIRequestGetAccounts requestHasWhatsappBusinessNumberField () {
      return this.requestHasWhatsappBusinessNumberField(true);
    }
    public APIRequestGetAccounts requestHasWhatsappBusinessNumberField (boolean value) {
      this.requestField("has_whatsapp_business_number", value);
      return this;
    }
    public APIRequestGetAccounts requestHasWhatsappNumberField () {
      return this.requestHasWhatsappNumberField(true);
    }
    public APIRequestGetAccounts requestHasWhatsappNumberField (boolean value) {
      this.requestField("has_whatsapp_number", value);
      return this;
    }
    public APIRequestGetAccounts requestHometownField () {
      return this.requestHometownField(true);
    }
    public APIRequestGetAccounts requestHometownField (boolean value) {
      this.requestField("hometown", value);
      return this;
    }
    public APIRequestGetAccounts requestHoursField () {
      return this.requestHoursField(true);
    }
    public APIRequestGetAccounts requestHoursField (boolean value) {
      this.requestField("hours", value);
      return this;
    }
    public APIRequestGetAccounts requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAccounts requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAccounts requestImpressumField () {
      return this.requestImpressumField(true);
    }
    public APIRequestGetAccounts requestImpressumField (boolean value) {
      this.requestField("impressum", value);
      return this;
    }
    public APIRequestGetAccounts requestInfluencesField () {
      return this.requestInfluencesField(true);
    }
    public APIRequestGetAccounts requestInfluencesField (boolean value) {
      this.requestField("influences", value);
      return this;
    }
    public APIRequestGetAccounts requestInstagramBusinessAccountField () {
      return this.requestInstagramBusinessAccountField(true);
    }
    public APIRequestGetAccounts requestInstagramBusinessAccountField (boolean value) {
      this.requestField("instagram_business_account", value);
      return this;
    }
    public APIRequestGetAccounts requestInstantArticlesReviewStatusField () {
      return this.requestInstantArticlesReviewStatusField(true);
    }
    public APIRequestGetAccounts requestInstantArticlesReviewStatusField (boolean value) {
      this.requestField("instant_articles_review_status", value);
      return this;
    }
    public APIRequestGetAccounts requestIsAlwaysOpenField () {
      return this.requestIsAlwaysOpenField(true);
    }
    public APIRequestGetAccounts requestIsAlwaysOpenField (boolean value) {
      this.requestField("is_always_open", value);
      return this;
    }
    public APIRequestGetAccounts requestIsChainField () {
      return this.requestIsChainField(true);
    }
    public APIRequestGetAccounts requestIsChainField (boolean value) {
      this.requestField("is_chain", value);
      return this;
    }
    public APIRequestGetAccounts requestIsCommunityPageField () {
      return this.requestIsCommunityPageField(true);
    }
    public APIRequestGetAccounts requestIsCommunityPageField (boolean value) {
      this.requestField("is_community_page", value);
      return this;
    }
    public APIRequestGetAccounts requestIsEligibleForBrandedContentField () {
      return this.requestIsEligibleForBrandedContentField(true);
    }
    public APIRequestGetAccounts requestIsEligibleForBrandedContentField (boolean value) {
      this.requestField("is_eligible_for_branded_content", value);
      return this;
    }
    public APIRequestGetAccounts requestIsMessengerBotGetStartedEnabledField () {
      return this.requestIsMessengerBotGetStartedEnabledField(true);
    }
    public APIRequestGetAccounts requestIsMessengerBotGetStartedEnabledField (boolean value) {
      this.requestField("is_messenger_bot_get_started_enabled", value);
      return this;
    }
    public APIRequestGetAccounts requestIsMessengerPlatformBotField () {
      return this.requestIsMessengerPlatformBotField(true);
    }
    public APIRequestGetAccounts requestIsMessengerPlatformBotField (boolean value) {
      this.requestField("is_messenger_platform_bot", value);
      return this;
    }
    public APIRequestGetAccounts requestIsOwnedField () {
      return this.requestIsOwnedField(true);
    }
    public APIRequestGetAccounts requestIsOwnedField (boolean value) {
      this.requestField("is_owned", value);
      return this;
    }
    public APIRequestGetAccounts requestIsPermanentlyClosedField () {
      return this.requestIsPermanentlyClosedField(true);
    }
    public APIRequestGetAccounts requestIsPermanentlyClosedField (boolean value) {
      this.requestField("is_permanently_closed", value);
      return this;
    }
    public APIRequestGetAccounts requestIsPublishedField () {
      return this.requestIsPublishedField(true);
    }
    public APIRequestGetAccounts requestIsPublishedField (boolean value) {
      this.requestField("is_published", value);
      return this;
    }
    public APIRequestGetAccounts requestIsUnclaimedField () {
      return this.requestIsUnclaimedField(true);
    }
    public APIRequestGetAccounts requestIsUnclaimedField (boolean value) {
      this.requestField("is_unclaimed", value);
      return this;
    }
    public APIRequestGetAccounts requestIsVerifiedField () {
      return this.requestIsVerifiedField(true);
    }
    public APIRequestGetAccounts requestIsVerifiedField (boolean value) {
      this.requestField("is_verified", value);
      return this;
    }
    public APIRequestGetAccounts requestIsWebhooksSubscribedField () {
      return this.requestIsWebhooksSubscribedField(true);
    }
    public APIRequestGetAccounts requestIsWebhooksSubscribedField (boolean value) {
      this.requestField("is_webhooks_subscribed", value);
      return this;
    }
    public APIRequestGetAccounts requestKeywordsField () {
      return this.requestKeywordsField(true);
    }
    public APIRequestGetAccounts requestKeywordsField (boolean value) {
      this.requestField("keywords", value);
      return this;
    }
    public APIRequestGetAccounts requestLeadgenFormPreviewDetailsField () {
      return this.requestLeadgenFormPreviewDetailsField(true);
    }
    public APIRequestGetAccounts requestLeadgenFormPreviewDetailsField (boolean value) {
      this.requestField("leadgen_form_preview_details", value);
      return this;
    }
    public APIRequestGetAccounts requestLeadgenHasCrmIntegrationField () {
      return this.requestLeadgenHasCrmIntegrationField(true);
    }
    public APIRequestGetAccounts requestLeadgenHasCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_crm_integration", value);
      return this;
    }
    public APIRequestGetAccounts requestLeadgenHasFatPingCrmIntegrationField () {
      return this.requestLeadgenHasFatPingCrmIntegrationField(true);
    }
    public APIRequestGetAccounts requestLeadgenHasFatPingCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_fat_ping_crm_integration", value);
      return this;
    }
    public APIRequestGetAccounts requestLeadgenTosAcceptanceTimeField () {
      return this.requestLeadgenTosAcceptanceTimeField(true);
    }
    public APIRequestGetAccounts requestLeadgenTosAcceptanceTimeField (boolean value) {
      this.requestField("leadgen_tos_acceptance_time", value);
      return this;
    }
    public APIRequestGetAccounts requestLeadgenTosAcceptedField () {
      return this.requestLeadgenTosAcceptedField(true);
    }
    public APIRequestGetAccounts requestLeadgenTosAcceptedField (boolean value) {
      this.requestField("leadgen_tos_accepted", value);
      return this;
    }
    public APIRequestGetAccounts requestLeadgenTosAcceptingUserField () {
      return this.requestLeadgenTosAcceptingUserField(true);
    }
    public APIRequestGetAccounts requestLeadgenTosAcceptingUserField (boolean value) {
      this.requestField("leadgen_tos_accepting_user", value);
      return this;
    }
    public APIRequestGetAccounts requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetAccounts requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetAccounts requestLocationField () {
      return this.requestLocationField(true);
    }
    public APIRequestGetAccounts requestLocationField (boolean value) {
      this.requestField("location", value);
      return this;
    }
    public APIRequestGetAccounts requestMembersField () {
      return this.requestMembersField(true);
    }
    public APIRequestGetAccounts requestMembersField (boolean value) {
      this.requestField("members", value);
      return this;
    }
    public APIRequestGetAccounts requestMerchantIdField () {
      return this.requestMerchantIdField(true);
    }
    public APIRequestGetAccounts requestMerchantIdField (boolean value) {
      this.requestField("merchant_id", value);
      return this;
    }
    public APIRequestGetAccounts requestMerchantReviewStatusField () {
      return this.requestMerchantReviewStatusField(true);
    }
    public APIRequestGetAccounts requestMerchantReviewStatusField (boolean value) {
      this.requestField("merchant_review_status", value);
      return this;
    }
    public APIRequestGetAccounts requestMessengerAdsDefaultIcebreakersField () {
      return this.requestMessengerAdsDefaultIcebreakersField(true);
    }
    public APIRequestGetAccounts requestMessengerAdsDefaultIcebreakersField (boolean value) {
      this.requestField("messenger_ads_default_icebreakers", value);
      return this;
    }
    public APIRequestGetAccounts requestMessengerAdsDefaultPageWelcomeMessageField () {
      return this.requestMessengerAdsDefaultPageWelcomeMessageField(true);
    }
    public APIRequestGetAccounts requestMessengerAdsDefaultPageWelcomeMessageField (boolean value) {
      this.requestField("messenger_ads_default_page_welcome_message", value);
      return this;
    }
    public APIRequestGetAccounts requestMessengerAdsDefaultQuickRepliesField () {
      return this.requestMessengerAdsDefaultQuickRepliesField(true);
    }
    public APIRequestGetAccounts requestMessengerAdsDefaultQuickRepliesField (boolean value) {
      this.requestField("messenger_ads_default_quick_replies", value);
      return this;
    }
    public APIRequestGetAccounts requestMessengerAdsQuickRepliesTypeField () {
      return this.requestMessengerAdsQuickRepliesTypeField(true);
    }
    public APIRequestGetAccounts requestMessengerAdsQuickRepliesTypeField (boolean value) {
      this.requestField("messenger_ads_quick_replies_type", value);
      return this;
    }
    public APIRequestGetAccounts requestMissionField () {
      return this.requestMissionField(true);
    }
    public APIRequestGetAccounts requestMissionField (boolean value) {
      this.requestField("mission", value);
      return this;
    }
    public APIRequestGetAccounts requestMpgField () {
      return this.requestMpgField(true);
    }
    public APIRequestGetAccounts requestMpgField (boolean value) {
      this.requestField("mpg", value);
      return this;
    }
    public APIRequestGetAccounts requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAccounts requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAccounts requestNameWithLocationDescriptorField () {
      return this.requestNameWithLocationDescriptorField(true);
    }
    public APIRequestGetAccounts requestNameWithLocationDescriptorField (boolean value) {
      this.requestField("name_with_location_descriptor", value);
      return this;
    }
    public APIRequestGetAccounts requestNetworkField () {
      return this.requestNetworkField(true);
    }
    public APIRequestGetAccounts requestNetworkField (boolean value) {
      this.requestField("network", value);
      return this;
    }
    public APIRequestGetAccounts requestNewLikeCountField () {
      return this.requestNewLikeCountField(true);
    }
    public APIRequestGetAccounts requestNewLikeCountField (boolean value) {
      this.requestField("new_like_count", value);
      return this;
    }
    public APIRequestGetAccounts requestOfferEligibleField () {
      return this.requestOfferEligibleField(true);
    }
    public APIRequestGetAccounts requestOfferEligibleField (boolean value) {
      this.requestField("offer_eligible", value);
      return this;
    }
    public APIRequestGetAccounts requestOverallStarRatingField () {
      return this.requestOverallStarRatingField(true);
    }
    public APIRequestGetAccounts requestOverallStarRatingField (boolean value) {
      this.requestField("overall_star_rating", value);
      return this;
    }
    public APIRequestGetAccounts requestPageAboutStoryField () {
      return this.requestPageAboutStoryField(true);
    }
    public APIRequestGetAccounts requestPageAboutStoryField (boolean value) {
      this.requestField("page_about_story", value);
      return this;
    }
    public APIRequestGetAccounts requestPageTokenField () {
      return this.requestPageTokenField(true);
    }
    public APIRequestGetAccounts requestPageTokenField (boolean value) {
      this.requestField("page_token", value);
      return this;
    }
    public APIRequestGetAccounts requestParentPageField () {
      return this.requestParentPageField(true);
    }
    public APIRequestGetAccounts requestParentPageField (boolean value) {
      this.requestField("parent_page", value);
      return this;
    }
    public APIRequestGetAccounts requestParkingField () {
      return this.requestParkingField(true);
    }
    public APIRequestGetAccounts requestParkingField (boolean value) {
      this.requestField("parking", value);
      return this;
    }
    public APIRequestGetAccounts requestPaymentOptionsField () {
      return this.requestPaymentOptionsField(true);
    }
    public APIRequestGetAccounts requestPaymentOptionsField (boolean value) {
      this.requestField("payment_options", value);
      return this;
    }
    public APIRequestGetAccounts requestPersonalInfoField () {
      return this.requestPersonalInfoField(true);
    }
    public APIRequestGetAccounts requestPersonalInfoField (boolean value) {
      this.requestField("personal_info", value);
      return this;
    }
    public APIRequestGetAccounts requestPersonalInterestsField () {
      return this.requestPersonalInterestsField(true);
    }
    public APIRequestGetAccounts requestPersonalInterestsField (boolean value) {
      this.requestField("personal_interests", value);
      return this;
    }
    public APIRequestGetAccounts requestPharmaSafetyInfoField () {
      return this.requestPharmaSafetyInfoField(true);
    }
    public APIRequestGetAccounts requestPharmaSafetyInfoField (boolean value) {
      this.requestField("pharma_safety_info", value);
      return this;
    }
    public APIRequestGetAccounts requestPhoneField () {
      return this.requestPhoneField(true);
    }
    public APIRequestGetAccounts requestPhoneField (boolean value) {
      this.requestField("phone", value);
      return this;
    }
    public APIRequestGetAccounts requestPlaceTypeField () {
      return this.requestPlaceTypeField(true);
    }
    public APIRequestGetAccounts requestPlaceTypeField (boolean value) {
      this.requestField("place_type", value);
      return this;
    }
    public APIRequestGetAccounts requestPlotOutlineField () {
      return this.requestPlotOutlineField(true);
    }
    public APIRequestGetAccounts requestPlotOutlineField (boolean value) {
      this.requestField("plot_outline", value);
      return this;
    }
    public APIRequestGetAccounts requestPreferredAudienceField () {
      return this.requestPreferredAudienceField(true);
    }
    public APIRequestGetAccounts requestPreferredAudienceField (boolean value) {
      this.requestField("preferred_audience", value);
      return this;
    }
    public APIRequestGetAccounts requestPressContactField () {
      return this.requestPressContactField(true);
    }
    public APIRequestGetAccounts requestPressContactField (boolean value) {
      this.requestField("press_contact", value);
      return this;
    }
    public APIRequestGetAccounts requestPriceRangeField () {
      return this.requestPriceRangeField(true);
    }
    public APIRequestGetAccounts requestPriceRangeField (boolean value) {
      this.requestField("price_range", value);
      return this;
    }
    public APIRequestGetAccounts requestPrivacyInfoUrlField () {
      return this.requestPrivacyInfoUrlField(true);
    }
    public APIRequestGetAccounts requestPrivacyInfoUrlField (boolean value) {
      this.requestField("privacy_info_url", value);
      return this;
    }
    public APIRequestGetAccounts requestProducedByField () {
      return this.requestProducedByField(true);
    }
    public APIRequestGetAccounts requestProducedByField (boolean value) {
      this.requestField("produced_by", value);
      return this;
    }
    public APIRequestGetAccounts requestProductsField () {
      return this.requestProductsField(true);
    }
    public APIRequestGetAccounts requestProductsField (boolean value) {
      this.requestField("products", value);
      return this;
    }
    public APIRequestGetAccounts requestPromotionEligibleField () {
      return this.requestPromotionEligibleField(true);
    }
    public APIRequestGetAccounts requestPromotionEligibleField (boolean value) {
      this.requestField("promotion_eligible", value);
      return this;
    }
    public APIRequestGetAccounts requestPromotionIneligibleReasonField () {
      return this.requestPromotionIneligibleReasonField(true);
    }
    public APIRequestGetAccounts requestPromotionIneligibleReasonField (boolean value) {
      this.requestField("promotion_ineligible_reason", value);
      return this;
    }
    public APIRequestGetAccounts requestPublicTransitField () {
      return this.requestPublicTransitField(true);
    }
    public APIRequestGetAccounts requestPublicTransitField (boolean value) {
      this.requestField("public_transit", value);
      return this;
    }
    public APIRequestGetAccounts requestRatingCountField () {
      return this.requestRatingCountField(true);
    }
    public APIRequestGetAccounts requestRatingCountField (boolean value) {
      this.requestField("rating_count", value);
      return this;
    }
    public APIRequestGetAccounts requestRecipientField () {
      return this.requestRecipientField(true);
    }
    public APIRequestGetAccounts requestRecipientField (boolean value) {
      this.requestField("recipient", value);
      return this;
    }
    public APIRequestGetAccounts requestRecordLabelField () {
      return this.requestRecordLabelField(true);
    }
    public APIRequestGetAccounts requestRecordLabelField (boolean value) {
      this.requestField("record_label", value);
      return this;
    }
    public APIRequestGetAccounts requestReleaseDateField () {
      return this.requestReleaseDateField(true);
    }
    public APIRequestGetAccounts requestReleaseDateField (boolean value) {
      this.requestField("release_date", value);
      return this;
    }
    public APIRequestGetAccounts requestRestaurantServicesField () {
      return this.requestRestaurantServicesField(true);
    }
    public APIRequestGetAccounts requestRestaurantServicesField (boolean value) {
      this.requestField("restaurant_services", value);
      return this;
    }
    public APIRequestGetAccounts requestRestaurantSpecialtiesField () {
      return this.requestRestaurantSpecialtiesField(true);
    }
    public APIRequestGetAccounts requestRestaurantSpecialtiesField (boolean value) {
      this.requestField("restaurant_specialties", value);
      return this;
    }
    public APIRequestGetAccounts requestScheduleField () {
      return this.requestScheduleField(true);
    }
    public APIRequestGetAccounts requestScheduleField (boolean value) {
      this.requestField("schedule", value);
      return this;
    }
    public APIRequestGetAccounts requestScreenplayByField () {
      return this.requestScreenplayByField(true);
    }
    public APIRequestGetAccounts requestScreenplayByField (boolean value) {
      this.requestField("screenplay_by", value);
      return this;
    }
    public APIRequestGetAccounts requestSeasonField () {
      return this.requestSeasonField(true);
    }
    public APIRequestGetAccounts requestSeasonField (boolean value) {
      this.requestField("season", value);
      return this;
    }
    public APIRequestGetAccounts requestSingleLineAddressField () {
      return this.requestSingleLineAddressField(true);
    }
    public APIRequestGetAccounts requestSingleLineAddressField (boolean value) {
      this.requestField("single_line_address", value);
      return this;
    }
    public APIRequestGetAccounts requestStarringField () {
      return this.requestStarringField(true);
    }
    public APIRequestGetAccounts requestStarringField (boolean value) {
      this.requestField("starring", value);
      return this;
    }
    public APIRequestGetAccounts requestStartInfoField () {
      return this.requestStartInfoField(true);
    }
    public APIRequestGetAccounts requestStartInfoField (boolean value) {
      this.requestField("start_info", value);
      return this;
    }
    public APIRequestGetAccounts requestStoreCodeField () {
      return this.requestStoreCodeField(true);
    }
    public APIRequestGetAccounts requestStoreCodeField (boolean value) {
      this.requestField("store_code", value);
      return this;
    }
    public APIRequestGetAccounts requestStoreLocationDescriptorField () {
      return this.requestStoreLocationDescriptorField(true);
    }
    public APIRequestGetAccounts requestStoreLocationDescriptorField (boolean value) {
      this.requestField("store_location_descriptor", value);
      return this;
    }
    public APIRequestGetAccounts requestStoreNumberField () {
      return this.requestStoreNumberField(true);
    }
    public APIRequestGetAccounts requestStoreNumberField (boolean value) {
      this.requestField("store_number", value);
      return this;
    }
    public APIRequestGetAccounts requestStudioField () {
      return this.requestStudioField(true);
    }
    public APIRequestGetAccounts requestStudioField (boolean value) {
      this.requestField("studio", value);
      return this;
    }
    public APIRequestGetAccounts requestSupportsInstantArticlesField () {
      return this.requestSupportsInstantArticlesField(true);
    }
    public APIRequestGetAccounts requestSupportsInstantArticlesField (boolean value) {
      this.requestField("supports_instant_articles", value);
      return this;
    }
    public APIRequestGetAccounts requestTalkingAboutCountField () {
      return this.requestTalkingAboutCountField(true);
    }
    public APIRequestGetAccounts requestTalkingAboutCountField (boolean value) {
      this.requestField("talking_about_count", value);
      return this;
    }
    public APIRequestGetAccounts requestUnreadMessageCountField () {
      return this.requestUnreadMessageCountField(true);
    }
    public APIRequestGetAccounts requestUnreadMessageCountField (boolean value) {
      this.requestField("unread_message_count", value);
      return this;
    }
    public APIRequestGetAccounts requestUnreadNotifCountField () {
      return this.requestUnreadNotifCountField(true);
    }
    public APIRequestGetAccounts requestUnreadNotifCountField (boolean value) {
      this.requestField("unread_notif_count", value);
      return this;
    }
    public APIRequestGetAccounts requestUnseenMessageCountField () {
      return this.requestUnseenMessageCountField(true);
    }
    public APIRequestGetAccounts requestUnseenMessageCountField (boolean value) {
      this.requestField("unseen_message_count", value);
      return this;
    }
    public APIRequestGetAccounts requestUsernameField () {
      return this.requestUsernameField(true);
    }
    public APIRequestGetAccounts requestUsernameField (boolean value) {
      this.requestField("username", value);
      return this;
    }
    public APIRequestGetAccounts requestVerificationStatusField () {
      return this.requestVerificationStatusField(true);
    }
    public APIRequestGetAccounts requestVerificationStatusField (boolean value) {
      this.requestField("verification_status", value);
      return this;
    }
    public APIRequestGetAccounts requestVoipInfoField () {
      return this.requestVoipInfoField(true);
    }
    public APIRequestGetAccounts requestVoipInfoField (boolean value) {
      this.requestField("voip_info", value);
      return this;
    }
    public APIRequestGetAccounts requestWebsiteField () {
      return this.requestWebsiteField(true);
    }
    public APIRequestGetAccounts requestWebsiteField (boolean value) {
      this.requestField("website", value);
      return this;
    }
    public APIRequestGetAccounts requestWereHereCountField () {
      return this.requestWereHereCountField(true);
    }
    public APIRequestGetAccounts requestWereHereCountField (boolean value) {
      this.requestField("were_here_count", value);
      return this;
    }
    public APIRequestGetAccounts requestWhatsappNumberField () {
      return this.requestWhatsappNumberField(true);
    }
    public APIRequestGetAccounts requestWhatsappNumberField (boolean value) {
      this.requestField("whatsapp_number", value);
      return this;
    }
    public APIRequestGetAccounts requestWrittenByField () {
      return this.requestWrittenByField(true);
    }
    public APIRequestGetAccounts requestWrittenByField (boolean value) {
      this.requestField("written_by", value);
      return this;
    }
  }

  public static class APIRequestCreateAccount extends APIRequest<Page> {

    Page lastResponse = null;
    @Override
    public Page getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "about",
      "address",
      "category",
      "category_enum",
      "category_list",
      "city_id",
      "coordinates",
      "cover_photo",
      "description",
      "ignore_coordinate_warnings",
      "location",
      "name",
      "phone",
      "picture",
      "website",
      "zip",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public Page parseResponse(String response, String header) throws APIException {
      return Page.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public Page execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public Page execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<Page> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<Page> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, Page>() {
           public Page apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAccount.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAccount(String nodeId, APIContext context) {
      super(context, nodeId, "/accounts", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAccount setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAccount setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAccount setAbout (String about) {
      this.setParam("about", about);
      return this;
    }

    public APIRequestCreateAccount setAddress (String address) {
      this.setParam("address", address);
      return this;
    }

    public APIRequestCreateAccount setCategory (Long category) {
      this.setParam("category", category);
      return this;
    }
    public APIRequestCreateAccount setCategory (String category) {
      this.setParam("category", category);
      return this;
    }

    public APIRequestCreateAccount setCategoryEnum (String categoryEnum) {
      this.setParam("category_enum", categoryEnum);
      return this;
    }

    public APIRequestCreateAccount setCategoryList (List<String> categoryList) {
      this.setParam("category_list", categoryList);
      return this;
    }
    public APIRequestCreateAccount setCategoryList (String categoryList) {
      this.setParam("category_list", categoryList);
      return this;
    }

    public APIRequestCreateAccount setCityId (String cityId) {
      this.setParam("city_id", cityId);
      return this;
    }

    public APIRequestCreateAccount setCoordinates (Object coordinates) {
      this.setParam("coordinates", coordinates);
      return this;
    }
    public APIRequestCreateAccount setCoordinates (String coordinates) {
      this.setParam("coordinates", coordinates);
      return this;
    }

    public APIRequestCreateAccount setCoverPhoto (Object coverPhoto) {
      this.setParam("cover_photo", coverPhoto);
      return this;
    }
    public APIRequestCreateAccount setCoverPhoto (String coverPhoto) {
      this.setParam("cover_photo", coverPhoto);
      return this;
    }

    public APIRequestCreateAccount setDescription (String description) {
      this.setParam("description", description);
      return this;
    }

    public APIRequestCreateAccount setIgnoreCoordinateWarnings (Boolean ignoreCoordinateWarnings) {
      this.setParam("ignore_coordinate_warnings", ignoreCoordinateWarnings);
      return this;
    }
    public APIRequestCreateAccount setIgnoreCoordinateWarnings (String ignoreCoordinateWarnings) {
      this.setParam("ignore_coordinate_warnings", ignoreCoordinateWarnings);
      return this;
    }

    public APIRequestCreateAccount setLocation (Object location) {
      this.setParam("location", location);
      return this;
    }
    public APIRequestCreateAccount setLocation (String location) {
      this.setParam("location", location);
      return this;
    }

    public APIRequestCreateAccount setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateAccount setPhone (String phone) {
      this.setParam("phone", phone);
      return this;
    }

    public APIRequestCreateAccount setPicture (String picture) {
      this.setParam("picture", picture);
      return this;
    }

    public APIRequestCreateAccount setWebsite (String website) {
      this.setParam("website", website);
      return this;
    }

    public APIRequestCreateAccount setZip (String zip) {
      this.setParam("zip", zip);
      return this;
    }

    public APIRequestCreateAccount requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAccount requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAccount requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAccount requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAccount requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAccount requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateAchievement extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "added",
      "alias",
      "android_key_hash",
      "client_secret",
      "created_time",
      "end_time",
      "expires_in",
      "fb:channel",
      "fb:explicitly_shared",
      "image:height",
      "image:secure_url",
      "image:type",
      "image:url",
      "image:user_generated",
      "image:width",
      "ios_bundle_id",
      "message",
      "no_action_link",
      "no_feed_story",
      "notify",
      "place",
      "preview",
      "privacy",
      "proxied_app_id",
      "ref",
      "scrape",
      "start_time",
      "tags",
      "to",
      "user_selected_place",
      "user_selected_tags",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestCreateAchievement.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateAchievement(String nodeId, APIContext context) {
      super(context, nodeId, "/achievements", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateAchievement setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateAchievement setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateAchievement setAdded (String added) {
      this.setParam("added", added);
      return this;
    }

    public APIRequestCreateAchievement setAlias (String alias) {
      this.setParam("alias", alias);
      return this;
    }

    public APIRequestCreateAchievement setAndroidKeyHash (String androidKeyHash) {
      this.setParam("android_key_hash", androidKeyHash);
      return this;
    }

    public APIRequestCreateAchievement setClientSecret (String clientSecret) {
      this.setParam("client_secret", clientSecret);
      return this;
    }

    public APIRequestCreateAchievement setCreatedTime (String createdTime) {
      this.setParam("created_time", createdTime);
      return this;
    }

    public APIRequestCreateAchievement setEndTime (String endTime) {
      this.setParam("end_time", endTime);
      return this;
    }

    public APIRequestCreateAchievement setExpiresIn (Long expiresIn) {
      this.setParam("expires_in", expiresIn);
      return this;
    }
    public APIRequestCreateAchievement setExpiresIn (String expiresIn) {
      this.setParam("expires_in", expiresIn);
      return this;
    }

    public APIRequestCreateAchievement setFbChannel (String fbChannel) {
      this.setParam("fb:channel", fbChannel);
      return this;
    }

    public APIRequestCreateAchievement setFbExplicitlyShared (Boolean fbExplicitlyShared) {
      this.setParam("fb:explicitly_shared", fbExplicitlyShared);
      return this;
    }
    public APIRequestCreateAchievement setFbExplicitlyShared (String fbExplicitlyShared) {
      this.setParam("fb:explicitly_shared", fbExplicitlyShared);
      return this;
    }

    public APIRequestCreateAchievement setImageHeight (Long imageHeight) {
      this.setParam("image:height", imageHeight);
      return this;
    }
    public APIRequestCreateAchievement setImageHeight (String imageHeight) {
      this.setParam("image:height", imageHeight);
      return this;
    }

    public APIRequestCreateAchievement setImageSecureUrl (String imageSecureUrl) {
      this.setParam("image:secure_url", imageSecureUrl);
      return this;
    }

    public APIRequestCreateAchievement setImageType (String imageType) {
      this.setParam("image:type", imageType);
      return this;
    }

    public APIRequestCreateAchievement setImageUrl (String imageUrl) {
      this.setParam("image:url", imageUrl);
      return this;
    }

    public APIRequestCreateAchievement setImageUserGenerated (Boolean imageUserGenerated) {
      this.setParam("image:user_generated", imageUserGenerated);
      return this;
    }
    public APIRequestCreateAchievement setImageUserGenerated (String imageUserGenerated) {
      this.setParam("image:user_generated", imageUserGenerated);
      return this;
    }

    public APIRequestCreateAchievement setImageWidth (Long imageWidth) {
      this.setParam("image:width", imageWidth);
      return this;
    }
    public APIRequestCreateAchievement setImageWidth (String imageWidth) {
      this.setParam("image:width", imageWidth);
      return this;
    }

    public APIRequestCreateAchievement setIosBundleId (String iosBundleId) {
      this.setParam("ios_bundle_id", iosBundleId);
      return this;
    }

    public APIRequestCreateAchievement setMessage (String message) {
      this.setParam("message", message);
      return this;
    }

    public APIRequestCreateAchievement setNoActionLink (Boolean noActionLink) {
      this.setParam("no_action_link", noActionLink);
      return this;
    }
    public APIRequestCreateAchievement setNoActionLink (String noActionLink) {
      this.setParam("no_action_link", noActionLink);
      return this;
    }

    public APIRequestCreateAchievement setNoFeedStory (Boolean noFeedStory) {
      this.setParam("no_feed_story", noFeedStory);
      return this;
    }
    public APIRequestCreateAchievement setNoFeedStory (String noFeedStory) {
      this.setParam("no_feed_story", noFeedStory);
      return this;
    }

    public APIRequestCreateAchievement setNotify (Boolean notify) {
      this.setParam("notify", notify);
      return this;
    }
    public APIRequestCreateAchievement setNotify (String notify) {
      this.setParam("notify", notify);
      return this;
    }

    public APIRequestCreateAchievement setPlace (String place) {
      this.setParam("place", place);
      return this;
    }

    public APIRequestCreateAchievement setPreview (Boolean preview) {
      this.setParam("preview", preview);
      return this;
    }
    public APIRequestCreateAchievement setPreview (String preview) {
      this.setParam("preview", preview);
      return this;
    }

    public APIRequestCreateAchievement setPrivacy (String privacy) {
      this.setParam("privacy", privacy);
      return this;
    }

    public APIRequestCreateAchievement setProxiedAppId (String proxiedAppId) {
      this.setParam("proxied_app_id", proxiedAppId);
      return this;
    }

    public APIRequestCreateAchievement setRef (String ref) {
      this.setParam("ref", ref);
      return this;
    }

    public APIRequestCreateAchievement setScrape (Boolean scrape) {
      this.setParam("scrape", scrape);
      return this;
    }
    public APIRequestCreateAchievement setScrape (String scrape) {
      this.setParam("scrape", scrape);
      return this;
    }

    public APIRequestCreateAchievement setStartTime (String startTime) {
      this.setParam("start_time", startTime);
      return this;
    }

    public APIRequestCreateAchievement setTags (List<Long> tags) {
      this.setParam("tags", tags);
      return this;
    }
    public APIRequestCreateAchievement setTags (String tags) {
      this.setParam("tags", tags);
      return this;
    }

    public APIRequestCreateAchievement setTo (String to) {
      this.setParam("to", to);
      return this;
    }

    public APIRequestCreateAchievement setUserSelectedPlace (Boolean userSelectedPlace) {
      this.setParam("user_selected_place", userSelectedPlace);
      return this;
    }
    public APIRequestCreateAchievement setUserSelectedPlace (String userSelectedPlace) {
      this.setParam("user_selected_place", userSelectedPlace);
      return this;
    }

    public APIRequestCreateAchievement setUserSelectedTags (Boolean userSelectedTags) {
      this.setParam("user_selected_tags", userSelectedTags);
      return this;
    }
    public APIRequestCreateAchievement setUserSelectedTags (String userSelectedTags) {
      this.setParam("user_selected_tags", userSelectedTags);
      return this;
    }

    public APIRequestCreateAchievement requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateAchievement requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAchievement requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateAchievement requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateAchievement requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateAchievement requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAdStudies extends APIRequest<AdStudy> {

    APINodeList<AdStudy> lastResponse = null;
    @Override
    public APINodeList<AdStudy> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "business",
      "canceled_time",
      "cooldown_start_time",
      "created_by",
      "created_time",
      "description",
      "end_time",
      "id",
      "name",
      "observation_end_time",
      "results_first_available_date",
      "start_time",
      "type",
      "updated_by",
      "updated_time",
    };

    @Override
    public APINodeList<AdStudy> parseResponse(String response, String header) throws APIException {
      return AdStudy.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdStudy> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdStudy> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdStudy>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdStudy>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdStudy>>() {
           public APINodeList<AdStudy> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdStudies.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdStudies(String nodeId, APIContext context) {
      super(context, nodeId, "/ad_studies", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdStudies setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdStudies setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdStudies requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdStudies requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdStudies requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdStudies requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdStudies requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdStudies requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdStudies requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetAdStudies requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetAdStudies requestCanceledTimeField () {
      return this.requestCanceledTimeField(true);
    }
    public APIRequestGetAdStudies requestCanceledTimeField (boolean value) {
      this.requestField("canceled_time", value);
      return this;
    }
    public APIRequestGetAdStudies requestCooldownStartTimeField () {
      return this.requestCooldownStartTimeField(true);
    }
    public APIRequestGetAdStudies requestCooldownStartTimeField (boolean value) {
      this.requestField("cooldown_start_time", value);
      return this;
    }
    public APIRequestGetAdStudies requestCreatedByField () {
      return this.requestCreatedByField(true);
    }
    public APIRequestGetAdStudies requestCreatedByField (boolean value) {
      this.requestField("created_by", value);
      return this;
    }
    public APIRequestGetAdStudies requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAdStudies requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAdStudies requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetAdStudies requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetAdStudies requestEndTimeField () {
      return this.requestEndTimeField(true);
    }
    public APIRequestGetAdStudies requestEndTimeField (boolean value) {
      this.requestField("end_time", value);
      return this;
    }
    public APIRequestGetAdStudies requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdStudies requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdStudies requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAdStudies requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAdStudies requestObservationEndTimeField () {
      return this.requestObservationEndTimeField(true);
    }
    public APIRequestGetAdStudies requestObservationEndTimeField (boolean value) {
      this.requestField("observation_end_time", value);
      return this;
    }
    public APIRequestGetAdStudies requestResultsFirstAvailableDateField () {
      return this.requestResultsFirstAvailableDateField(true);
    }
    public APIRequestGetAdStudies requestResultsFirstAvailableDateField (boolean value) {
      this.requestField("results_first_available_date", value);
      return this;
    }
    public APIRequestGetAdStudies requestStartTimeField () {
      return this.requestStartTimeField(true);
    }
    public APIRequestGetAdStudies requestStartTimeField (boolean value) {
      this.requestField("start_time", value);
      return this;
    }
    public APIRequestGetAdStudies requestTypeField () {
      return this.requestTypeField(true);
    }
    public APIRequestGetAdStudies requestTypeField (boolean value) {
      this.requestField("type", value);
      return this;
    }
    public APIRequestGetAdStudies requestUpdatedByField () {
      return this.requestUpdatedByField(true);
    }
    public APIRequestGetAdStudies requestUpdatedByField (boolean value) {
      this.requestField("updated_by", value);
      return this;
    }
    public APIRequestGetAdStudies requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetAdStudies requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
  }

  public static class APIRequestGetAdAccounts extends APIRequest<AdAccount> {

    APINodeList<AdAccount> lastResponse = null;
    @Override
    public APINodeList<AdAccount> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "account_id",
      "account_status",
      "ad_account_creation_request",
      "ad_account_promotable_objects",
      "age",
      "agency_client_declaration",
      "amount_spent",
      "attribution_spec",
      "balance",
      "business",
      "business_city",
      "business_country_code",
      "business_name",
      "business_state",
      "business_street",
      "business_street2",
      "business_zip",
      "capabilities",
      "created_time",
      "currency",
      "disable_reason",
      "end_advertiser",
      "end_advertiser_name",
      "failed_delivery_checks",
      "fb_entity",
      "funding_source",
      "funding_source_details",
      "has_migrated_permissions",
      "has_page_authorized_adaccount",
      "id",
      "io_number",
      "is_attribution_spec_system_default",
      "is_direct_deals_enabled",
      "is_in_3ds_authorization_enabled_market",
      "is_in_middle_of_local_entity_migration",
      "is_notifications_enabled",
      "is_personal",
      "is_prepay_account",
      "is_tax_id_required",
      "line_numbers",
      "media_agency",
      "min_campaign_group_spend_cap",
      "min_daily_budget",
      "name",
      "offsite_pixels_tos_accepted",
      "owner",
      "partner",
      "rf_spec",
      "show_checkout_experience",
      "spend_cap",
      "tax_id",
      "tax_id_status",
      "tax_id_type",
      "timezone_id",
      "timezone_name",
      "timezone_offset_hours_utc",
      "tos_accepted",
      "user_role",
      "user_tos_accepted",
    };

    @Override
    public APINodeList<AdAccount> parseResponse(String response, String header) throws APIException {
      return AdAccount.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdAccount> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdAccount> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdAccount>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdAccount>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdAccount>>() {
           public APINodeList<AdAccount> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAdAccounts.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAdAccounts(String nodeId, APIContext context) {
      super(context, nodeId, "/adaccounts", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAdAccounts setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAdAccounts setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAdAccounts requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAdAccounts requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdAccounts requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAdAccounts requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAdAccounts requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAdAccounts requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAdAccounts requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetAdAccounts requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetAdAccounts requestAccountStatusField () {
      return this.requestAccountStatusField(true);
    }
    public APIRequestGetAdAccounts requestAccountStatusField (boolean value) {
      this.requestField("account_status", value);
      return this;
    }
    public APIRequestGetAdAccounts requestAdAccountCreationRequestField () {
      return this.requestAdAccountCreationRequestField(true);
    }
    public APIRequestGetAdAccounts requestAdAccountCreationRequestField (boolean value) {
      this.requestField("ad_account_creation_request", value);
      return this;
    }
    public APIRequestGetAdAccounts requestAdAccountPromotableObjectsField () {
      return this.requestAdAccountPromotableObjectsField(true);
    }
    public APIRequestGetAdAccounts requestAdAccountPromotableObjectsField (boolean value) {
      this.requestField("ad_account_promotable_objects", value);
      return this;
    }
    public APIRequestGetAdAccounts requestAgeField () {
      return this.requestAgeField(true);
    }
    public APIRequestGetAdAccounts requestAgeField (boolean value) {
      this.requestField("age", value);
      return this;
    }
    public APIRequestGetAdAccounts requestAgencyClientDeclarationField () {
      return this.requestAgencyClientDeclarationField(true);
    }
    public APIRequestGetAdAccounts requestAgencyClientDeclarationField (boolean value) {
      this.requestField("agency_client_declaration", value);
      return this;
    }
    public APIRequestGetAdAccounts requestAmountSpentField () {
      return this.requestAmountSpentField(true);
    }
    public APIRequestGetAdAccounts requestAmountSpentField (boolean value) {
      this.requestField("amount_spent", value);
      return this;
    }
    public APIRequestGetAdAccounts requestAttributionSpecField () {
      return this.requestAttributionSpecField(true);
    }
    public APIRequestGetAdAccounts requestAttributionSpecField (boolean value) {
      this.requestField("attribution_spec", value);
      return this;
    }
    public APIRequestGetAdAccounts requestBalanceField () {
      return this.requestBalanceField(true);
    }
    public APIRequestGetAdAccounts requestBalanceField (boolean value) {
      this.requestField("balance", value);
      return this;
    }
    public APIRequestGetAdAccounts requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetAdAccounts requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetAdAccounts requestBusinessCityField () {
      return this.requestBusinessCityField(true);
    }
    public APIRequestGetAdAccounts requestBusinessCityField (boolean value) {
      this.requestField("business_city", value);
      return this;
    }
    public APIRequestGetAdAccounts requestBusinessCountryCodeField () {
      return this.requestBusinessCountryCodeField(true);
    }
    public APIRequestGetAdAccounts requestBusinessCountryCodeField (boolean value) {
      this.requestField("business_country_code", value);
      return this;
    }
    public APIRequestGetAdAccounts requestBusinessNameField () {
      return this.requestBusinessNameField(true);
    }
    public APIRequestGetAdAccounts requestBusinessNameField (boolean value) {
      this.requestField("business_name", value);
      return this;
    }
    public APIRequestGetAdAccounts requestBusinessStateField () {
      return this.requestBusinessStateField(true);
    }
    public APIRequestGetAdAccounts requestBusinessStateField (boolean value) {
      this.requestField("business_state", value);
      return this;
    }
    public APIRequestGetAdAccounts requestBusinessStreetField () {
      return this.requestBusinessStreetField(true);
    }
    public APIRequestGetAdAccounts requestBusinessStreetField (boolean value) {
      this.requestField("business_street", value);
      return this;
    }
    public APIRequestGetAdAccounts requestBusinessStreet2Field () {
      return this.requestBusinessStreet2Field(true);
    }
    public APIRequestGetAdAccounts requestBusinessStreet2Field (boolean value) {
      this.requestField("business_street2", value);
      return this;
    }
    public APIRequestGetAdAccounts requestBusinessZipField () {
      return this.requestBusinessZipField(true);
    }
    public APIRequestGetAdAccounts requestBusinessZipField (boolean value) {
      this.requestField("business_zip", value);
      return this;
    }
    public APIRequestGetAdAccounts requestCapabilitiesField () {
      return this.requestCapabilitiesField(true);
    }
    public APIRequestGetAdAccounts requestCapabilitiesField (boolean value) {
      this.requestField("capabilities", value);
      return this;
    }
    public APIRequestGetAdAccounts requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAdAccounts requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAdAccounts requestCurrencyField () {
      return this.requestCurrencyField(true);
    }
    public APIRequestGetAdAccounts requestCurrencyField (boolean value) {
      this.requestField("currency", value);
      return this;
    }
    public APIRequestGetAdAccounts requestDisableReasonField () {
      return this.requestDisableReasonField(true);
    }
    public APIRequestGetAdAccounts requestDisableReasonField (boolean value) {
      this.requestField("disable_reason", value);
      return this;
    }
    public APIRequestGetAdAccounts requestEndAdvertiserField () {
      return this.requestEndAdvertiserField(true);
    }
    public APIRequestGetAdAccounts requestEndAdvertiserField (boolean value) {
      this.requestField("end_advertiser", value);
      return this;
    }
    public APIRequestGetAdAccounts requestEndAdvertiserNameField () {
      return this.requestEndAdvertiserNameField(true);
    }
    public APIRequestGetAdAccounts requestEndAdvertiserNameField (boolean value) {
      this.requestField("end_advertiser_name", value);
      return this;
    }
    public APIRequestGetAdAccounts requestFailedDeliveryChecksField () {
      return this.requestFailedDeliveryChecksField(true);
    }
    public APIRequestGetAdAccounts requestFailedDeliveryChecksField (boolean value) {
      this.requestField("failed_delivery_checks", value);
      return this;
    }
    public APIRequestGetAdAccounts requestFbEntityField () {
      return this.requestFbEntityField(true);
    }
    public APIRequestGetAdAccounts requestFbEntityField (boolean value) {
      this.requestField("fb_entity", value);
      return this;
    }
    public APIRequestGetAdAccounts requestFundingSourceField () {
      return this.requestFundingSourceField(true);
    }
    public APIRequestGetAdAccounts requestFundingSourceField (boolean value) {
      this.requestField("funding_source", value);
      return this;
    }
    public APIRequestGetAdAccounts requestFundingSourceDetailsField () {
      return this.requestFundingSourceDetailsField(true);
    }
    public APIRequestGetAdAccounts requestFundingSourceDetailsField (boolean value) {
      this.requestField("funding_source_details", value);
      return this;
    }
    public APIRequestGetAdAccounts requestHasMigratedPermissionsField () {
      return this.requestHasMigratedPermissionsField(true);
    }
    public APIRequestGetAdAccounts requestHasMigratedPermissionsField (boolean value) {
      this.requestField("has_migrated_permissions", value);
      return this;
    }
    public APIRequestGetAdAccounts requestHasPageAuthorizedAdaccountField () {
      return this.requestHasPageAuthorizedAdaccountField(true);
    }
    public APIRequestGetAdAccounts requestHasPageAuthorizedAdaccountField (boolean value) {
      this.requestField("has_page_authorized_adaccount", value);
      return this;
    }
    public APIRequestGetAdAccounts requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAdAccounts requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAdAccounts requestIoNumberField () {
      return this.requestIoNumberField(true);
    }
    public APIRequestGetAdAccounts requestIoNumberField (boolean value) {
      this.requestField("io_number", value);
      return this;
    }
    public APIRequestGetAdAccounts requestIsAttributionSpecSystemDefaultField () {
      return this.requestIsAttributionSpecSystemDefaultField(true);
    }
    public APIRequestGetAdAccounts requestIsAttributionSpecSystemDefaultField (boolean value) {
      this.requestField("is_attribution_spec_system_default", value);
      return this;
    }
    public APIRequestGetAdAccounts requestIsDirectDealsEnabledField () {
      return this.requestIsDirectDealsEnabledField(true);
    }
    public APIRequestGetAdAccounts requestIsDirectDealsEnabledField (boolean value) {
      this.requestField("is_direct_deals_enabled", value);
      return this;
    }
    public APIRequestGetAdAccounts requestIsIn3dsAuthorizationEnabledMarketField () {
      return this.requestIsIn3dsAuthorizationEnabledMarketField(true);
    }
    public APIRequestGetAdAccounts requestIsIn3dsAuthorizationEnabledMarketField (boolean value) {
      this.requestField("is_in_3ds_authorization_enabled_market", value);
      return this;
    }
    public APIRequestGetAdAccounts requestIsInMiddleOfLocalEntityMigrationField () {
      return this.requestIsInMiddleOfLocalEntityMigrationField(true);
    }
    public APIRequestGetAdAccounts requestIsInMiddleOfLocalEntityMigrationField (boolean value) {
      this.requestField("is_in_middle_of_local_entity_migration", value);
      return this;
    }
    public APIRequestGetAdAccounts requestIsNotificationsEnabledField () {
      return this.requestIsNotificationsEnabledField(true);
    }
    public APIRequestGetAdAccounts requestIsNotificationsEnabledField (boolean value) {
      this.requestField("is_notifications_enabled", value);
      return this;
    }
    public APIRequestGetAdAccounts requestIsPersonalField () {
      return this.requestIsPersonalField(true);
    }
    public APIRequestGetAdAccounts requestIsPersonalField (boolean value) {
      this.requestField("is_personal", value);
      return this;
    }
    public APIRequestGetAdAccounts requestIsPrepayAccountField () {
      return this.requestIsPrepayAccountField(true);
    }
    public APIRequestGetAdAccounts requestIsPrepayAccountField (boolean value) {
      this.requestField("is_prepay_account", value);
      return this;
    }
    public APIRequestGetAdAccounts requestIsTaxIdRequiredField () {
      return this.requestIsTaxIdRequiredField(true);
    }
    public APIRequestGetAdAccounts requestIsTaxIdRequiredField (boolean value) {
      this.requestField("is_tax_id_required", value);
      return this;
    }
    public APIRequestGetAdAccounts requestLineNumbersField () {
      return this.requestLineNumbersField(true);
    }
    public APIRequestGetAdAccounts requestLineNumbersField (boolean value) {
      this.requestField("line_numbers", value);
      return this;
    }
    public APIRequestGetAdAccounts requestMediaAgencyField () {
      return this.requestMediaAgencyField(true);
    }
    public APIRequestGetAdAccounts requestMediaAgencyField (boolean value) {
      this.requestField("media_agency", value);
      return this;
    }
    public APIRequestGetAdAccounts requestMinCampaignGroupSpendCapField () {
      return this.requestMinCampaignGroupSpendCapField(true);
    }
    public APIRequestGetAdAccounts requestMinCampaignGroupSpendCapField (boolean value) {
      this.requestField("min_campaign_group_spend_cap", value);
      return this;
    }
    public APIRequestGetAdAccounts requestMinDailyBudgetField () {
      return this.requestMinDailyBudgetField(true);
    }
    public APIRequestGetAdAccounts requestMinDailyBudgetField (boolean value) {
      this.requestField("min_daily_budget", value);
      return this;
    }
    public APIRequestGetAdAccounts requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAdAccounts requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAdAccounts requestOffsitePixelsTosAcceptedField () {
      return this.requestOffsitePixelsTosAcceptedField(true);
    }
    public APIRequestGetAdAccounts requestOffsitePixelsTosAcceptedField (boolean value) {
      this.requestField("offsite_pixels_tos_accepted", value);
      return this;
    }
    public APIRequestGetAdAccounts requestOwnerField () {
      return this.requestOwnerField(true);
    }
    public APIRequestGetAdAccounts requestOwnerField (boolean value) {
      this.requestField("owner", value);
      return this;
    }
    public APIRequestGetAdAccounts requestPartnerField () {
      return this.requestPartnerField(true);
    }
    public APIRequestGetAdAccounts requestPartnerField (boolean value) {
      this.requestField("partner", value);
      return this;
    }
    public APIRequestGetAdAccounts requestRfSpecField () {
      return this.requestRfSpecField(true);
    }
    public APIRequestGetAdAccounts requestRfSpecField (boolean value) {
      this.requestField("rf_spec", value);
      return this;
    }
    public APIRequestGetAdAccounts requestShowCheckoutExperienceField () {
      return this.requestShowCheckoutExperienceField(true);
    }
    public APIRequestGetAdAccounts requestShowCheckoutExperienceField (boolean value) {
      this.requestField("show_checkout_experience", value);
      return this;
    }
    public APIRequestGetAdAccounts requestSpendCapField () {
      return this.requestSpendCapField(true);
    }
    public APIRequestGetAdAccounts requestSpendCapField (boolean value) {
      this.requestField("spend_cap", value);
      return this;
    }
    public APIRequestGetAdAccounts requestTaxIdField () {
      return this.requestTaxIdField(true);
    }
    public APIRequestGetAdAccounts requestTaxIdField (boolean value) {
      this.requestField("tax_id", value);
      return this;
    }
    public APIRequestGetAdAccounts requestTaxIdStatusField () {
      return this.requestTaxIdStatusField(true);
    }
    public APIRequestGetAdAccounts requestTaxIdStatusField (boolean value) {
      this.requestField("tax_id_status", value);
      return this;
    }
    public APIRequestGetAdAccounts requestTaxIdTypeField () {
      return this.requestTaxIdTypeField(true);
    }
    public APIRequestGetAdAccounts requestTaxIdTypeField (boolean value) {
      this.requestField("tax_id_type", value);
      return this;
    }
    public APIRequestGetAdAccounts requestTimezoneIdField () {
      return this.requestTimezoneIdField(true);
    }
    public APIRequestGetAdAccounts requestTimezoneIdField (boolean value) {
      this.requestField("timezone_id", value);
      return this;
    }
    public APIRequestGetAdAccounts requestTimezoneNameField () {
      return this.requestTimezoneNameField(true);
    }
    public APIRequestGetAdAccounts requestTimezoneNameField (boolean value) {
      this.requestField("timezone_name", value);
      return this;
    }
    public APIRequestGetAdAccounts requestTimezoneOffsetHoursUtcField () {
      return this.requestTimezoneOffsetHoursUtcField(true);
    }
    public APIRequestGetAdAccounts requestTimezoneOffsetHoursUtcField (boolean value) {
      this.requestField("timezone_offset_hours_utc", value);
      return this;
    }
    public APIRequestGetAdAccounts requestTosAcceptedField () {
      return this.requestTosAcceptedField(true);
    }
    public APIRequestGetAdAccounts requestTosAcceptedField (boolean value) {
      this.requestField("tos_accepted", value);
      return this;
    }
    public APIRequestGetAdAccounts requestUserRoleField () {
      return this.requestUserRoleField(true);
    }
    public APIRequestGetAdAccounts requestUserRoleField (boolean value) {
      this.requestField("user_role", value);
      return this;
    }
    public APIRequestGetAdAccounts requestUserTosAcceptedField () {
      return this.requestUserTosAcceptedField(true);
    }
    public APIRequestGetAdAccounts requestUserTosAcceptedField (boolean value) {
      this.requestField("user_tos_accepted", value);
      return this;
    }
  }

  public static class APIRequestGetAlbums extends APIRequest<Album> {

    APINodeList<Album> lastResponse = null;
    @Override
    public APINodeList<Album> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "backdated_time",
      "backdated_time_granularity",
      "can_backdate",
      "can_upload",
      "count",
      "cover_photo",
      "created_time",
      "description",
      "edit_link",
      "event",
      "from",
      "id",
      "is_user_facing",
      "link",
      "location",
      "modified_major",
      "name",
      "photo_count",
      "place",
      "privacy",
      "type",
      "updated_time",
      "video_count",
    };

    @Override
    public APINodeList<Album> parseResponse(String response, String header) throws APIException {
      return Album.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Album> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Album> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Album>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Album>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Album>>() {
           public APINodeList<Album> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAlbums.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAlbums(String nodeId, APIContext context) {
      super(context, nodeId, "/albums", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAlbums setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAlbums setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAlbums requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAlbums requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAlbums requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAlbums requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAlbums requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAlbums requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAlbums requestBackdatedTimeField () {
      return this.requestBackdatedTimeField(true);
    }
    public APIRequestGetAlbums requestBackdatedTimeField (boolean value) {
      this.requestField("backdated_time", value);
      return this;
    }
    public APIRequestGetAlbums requestBackdatedTimeGranularityField () {
      return this.requestBackdatedTimeGranularityField(true);
    }
    public APIRequestGetAlbums requestBackdatedTimeGranularityField (boolean value) {
      this.requestField("backdated_time_granularity", value);
      return this;
    }
    public APIRequestGetAlbums requestCanBackdateField () {
      return this.requestCanBackdateField(true);
    }
    public APIRequestGetAlbums requestCanBackdateField (boolean value) {
      this.requestField("can_backdate", value);
      return this;
    }
    public APIRequestGetAlbums requestCanUploadField () {
      return this.requestCanUploadField(true);
    }
    public APIRequestGetAlbums requestCanUploadField (boolean value) {
      this.requestField("can_upload", value);
      return this;
    }
    public APIRequestGetAlbums requestCountField () {
      return this.requestCountField(true);
    }
    public APIRequestGetAlbums requestCountField (boolean value) {
      this.requestField("count", value);
      return this;
    }
    public APIRequestGetAlbums requestCoverPhotoField () {
      return this.requestCoverPhotoField(true);
    }
    public APIRequestGetAlbums requestCoverPhotoField (boolean value) {
      this.requestField("cover_photo", value);
      return this;
    }
    public APIRequestGetAlbums requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAlbums requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAlbums requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetAlbums requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetAlbums requestEditLinkField () {
      return this.requestEditLinkField(true);
    }
    public APIRequestGetAlbums requestEditLinkField (boolean value) {
      this.requestField("edit_link", value);
      return this;
    }
    public APIRequestGetAlbums requestEventField () {
      return this.requestEventField(true);
    }
    public APIRequestGetAlbums requestEventField (boolean value) {
      this.requestField("event", value);
      return this;
    }
    public APIRequestGetAlbums requestFromField () {
      return this.requestFromField(true);
    }
    public APIRequestGetAlbums requestFromField (boolean value) {
      this.requestField("from", value);
      return this;
    }
    public APIRequestGetAlbums requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAlbums requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAlbums requestIsUserFacingField () {
      return this.requestIsUserFacingField(true);
    }
    public APIRequestGetAlbums requestIsUserFacingField (boolean value) {
      this.requestField("is_user_facing", value);
      return this;
    }
    public APIRequestGetAlbums requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetAlbums requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetAlbums requestLocationField () {
      return this.requestLocationField(true);
    }
    public APIRequestGetAlbums requestLocationField (boolean value) {
      this.requestField("location", value);
      return this;
    }
    public APIRequestGetAlbums requestModifiedMajorField () {
      return this.requestModifiedMajorField(true);
    }
    public APIRequestGetAlbums requestModifiedMajorField (boolean value) {
      this.requestField("modified_major", value);
      return this;
    }
    public APIRequestGetAlbums requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAlbums requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAlbums requestPhotoCountField () {
      return this.requestPhotoCountField(true);
    }
    public APIRequestGetAlbums requestPhotoCountField (boolean value) {
      this.requestField("photo_count", value);
      return this;
    }
    public APIRequestGetAlbums requestPlaceField () {
      return this.requestPlaceField(true);
    }
    public APIRequestGetAlbums requestPlaceField (boolean value) {
      this.requestField("place", value);
      return this;
    }
    public APIRequestGetAlbums requestPrivacyField () {
      return this.requestPrivacyField(true);
    }
    public APIRequestGetAlbums requestPrivacyField (boolean value) {
      this.requestField("privacy", value);
      return this;
    }
    public APIRequestGetAlbums requestTypeField () {
      return this.requestTypeField(true);
    }
    public APIRequestGetAlbums requestTypeField (boolean value) {
      this.requestField("type", value);
      return this;
    }
    public APIRequestGetAlbums requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetAlbums requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
    public APIRequestGetAlbums requestVideoCountField () {
      return this.requestVideoCountField(true);
    }
    public APIRequestGetAlbums requestVideoCountField (boolean value) {
      this.requestField("video_count", value);
      return this;
    }
  }

  public static class APIRequestCreateApplication extends APIRequest<User> {

    User lastResponse = null;
    @Override
    public User getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "business_app",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public User parseResponse(String response, String header) throws APIException {
      return User.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public User execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public User execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<User> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<User> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, User>() {
           public User apply(ResponseWrapper result) {
             try {
               return APIRequestCreateApplication.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateApplication(String nodeId, APIContext context) {
      super(context, nodeId, "/applications", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateApplication setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateApplication setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateApplication setBusinessApp (Long businessApp) {
      this.setParam("business_app", businessApp);
      return this;
    }
    public APIRequestCreateApplication setBusinessApp (String businessApp) {
      this.setParam("business_app", businessApp);
      return this;
    }

    public APIRequestCreateApplication requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateApplication requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateApplication requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateApplication requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateApplication requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateApplication requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetAppRequestFormerRecipients extends APIRequest<AppRequestFormerRecipient> {

    APINodeList<AppRequestFormerRecipient> lastResponse = null;
    @Override
    public APINodeList<AppRequestFormerRecipient> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "id",
      "recipient_id",
    };

    @Override
    public APINodeList<AppRequestFormerRecipient> parseResponse(String response, String header) throws APIException {
      return AppRequestFormerRecipient.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AppRequestFormerRecipient> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AppRequestFormerRecipient> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AppRequestFormerRecipient>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AppRequestFormerRecipient>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AppRequestFormerRecipient>>() {
           public APINodeList<AppRequestFormerRecipient> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAppRequestFormerRecipients.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAppRequestFormerRecipients(String nodeId, APIContext context) {
      super(context, nodeId, "/apprequestformerrecipients", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAppRequestFormerRecipients setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAppRequestFormerRecipients setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAppRequestFormerRecipients requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAppRequestFormerRecipients requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAppRequestFormerRecipients requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAppRequestFormerRecipients requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAppRequestFormerRecipients requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAppRequestFormerRecipients requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAppRequestFormerRecipients requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAppRequestFormerRecipients requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAppRequestFormerRecipients requestRecipientIdField () {
      return this.requestRecipientIdField(true);
    }
    public APIRequestGetAppRequestFormerRecipients requestRecipientIdField (boolean value) {
      this.requestField("recipient_id", value);
      return this;
    }
  }

  public static class APIRequestGetAppRequests extends APIRequest<AppRequest> {

    APINodeList<AppRequest> lastResponse = null;
    @Override
    public APINodeList<AppRequest> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "action_type",
      "application",
      "created_time",
      "data",
      "from",
      "id",
      "message",
      "object",
      "to",
    };

    @Override
    public APINodeList<AppRequest> parseResponse(String response, String header) throws APIException {
      return AppRequest.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AppRequest> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AppRequest> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AppRequest>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AppRequest>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AppRequest>>() {
           public APINodeList<AppRequest> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAppRequests.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAppRequests(String nodeId, APIContext context) {
      super(context, nodeId, "/apprequests", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAppRequests setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAppRequests setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAppRequests requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAppRequests requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAppRequests requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAppRequests requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAppRequests requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAppRequests requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAppRequests requestActionTypeField () {
      return this.requestActionTypeField(true);
    }
    public APIRequestGetAppRequests requestActionTypeField (boolean value) {
      this.requestField("action_type", value);
      return this;
    }
    public APIRequestGetAppRequests requestApplicationField () {
      return this.requestApplicationField(true);
    }
    public APIRequestGetAppRequests requestApplicationField (boolean value) {
      this.requestField("application", value);
      return this;
    }
    public APIRequestGetAppRequests requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAppRequests requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAppRequests requestDataField () {
      return this.requestDataField(true);
    }
    public APIRequestGetAppRequests requestDataField (boolean value) {
      this.requestField("data", value);
      return this;
    }
    public APIRequestGetAppRequests requestFromField () {
      return this.requestFromField(true);
    }
    public APIRequestGetAppRequests requestFromField (boolean value) {
      this.requestField("from", value);
      return this;
    }
    public APIRequestGetAppRequests requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAppRequests requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAppRequests requestMessageField () {
      return this.requestMessageField(true);
    }
    public APIRequestGetAppRequests requestMessageField (boolean value) {
      this.requestField("message", value);
      return this;
    }
    public APIRequestGetAppRequests requestObjectField () {
      return this.requestObjectField(true);
    }
    public APIRequestGetAppRequests requestObjectField (boolean value) {
      this.requestField("object", value);
      return this;
    }
    public APIRequestGetAppRequests requestToField () {
      return this.requestToField(true);
    }
    public APIRequestGetAppRequests requestToField (boolean value) {
      this.requestField("to", value);
      return this;
    }
  }

  public static class APIRequestGetAssignedAdAccounts extends APIRequest<AdAccount> {

    APINodeList<AdAccount> lastResponse = null;
    @Override
    public APINodeList<AdAccount> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "account_id",
      "account_status",
      "ad_account_creation_request",
      "ad_account_promotable_objects",
      "age",
      "agency_client_declaration",
      "amount_spent",
      "attribution_spec",
      "balance",
      "business",
      "business_city",
      "business_country_code",
      "business_name",
      "business_state",
      "business_street",
      "business_street2",
      "business_zip",
      "capabilities",
      "created_time",
      "currency",
      "disable_reason",
      "end_advertiser",
      "end_advertiser_name",
      "failed_delivery_checks",
      "fb_entity",
      "funding_source",
      "funding_source_details",
      "has_migrated_permissions",
      "has_page_authorized_adaccount",
      "id",
      "io_number",
      "is_attribution_spec_system_default",
      "is_direct_deals_enabled",
      "is_in_3ds_authorization_enabled_market",
      "is_in_middle_of_local_entity_migration",
      "is_notifications_enabled",
      "is_personal",
      "is_prepay_account",
      "is_tax_id_required",
      "line_numbers",
      "media_agency",
      "min_campaign_group_spend_cap",
      "min_daily_budget",
      "name",
      "offsite_pixels_tos_accepted",
      "owner",
      "partner",
      "rf_spec",
      "show_checkout_experience",
      "spend_cap",
      "tax_id",
      "tax_id_status",
      "tax_id_type",
      "timezone_id",
      "timezone_name",
      "timezone_offset_hours_utc",
      "tos_accepted",
      "user_role",
      "user_tos_accepted",
    };

    @Override
    public APINodeList<AdAccount> parseResponse(String response, String header) throws APIException {
      return AdAccount.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdAccount> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdAccount> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdAccount>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdAccount>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdAccount>>() {
           public APINodeList<AdAccount> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAssignedAdAccounts.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAssignedAdAccounts(String nodeId, APIContext context) {
      super(context, nodeId, "/assigned_ad_accounts", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAssignedAdAccounts setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAssignedAdAccounts setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAssignedAdAccounts requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAssignedAdAccounts requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAssignedAdAccounts requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAssignedAdAccounts requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAssignedAdAccounts requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAssignedAdAccounts requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAssignedAdAccounts requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetAssignedAdAccounts requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestAccountStatusField () {
      return this.requestAccountStatusField(true);
    }
    public APIRequestGetAssignedAdAccounts requestAccountStatusField (boolean value) {
      this.requestField("account_status", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestAdAccountCreationRequestField () {
      return this.requestAdAccountCreationRequestField(true);
    }
    public APIRequestGetAssignedAdAccounts requestAdAccountCreationRequestField (boolean value) {
      this.requestField("ad_account_creation_request", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestAdAccountPromotableObjectsField () {
      return this.requestAdAccountPromotableObjectsField(true);
    }
    public APIRequestGetAssignedAdAccounts requestAdAccountPromotableObjectsField (boolean value) {
      this.requestField("ad_account_promotable_objects", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestAgeField () {
      return this.requestAgeField(true);
    }
    public APIRequestGetAssignedAdAccounts requestAgeField (boolean value) {
      this.requestField("age", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestAgencyClientDeclarationField () {
      return this.requestAgencyClientDeclarationField(true);
    }
    public APIRequestGetAssignedAdAccounts requestAgencyClientDeclarationField (boolean value) {
      this.requestField("agency_client_declaration", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestAmountSpentField () {
      return this.requestAmountSpentField(true);
    }
    public APIRequestGetAssignedAdAccounts requestAmountSpentField (boolean value) {
      this.requestField("amount_spent", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestAttributionSpecField () {
      return this.requestAttributionSpecField(true);
    }
    public APIRequestGetAssignedAdAccounts requestAttributionSpecField (boolean value) {
      this.requestField("attribution_spec", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestBalanceField () {
      return this.requestBalanceField(true);
    }
    public APIRequestGetAssignedAdAccounts requestBalanceField (boolean value) {
      this.requestField("balance", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetAssignedAdAccounts requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestBusinessCityField () {
      return this.requestBusinessCityField(true);
    }
    public APIRequestGetAssignedAdAccounts requestBusinessCityField (boolean value) {
      this.requestField("business_city", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestBusinessCountryCodeField () {
      return this.requestBusinessCountryCodeField(true);
    }
    public APIRequestGetAssignedAdAccounts requestBusinessCountryCodeField (boolean value) {
      this.requestField("business_country_code", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestBusinessNameField () {
      return this.requestBusinessNameField(true);
    }
    public APIRequestGetAssignedAdAccounts requestBusinessNameField (boolean value) {
      this.requestField("business_name", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestBusinessStateField () {
      return this.requestBusinessStateField(true);
    }
    public APIRequestGetAssignedAdAccounts requestBusinessStateField (boolean value) {
      this.requestField("business_state", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestBusinessStreetField () {
      return this.requestBusinessStreetField(true);
    }
    public APIRequestGetAssignedAdAccounts requestBusinessStreetField (boolean value) {
      this.requestField("business_street", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestBusinessStreet2Field () {
      return this.requestBusinessStreet2Field(true);
    }
    public APIRequestGetAssignedAdAccounts requestBusinessStreet2Field (boolean value) {
      this.requestField("business_street2", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestBusinessZipField () {
      return this.requestBusinessZipField(true);
    }
    public APIRequestGetAssignedAdAccounts requestBusinessZipField (boolean value) {
      this.requestField("business_zip", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestCapabilitiesField () {
      return this.requestCapabilitiesField(true);
    }
    public APIRequestGetAssignedAdAccounts requestCapabilitiesField (boolean value) {
      this.requestField("capabilities", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetAssignedAdAccounts requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestCurrencyField () {
      return this.requestCurrencyField(true);
    }
    public APIRequestGetAssignedAdAccounts requestCurrencyField (boolean value) {
      this.requestField("currency", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestDisableReasonField () {
      return this.requestDisableReasonField(true);
    }
    public APIRequestGetAssignedAdAccounts requestDisableReasonField (boolean value) {
      this.requestField("disable_reason", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestEndAdvertiserField () {
      return this.requestEndAdvertiserField(true);
    }
    public APIRequestGetAssignedAdAccounts requestEndAdvertiserField (boolean value) {
      this.requestField("end_advertiser", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestEndAdvertiserNameField () {
      return this.requestEndAdvertiserNameField(true);
    }
    public APIRequestGetAssignedAdAccounts requestEndAdvertiserNameField (boolean value) {
      this.requestField("end_advertiser_name", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestFailedDeliveryChecksField () {
      return this.requestFailedDeliveryChecksField(true);
    }
    public APIRequestGetAssignedAdAccounts requestFailedDeliveryChecksField (boolean value) {
      this.requestField("failed_delivery_checks", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestFbEntityField () {
      return this.requestFbEntityField(true);
    }
    public APIRequestGetAssignedAdAccounts requestFbEntityField (boolean value) {
      this.requestField("fb_entity", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestFundingSourceField () {
      return this.requestFundingSourceField(true);
    }
    public APIRequestGetAssignedAdAccounts requestFundingSourceField (boolean value) {
      this.requestField("funding_source", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestFundingSourceDetailsField () {
      return this.requestFundingSourceDetailsField(true);
    }
    public APIRequestGetAssignedAdAccounts requestFundingSourceDetailsField (boolean value) {
      this.requestField("funding_source_details", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestHasMigratedPermissionsField () {
      return this.requestHasMigratedPermissionsField(true);
    }
    public APIRequestGetAssignedAdAccounts requestHasMigratedPermissionsField (boolean value) {
      this.requestField("has_migrated_permissions", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestHasPageAuthorizedAdaccountField () {
      return this.requestHasPageAuthorizedAdaccountField(true);
    }
    public APIRequestGetAssignedAdAccounts requestHasPageAuthorizedAdaccountField (boolean value) {
      this.requestField("has_page_authorized_adaccount", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAssignedAdAccounts requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestIoNumberField () {
      return this.requestIoNumberField(true);
    }
    public APIRequestGetAssignedAdAccounts requestIoNumberField (boolean value) {
      this.requestField("io_number", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestIsAttributionSpecSystemDefaultField () {
      return this.requestIsAttributionSpecSystemDefaultField(true);
    }
    public APIRequestGetAssignedAdAccounts requestIsAttributionSpecSystemDefaultField (boolean value) {
      this.requestField("is_attribution_spec_system_default", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestIsDirectDealsEnabledField () {
      return this.requestIsDirectDealsEnabledField(true);
    }
    public APIRequestGetAssignedAdAccounts requestIsDirectDealsEnabledField (boolean value) {
      this.requestField("is_direct_deals_enabled", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestIsIn3dsAuthorizationEnabledMarketField () {
      return this.requestIsIn3dsAuthorizationEnabledMarketField(true);
    }
    public APIRequestGetAssignedAdAccounts requestIsIn3dsAuthorizationEnabledMarketField (boolean value) {
      this.requestField("is_in_3ds_authorization_enabled_market", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestIsInMiddleOfLocalEntityMigrationField () {
      return this.requestIsInMiddleOfLocalEntityMigrationField(true);
    }
    public APIRequestGetAssignedAdAccounts requestIsInMiddleOfLocalEntityMigrationField (boolean value) {
      this.requestField("is_in_middle_of_local_entity_migration", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestIsNotificationsEnabledField () {
      return this.requestIsNotificationsEnabledField(true);
    }
    public APIRequestGetAssignedAdAccounts requestIsNotificationsEnabledField (boolean value) {
      this.requestField("is_notifications_enabled", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestIsPersonalField () {
      return this.requestIsPersonalField(true);
    }
    public APIRequestGetAssignedAdAccounts requestIsPersonalField (boolean value) {
      this.requestField("is_personal", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestIsPrepayAccountField () {
      return this.requestIsPrepayAccountField(true);
    }
    public APIRequestGetAssignedAdAccounts requestIsPrepayAccountField (boolean value) {
      this.requestField("is_prepay_account", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestIsTaxIdRequiredField () {
      return this.requestIsTaxIdRequiredField(true);
    }
    public APIRequestGetAssignedAdAccounts requestIsTaxIdRequiredField (boolean value) {
      this.requestField("is_tax_id_required", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestLineNumbersField () {
      return this.requestLineNumbersField(true);
    }
    public APIRequestGetAssignedAdAccounts requestLineNumbersField (boolean value) {
      this.requestField("line_numbers", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestMediaAgencyField () {
      return this.requestMediaAgencyField(true);
    }
    public APIRequestGetAssignedAdAccounts requestMediaAgencyField (boolean value) {
      this.requestField("media_agency", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestMinCampaignGroupSpendCapField () {
      return this.requestMinCampaignGroupSpendCapField(true);
    }
    public APIRequestGetAssignedAdAccounts requestMinCampaignGroupSpendCapField (boolean value) {
      this.requestField("min_campaign_group_spend_cap", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestMinDailyBudgetField () {
      return this.requestMinDailyBudgetField(true);
    }
    public APIRequestGetAssignedAdAccounts requestMinDailyBudgetField (boolean value) {
      this.requestField("min_daily_budget", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAssignedAdAccounts requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestOffsitePixelsTosAcceptedField () {
      return this.requestOffsitePixelsTosAcceptedField(true);
    }
    public APIRequestGetAssignedAdAccounts requestOffsitePixelsTosAcceptedField (boolean value) {
      this.requestField("offsite_pixels_tos_accepted", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestOwnerField () {
      return this.requestOwnerField(true);
    }
    public APIRequestGetAssignedAdAccounts requestOwnerField (boolean value) {
      this.requestField("owner", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestPartnerField () {
      return this.requestPartnerField(true);
    }
    public APIRequestGetAssignedAdAccounts requestPartnerField (boolean value) {
      this.requestField("partner", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestRfSpecField () {
      return this.requestRfSpecField(true);
    }
    public APIRequestGetAssignedAdAccounts requestRfSpecField (boolean value) {
      this.requestField("rf_spec", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestShowCheckoutExperienceField () {
      return this.requestShowCheckoutExperienceField(true);
    }
    public APIRequestGetAssignedAdAccounts requestShowCheckoutExperienceField (boolean value) {
      this.requestField("show_checkout_experience", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestSpendCapField () {
      return this.requestSpendCapField(true);
    }
    public APIRequestGetAssignedAdAccounts requestSpendCapField (boolean value) {
      this.requestField("spend_cap", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestTaxIdField () {
      return this.requestTaxIdField(true);
    }
    public APIRequestGetAssignedAdAccounts requestTaxIdField (boolean value) {
      this.requestField("tax_id", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestTaxIdStatusField () {
      return this.requestTaxIdStatusField(true);
    }
    public APIRequestGetAssignedAdAccounts requestTaxIdStatusField (boolean value) {
      this.requestField("tax_id_status", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestTaxIdTypeField () {
      return this.requestTaxIdTypeField(true);
    }
    public APIRequestGetAssignedAdAccounts requestTaxIdTypeField (boolean value) {
      this.requestField("tax_id_type", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestTimezoneIdField () {
      return this.requestTimezoneIdField(true);
    }
    public APIRequestGetAssignedAdAccounts requestTimezoneIdField (boolean value) {
      this.requestField("timezone_id", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestTimezoneNameField () {
      return this.requestTimezoneNameField(true);
    }
    public APIRequestGetAssignedAdAccounts requestTimezoneNameField (boolean value) {
      this.requestField("timezone_name", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestTimezoneOffsetHoursUtcField () {
      return this.requestTimezoneOffsetHoursUtcField(true);
    }
    public APIRequestGetAssignedAdAccounts requestTimezoneOffsetHoursUtcField (boolean value) {
      this.requestField("timezone_offset_hours_utc", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestTosAcceptedField () {
      return this.requestTosAcceptedField(true);
    }
    public APIRequestGetAssignedAdAccounts requestTosAcceptedField (boolean value) {
      this.requestField("tos_accepted", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestUserRoleField () {
      return this.requestUserRoleField(true);
    }
    public APIRequestGetAssignedAdAccounts requestUserRoleField (boolean value) {
      this.requestField("user_role", value);
      return this;
    }
    public APIRequestGetAssignedAdAccounts requestUserTosAcceptedField () {
      return this.requestUserTosAcceptedField(true);
    }
    public APIRequestGetAssignedAdAccounts requestUserTosAcceptedField (boolean value) {
      this.requestField("user_tos_accepted", value);
      return this;
    }
  }

  public static class APIRequestGetAssignedPages extends APIRequest<Page> {

    APINodeList<Page> lastResponse = null;
    @Override
    public APINodeList<Page> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "about",
      "access_token",
      "ad_campaign",
      "affiliation",
      "app_id",
      "app_links",
      "artists_we_like",
      "attire",
      "awards",
      "band_interests",
      "band_members",
      "best_page",
      "bio",
      "birthday",
      "booking_agent",
      "built",
      "business",
      "can_checkin",
      "can_post",
      "category",
      "category_list",
      "checkins",
      "company_overview",
      "connected_instagram_account",
      "contact_address",
      "copyright_attribution_insights",
      "copyright_whitelisted_ig_partners",
      "country_page_likes",
      "cover",
      "culinary_team",
      "current_location",
      "description",
      "description_html",
      "directed_by",
      "display_subtext",
      "displayed_message_response_time",
      "emails",
      "engagement",
      "fan_count",
      "featured_video",
      "features",
      "food_styles",
      "founded",
      "general_info",
      "general_manager",
      "genre",
      "global_brand_page_name",
      "global_brand_root_id",
      "has_added_app",
      "has_whatsapp_business_number",
      "has_whatsapp_number",
      "hometown",
      "hours",
      "id",
      "impressum",
      "influences",
      "instagram_business_account",
      "instant_articles_review_status",
      "is_always_open",
      "is_chain",
      "is_community_page",
      "is_eligible_for_branded_content",
      "is_messenger_bot_get_started_enabled",
      "is_messenger_platform_bot",
      "is_owned",
      "is_permanently_closed",
      "is_published",
      "is_unclaimed",
      "is_verified",
      "is_webhooks_subscribed",
      "keywords",
      "leadgen_form_preview_details",
      "leadgen_has_crm_integration",
      "leadgen_has_fat_ping_crm_integration",
      "leadgen_tos_acceptance_time",
      "leadgen_tos_accepted",
      "leadgen_tos_accepting_user",
      "link",
      "location",
      "members",
      "merchant_id",
      "merchant_review_status",
      "messenger_ads_default_icebreakers",
      "messenger_ads_default_page_welcome_message",
      "messenger_ads_default_quick_replies",
      "messenger_ads_quick_replies_type",
      "mission",
      "mpg",
      "name",
      "name_with_location_descriptor",
      "network",
      "new_like_count",
      "offer_eligible",
      "overall_star_rating",
      "page_about_story",
      "page_token",
      "parent_page",
      "parking",
      "payment_options",
      "personal_info",
      "personal_interests",
      "pharma_safety_info",
      "phone",
      "place_type",
      "plot_outline",
      "preferred_audience",
      "press_contact",
      "price_range",
      "privacy_info_url",
      "produced_by",
      "products",
      "promotion_eligible",
      "promotion_ineligible_reason",
      "public_transit",
      "rating_count",
      "recipient",
      "record_label",
      "release_date",
      "restaurant_services",
      "restaurant_specialties",
      "schedule",
      "screenplay_by",
      "season",
      "single_line_address",
      "starring",
      "start_info",
      "store_code",
      "store_location_descriptor",
      "store_number",
      "studio",
      "supports_instant_articles",
      "talking_about_count",
      "unread_message_count",
      "unread_notif_count",
      "unseen_message_count",
      "username",
      "verification_status",
      "voip_info",
      "website",
      "were_here_count",
      "whatsapp_number",
      "written_by",
    };

    @Override
    public APINodeList<Page> parseResponse(String response, String header) throws APIException {
      return Page.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Page> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Page> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Page>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Page>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Page>>() {
           public APINodeList<Page> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAssignedPages.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAssignedPages(String nodeId, APIContext context) {
      super(context, nodeId, "/assigned_pages", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAssignedPages setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAssignedPages setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAssignedPages requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAssignedPages requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAssignedPages requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAssignedPages requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAssignedPages requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAssignedPages requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAssignedPages requestAboutField () {
      return this.requestAboutField(true);
    }
    public APIRequestGetAssignedPages requestAboutField (boolean value) {
      this.requestField("about", value);
      return this;
    }
    public APIRequestGetAssignedPages requestAccessTokenField () {
      return this.requestAccessTokenField(true);
    }
    public APIRequestGetAssignedPages requestAccessTokenField (boolean value) {
      this.requestField("access_token", value);
      return this;
    }
    public APIRequestGetAssignedPages requestAdCampaignField () {
      return this.requestAdCampaignField(true);
    }
    public APIRequestGetAssignedPages requestAdCampaignField (boolean value) {
      this.requestField("ad_campaign", value);
      return this;
    }
    public APIRequestGetAssignedPages requestAffiliationField () {
      return this.requestAffiliationField(true);
    }
    public APIRequestGetAssignedPages requestAffiliationField (boolean value) {
      this.requestField("affiliation", value);
      return this;
    }
    public APIRequestGetAssignedPages requestAppIdField () {
      return this.requestAppIdField(true);
    }
    public APIRequestGetAssignedPages requestAppIdField (boolean value) {
      this.requestField("app_id", value);
      return this;
    }
    public APIRequestGetAssignedPages requestAppLinksField () {
      return this.requestAppLinksField(true);
    }
    public APIRequestGetAssignedPages requestAppLinksField (boolean value) {
      this.requestField("app_links", value);
      return this;
    }
    public APIRequestGetAssignedPages requestArtistsWeLikeField () {
      return this.requestArtistsWeLikeField(true);
    }
    public APIRequestGetAssignedPages requestArtistsWeLikeField (boolean value) {
      this.requestField("artists_we_like", value);
      return this;
    }
    public APIRequestGetAssignedPages requestAttireField () {
      return this.requestAttireField(true);
    }
    public APIRequestGetAssignedPages requestAttireField (boolean value) {
      this.requestField("attire", value);
      return this;
    }
    public APIRequestGetAssignedPages requestAwardsField () {
      return this.requestAwardsField(true);
    }
    public APIRequestGetAssignedPages requestAwardsField (boolean value) {
      this.requestField("awards", value);
      return this;
    }
    public APIRequestGetAssignedPages requestBandInterestsField () {
      return this.requestBandInterestsField(true);
    }
    public APIRequestGetAssignedPages requestBandInterestsField (boolean value) {
      this.requestField("band_interests", value);
      return this;
    }
    public APIRequestGetAssignedPages requestBandMembersField () {
      return this.requestBandMembersField(true);
    }
    public APIRequestGetAssignedPages requestBandMembersField (boolean value) {
      this.requestField("band_members", value);
      return this;
    }
    public APIRequestGetAssignedPages requestBestPageField () {
      return this.requestBestPageField(true);
    }
    public APIRequestGetAssignedPages requestBestPageField (boolean value) {
      this.requestField("best_page", value);
      return this;
    }
    public APIRequestGetAssignedPages requestBioField () {
      return this.requestBioField(true);
    }
    public APIRequestGetAssignedPages requestBioField (boolean value) {
      this.requestField("bio", value);
      return this;
    }
    public APIRequestGetAssignedPages requestBirthdayField () {
      return this.requestBirthdayField(true);
    }
    public APIRequestGetAssignedPages requestBirthdayField (boolean value) {
      this.requestField("birthday", value);
      return this;
    }
    public APIRequestGetAssignedPages requestBookingAgentField () {
      return this.requestBookingAgentField(true);
    }
    public APIRequestGetAssignedPages requestBookingAgentField (boolean value) {
      this.requestField("booking_agent", value);
      return this;
    }
    public APIRequestGetAssignedPages requestBuiltField () {
      return this.requestBuiltField(true);
    }
    public APIRequestGetAssignedPages requestBuiltField (boolean value) {
      this.requestField("built", value);
      return this;
    }
    public APIRequestGetAssignedPages requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetAssignedPages requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetAssignedPages requestCanCheckinField () {
      return this.requestCanCheckinField(true);
    }
    public APIRequestGetAssignedPages requestCanCheckinField (boolean value) {
      this.requestField("can_checkin", value);
      return this;
    }
    public APIRequestGetAssignedPages requestCanPostField () {
      return this.requestCanPostField(true);
    }
    public APIRequestGetAssignedPages requestCanPostField (boolean value) {
      this.requestField("can_post", value);
      return this;
    }
    public APIRequestGetAssignedPages requestCategoryField () {
      return this.requestCategoryField(true);
    }
    public APIRequestGetAssignedPages requestCategoryField (boolean value) {
      this.requestField("category", value);
      return this;
    }
    public APIRequestGetAssignedPages requestCategoryListField () {
      return this.requestCategoryListField(true);
    }
    public APIRequestGetAssignedPages requestCategoryListField (boolean value) {
      this.requestField("category_list", value);
      return this;
    }
    public APIRequestGetAssignedPages requestCheckinsField () {
      return this.requestCheckinsField(true);
    }
    public APIRequestGetAssignedPages requestCheckinsField (boolean value) {
      this.requestField("checkins", value);
      return this;
    }
    public APIRequestGetAssignedPages requestCompanyOverviewField () {
      return this.requestCompanyOverviewField(true);
    }
    public APIRequestGetAssignedPages requestCompanyOverviewField (boolean value) {
      this.requestField("company_overview", value);
      return this;
    }
    public APIRequestGetAssignedPages requestConnectedInstagramAccountField () {
      return this.requestConnectedInstagramAccountField(true);
    }
    public APIRequestGetAssignedPages requestConnectedInstagramAccountField (boolean value) {
      this.requestField("connected_instagram_account", value);
      return this;
    }
    public APIRequestGetAssignedPages requestContactAddressField () {
      return this.requestContactAddressField(true);
    }
    public APIRequestGetAssignedPages requestContactAddressField (boolean value) {
      this.requestField("contact_address", value);
      return this;
    }
    public APIRequestGetAssignedPages requestCopyrightAttributionInsightsField () {
      return this.requestCopyrightAttributionInsightsField(true);
    }
    public APIRequestGetAssignedPages requestCopyrightAttributionInsightsField (boolean value) {
      this.requestField("copyright_attribution_insights", value);
      return this;
    }
    public APIRequestGetAssignedPages requestCopyrightWhitelistedIgPartnersField () {
      return this.requestCopyrightWhitelistedIgPartnersField(true);
    }
    public APIRequestGetAssignedPages requestCopyrightWhitelistedIgPartnersField (boolean value) {
      this.requestField("copyright_whitelisted_ig_partners", value);
      return this;
    }
    public APIRequestGetAssignedPages requestCountryPageLikesField () {
      return this.requestCountryPageLikesField(true);
    }
    public APIRequestGetAssignedPages requestCountryPageLikesField (boolean value) {
      this.requestField("country_page_likes", value);
      return this;
    }
    public APIRequestGetAssignedPages requestCoverField () {
      return this.requestCoverField(true);
    }
    public APIRequestGetAssignedPages requestCoverField (boolean value) {
      this.requestField("cover", value);
      return this;
    }
    public APIRequestGetAssignedPages requestCulinaryTeamField () {
      return this.requestCulinaryTeamField(true);
    }
    public APIRequestGetAssignedPages requestCulinaryTeamField (boolean value) {
      this.requestField("culinary_team", value);
      return this;
    }
    public APIRequestGetAssignedPages requestCurrentLocationField () {
      return this.requestCurrentLocationField(true);
    }
    public APIRequestGetAssignedPages requestCurrentLocationField (boolean value) {
      this.requestField("current_location", value);
      return this;
    }
    public APIRequestGetAssignedPages requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetAssignedPages requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetAssignedPages requestDescriptionHtmlField () {
      return this.requestDescriptionHtmlField(true);
    }
    public APIRequestGetAssignedPages requestDescriptionHtmlField (boolean value) {
      this.requestField("description_html", value);
      return this;
    }
    public APIRequestGetAssignedPages requestDirectedByField () {
      return this.requestDirectedByField(true);
    }
    public APIRequestGetAssignedPages requestDirectedByField (boolean value) {
      this.requestField("directed_by", value);
      return this;
    }
    public APIRequestGetAssignedPages requestDisplaySubtextField () {
      return this.requestDisplaySubtextField(true);
    }
    public APIRequestGetAssignedPages requestDisplaySubtextField (boolean value) {
      this.requestField("display_subtext", value);
      return this;
    }
    public APIRequestGetAssignedPages requestDisplayedMessageResponseTimeField () {
      return this.requestDisplayedMessageResponseTimeField(true);
    }
    public APIRequestGetAssignedPages requestDisplayedMessageResponseTimeField (boolean value) {
      this.requestField("displayed_message_response_time", value);
      return this;
    }
    public APIRequestGetAssignedPages requestEmailsField () {
      return this.requestEmailsField(true);
    }
    public APIRequestGetAssignedPages requestEmailsField (boolean value) {
      this.requestField("emails", value);
      return this;
    }
    public APIRequestGetAssignedPages requestEngagementField () {
      return this.requestEngagementField(true);
    }
    public APIRequestGetAssignedPages requestEngagementField (boolean value) {
      this.requestField("engagement", value);
      return this;
    }
    public APIRequestGetAssignedPages requestFanCountField () {
      return this.requestFanCountField(true);
    }
    public APIRequestGetAssignedPages requestFanCountField (boolean value) {
      this.requestField("fan_count", value);
      return this;
    }
    public APIRequestGetAssignedPages requestFeaturedVideoField () {
      return this.requestFeaturedVideoField(true);
    }
    public APIRequestGetAssignedPages requestFeaturedVideoField (boolean value) {
      this.requestField("featured_video", value);
      return this;
    }
    public APIRequestGetAssignedPages requestFeaturesField () {
      return this.requestFeaturesField(true);
    }
    public APIRequestGetAssignedPages requestFeaturesField (boolean value) {
      this.requestField("features", value);
      return this;
    }
    public APIRequestGetAssignedPages requestFoodStylesField () {
      return this.requestFoodStylesField(true);
    }
    public APIRequestGetAssignedPages requestFoodStylesField (boolean value) {
      this.requestField("food_styles", value);
      return this;
    }
    public APIRequestGetAssignedPages requestFoundedField () {
      return this.requestFoundedField(true);
    }
    public APIRequestGetAssignedPages requestFoundedField (boolean value) {
      this.requestField("founded", value);
      return this;
    }
    public APIRequestGetAssignedPages requestGeneralInfoField () {
      return this.requestGeneralInfoField(true);
    }
    public APIRequestGetAssignedPages requestGeneralInfoField (boolean value) {
      this.requestField("general_info", value);
      return this;
    }
    public APIRequestGetAssignedPages requestGeneralManagerField () {
      return this.requestGeneralManagerField(true);
    }
    public APIRequestGetAssignedPages requestGeneralManagerField (boolean value) {
      this.requestField("general_manager", value);
      return this;
    }
    public APIRequestGetAssignedPages requestGenreField () {
      return this.requestGenreField(true);
    }
    public APIRequestGetAssignedPages requestGenreField (boolean value) {
      this.requestField("genre", value);
      return this;
    }
    public APIRequestGetAssignedPages requestGlobalBrandPageNameField () {
      return this.requestGlobalBrandPageNameField(true);
    }
    public APIRequestGetAssignedPages requestGlobalBrandPageNameField (boolean value) {
      this.requestField("global_brand_page_name", value);
      return this;
    }
    public APIRequestGetAssignedPages requestGlobalBrandRootIdField () {
      return this.requestGlobalBrandRootIdField(true);
    }
    public APIRequestGetAssignedPages requestGlobalBrandRootIdField (boolean value) {
      this.requestField("global_brand_root_id", value);
      return this;
    }
    public APIRequestGetAssignedPages requestHasAddedAppField () {
      return this.requestHasAddedAppField(true);
    }
    public APIRequestGetAssignedPages requestHasAddedAppField (boolean value) {
      this.requestField("has_added_app", value);
      return this;
    }
    public APIRequestGetAssignedPages requestHasWhatsappBusinessNumberField () {
      return this.requestHasWhatsappBusinessNumberField(true);
    }
    public APIRequestGetAssignedPages requestHasWhatsappBusinessNumberField (boolean value) {
      this.requestField("has_whatsapp_business_number", value);
      return this;
    }
    public APIRequestGetAssignedPages requestHasWhatsappNumberField () {
      return this.requestHasWhatsappNumberField(true);
    }
    public APIRequestGetAssignedPages requestHasWhatsappNumberField (boolean value) {
      this.requestField("has_whatsapp_number", value);
      return this;
    }
    public APIRequestGetAssignedPages requestHometownField () {
      return this.requestHometownField(true);
    }
    public APIRequestGetAssignedPages requestHometownField (boolean value) {
      this.requestField("hometown", value);
      return this;
    }
    public APIRequestGetAssignedPages requestHoursField () {
      return this.requestHoursField(true);
    }
    public APIRequestGetAssignedPages requestHoursField (boolean value) {
      this.requestField("hours", value);
      return this;
    }
    public APIRequestGetAssignedPages requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAssignedPages requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAssignedPages requestImpressumField () {
      return this.requestImpressumField(true);
    }
    public APIRequestGetAssignedPages requestImpressumField (boolean value) {
      this.requestField("impressum", value);
      return this;
    }
    public APIRequestGetAssignedPages requestInfluencesField () {
      return this.requestInfluencesField(true);
    }
    public APIRequestGetAssignedPages requestInfluencesField (boolean value) {
      this.requestField("influences", value);
      return this;
    }
    public APIRequestGetAssignedPages requestInstagramBusinessAccountField () {
      return this.requestInstagramBusinessAccountField(true);
    }
    public APIRequestGetAssignedPages requestInstagramBusinessAccountField (boolean value) {
      this.requestField("instagram_business_account", value);
      return this;
    }
    public APIRequestGetAssignedPages requestInstantArticlesReviewStatusField () {
      return this.requestInstantArticlesReviewStatusField(true);
    }
    public APIRequestGetAssignedPages requestInstantArticlesReviewStatusField (boolean value) {
      this.requestField("instant_articles_review_status", value);
      return this;
    }
    public APIRequestGetAssignedPages requestIsAlwaysOpenField () {
      return this.requestIsAlwaysOpenField(true);
    }
    public APIRequestGetAssignedPages requestIsAlwaysOpenField (boolean value) {
      this.requestField("is_always_open", value);
      return this;
    }
    public APIRequestGetAssignedPages requestIsChainField () {
      return this.requestIsChainField(true);
    }
    public APIRequestGetAssignedPages requestIsChainField (boolean value) {
      this.requestField("is_chain", value);
      return this;
    }
    public APIRequestGetAssignedPages requestIsCommunityPageField () {
      return this.requestIsCommunityPageField(true);
    }
    public APIRequestGetAssignedPages requestIsCommunityPageField (boolean value) {
      this.requestField("is_community_page", value);
      return this;
    }
    public APIRequestGetAssignedPages requestIsEligibleForBrandedContentField () {
      return this.requestIsEligibleForBrandedContentField(true);
    }
    public APIRequestGetAssignedPages requestIsEligibleForBrandedContentField (boolean value) {
      this.requestField("is_eligible_for_branded_content", value);
      return this;
    }
    public APIRequestGetAssignedPages requestIsMessengerBotGetStartedEnabledField () {
      return this.requestIsMessengerBotGetStartedEnabledField(true);
    }
    public APIRequestGetAssignedPages requestIsMessengerBotGetStartedEnabledField (boolean value) {
      this.requestField("is_messenger_bot_get_started_enabled", value);
      return this;
    }
    public APIRequestGetAssignedPages requestIsMessengerPlatformBotField () {
      return this.requestIsMessengerPlatformBotField(true);
    }
    public APIRequestGetAssignedPages requestIsMessengerPlatformBotField (boolean value) {
      this.requestField("is_messenger_platform_bot", value);
      return this;
    }
    public APIRequestGetAssignedPages requestIsOwnedField () {
      return this.requestIsOwnedField(true);
    }
    public APIRequestGetAssignedPages requestIsOwnedField (boolean value) {
      this.requestField("is_owned", value);
      return this;
    }
    public APIRequestGetAssignedPages requestIsPermanentlyClosedField () {
      return this.requestIsPermanentlyClosedField(true);
    }
    public APIRequestGetAssignedPages requestIsPermanentlyClosedField (boolean value) {
      this.requestField("is_permanently_closed", value);
      return this;
    }
    public APIRequestGetAssignedPages requestIsPublishedField () {
      return this.requestIsPublishedField(true);
    }
    public APIRequestGetAssignedPages requestIsPublishedField (boolean value) {
      this.requestField("is_published", value);
      return this;
    }
    public APIRequestGetAssignedPages requestIsUnclaimedField () {
      return this.requestIsUnclaimedField(true);
    }
    public APIRequestGetAssignedPages requestIsUnclaimedField (boolean value) {
      this.requestField("is_unclaimed", value);
      return this;
    }
    public APIRequestGetAssignedPages requestIsVerifiedField () {
      return this.requestIsVerifiedField(true);
    }
    public APIRequestGetAssignedPages requestIsVerifiedField (boolean value) {
      this.requestField("is_verified", value);
      return this;
    }
    public APIRequestGetAssignedPages requestIsWebhooksSubscribedField () {
      return this.requestIsWebhooksSubscribedField(true);
    }
    public APIRequestGetAssignedPages requestIsWebhooksSubscribedField (boolean value) {
      this.requestField("is_webhooks_subscribed", value);
      return this;
    }
    public APIRequestGetAssignedPages requestKeywordsField () {
      return this.requestKeywordsField(true);
    }
    public APIRequestGetAssignedPages requestKeywordsField (boolean value) {
      this.requestField("keywords", value);
      return this;
    }
    public APIRequestGetAssignedPages requestLeadgenFormPreviewDetailsField () {
      return this.requestLeadgenFormPreviewDetailsField(true);
    }
    public APIRequestGetAssignedPages requestLeadgenFormPreviewDetailsField (boolean value) {
      this.requestField("leadgen_form_preview_details", value);
      return this;
    }
    public APIRequestGetAssignedPages requestLeadgenHasCrmIntegrationField () {
      return this.requestLeadgenHasCrmIntegrationField(true);
    }
    public APIRequestGetAssignedPages requestLeadgenHasCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_crm_integration", value);
      return this;
    }
    public APIRequestGetAssignedPages requestLeadgenHasFatPingCrmIntegrationField () {
      return this.requestLeadgenHasFatPingCrmIntegrationField(true);
    }
    public APIRequestGetAssignedPages requestLeadgenHasFatPingCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_fat_ping_crm_integration", value);
      return this;
    }
    public APIRequestGetAssignedPages requestLeadgenTosAcceptanceTimeField () {
      return this.requestLeadgenTosAcceptanceTimeField(true);
    }
    public APIRequestGetAssignedPages requestLeadgenTosAcceptanceTimeField (boolean value) {
      this.requestField("leadgen_tos_acceptance_time", value);
      return this;
    }
    public APIRequestGetAssignedPages requestLeadgenTosAcceptedField () {
      return this.requestLeadgenTosAcceptedField(true);
    }
    public APIRequestGetAssignedPages requestLeadgenTosAcceptedField (boolean value) {
      this.requestField("leadgen_tos_accepted", value);
      return this;
    }
    public APIRequestGetAssignedPages requestLeadgenTosAcceptingUserField () {
      return this.requestLeadgenTosAcceptingUserField(true);
    }
    public APIRequestGetAssignedPages requestLeadgenTosAcceptingUserField (boolean value) {
      this.requestField("leadgen_tos_accepting_user", value);
      return this;
    }
    public APIRequestGetAssignedPages requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetAssignedPages requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetAssignedPages requestLocationField () {
      return this.requestLocationField(true);
    }
    public APIRequestGetAssignedPages requestLocationField (boolean value) {
      this.requestField("location", value);
      return this;
    }
    public APIRequestGetAssignedPages requestMembersField () {
      return this.requestMembersField(true);
    }
    public APIRequestGetAssignedPages requestMembersField (boolean value) {
      this.requestField("members", value);
      return this;
    }
    public APIRequestGetAssignedPages requestMerchantIdField () {
      return this.requestMerchantIdField(true);
    }
    public APIRequestGetAssignedPages requestMerchantIdField (boolean value) {
      this.requestField("merchant_id", value);
      return this;
    }
    public APIRequestGetAssignedPages requestMerchantReviewStatusField () {
      return this.requestMerchantReviewStatusField(true);
    }
    public APIRequestGetAssignedPages requestMerchantReviewStatusField (boolean value) {
      this.requestField("merchant_review_status", value);
      return this;
    }
    public APIRequestGetAssignedPages requestMessengerAdsDefaultIcebreakersField () {
      return this.requestMessengerAdsDefaultIcebreakersField(true);
    }
    public APIRequestGetAssignedPages requestMessengerAdsDefaultIcebreakersField (boolean value) {
      this.requestField("messenger_ads_default_icebreakers", value);
      return this;
    }
    public APIRequestGetAssignedPages requestMessengerAdsDefaultPageWelcomeMessageField () {
      return this.requestMessengerAdsDefaultPageWelcomeMessageField(true);
    }
    public APIRequestGetAssignedPages requestMessengerAdsDefaultPageWelcomeMessageField (boolean value) {
      this.requestField("messenger_ads_default_page_welcome_message", value);
      return this;
    }
    public APIRequestGetAssignedPages requestMessengerAdsDefaultQuickRepliesField () {
      return this.requestMessengerAdsDefaultQuickRepliesField(true);
    }
    public APIRequestGetAssignedPages requestMessengerAdsDefaultQuickRepliesField (boolean value) {
      this.requestField("messenger_ads_default_quick_replies", value);
      return this;
    }
    public APIRequestGetAssignedPages requestMessengerAdsQuickRepliesTypeField () {
      return this.requestMessengerAdsQuickRepliesTypeField(true);
    }
    public APIRequestGetAssignedPages requestMessengerAdsQuickRepliesTypeField (boolean value) {
      this.requestField("messenger_ads_quick_replies_type", value);
      return this;
    }
    public APIRequestGetAssignedPages requestMissionField () {
      return this.requestMissionField(true);
    }
    public APIRequestGetAssignedPages requestMissionField (boolean value) {
      this.requestField("mission", value);
      return this;
    }
    public APIRequestGetAssignedPages requestMpgField () {
      return this.requestMpgField(true);
    }
    public APIRequestGetAssignedPages requestMpgField (boolean value) {
      this.requestField("mpg", value);
      return this;
    }
    public APIRequestGetAssignedPages requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAssignedPages requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAssignedPages requestNameWithLocationDescriptorField () {
      return this.requestNameWithLocationDescriptorField(true);
    }
    public APIRequestGetAssignedPages requestNameWithLocationDescriptorField (boolean value) {
      this.requestField("name_with_location_descriptor", value);
      return this;
    }
    public APIRequestGetAssignedPages requestNetworkField () {
      return this.requestNetworkField(true);
    }
    public APIRequestGetAssignedPages requestNetworkField (boolean value) {
      this.requestField("network", value);
      return this;
    }
    public APIRequestGetAssignedPages requestNewLikeCountField () {
      return this.requestNewLikeCountField(true);
    }
    public APIRequestGetAssignedPages requestNewLikeCountField (boolean value) {
      this.requestField("new_like_count", value);
      return this;
    }
    public APIRequestGetAssignedPages requestOfferEligibleField () {
      return this.requestOfferEligibleField(true);
    }
    public APIRequestGetAssignedPages requestOfferEligibleField (boolean value) {
      this.requestField("offer_eligible", value);
      return this;
    }
    public APIRequestGetAssignedPages requestOverallStarRatingField () {
      return this.requestOverallStarRatingField(true);
    }
    public APIRequestGetAssignedPages requestOverallStarRatingField (boolean value) {
      this.requestField("overall_star_rating", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPageAboutStoryField () {
      return this.requestPageAboutStoryField(true);
    }
    public APIRequestGetAssignedPages requestPageAboutStoryField (boolean value) {
      this.requestField("page_about_story", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPageTokenField () {
      return this.requestPageTokenField(true);
    }
    public APIRequestGetAssignedPages requestPageTokenField (boolean value) {
      this.requestField("page_token", value);
      return this;
    }
    public APIRequestGetAssignedPages requestParentPageField () {
      return this.requestParentPageField(true);
    }
    public APIRequestGetAssignedPages requestParentPageField (boolean value) {
      this.requestField("parent_page", value);
      return this;
    }
    public APIRequestGetAssignedPages requestParkingField () {
      return this.requestParkingField(true);
    }
    public APIRequestGetAssignedPages requestParkingField (boolean value) {
      this.requestField("parking", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPaymentOptionsField () {
      return this.requestPaymentOptionsField(true);
    }
    public APIRequestGetAssignedPages requestPaymentOptionsField (boolean value) {
      this.requestField("payment_options", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPersonalInfoField () {
      return this.requestPersonalInfoField(true);
    }
    public APIRequestGetAssignedPages requestPersonalInfoField (boolean value) {
      this.requestField("personal_info", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPersonalInterestsField () {
      return this.requestPersonalInterestsField(true);
    }
    public APIRequestGetAssignedPages requestPersonalInterestsField (boolean value) {
      this.requestField("personal_interests", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPharmaSafetyInfoField () {
      return this.requestPharmaSafetyInfoField(true);
    }
    public APIRequestGetAssignedPages requestPharmaSafetyInfoField (boolean value) {
      this.requestField("pharma_safety_info", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPhoneField () {
      return this.requestPhoneField(true);
    }
    public APIRequestGetAssignedPages requestPhoneField (boolean value) {
      this.requestField("phone", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPlaceTypeField () {
      return this.requestPlaceTypeField(true);
    }
    public APIRequestGetAssignedPages requestPlaceTypeField (boolean value) {
      this.requestField("place_type", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPlotOutlineField () {
      return this.requestPlotOutlineField(true);
    }
    public APIRequestGetAssignedPages requestPlotOutlineField (boolean value) {
      this.requestField("plot_outline", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPreferredAudienceField () {
      return this.requestPreferredAudienceField(true);
    }
    public APIRequestGetAssignedPages requestPreferredAudienceField (boolean value) {
      this.requestField("preferred_audience", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPressContactField () {
      return this.requestPressContactField(true);
    }
    public APIRequestGetAssignedPages requestPressContactField (boolean value) {
      this.requestField("press_contact", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPriceRangeField () {
      return this.requestPriceRangeField(true);
    }
    public APIRequestGetAssignedPages requestPriceRangeField (boolean value) {
      this.requestField("price_range", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPrivacyInfoUrlField () {
      return this.requestPrivacyInfoUrlField(true);
    }
    public APIRequestGetAssignedPages requestPrivacyInfoUrlField (boolean value) {
      this.requestField("privacy_info_url", value);
      return this;
    }
    public APIRequestGetAssignedPages requestProducedByField () {
      return this.requestProducedByField(true);
    }
    public APIRequestGetAssignedPages requestProducedByField (boolean value) {
      this.requestField("produced_by", value);
      return this;
    }
    public APIRequestGetAssignedPages requestProductsField () {
      return this.requestProductsField(true);
    }
    public APIRequestGetAssignedPages requestProductsField (boolean value) {
      this.requestField("products", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPromotionEligibleField () {
      return this.requestPromotionEligibleField(true);
    }
    public APIRequestGetAssignedPages requestPromotionEligibleField (boolean value) {
      this.requestField("promotion_eligible", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPromotionIneligibleReasonField () {
      return this.requestPromotionIneligibleReasonField(true);
    }
    public APIRequestGetAssignedPages requestPromotionIneligibleReasonField (boolean value) {
      this.requestField("promotion_ineligible_reason", value);
      return this;
    }
    public APIRequestGetAssignedPages requestPublicTransitField () {
      return this.requestPublicTransitField(true);
    }
    public APIRequestGetAssignedPages requestPublicTransitField (boolean value) {
      this.requestField("public_transit", value);
      return this;
    }
    public APIRequestGetAssignedPages requestRatingCountField () {
      return this.requestRatingCountField(true);
    }
    public APIRequestGetAssignedPages requestRatingCountField (boolean value) {
      this.requestField("rating_count", value);
      return this;
    }
    public APIRequestGetAssignedPages requestRecipientField () {
      return this.requestRecipientField(true);
    }
    public APIRequestGetAssignedPages requestRecipientField (boolean value) {
      this.requestField("recipient", value);
      return this;
    }
    public APIRequestGetAssignedPages requestRecordLabelField () {
      return this.requestRecordLabelField(true);
    }
    public APIRequestGetAssignedPages requestRecordLabelField (boolean value) {
      this.requestField("record_label", value);
      return this;
    }
    public APIRequestGetAssignedPages requestReleaseDateField () {
      return this.requestReleaseDateField(true);
    }
    public APIRequestGetAssignedPages requestReleaseDateField (boolean value) {
      this.requestField("release_date", value);
      return this;
    }
    public APIRequestGetAssignedPages requestRestaurantServicesField () {
      return this.requestRestaurantServicesField(true);
    }
    public APIRequestGetAssignedPages requestRestaurantServicesField (boolean value) {
      this.requestField("restaurant_services", value);
      return this;
    }
    public APIRequestGetAssignedPages requestRestaurantSpecialtiesField () {
      return this.requestRestaurantSpecialtiesField(true);
    }
    public APIRequestGetAssignedPages requestRestaurantSpecialtiesField (boolean value) {
      this.requestField("restaurant_specialties", value);
      return this;
    }
    public APIRequestGetAssignedPages requestScheduleField () {
      return this.requestScheduleField(true);
    }
    public APIRequestGetAssignedPages requestScheduleField (boolean value) {
      this.requestField("schedule", value);
      return this;
    }
    public APIRequestGetAssignedPages requestScreenplayByField () {
      return this.requestScreenplayByField(true);
    }
    public APIRequestGetAssignedPages requestScreenplayByField (boolean value) {
      this.requestField("screenplay_by", value);
      return this;
    }
    public APIRequestGetAssignedPages requestSeasonField () {
      return this.requestSeasonField(true);
    }
    public APIRequestGetAssignedPages requestSeasonField (boolean value) {
      this.requestField("season", value);
      return this;
    }
    public APIRequestGetAssignedPages requestSingleLineAddressField () {
      return this.requestSingleLineAddressField(true);
    }
    public APIRequestGetAssignedPages requestSingleLineAddressField (boolean value) {
      this.requestField("single_line_address", value);
      return this;
    }
    public APIRequestGetAssignedPages requestStarringField () {
      return this.requestStarringField(true);
    }
    public APIRequestGetAssignedPages requestStarringField (boolean value) {
      this.requestField("starring", value);
      return this;
    }
    public APIRequestGetAssignedPages requestStartInfoField () {
      return this.requestStartInfoField(true);
    }
    public APIRequestGetAssignedPages requestStartInfoField (boolean value) {
      this.requestField("start_info", value);
      return this;
    }
    public APIRequestGetAssignedPages requestStoreCodeField () {
      return this.requestStoreCodeField(true);
    }
    public APIRequestGetAssignedPages requestStoreCodeField (boolean value) {
      this.requestField("store_code", value);
      return this;
    }
    public APIRequestGetAssignedPages requestStoreLocationDescriptorField () {
      return this.requestStoreLocationDescriptorField(true);
    }
    public APIRequestGetAssignedPages requestStoreLocationDescriptorField (boolean value) {
      this.requestField("store_location_descriptor", value);
      return this;
    }
    public APIRequestGetAssignedPages requestStoreNumberField () {
      return this.requestStoreNumberField(true);
    }
    public APIRequestGetAssignedPages requestStoreNumberField (boolean value) {
      this.requestField("store_number", value);
      return this;
    }
    public APIRequestGetAssignedPages requestStudioField () {
      return this.requestStudioField(true);
    }
    public APIRequestGetAssignedPages requestStudioField (boolean value) {
      this.requestField("studio", value);
      return this;
    }
    public APIRequestGetAssignedPages requestSupportsInstantArticlesField () {
      return this.requestSupportsInstantArticlesField(true);
    }
    public APIRequestGetAssignedPages requestSupportsInstantArticlesField (boolean value) {
      this.requestField("supports_instant_articles", value);
      return this;
    }
    public APIRequestGetAssignedPages requestTalkingAboutCountField () {
      return this.requestTalkingAboutCountField(true);
    }
    public APIRequestGetAssignedPages requestTalkingAboutCountField (boolean value) {
      this.requestField("talking_about_count", value);
      return this;
    }
    public APIRequestGetAssignedPages requestUnreadMessageCountField () {
      return this.requestUnreadMessageCountField(true);
    }
    public APIRequestGetAssignedPages requestUnreadMessageCountField (boolean value) {
      this.requestField("unread_message_count", value);
      return this;
    }
    public APIRequestGetAssignedPages requestUnreadNotifCountField () {
      return this.requestUnreadNotifCountField(true);
    }
    public APIRequestGetAssignedPages requestUnreadNotifCountField (boolean value) {
      this.requestField("unread_notif_count", value);
      return this;
    }
    public APIRequestGetAssignedPages requestUnseenMessageCountField () {
      return this.requestUnseenMessageCountField(true);
    }
    public APIRequestGetAssignedPages requestUnseenMessageCountField (boolean value) {
      this.requestField("unseen_message_count", value);
      return this;
    }
    public APIRequestGetAssignedPages requestUsernameField () {
      return this.requestUsernameField(true);
    }
    public APIRequestGetAssignedPages requestUsernameField (boolean value) {
      this.requestField("username", value);
      return this;
    }
    public APIRequestGetAssignedPages requestVerificationStatusField () {
      return this.requestVerificationStatusField(true);
    }
    public APIRequestGetAssignedPages requestVerificationStatusField (boolean value) {
      this.requestField("verification_status", value);
      return this;
    }
    public APIRequestGetAssignedPages requestVoipInfoField () {
      return this.requestVoipInfoField(true);
    }
    public APIRequestGetAssignedPages requestVoipInfoField (boolean value) {
      this.requestField("voip_info", value);
      return this;
    }
    public APIRequestGetAssignedPages requestWebsiteField () {
      return this.requestWebsiteField(true);
    }
    public APIRequestGetAssignedPages requestWebsiteField (boolean value) {
      this.requestField("website", value);
      return this;
    }
    public APIRequestGetAssignedPages requestWereHereCountField () {
      return this.requestWereHereCountField(true);
    }
    public APIRequestGetAssignedPages requestWereHereCountField (boolean value) {
      this.requestField("were_here_count", value);
      return this;
    }
    public APIRequestGetAssignedPages requestWhatsappNumberField () {
      return this.requestWhatsappNumberField(true);
    }
    public APIRequestGetAssignedPages requestWhatsappNumberField (boolean value) {
      this.requestField("whatsapp_number", value);
      return this;
    }
    public APIRequestGetAssignedPages requestWrittenByField () {
      return this.requestWrittenByField(true);
    }
    public APIRequestGetAssignedPages requestWrittenByField (boolean value) {
      this.requestField("written_by", value);
      return this;
    }
  }

  public static class APIRequestGetAssignedProductCatalogs extends APIRequest<ProductCatalog> {

    APINodeList<ProductCatalog> lastResponse = null;
    @Override
    public APINodeList<ProductCatalog> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "business",
      "cpas_parent_catalog_settings",
      "da_display_settings",
      "default_image_url",
      "fallback_image_url",
      "feed_count",
      "id",
      "name",
      "product_count",
      "qualified_product_count",
      "vertical",
    };

    @Override
    public APINodeList<ProductCatalog> parseResponse(String response, String header) throws APIException {
      return ProductCatalog.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<ProductCatalog> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<ProductCatalog> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<ProductCatalog>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<ProductCatalog>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<ProductCatalog>>() {
           public APINodeList<ProductCatalog> apply(ResponseWrapper result) {
             try {
               return APIRequestGetAssignedProductCatalogs.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetAssignedProductCatalogs(String nodeId, APIContext context) {
      super(context, nodeId, "/assigned_product_catalogs", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetAssignedProductCatalogs setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetAssignedProductCatalogs setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetAssignedProductCatalogs requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetAssignedProductCatalogs requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAssignedProductCatalogs requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetAssignedProductCatalogs requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetAssignedProductCatalogs requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetAssignedProductCatalogs requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetAssignedProductCatalogs requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetAssignedProductCatalogs requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetAssignedProductCatalogs requestCpasParentCatalogSettingsField () {
      return this.requestCpasParentCatalogSettingsField(true);
    }
    public APIRequestGetAssignedProductCatalogs requestCpasParentCatalogSettingsField (boolean value) {
      this.requestField("cpas_parent_catalog_settings", value);
      return this;
    }
    public APIRequestGetAssignedProductCatalogs requestDaDisplaySettingsField () {
      return this.requestDaDisplaySettingsField(true);
    }
    public APIRequestGetAssignedProductCatalogs requestDaDisplaySettingsField (boolean value) {
      this.requestField("da_display_settings", value);
      return this;
    }
    public APIRequestGetAssignedProductCatalogs requestDefaultImageUrlField () {
      return this.requestDefaultImageUrlField(true);
    }
    public APIRequestGetAssignedProductCatalogs requestDefaultImageUrlField (boolean value) {
      this.requestField("default_image_url", value);
      return this;
    }
    public APIRequestGetAssignedProductCatalogs requestFallbackImageUrlField () {
      return this.requestFallbackImageUrlField(true);
    }
    public APIRequestGetAssignedProductCatalogs requestFallbackImageUrlField (boolean value) {
      this.requestField("fallback_image_url", value);
      return this;
    }
    public APIRequestGetAssignedProductCatalogs requestFeedCountField () {
      return this.requestFeedCountField(true);
    }
    public APIRequestGetAssignedProductCatalogs requestFeedCountField (boolean value) {
      this.requestField("feed_count", value);
      return this;
    }
    public APIRequestGetAssignedProductCatalogs requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetAssignedProductCatalogs requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetAssignedProductCatalogs requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetAssignedProductCatalogs requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetAssignedProductCatalogs requestProductCountField () {
      return this.requestProductCountField(true);
    }
    public APIRequestGetAssignedProductCatalogs requestProductCountField (boolean value) {
      this.requestField("product_count", value);
      return this;
    }
    public APIRequestGetAssignedProductCatalogs requestQualifiedProductCountField () {
      return this.requestQualifiedProductCountField(true);
    }
    public APIRequestGetAssignedProductCatalogs requestQualifiedProductCountField (boolean value) {
      this.requestField("qualified_product_count", value);
      return this;
    }
    public APIRequestGetAssignedProductCatalogs requestVerticalField () {
      return this.requestVerticalField(true);
    }
    public APIRequestGetAssignedProductCatalogs requestVerticalField (boolean value) {
      this.requestField("vertical", value);
      return this;
    }
  }

  public static class APIRequestGetBooks extends APIRequest<Page> {

    APINodeList<Page> lastResponse = null;
    @Override
    public APINodeList<Page> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "target_id",
    };

    public static final String[] FIELDS = {
      "about",
      "access_token",
      "ad_campaign",
      "affiliation",
      "app_id",
      "app_links",
      "artists_we_like",
      "attire",
      "awards",
      "band_interests",
      "band_members",
      "best_page",
      "bio",
      "birthday",
      "booking_agent",
      "built",
      "business",
      "can_checkin",
      "can_post",
      "category",
      "category_list",
      "checkins",
      "company_overview",
      "connected_instagram_account",
      "contact_address",
      "copyright_attribution_insights",
      "copyright_whitelisted_ig_partners",
      "country_page_likes",
      "cover",
      "culinary_team",
      "current_location",
      "description",
      "description_html",
      "directed_by",
      "display_subtext",
      "displayed_message_response_time",
      "emails",
      "engagement",
      "fan_count",
      "featured_video",
      "features",
      "food_styles",
      "founded",
      "general_info",
      "general_manager",
      "genre",
      "global_brand_page_name",
      "global_brand_root_id",
      "has_added_app",
      "has_whatsapp_business_number",
      "has_whatsapp_number",
      "hometown",
      "hours",
      "id",
      "impressum",
      "influences",
      "instagram_business_account",
      "instant_articles_review_status",
      "is_always_open",
      "is_chain",
      "is_community_page",
      "is_eligible_for_branded_content",
      "is_messenger_bot_get_started_enabled",
      "is_messenger_platform_bot",
      "is_owned",
      "is_permanently_closed",
      "is_published",
      "is_unclaimed",
      "is_verified",
      "is_webhooks_subscribed",
      "keywords",
      "leadgen_form_preview_details",
      "leadgen_has_crm_integration",
      "leadgen_has_fat_ping_crm_integration",
      "leadgen_tos_acceptance_time",
      "leadgen_tos_accepted",
      "leadgen_tos_accepting_user",
      "link",
      "location",
      "members",
      "merchant_id",
      "merchant_review_status",
      "messenger_ads_default_icebreakers",
      "messenger_ads_default_page_welcome_message",
      "messenger_ads_default_quick_replies",
      "messenger_ads_quick_replies_type",
      "mission",
      "mpg",
      "name",
      "name_with_location_descriptor",
      "network",
      "new_like_count",
      "offer_eligible",
      "overall_star_rating",
      "page_about_story",
      "page_token",
      "parent_page",
      "parking",
      "payment_options",
      "personal_info",
      "personal_interests",
      "pharma_safety_info",
      "phone",
      "place_type",
      "plot_outline",
      "preferred_audience",
      "press_contact",
      "price_range",
      "privacy_info_url",
      "produced_by",
      "products",
      "promotion_eligible",
      "promotion_ineligible_reason",
      "public_transit",
      "rating_count",
      "recipient",
      "record_label",
      "release_date",
      "restaurant_services",
      "restaurant_specialties",
      "schedule",
      "screenplay_by",
      "season",
      "single_line_address",
      "starring",
      "start_info",
      "store_code",
      "store_location_descriptor",
      "store_number",
      "studio",
      "supports_instant_articles",
      "talking_about_count",
      "unread_message_count",
      "unread_notif_count",
      "unseen_message_count",
      "username",
      "verification_status",
      "voip_info",
      "website",
      "were_here_count",
      "whatsapp_number",
      "written_by",
    };

    @Override
    public APINodeList<Page> parseResponse(String response, String header) throws APIException {
      return Page.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Page> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Page> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Page>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Page>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Page>>() {
           public APINodeList<Page> apply(ResponseWrapper result) {
             try {
               return APIRequestGetBooks.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetBooks(String nodeId, APIContext context) {
      super(context, nodeId, "/books", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetBooks setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetBooks setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetBooks setTargetId (String targetId) {
      this.setParam("target_id", targetId);
      return this;
    }

    public APIRequestGetBooks requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetBooks requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetBooks requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetBooks requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetBooks requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetBooks requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetBooks requestAboutField () {
      return this.requestAboutField(true);
    }
    public APIRequestGetBooks requestAboutField (boolean value) {
      this.requestField("about", value);
      return this;
    }
    public APIRequestGetBooks requestAccessTokenField () {
      return this.requestAccessTokenField(true);
    }
    public APIRequestGetBooks requestAccessTokenField (boolean value) {
      this.requestField("access_token", value);
      return this;
    }
    public APIRequestGetBooks requestAdCampaignField () {
      return this.requestAdCampaignField(true);
    }
    public APIRequestGetBooks requestAdCampaignField (boolean value) {
      this.requestField("ad_campaign", value);
      return this;
    }
    public APIRequestGetBooks requestAffiliationField () {
      return this.requestAffiliationField(true);
    }
    public APIRequestGetBooks requestAffiliationField (boolean value) {
      this.requestField("affiliation", value);
      return this;
    }
    public APIRequestGetBooks requestAppIdField () {
      return this.requestAppIdField(true);
    }
    public APIRequestGetBooks requestAppIdField (boolean value) {
      this.requestField("app_id", value);
      return this;
    }
    public APIRequestGetBooks requestAppLinksField () {
      return this.requestAppLinksField(true);
    }
    public APIRequestGetBooks requestAppLinksField (boolean value) {
      this.requestField("app_links", value);
      return this;
    }
    public APIRequestGetBooks requestArtistsWeLikeField () {
      return this.requestArtistsWeLikeField(true);
    }
    public APIRequestGetBooks requestArtistsWeLikeField (boolean value) {
      this.requestField("artists_we_like", value);
      return this;
    }
    public APIRequestGetBooks requestAttireField () {
      return this.requestAttireField(true);
    }
    public APIRequestGetBooks requestAttireField (boolean value) {
      this.requestField("attire", value);
      return this;
    }
    public APIRequestGetBooks requestAwardsField () {
      return this.requestAwardsField(true);
    }
    public APIRequestGetBooks requestAwardsField (boolean value) {
      this.requestField("awards", value);
      return this;
    }
    public APIRequestGetBooks requestBandInterestsField () {
      return this.requestBandInterestsField(true);
    }
    public APIRequestGetBooks requestBandInterestsField (boolean value) {
      this.requestField("band_interests", value);
      return this;
    }
    public APIRequestGetBooks requestBandMembersField () {
      return this.requestBandMembersField(true);
    }
    public APIRequestGetBooks requestBandMembersField (boolean value) {
      this.requestField("band_members", value);
      return this;
    }
    public APIRequestGetBooks requestBestPageField () {
      return this.requestBestPageField(true);
    }
    public APIRequestGetBooks requestBestPageField (boolean value) {
      this.requestField("best_page", value);
      return this;
    }
    public APIRequestGetBooks requestBioField () {
      return this.requestBioField(true);
    }
    public APIRequestGetBooks requestBioField (boolean value) {
      this.requestField("bio", value);
      return this;
    }
    public APIRequestGetBooks requestBirthdayField () {
      return this.requestBirthdayField(true);
    }
    public APIRequestGetBooks requestBirthdayField (boolean value) {
      this.requestField("birthday", value);
      return this;
    }
    public APIRequestGetBooks requestBookingAgentField () {
      return this.requestBookingAgentField(true);
    }
    public APIRequestGetBooks requestBookingAgentField (boolean value) {
      this.requestField("booking_agent", value);
      return this;
    }
    public APIRequestGetBooks requestBuiltField () {
      return this.requestBuiltField(true);
    }
    public APIRequestGetBooks requestBuiltField (boolean value) {
      this.requestField("built", value);
      return this;
    }
    public APIRequestGetBooks requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetBooks requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetBooks requestCanCheckinField () {
      return this.requestCanCheckinField(true);
    }
    public APIRequestGetBooks requestCanCheckinField (boolean value) {
      this.requestField("can_checkin", value);
      return this;
    }
    public APIRequestGetBooks requestCanPostField () {
      return this.requestCanPostField(true);
    }
    public APIRequestGetBooks requestCanPostField (boolean value) {
      this.requestField("can_post", value);
      return this;
    }
    public APIRequestGetBooks requestCategoryField () {
      return this.requestCategoryField(true);
    }
    public APIRequestGetBooks requestCategoryField (boolean value) {
      this.requestField("category", value);
      return this;
    }
    public APIRequestGetBooks requestCategoryListField () {
      return this.requestCategoryListField(true);
    }
    public APIRequestGetBooks requestCategoryListField (boolean value) {
      this.requestField("category_list", value);
      return this;
    }
    public APIRequestGetBooks requestCheckinsField () {
      return this.requestCheckinsField(true);
    }
    public APIRequestGetBooks requestCheckinsField (boolean value) {
      this.requestField("checkins", value);
      return this;
    }
    public APIRequestGetBooks requestCompanyOverviewField () {
      return this.requestCompanyOverviewField(true);
    }
    public APIRequestGetBooks requestCompanyOverviewField (boolean value) {
      this.requestField("company_overview", value);
      return this;
    }
    public APIRequestGetBooks requestConnectedInstagramAccountField () {
      return this.requestConnectedInstagramAccountField(true);
    }
    public APIRequestGetBooks requestConnectedInstagramAccountField (boolean value) {
      this.requestField("connected_instagram_account", value);
      return this;
    }
    public APIRequestGetBooks requestContactAddressField () {
      return this.requestContactAddressField(true);
    }
    public APIRequestGetBooks requestContactAddressField (boolean value) {
      this.requestField("contact_address", value);
      return this;
    }
    public APIRequestGetBooks requestCopyrightAttributionInsightsField () {
      return this.requestCopyrightAttributionInsightsField(true);
    }
    public APIRequestGetBooks requestCopyrightAttributionInsightsField (boolean value) {
      this.requestField("copyright_attribution_insights", value);
      return this;
    }
    public APIRequestGetBooks requestCopyrightWhitelistedIgPartnersField () {
      return this.requestCopyrightWhitelistedIgPartnersField(true);
    }
    public APIRequestGetBooks requestCopyrightWhitelistedIgPartnersField (boolean value) {
      this.requestField("copyright_whitelisted_ig_partners", value);
      return this;
    }
    public APIRequestGetBooks requestCountryPageLikesField () {
      return this.requestCountryPageLikesField(true);
    }
    public APIRequestGetBooks requestCountryPageLikesField (boolean value) {
      this.requestField("country_page_likes", value);
      return this;
    }
    public APIRequestGetBooks requestCoverField () {
      return this.requestCoverField(true);
    }
    public APIRequestGetBooks requestCoverField (boolean value) {
      this.requestField("cover", value);
      return this;
    }
    public APIRequestGetBooks requestCulinaryTeamField () {
      return this.requestCulinaryTeamField(true);
    }
    public APIRequestGetBooks requestCulinaryTeamField (boolean value) {
      this.requestField("culinary_team", value);
      return this;
    }
    public APIRequestGetBooks requestCurrentLocationField () {
      return this.requestCurrentLocationField(true);
    }
    public APIRequestGetBooks requestCurrentLocationField (boolean value) {
      this.requestField("current_location", value);
      return this;
    }
    public APIRequestGetBooks requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetBooks requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetBooks requestDescriptionHtmlField () {
      return this.requestDescriptionHtmlField(true);
    }
    public APIRequestGetBooks requestDescriptionHtmlField (boolean value) {
      this.requestField("description_html", value);
      return this;
    }
    public APIRequestGetBooks requestDirectedByField () {
      return this.requestDirectedByField(true);
    }
    public APIRequestGetBooks requestDirectedByField (boolean value) {
      this.requestField("directed_by", value);
      return this;
    }
    public APIRequestGetBooks requestDisplaySubtextField () {
      return this.requestDisplaySubtextField(true);
    }
    public APIRequestGetBooks requestDisplaySubtextField (boolean value) {
      this.requestField("display_subtext", value);
      return this;
    }
    public APIRequestGetBooks requestDisplayedMessageResponseTimeField () {
      return this.requestDisplayedMessageResponseTimeField(true);
    }
    public APIRequestGetBooks requestDisplayedMessageResponseTimeField (boolean value) {
      this.requestField("displayed_message_response_time", value);
      return this;
    }
    public APIRequestGetBooks requestEmailsField () {
      return this.requestEmailsField(true);
    }
    public APIRequestGetBooks requestEmailsField (boolean value) {
      this.requestField("emails", value);
      return this;
    }
    public APIRequestGetBooks requestEngagementField () {
      return this.requestEngagementField(true);
    }
    public APIRequestGetBooks requestEngagementField (boolean value) {
      this.requestField("engagement", value);
      return this;
    }
    public APIRequestGetBooks requestFanCountField () {
      return this.requestFanCountField(true);
    }
    public APIRequestGetBooks requestFanCountField (boolean value) {
      this.requestField("fan_count", value);
      return this;
    }
    public APIRequestGetBooks requestFeaturedVideoField () {
      return this.requestFeaturedVideoField(true);
    }
    public APIRequestGetBooks requestFeaturedVideoField (boolean value) {
      this.requestField("featured_video", value);
      return this;
    }
    public APIRequestGetBooks requestFeaturesField () {
      return this.requestFeaturesField(true);
    }
    public APIRequestGetBooks requestFeaturesField (boolean value) {
      this.requestField("features", value);
      return this;
    }
    public APIRequestGetBooks requestFoodStylesField () {
      return this.requestFoodStylesField(true);
    }
    public APIRequestGetBooks requestFoodStylesField (boolean value) {
      this.requestField("food_styles", value);
      return this;
    }
    public APIRequestGetBooks requestFoundedField () {
      return this.requestFoundedField(true);
    }
    public APIRequestGetBooks requestFoundedField (boolean value) {
      this.requestField("founded", value);
      return this;
    }
    public APIRequestGetBooks requestGeneralInfoField () {
      return this.requestGeneralInfoField(true);
    }
    public APIRequestGetBooks requestGeneralInfoField (boolean value) {
      this.requestField("general_info", value);
      return this;
    }
    public APIRequestGetBooks requestGeneralManagerField () {
      return this.requestGeneralManagerField(true);
    }
    public APIRequestGetBooks requestGeneralManagerField (boolean value) {
      this.requestField("general_manager", value);
      return this;
    }
    public APIRequestGetBooks requestGenreField () {
      return this.requestGenreField(true);
    }
    public APIRequestGetBooks requestGenreField (boolean value) {
      this.requestField("genre", value);
      return this;
    }
    public APIRequestGetBooks requestGlobalBrandPageNameField () {
      return this.requestGlobalBrandPageNameField(true);
    }
    public APIRequestGetBooks requestGlobalBrandPageNameField (boolean value) {
      this.requestField("global_brand_page_name", value);
      return this;
    }
    public APIRequestGetBooks requestGlobalBrandRootIdField () {
      return this.requestGlobalBrandRootIdField(true);
    }
    public APIRequestGetBooks requestGlobalBrandRootIdField (boolean value) {
      this.requestField("global_brand_root_id", value);
      return this;
    }
    public APIRequestGetBooks requestHasAddedAppField () {
      return this.requestHasAddedAppField(true);
    }
    public APIRequestGetBooks requestHasAddedAppField (boolean value) {
      this.requestField("has_added_app", value);
      return this;
    }
    public APIRequestGetBooks requestHasWhatsappBusinessNumberField () {
      return this.requestHasWhatsappBusinessNumberField(true);
    }
    public APIRequestGetBooks requestHasWhatsappBusinessNumberField (boolean value) {
      this.requestField("has_whatsapp_business_number", value);
      return this;
    }
    public APIRequestGetBooks requestHasWhatsappNumberField () {
      return this.requestHasWhatsappNumberField(true);
    }
    public APIRequestGetBooks requestHasWhatsappNumberField (boolean value) {
      this.requestField("has_whatsapp_number", value);
      return this;
    }
    public APIRequestGetBooks requestHometownField () {
      return this.requestHometownField(true);
    }
    public APIRequestGetBooks requestHometownField (boolean value) {
      this.requestField("hometown", value);
      return this;
    }
    public APIRequestGetBooks requestHoursField () {
      return this.requestHoursField(true);
    }
    public APIRequestGetBooks requestHoursField (boolean value) {
      this.requestField("hours", value);
      return this;
    }
    public APIRequestGetBooks requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetBooks requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetBooks requestImpressumField () {
      return this.requestImpressumField(true);
    }
    public APIRequestGetBooks requestImpressumField (boolean value) {
      this.requestField("impressum", value);
      return this;
    }
    public APIRequestGetBooks requestInfluencesField () {
      return this.requestInfluencesField(true);
    }
    public APIRequestGetBooks requestInfluencesField (boolean value) {
      this.requestField("influences", value);
      return this;
    }
    public APIRequestGetBooks requestInstagramBusinessAccountField () {
      return this.requestInstagramBusinessAccountField(true);
    }
    public APIRequestGetBooks requestInstagramBusinessAccountField (boolean value) {
      this.requestField("instagram_business_account", value);
      return this;
    }
    public APIRequestGetBooks requestInstantArticlesReviewStatusField () {
      return this.requestInstantArticlesReviewStatusField(true);
    }
    public APIRequestGetBooks requestInstantArticlesReviewStatusField (boolean value) {
      this.requestField("instant_articles_review_status", value);
      return this;
    }
    public APIRequestGetBooks requestIsAlwaysOpenField () {
      return this.requestIsAlwaysOpenField(true);
    }
    public APIRequestGetBooks requestIsAlwaysOpenField (boolean value) {
      this.requestField("is_always_open", value);
      return this;
    }
    public APIRequestGetBooks requestIsChainField () {
      return this.requestIsChainField(true);
    }
    public APIRequestGetBooks requestIsChainField (boolean value) {
      this.requestField("is_chain", value);
      return this;
    }
    public APIRequestGetBooks requestIsCommunityPageField () {
      return this.requestIsCommunityPageField(true);
    }
    public APIRequestGetBooks requestIsCommunityPageField (boolean value) {
      this.requestField("is_community_page", value);
      return this;
    }
    public APIRequestGetBooks requestIsEligibleForBrandedContentField () {
      return this.requestIsEligibleForBrandedContentField(true);
    }
    public APIRequestGetBooks requestIsEligibleForBrandedContentField (boolean value) {
      this.requestField("is_eligible_for_branded_content", value);
      return this;
    }
    public APIRequestGetBooks requestIsMessengerBotGetStartedEnabledField () {
      return this.requestIsMessengerBotGetStartedEnabledField(true);
    }
    public APIRequestGetBooks requestIsMessengerBotGetStartedEnabledField (boolean value) {
      this.requestField("is_messenger_bot_get_started_enabled", value);
      return this;
    }
    public APIRequestGetBooks requestIsMessengerPlatformBotField () {
      return this.requestIsMessengerPlatformBotField(true);
    }
    public APIRequestGetBooks requestIsMessengerPlatformBotField (boolean value) {
      this.requestField("is_messenger_platform_bot", value);
      return this;
    }
    public APIRequestGetBooks requestIsOwnedField () {
      return this.requestIsOwnedField(true);
    }
    public APIRequestGetBooks requestIsOwnedField (boolean value) {
      this.requestField("is_owned", value);
      return this;
    }
    public APIRequestGetBooks requestIsPermanentlyClosedField () {
      return this.requestIsPermanentlyClosedField(true);
    }
    public APIRequestGetBooks requestIsPermanentlyClosedField (boolean value) {
      this.requestField("is_permanently_closed", value);
      return this;
    }
    public APIRequestGetBooks requestIsPublishedField () {
      return this.requestIsPublishedField(true);
    }
    public APIRequestGetBooks requestIsPublishedField (boolean value) {
      this.requestField("is_published", value);
      return this;
    }
    public APIRequestGetBooks requestIsUnclaimedField () {
      return this.requestIsUnclaimedField(true);
    }
    public APIRequestGetBooks requestIsUnclaimedField (boolean value) {
      this.requestField("is_unclaimed", value);
      return this;
    }
    public APIRequestGetBooks requestIsVerifiedField () {
      return this.requestIsVerifiedField(true);
    }
    public APIRequestGetBooks requestIsVerifiedField (boolean value) {
      this.requestField("is_verified", value);
      return this;
    }
    public APIRequestGetBooks requestIsWebhooksSubscribedField () {
      return this.requestIsWebhooksSubscribedField(true);
    }
    public APIRequestGetBooks requestIsWebhooksSubscribedField (boolean value) {
      this.requestField("is_webhooks_subscribed", value);
      return this;
    }
    public APIRequestGetBooks requestKeywordsField () {
      return this.requestKeywordsField(true);
    }
    public APIRequestGetBooks requestKeywordsField (boolean value) {
      this.requestField("keywords", value);
      return this;
    }
    public APIRequestGetBooks requestLeadgenFormPreviewDetailsField () {
      return this.requestLeadgenFormPreviewDetailsField(true);
    }
    public APIRequestGetBooks requestLeadgenFormPreviewDetailsField (boolean value) {
      this.requestField("leadgen_form_preview_details", value);
      return this;
    }
    public APIRequestGetBooks requestLeadgenHasCrmIntegrationField () {
      return this.requestLeadgenHasCrmIntegrationField(true);
    }
    public APIRequestGetBooks requestLeadgenHasCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_crm_integration", value);
      return this;
    }
    public APIRequestGetBooks requestLeadgenHasFatPingCrmIntegrationField () {
      return this.requestLeadgenHasFatPingCrmIntegrationField(true);
    }
    public APIRequestGetBooks requestLeadgenHasFatPingCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_fat_ping_crm_integration", value);
      return this;
    }
    public APIRequestGetBooks requestLeadgenTosAcceptanceTimeField () {
      return this.requestLeadgenTosAcceptanceTimeField(true);
    }
    public APIRequestGetBooks requestLeadgenTosAcceptanceTimeField (boolean value) {
      this.requestField("leadgen_tos_acceptance_time", value);
      return this;
    }
    public APIRequestGetBooks requestLeadgenTosAcceptedField () {
      return this.requestLeadgenTosAcceptedField(true);
    }
    public APIRequestGetBooks requestLeadgenTosAcceptedField (boolean value) {
      this.requestField("leadgen_tos_accepted", value);
      return this;
    }
    public APIRequestGetBooks requestLeadgenTosAcceptingUserField () {
      return this.requestLeadgenTosAcceptingUserField(true);
    }
    public APIRequestGetBooks requestLeadgenTosAcceptingUserField (boolean value) {
      this.requestField("leadgen_tos_accepting_user", value);
      return this;
    }
    public APIRequestGetBooks requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetBooks requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetBooks requestLocationField () {
      return this.requestLocationField(true);
    }
    public APIRequestGetBooks requestLocationField (boolean value) {
      this.requestField("location", value);
      return this;
    }
    public APIRequestGetBooks requestMembersField () {
      return this.requestMembersField(true);
    }
    public APIRequestGetBooks requestMembersField (boolean value) {
      this.requestField("members", value);
      return this;
    }
    public APIRequestGetBooks requestMerchantIdField () {
      return this.requestMerchantIdField(true);
    }
    public APIRequestGetBooks requestMerchantIdField (boolean value) {
      this.requestField("merchant_id", value);
      return this;
    }
    public APIRequestGetBooks requestMerchantReviewStatusField () {
      return this.requestMerchantReviewStatusField(true);
    }
    public APIRequestGetBooks requestMerchantReviewStatusField (boolean value) {
      this.requestField("merchant_review_status", value);
      return this;
    }
    public APIRequestGetBooks requestMessengerAdsDefaultIcebreakersField () {
      return this.requestMessengerAdsDefaultIcebreakersField(true);
    }
    public APIRequestGetBooks requestMessengerAdsDefaultIcebreakersField (boolean value) {
      this.requestField("messenger_ads_default_icebreakers", value);
      return this;
    }
    public APIRequestGetBooks requestMessengerAdsDefaultPageWelcomeMessageField () {
      return this.requestMessengerAdsDefaultPageWelcomeMessageField(true);
    }
    public APIRequestGetBooks requestMessengerAdsDefaultPageWelcomeMessageField (boolean value) {
      this.requestField("messenger_ads_default_page_welcome_message", value);
      return this;
    }
    public APIRequestGetBooks requestMessengerAdsDefaultQuickRepliesField () {
      return this.requestMessengerAdsDefaultQuickRepliesField(true);
    }
    public APIRequestGetBooks requestMessengerAdsDefaultQuickRepliesField (boolean value) {
      this.requestField("messenger_ads_default_quick_replies", value);
      return this;
    }
    public APIRequestGetBooks requestMessengerAdsQuickRepliesTypeField () {
      return this.requestMessengerAdsQuickRepliesTypeField(true);
    }
    public APIRequestGetBooks requestMessengerAdsQuickRepliesTypeField (boolean value) {
      this.requestField("messenger_ads_quick_replies_type", value);
      return this;
    }
    public APIRequestGetBooks requestMissionField () {
      return this.requestMissionField(true);
    }
    public APIRequestGetBooks requestMissionField (boolean value) {
      this.requestField("mission", value);
      return this;
    }
    public APIRequestGetBooks requestMpgField () {
      return this.requestMpgField(true);
    }
    public APIRequestGetBooks requestMpgField (boolean value) {
      this.requestField("mpg", value);
      return this;
    }
    public APIRequestGetBooks requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetBooks requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetBooks requestNameWithLocationDescriptorField () {
      return this.requestNameWithLocationDescriptorField(true);
    }
    public APIRequestGetBooks requestNameWithLocationDescriptorField (boolean value) {
      this.requestField("name_with_location_descriptor", value);
      return this;
    }
    public APIRequestGetBooks requestNetworkField () {
      return this.requestNetworkField(true);
    }
    public APIRequestGetBooks requestNetworkField (boolean value) {
      this.requestField("network", value);
      return this;
    }
    public APIRequestGetBooks requestNewLikeCountField () {
      return this.requestNewLikeCountField(true);
    }
    public APIRequestGetBooks requestNewLikeCountField (boolean value) {
      this.requestField("new_like_count", value);
      return this;
    }
    public APIRequestGetBooks requestOfferEligibleField () {
      return this.requestOfferEligibleField(true);
    }
    public APIRequestGetBooks requestOfferEligibleField (boolean value) {
      this.requestField("offer_eligible", value);
      return this;
    }
    public APIRequestGetBooks requestOverallStarRatingField () {
      return this.requestOverallStarRatingField(true);
    }
    public APIRequestGetBooks requestOverallStarRatingField (boolean value) {
      this.requestField("overall_star_rating", value);
      return this;
    }
    public APIRequestGetBooks requestPageAboutStoryField () {
      return this.requestPageAboutStoryField(true);
    }
    public APIRequestGetBooks requestPageAboutStoryField (boolean value) {
      this.requestField("page_about_story", value);
      return this;
    }
    public APIRequestGetBooks requestPageTokenField () {
      return this.requestPageTokenField(true);
    }
    public APIRequestGetBooks requestPageTokenField (boolean value) {
      this.requestField("page_token", value);
      return this;
    }
    public APIRequestGetBooks requestParentPageField () {
      return this.requestParentPageField(true);
    }
    public APIRequestGetBooks requestParentPageField (boolean value) {
      this.requestField("parent_page", value);
      return this;
    }
    public APIRequestGetBooks requestParkingField () {
      return this.requestParkingField(true);
    }
    public APIRequestGetBooks requestParkingField (boolean value) {
      this.requestField("parking", value);
      return this;
    }
    public APIRequestGetBooks requestPaymentOptionsField () {
      return this.requestPaymentOptionsField(true);
    }
    public APIRequestGetBooks requestPaymentOptionsField (boolean value) {
      this.requestField("payment_options", value);
      return this;
    }
    public APIRequestGetBooks requestPersonalInfoField () {
      return this.requestPersonalInfoField(true);
    }
    public APIRequestGetBooks requestPersonalInfoField (boolean value) {
      this.requestField("personal_info", value);
      return this;
    }
    public APIRequestGetBooks requestPersonalInterestsField () {
      return this.requestPersonalInterestsField(true);
    }
    public APIRequestGetBooks requestPersonalInterestsField (boolean value) {
      this.requestField("personal_interests", value);
      return this;
    }
    public APIRequestGetBooks requestPharmaSafetyInfoField () {
      return this.requestPharmaSafetyInfoField(true);
    }
    public APIRequestGetBooks requestPharmaSafetyInfoField (boolean value) {
      this.requestField("pharma_safety_info", value);
      return this;
    }
    public APIRequestGetBooks requestPhoneField () {
      return this.requestPhoneField(true);
    }
    public APIRequestGetBooks requestPhoneField (boolean value) {
      this.requestField("phone", value);
      return this;
    }
    public APIRequestGetBooks requestPlaceTypeField () {
      return this.requestPlaceTypeField(true);
    }
    public APIRequestGetBooks requestPlaceTypeField (boolean value) {
      this.requestField("place_type", value);
      return this;
    }
    public APIRequestGetBooks requestPlotOutlineField () {
      return this.requestPlotOutlineField(true);
    }
    public APIRequestGetBooks requestPlotOutlineField (boolean value) {
      this.requestField("plot_outline", value);
      return this;
    }
    public APIRequestGetBooks requestPreferredAudienceField () {
      return this.requestPreferredAudienceField(true);
    }
    public APIRequestGetBooks requestPreferredAudienceField (boolean value) {
      this.requestField("preferred_audience", value);
      return this;
    }
    public APIRequestGetBooks requestPressContactField () {
      return this.requestPressContactField(true);
    }
    public APIRequestGetBooks requestPressContactField (boolean value) {
      this.requestField("press_contact", value);
      return this;
    }
    public APIRequestGetBooks requestPriceRangeField () {
      return this.requestPriceRangeField(true);
    }
    public APIRequestGetBooks requestPriceRangeField (boolean value) {
      this.requestField("price_range", value);
      return this;
    }
    public APIRequestGetBooks requestPrivacyInfoUrlField () {
      return this.requestPrivacyInfoUrlField(true);
    }
    public APIRequestGetBooks requestPrivacyInfoUrlField (boolean value) {
      this.requestField("privacy_info_url", value);
      return this;
    }
    public APIRequestGetBooks requestProducedByField () {
      return this.requestProducedByField(true);
    }
    public APIRequestGetBooks requestProducedByField (boolean value) {
      this.requestField("produced_by", value);
      return this;
    }
    public APIRequestGetBooks requestProductsField () {
      return this.requestProductsField(true);
    }
    public APIRequestGetBooks requestProductsField (boolean value) {
      this.requestField("products", value);
      return this;
    }
    public APIRequestGetBooks requestPromotionEligibleField () {
      return this.requestPromotionEligibleField(true);
    }
    public APIRequestGetBooks requestPromotionEligibleField (boolean value) {
      this.requestField("promotion_eligible", value);
      return this;
    }
    public APIRequestGetBooks requestPromotionIneligibleReasonField () {
      return this.requestPromotionIneligibleReasonField(true);
    }
    public APIRequestGetBooks requestPromotionIneligibleReasonField (boolean value) {
      this.requestField("promotion_ineligible_reason", value);
      return this;
    }
    public APIRequestGetBooks requestPublicTransitField () {
      return this.requestPublicTransitField(true);
    }
    public APIRequestGetBooks requestPublicTransitField (boolean value) {
      this.requestField("public_transit", value);
      return this;
    }
    public APIRequestGetBooks requestRatingCountField () {
      return this.requestRatingCountField(true);
    }
    public APIRequestGetBooks requestRatingCountField (boolean value) {
      this.requestField("rating_count", value);
      return this;
    }
    public APIRequestGetBooks requestRecipientField () {
      return this.requestRecipientField(true);
    }
    public APIRequestGetBooks requestRecipientField (boolean value) {
      this.requestField("recipient", value);
      return this;
    }
    public APIRequestGetBooks requestRecordLabelField () {
      return this.requestRecordLabelField(true);
    }
    public APIRequestGetBooks requestRecordLabelField (boolean value) {
      this.requestField("record_label", value);
      return this;
    }
    public APIRequestGetBooks requestReleaseDateField () {
      return this.requestReleaseDateField(true);
    }
    public APIRequestGetBooks requestReleaseDateField (boolean value) {
      this.requestField("release_date", value);
      return this;
    }
    public APIRequestGetBooks requestRestaurantServicesField () {
      return this.requestRestaurantServicesField(true);
    }
    public APIRequestGetBooks requestRestaurantServicesField (boolean value) {
      this.requestField("restaurant_services", value);
      return this;
    }
    public APIRequestGetBooks requestRestaurantSpecialtiesField () {
      return this.requestRestaurantSpecialtiesField(true);
    }
    public APIRequestGetBooks requestRestaurantSpecialtiesField (boolean value) {
      this.requestField("restaurant_specialties", value);
      return this;
    }
    public APIRequestGetBooks requestScheduleField () {
      return this.requestScheduleField(true);
    }
    public APIRequestGetBooks requestScheduleField (boolean value) {
      this.requestField("schedule", value);
      return this;
    }
    public APIRequestGetBooks requestScreenplayByField () {
      return this.requestScreenplayByField(true);
    }
    public APIRequestGetBooks requestScreenplayByField (boolean value) {
      this.requestField("screenplay_by", value);
      return this;
    }
    public APIRequestGetBooks requestSeasonField () {
      return this.requestSeasonField(true);
    }
    public APIRequestGetBooks requestSeasonField (boolean value) {
      this.requestField("season", value);
      return this;
    }
    public APIRequestGetBooks requestSingleLineAddressField () {
      return this.requestSingleLineAddressField(true);
    }
    public APIRequestGetBooks requestSingleLineAddressField (boolean value) {
      this.requestField("single_line_address", value);
      return this;
    }
    public APIRequestGetBooks requestStarringField () {
      return this.requestStarringField(true);
    }
    public APIRequestGetBooks requestStarringField (boolean value) {
      this.requestField("starring", value);
      return this;
    }
    public APIRequestGetBooks requestStartInfoField () {
      return this.requestStartInfoField(true);
    }
    public APIRequestGetBooks requestStartInfoField (boolean value) {
      this.requestField("start_info", value);
      return this;
    }
    public APIRequestGetBooks requestStoreCodeField () {
      return this.requestStoreCodeField(true);
    }
    public APIRequestGetBooks requestStoreCodeField (boolean value) {
      this.requestField("store_code", value);
      return this;
    }
    public APIRequestGetBooks requestStoreLocationDescriptorField () {
      return this.requestStoreLocationDescriptorField(true);
    }
    public APIRequestGetBooks requestStoreLocationDescriptorField (boolean value) {
      this.requestField("store_location_descriptor", value);
      return this;
    }
    public APIRequestGetBooks requestStoreNumberField () {
      return this.requestStoreNumberField(true);
    }
    public APIRequestGetBooks requestStoreNumberField (boolean value) {
      this.requestField("store_number", value);
      return this;
    }
    public APIRequestGetBooks requestStudioField () {
      return this.requestStudioField(true);
    }
    public APIRequestGetBooks requestStudioField (boolean value) {
      this.requestField("studio", value);
      return this;
    }
    public APIRequestGetBooks requestSupportsInstantArticlesField () {
      return this.requestSupportsInstantArticlesField(true);
    }
    public APIRequestGetBooks requestSupportsInstantArticlesField (boolean value) {
      this.requestField("supports_instant_articles", value);
      return this;
    }
    public APIRequestGetBooks requestTalkingAboutCountField () {
      return this.requestTalkingAboutCountField(true);
    }
    public APIRequestGetBooks requestTalkingAboutCountField (boolean value) {
      this.requestField("talking_about_count", value);
      return this;
    }
    public APIRequestGetBooks requestUnreadMessageCountField () {
      return this.requestUnreadMessageCountField(true);
    }
    public APIRequestGetBooks requestUnreadMessageCountField (boolean value) {
      this.requestField("unread_message_count", value);
      return this;
    }
    public APIRequestGetBooks requestUnreadNotifCountField () {
      return this.requestUnreadNotifCountField(true);
    }
    public APIRequestGetBooks requestUnreadNotifCountField (boolean value) {
      this.requestField("unread_notif_count", value);
      return this;
    }
    public APIRequestGetBooks requestUnseenMessageCountField () {
      return this.requestUnseenMessageCountField(true);
    }
    public APIRequestGetBooks requestUnseenMessageCountField (boolean value) {
      this.requestField("unseen_message_count", value);
      return this;
    }
    public APIRequestGetBooks requestUsernameField () {
      return this.requestUsernameField(true);
    }
    public APIRequestGetBooks requestUsernameField (boolean value) {
      this.requestField("username", value);
      return this;
    }
    public APIRequestGetBooks requestVerificationStatusField () {
      return this.requestVerificationStatusField(true);
    }
    public APIRequestGetBooks requestVerificationStatusField (boolean value) {
      this.requestField("verification_status", value);
      return this;
    }
    public APIRequestGetBooks requestVoipInfoField () {
      return this.requestVoipInfoField(true);
    }
    public APIRequestGetBooks requestVoipInfoField (boolean value) {
      this.requestField("voip_info", value);
      return this;
    }
    public APIRequestGetBooks requestWebsiteField () {
      return this.requestWebsiteField(true);
    }
    public APIRequestGetBooks requestWebsiteField (boolean value) {
      this.requestField("website", value);
      return this;
    }
    public APIRequestGetBooks requestWereHereCountField () {
      return this.requestWereHereCountField(true);
    }
    public APIRequestGetBooks requestWereHereCountField (boolean value) {
      this.requestField("were_here_count", value);
      return this;
    }
    public APIRequestGetBooks requestWhatsappNumberField () {
      return this.requestWhatsappNumberField(true);
    }
    public APIRequestGetBooks requestWhatsappNumberField (boolean value) {
      this.requestField("whatsapp_number", value);
      return this;
    }
    public APIRequestGetBooks requestWrittenByField () {
      return this.requestWrittenByField(true);
    }
    public APIRequestGetBooks requestWrittenByField (boolean value) {
      this.requestField("written_by", value);
      return this;
    }
  }

  public static class APIRequestGetBusinessUsers extends APIRequest<BusinessUser> {

    APINodeList<BusinessUser> lastResponse = null;
    @Override
    public APINodeList<BusinessUser> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "business",
      "email",
      "finance_permission",
      "first_name",
      "id",
      "ip_permission",
      "last_name",
      "marked_for_removal",
      "name",
      "pending_email",
      "role",
      "title",
      "two_fac_status",
    };

    @Override
    public APINodeList<BusinessUser> parseResponse(String response, String header) throws APIException {
      return BusinessUser.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<BusinessUser> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<BusinessUser> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<BusinessUser>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<BusinessUser>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<BusinessUser>>() {
           public APINodeList<BusinessUser> apply(ResponseWrapper result) {
             try {
               return APIRequestGetBusinessUsers.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetBusinessUsers(String nodeId, APIContext context) {
      super(context, nodeId, "/business_users", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetBusinessUsers setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetBusinessUsers setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetBusinessUsers requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetBusinessUsers requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetBusinessUsers requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetBusinessUsers requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetBusinessUsers requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetBusinessUsers requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetBusinessUsers requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetBusinessUsers requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetBusinessUsers requestEmailField () {
      return this.requestEmailField(true);
    }
    public APIRequestGetBusinessUsers requestEmailField (boolean value) {
      this.requestField("email", value);
      return this;
    }
    public APIRequestGetBusinessUsers requestFinancePermissionField () {
      return this.requestFinancePermissionField(true);
    }
    public APIRequestGetBusinessUsers requestFinancePermissionField (boolean value) {
      this.requestField("finance_permission", value);
      return this;
    }
    public APIRequestGetBusinessUsers requestFirstNameField () {
      return this.requestFirstNameField(true);
    }
    public APIRequestGetBusinessUsers requestFirstNameField (boolean value) {
      this.requestField("first_name", value);
      return this;
    }
    public APIRequestGetBusinessUsers requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetBusinessUsers requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetBusinessUsers requestIpPermissionField () {
      return this.requestIpPermissionField(true);
    }
    public APIRequestGetBusinessUsers requestIpPermissionField (boolean value) {
      this.requestField("ip_permission", value);
      return this;
    }
    public APIRequestGetBusinessUsers requestLastNameField () {
      return this.requestLastNameField(true);
    }
    public APIRequestGetBusinessUsers requestLastNameField (boolean value) {
      this.requestField("last_name", value);
      return this;
    }
    public APIRequestGetBusinessUsers requestMarkedForRemovalField () {
      return this.requestMarkedForRemovalField(true);
    }
    public APIRequestGetBusinessUsers requestMarkedForRemovalField (boolean value) {
      this.requestField("marked_for_removal", value);
      return this;
    }
    public APIRequestGetBusinessUsers requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetBusinessUsers requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetBusinessUsers requestPendingEmailField () {
      return this.requestPendingEmailField(true);
    }
    public APIRequestGetBusinessUsers requestPendingEmailField (boolean value) {
      this.requestField("pending_email", value);
      return this;
    }
    public APIRequestGetBusinessUsers requestRoleField () {
      return this.requestRoleField(true);
    }
    public APIRequestGetBusinessUsers requestRoleField (boolean value) {
      this.requestField("role", value);
      return this;
    }
    public APIRequestGetBusinessUsers requestTitleField () {
      return this.requestTitleField(true);
    }
    public APIRequestGetBusinessUsers requestTitleField (boolean value) {
      this.requestField("title", value);
      return this;
    }
    public APIRequestGetBusinessUsers requestTwoFacStatusField () {
      return this.requestTwoFacStatusField(true);
    }
    public APIRequestGetBusinessUsers requestTwoFacStatusField (boolean value) {
      this.requestField("two_fac_status", value);
      return this;
    }
  }

  public static class APIRequestDeleteBusinesses extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "business",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestDeleteBusinesses.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestDeleteBusinesses(String nodeId, APIContext context) {
      super(context, nodeId, "/businesses", "DELETE", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestDeleteBusinesses setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestDeleteBusinesses setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestDeleteBusinesses setBusiness (String business) {
      this.setParam("business", business);
      return this;
    }

    public APIRequestDeleteBusinesses requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestDeleteBusinesses requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteBusinesses requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestDeleteBusinesses requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeleteBusinesses requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestDeleteBusinesses requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetBusinesses extends APIRequest<Business> {

    APINodeList<Business> lastResponse = null;
    @Override
    public APINodeList<Business> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "block_offline_analytics",
      "created_by",
      "created_time",
      "extended_updated_time",
      "id",
      "is_hidden",
      "is_instagram_enabled_in_fb_analytics",
      "link",
      "name",
      "primary_page",
      "profile_picture_uri",
      "timezone_id",
      "two_factor_type",
      "updated_by",
      "updated_time",
      "verification_status",
      "vertical",
      "vertical_id",
    };

    @Override
    public APINodeList<Business> parseResponse(String response, String header) throws APIException {
      return Business.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Business> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Business> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Business>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Business>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Business>>() {
           public APINodeList<Business> apply(ResponseWrapper result) {
             try {
               return APIRequestGetBusinesses.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetBusinesses(String nodeId, APIContext context) {
      super(context, nodeId, "/businesses", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetBusinesses setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetBusinesses setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetBusinesses requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetBusinesses requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetBusinesses requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetBusinesses requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetBusinesses requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetBusinesses requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetBusinesses requestBlockOfflineAnalyticsField () {
      return this.requestBlockOfflineAnalyticsField(true);
    }
    public APIRequestGetBusinesses requestBlockOfflineAnalyticsField (boolean value) {
      this.requestField("block_offline_analytics", value);
      return this;
    }
    public APIRequestGetBusinesses requestCreatedByField () {
      return this.requestCreatedByField(true);
    }
    public APIRequestGetBusinesses requestCreatedByField (boolean value) {
      this.requestField("created_by", value);
      return this;
    }
    public APIRequestGetBusinesses requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetBusinesses requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetBusinesses requestExtendedUpdatedTimeField () {
      return this.requestExtendedUpdatedTimeField(true);
    }
    public APIRequestGetBusinesses requestExtendedUpdatedTimeField (boolean value) {
      this.requestField("extended_updated_time", value);
      return this;
    }
    public APIRequestGetBusinesses requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetBusinesses requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetBusinesses requestIsHiddenField () {
      return this.requestIsHiddenField(true);
    }
    public APIRequestGetBusinesses requestIsHiddenField (boolean value) {
      this.requestField("is_hidden", value);
      return this;
    }
    public APIRequestGetBusinesses requestIsInstagramEnabledInFbAnalyticsField () {
      return this.requestIsInstagramEnabledInFbAnalyticsField(true);
    }
    public APIRequestGetBusinesses requestIsInstagramEnabledInFbAnalyticsField (boolean value) {
      this.requestField("is_instagram_enabled_in_fb_analytics", value);
      return this;
    }
    public APIRequestGetBusinesses requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetBusinesses requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetBusinesses requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetBusinesses requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetBusinesses requestPrimaryPageField () {
      return this.requestPrimaryPageField(true);
    }
    public APIRequestGetBusinesses requestPrimaryPageField (boolean value) {
      this.requestField("primary_page", value);
      return this;
    }
    public APIRequestGetBusinesses requestProfilePictureUriField () {
      return this.requestProfilePictureUriField(true);
    }
    public APIRequestGetBusinesses requestProfilePictureUriField (boolean value) {
      this.requestField("profile_picture_uri", value);
      return this;
    }
    public APIRequestGetBusinesses requestTimezoneIdField () {
      return this.requestTimezoneIdField(true);
    }
    public APIRequestGetBusinesses requestTimezoneIdField (boolean value) {
      this.requestField("timezone_id", value);
      return this;
    }
    public APIRequestGetBusinesses requestTwoFactorTypeField () {
      return this.requestTwoFactorTypeField(true);
    }
    public APIRequestGetBusinesses requestTwoFactorTypeField (boolean value) {
      this.requestField("two_factor_type", value);
      return this;
    }
    public APIRequestGetBusinesses requestUpdatedByField () {
      return this.requestUpdatedByField(true);
    }
    public APIRequestGetBusinesses requestUpdatedByField (boolean value) {
      this.requestField("updated_by", value);
      return this;
    }
    public APIRequestGetBusinesses requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetBusinesses requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
    public APIRequestGetBusinesses requestVerificationStatusField () {
      return this.requestVerificationStatusField(true);
    }
    public APIRequestGetBusinesses requestVerificationStatusField (boolean value) {
      this.requestField("verification_status", value);
      return this;
    }
    public APIRequestGetBusinesses requestVerticalField () {
      return this.requestVerticalField(true);
    }
    public APIRequestGetBusinesses requestVerticalField (boolean value) {
      this.requestField("vertical", value);
      return this;
    }
    public APIRequestGetBusinesses requestVerticalIdField () {
      return this.requestVerticalIdField(true);
    }
    public APIRequestGetBusinesses requestVerticalIdField (boolean value) {
      this.requestField("vertical_id", value);
      return this;
    }
  }

  public static class APIRequestGetConversations extends APIRequest<UnifiedThread> {

    APINodeList<UnifiedThread> lastResponse = null;
    @Override
    public APINodeList<UnifiedThread> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "folder",
      "tags",
      "user_id",
    };

    public static final String[] FIELDS = {
      "can_reply",
      "former_participants",
      "id",
      "is_subscribed",
      "link",
      "message_count",
      "name",
      "participants",
      "scoped_thread_key",
      "senders",
      "snippet",
      "subject",
      "unread_count",
      "updated_time",
      "wallpaper",
    };

    @Override
    public APINodeList<UnifiedThread> parseResponse(String response, String header) throws APIException {
      return UnifiedThread.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<UnifiedThread> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<UnifiedThread> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<UnifiedThread>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<UnifiedThread>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<UnifiedThread>>() {
           public APINodeList<UnifiedThread> apply(ResponseWrapper result) {
             try {
               return APIRequestGetConversations.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetConversations(String nodeId, APIContext context) {
      super(context, nodeId, "/conversations", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetConversations setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetConversations setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetConversations setFolder (String folder) {
      this.setParam("folder", folder);
      return this;
    }

    public APIRequestGetConversations setTags (List<String> tags) {
      this.setParam("tags", tags);
      return this;
    }
    public APIRequestGetConversations setTags (String tags) {
      this.setParam("tags", tags);
      return this;
    }

    public APIRequestGetConversations setUserId (String userId) {
      this.setParam("user_id", userId);
      return this;
    }

    public APIRequestGetConversations requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetConversations requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetConversations requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetConversations requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetConversations requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetConversations requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetConversations requestCanReplyField () {
      return this.requestCanReplyField(true);
    }
    public APIRequestGetConversations requestCanReplyField (boolean value) {
      this.requestField("can_reply", value);
      return this;
    }
    public APIRequestGetConversations requestFormerParticipantsField () {
      return this.requestFormerParticipantsField(true);
    }
    public APIRequestGetConversations requestFormerParticipantsField (boolean value) {
      this.requestField("former_participants", value);
      return this;
    }
    public APIRequestGetConversations requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetConversations requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetConversations requestIsSubscribedField () {
      return this.requestIsSubscribedField(true);
    }
    public APIRequestGetConversations requestIsSubscribedField (boolean value) {
      this.requestField("is_subscribed", value);
      return this;
    }
    public APIRequestGetConversations requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetConversations requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetConversations requestMessageCountField () {
      return this.requestMessageCountField(true);
    }
    public APIRequestGetConversations requestMessageCountField (boolean value) {
      this.requestField("message_count", value);
      return this;
    }
    public APIRequestGetConversations requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetConversations requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetConversations requestParticipantsField () {
      return this.requestParticipantsField(true);
    }
    public APIRequestGetConversations requestParticipantsField (boolean value) {
      this.requestField("participants", value);
      return this;
    }
    public APIRequestGetConversations requestScopedThreadKeyField () {
      return this.requestScopedThreadKeyField(true);
    }
    public APIRequestGetConversations requestScopedThreadKeyField (boolean value) {
      this.requestField("scoped_thread_key", value);
      return this;
    }
    public APIRequestGetConversations requestSendersField () {
      return this.requestSendersField(true);
    }
    public APIRequestGetConversations requestSendersField (boolean value) {
      this.requestField("senders", value);
      return this;
    }
    public APIRequestGetConversations requestSnippetField () {
      return this.requestSnippetField(true);
    }
    public APIRequestGetConversations requestSnippetField (boolean value) {
      this.requestField("snippet", value);
      return this;
    }
    public APIRequestGetConversations requestSubjectField () {
      return this.requestSubjectField(true);
    }
    public APIRequestGetConversations requestSubjectField (boolean value) {
      this.requestField("subject", value);
      return this;
    }
    public APIRequestGetConversations requestUnreadCountField () {
      return this.requestUnreadCountField(true);
    }
    public APIRequestGetConversations requestUnreadCountField (boolean value) {
      this.requestField("unread_count", value);
      return this;
    }
    public APIRequestGetConversations requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetConversations requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
    public APIRequestGetConversations requestWallpaperField () {
      return this.requestWallpaperField(true);
    }
    public APIRequestGetConversations requestWallpaperField (boolean value) {
      this.requestField("wallpaper", value);
      return this;
    }
  }

  public static class APIRequestGetEvents extends APIRequest<Event> {

    APINodeList<Event> lastResponse = null;
    @Override
    public APINodeList<Event> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "include_canceled",
      "type",
    };

    public static final String[] FIELDS = {
      "attending_count",
      "can_guests_invite",
      "category",
      "cover",
      "declined_count",
      "description",
      "discount_code_enabled",
      "end_time",
      "event_times",
      "guest_list_enabled",
      "id",
      "interested_count",
      "is_canceled",
      "is_draft",
      "is_page_owned",
      "maybe_count",
      "name",
      "noreply_count",
      "owner",
      "parent_group",
      "place",
      "scheduled_publish_time",
      "start_time",
      "ticket_uri",
      "ticket_uri_start_sales_time",
      "ticketing_privacy_uri",
      "ticketing_terms_uri",
      "timezone",
      "type",
      "updated_time",
    };

    @Override
    public APINodeList<Event> parseResponse(String response, String header) throws APIException {
      return Event.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Event> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Event> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Event>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Event>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Event>>() {
           public APINodeList<Event> apply(ResponseWrapper result) {
             try {
               return APIRequestGetEvents.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetEvents(String nodeId, APIContext context) {
      super(context, nodeId, "/events", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetEvents setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetEvents setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetEvents setIncludeCanceled (Boolean includeCanceled) {
      this.setParam("include_canceled", includeCanceled);
      return this;
    }
    public APIRequestGetEvents setIncludeCanceled (String includeCanceled) {
      this.setParam("include_canceled", includeCanceled);
      return this;
    }

    public APIRequestGetEvents setType (Event.EnumType type) {
      this.setParam("type", type);
      return this;
    }
    public APIRequestGetEvents setType (String type) {
      this.setParam("type", type);
      return this;
    }

    public APIRequestGetEvents requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetEvents requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetEvents requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetEvents requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetEvents requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetEvents requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetEvents requestAttendingCountField () {
      return this.requestAttendingCountField(true);
    }
    public APIRequestGetEvents requestAttendingCountField (boolean value) {
      this.requestField("attending_count", value);
      return this;
    }
    public APIRequestGetEvents requestCanGuestsInviteField () {
      return this.requestCanGuestsInviteField(true);
    }
    public APIRequestGetEvents requestCanGuestsInviteField (boolean value) {
      this.requestField("can_guests_invite", value);
      return this;
    }
    public APIRequestGetEvents requestCategoryField () {
      return this.requestCategoryField(true);
    }
    public APIRequestGetEvents requestCategoryField (boolean value) {
      this.requestField("category", value);
      return this;
    }
    public APIRequestGetEvents requestCoverField () {
      return this.requestCoverField(true);
    }
    public APIRequestGetEvents requestCoverField (boolean value) {
      this.requestField("cover", value);
      return this;
    }
    public APIRequestGetEvents requestDeclinedCountField () {
      return this.requestDeclinedCountField(true);
    }
    public APIRequestGetEvents requestDeclinedCountField (boolean value) {
      this.requestField("declined_count", value);
      return this;
    }
    public APIRequestGetEvents requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetEvents requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetEvents requestDiscountCodeEnabledField () {
      return this.requestDiscountCodeEnabledField(true);
    }
    public APIRequestGetEvents requestDiscountCodeEnabledField (boolean value) {
      this.requestField("discount_code_enabled", value);
      return this;
    }
    public APIRequestGetEvents requestEndTimeField () {
      return this.requestEndTimeField(true);
    }
    public APIRequestGetEvents requestEndTimeField (boolean value) {
      this.requestField("end_time", value);
      return this;
    }
    public APIRequestGetEvents requestEventTimesField () {
      return this.requestEventTimesField(true);
    }
    public APIRequestGetEvents requestEventTimesField (boolean value) {
      this.requestField("event_times", value);
      return this;
    }
    public APIRequestGetEvents requestGuestListEnabledField () {
      return this.requestGuestListEnabledField(true);
    }
    public APIRequestGetEvents requestGuestListEnabledField (boolean value) {
      this.requestField("guest_list_enabled", value);
      return this;
    }
    public APIRequestGetEvents requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetEvents requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetEvents requestInterestedCountField () {
      return this.requestInterestedCountField(true);
    }
    public APIRequestGetEvents requestInterestedCountField (boolean value) {
      this.requestField("interested_count", value);
      return this;
    }
    public APIRequestGetEvents requestIsCanceledField () {
      return this.requestIsCanceledField(true);
    }
    public APIRequestGetEvents requestIsCanceledField (boolean value) {
      this.requestField("is_canceled", value);
      return this;
    }
    public APIRequestGetEvents requestIsDraftField () {
      return this.requestIsDraftField(true);
    }
    public APIRequestGetEvents requestIsDraftField (boolean value) {
      this.requestField("is_draft", value);
      return this;
    }
    public APIRequestGetEvents requestIsPageOwnedField () {
      return this.requestIsPageOwnedField(true);
    }
    public APIRequestGetEvents requestIsPageOwnedField (boolean value) {
      this.requestField("is_page_owned", value);
      return this;
    }
    public APIRequestGetEvents requestMaybeCountField () {
      return this.requestMaybeCountField(true);
    }
    public APIRequestGetEvents requestMaybeCountField (boolean value) {
      this.requestField("maybe_count", value);
      return this;
    }
    public APIRequestGetEvents requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetEvents requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetEvents requestNoreplyCountField () {
      return this.requestNoreplyCountField(true);
    }
    public APIRequestGetEvents requestNoreplyCountField (boolean value) {
      this.requestField("noreply_count", value);
      return this;
    }
    public APIRequestGetEvents requestOwnerField () {
      return this.requestOwnerField(true);
    }
    public APIRequestGetEvents requestOwnerField (boolean value) {
      this.requestField("owner", value);
      return this;
    }
    public APIRequestGetEvents requestParentGroupField () {
      return this.requestParentGroupField(true);
    }
    public APIRequestGetEvents requestParentGroupField (boolean value) {
      this.requestField("parent_group", value);
      return this;
    }
    public APIRequestGetEvents requestPlaceField () {
      return this.requestPlaceField(true);
    }
    public APIRequestGetEvents requestPlaceField (boolean value) {
      this.requestField("place", value);
      return this;
    }
    public APIRequestGetEvents requestScheduledPublishTimeField () {
      return this.requestScheduledPublishTimeField(true);
    }
    public APIRequestGetEvents requestScheduledPublishTimeField (boolean value) {
      this.requestField("scheduled_publish_time", value);
      return this;
    }
    public APIRequestGetEvents requestStartTimeField () {
      return this.requestStartTimeField(true);
    }
    public APIRequestGetEvents requestStartTimeField (boolean value) {
      this.requestField("start_time", value);
      return this;
    }
    public APIRequestGetEvents requestTicketUriField () {
      return this.requestTicketUriField(true);
    }
    public APIRequestGetEvents requestTicketUriField (boolean value) {
      this.requestField("ticket_uri", value);
      return this;
    }
    public APIRequestGetEvents requestTicketUriStartSalesTimeField () {
      return this.requestTicketUriStartSalesTimeField(true);
    }
    public APIRequestGetEvents requestTicketUriStartSalesTimeField (boolean value) {
      this.requestField("ticket_uri_start_sales_time", value);
      return this;
    }
    public APIRequestGetEvents requestTicketingPrivacyUriField () {
      return this.requestTicketingPrivacyUriField(true);
    }
    public APIRequestGetEvents requestTicketingPrivacyUriField (boolean value) {
      this.requestField("ticketing_privacy_uri", value);
      return this;
    }
    public APIRequestGetEvents requestTicketingTermsUriField () {
      return this.requestTicketingTermsUriField(true);
    }
    public APIRequestGetEvents requestTicketingTermsUriField (boolean value) {
      this.requestField("ticketing_terms_uri", value);
      return this;
    }
    public APIRequestGetEvents requestTimezoneField () {
      return this.requestTimezoneField(true);
    }
    public APIRequestGetEvents requestTimezoneField (boolean value) {
      this.requestField("timezone", value);
      return this;
    }
    public APIRequestGetEvents requestTypeField () {
      return this.requestTypeField(true);
    }
    public APIRequestGetEvents requestTypeField (boolean value) {
      this.requestField("type", value);
      return this;
    }
    public APIRequestGetEvents requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetEvents requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
  }

  public static class APIRequestGetFamily extends APIRequest<User> {

    APINodeList<User> lastResponse = null;
    @Override
    public APINodeList<User> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "about",
      "address",
      "admin_notes",
      "age_range",
      "birthday",
      "can_review_measurement_request",
      "cover",
      "currency",
      "devices",
      "education",
      "email",
      "employee_number",
      "favorite_athletes",
      "favorite_teams",
      "first_name",
      "gender",
      "hometown",
      "id",
      "inspirational_people",
      "install_type",
      "installed",
      "interested_in",
      "is_famedeeplinkinguser",
      "is_shared_login",
      "is_verified",
      "labels",
      "languages",
      "last_name",
      "link",
      "local_news_megaphone_dismiss_status",
      "local_news_subscription_status",
      "locale",
      "location",
      "meeting_for",
      "middle_name",
      "name",
      "name_format",
      "payment_pricepoints",
      "political",
      "profile_pic",
      "public_key",
      "quotes",
      "relationship_status",
      "religion",
      "security_settings",
      "shared_login_upgrade_required_by",
      "short_name",
      "significant_other",
      "sports",
      "test_group",
      "third_party_id",
      "timezone",
      "token_for_business",
      "updated_time",
      "verified",
      "video_upload_limits",
      "viewer_can_send_gift",
      "website",
      "work",
    };

    @Override
    public APINodeList<User> parseResponse(String response, String header) throws APIException {
      return User.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<User> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<User> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<User>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<User>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<User>>() {
           public APINodeList<User> apply(ResponseWrapper result) {
             try {
               return APIRequestGetFamily.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetFamily(String nodeId, APIContext context) {
      super(context, nodeId, "/family", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetFamily setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetFamily setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetFamily requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetFamily requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetFamily requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetFamily requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetFamily requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetFamily requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetFamily requestAboutField () {
      return this.requestAboutField(true);
    }
    public APIRequestGetFamily requestAboutField (boolean value) {
      this.requestField("about", value);
      return this;
    }
    public APIRequestGetFamily requestAddressField () {
      return this.requestAddressField(true);
    }
    public APIRequestGetFamily requestAddressField (boolean value) {
      this.requestField("address", value);
      return this;
    }
    public APIRequestGetFamily requestAdminNotesField () {
      return this.requestAdminNotesField(true);
    }
    public APIRequestGetFamily requestAdminNotesField (boolean value) {
      this.requestField("admin_notes", value);
      return this;
    }
    public APIRequestGetFamily requestAgeRangeField () {
      return this.requestAgeRangeField(true);
    }
    public APIRequestGetFamily requestAgeRangeField (boolean value) {
      this.requestField("age_range", value);
      return this;
    }
    public APIRequestGetFamily requestBirthdayField () {
      return this.requestBirthdayField(true);
    }
    public APIRequestGetFamily requestBirthdayField (boolean value) {
      this.requestField("birthday", value);
      return this;
    }
    public APIRequestGetFamily requestCanReviewMeasurementRequestField () {
      return this.requestCanReviewMeasurementRequestField(true);
    }
    public APIRequestGetFamily requestCanReviewMeasurementRequestField (boolean value) {
      this.requestField("can_review_measurement_request", value);
      return this;
    }
    public APIRequestGetFamily requestCoverField () {
      return this.requestCoverField(true);
    }
    public APIRequestGetFamily requestCoverField (boolean value) {
      this.requestField("cover", value);
      return this;
    }
    public APIRequestGetFamily requestCurrencyField () {
      return this.requestCurrencyField(true);
    }
    public APIRequestGetFamily requestCurrencyField (boolean value) {
      this.requestField("currency", value);
      return this;
    }
    public APIRequestGetFamily requestDevicesField () {
      return this.requestDevicesField(true);
    }
    public APIRequestGetFamily requestDevicesField (boolean value) {
      this.requestField("devices", value);
      return this;
    }
    public APIRequestGetFamily requestEducationField () {
      return this.requestEducationField(true);
    }
    public APIRequestGetFamily requestEducationField (boolean value) {
      this.requestField("education", value);
      return this;
    }
    public APIRequestGetFamily requestEmailField () {
      return this.requestEmailField(true);
    }
    public APIRequestGetFamily requestEmailField (boolean value) {
      this.requestField("email", value);
      return this;
    }
    public APIRequestGetFamily requestEmployeeNumberField () {
      return this.requestEmployeeNumberField(true);
    }
    public APIRequestGetFamily requestEmployeeNumberField (boolean value) {
      this.requestField("employee_number", value);
      return this;
    }
    public APIRequestGetFamily requestFavoriteAthletesField () {
      return this.requestFavoriteAthletesField(true);
    }
    public APIRequestGetFamily requestFavoriteAthletesField (boolean value) {
      this.requestField("favorite_athletes", value);
      return this;
    }
    public APIRequestGetFamily requestFavoriteTeamsField () {
      return this.requestFavoriteTeamsField(true);
    }
    public APIRequestGetFamily requestFavoriteTeamsField (boolean value) {
      this.requestField("favorite_teams", value);
      return this;
    }
    public APIRequestGetFamily requestFirstNameField () {
      return this.requestFirstNameField(true);
    }
    public APIRequestGetFamily requestFirstNameField (boolean value) {
      this.requestField("first_name", value);
      return this;
    }
    public APIRequestGetFamily requestGenderField () {
      return this.requestGenderField(true);
    }
    public APIRequestGetFamily requestGenderField (boolean value) {
      this.requestField("gender", value);
      return this;
    }
    public APIRequestGetFamily requestHometownField () {
      return this.requestHometownField(true);
    }
    public APIRequestGetFamily requestHometownField (boolean value) {
      this.requestField("hometown", value);
      return this;
    }
    public APIRequestGetFamily requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetFamily requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetFamily requestInspirationalPeopleField () {
      return this.requestInspirationalPeopleField(true);
    }
    public APIRequestGetFamily requestInspirationalPeopleField (boolean value) {
      this.requestField("inspirational_people", value);
      return this;
    }
    public APIRequestGetFamily requestInstallTypeField () {
      return this.requestInstallTypeField(true);
    }
    public APIRequestGetFamily requestInstallTypeField (boolean value) {
      this.requestField("install_type", value);
      return this;
    }
    public APIRequestGetFamily requestInstalledField () {
      return this.requestInstalledField(true);
    }
    public APIRequestGetFamily requestInstalledField (boolean value) {
      this.requestField("installed", value);
      return this;
    }
    public APIRequestGetFamily requestInterestedInField () {
      return this.requestInterestedInField(true);
    }
    public APIRequestGetFamily requestInterestedInField (boolean value) {
      this.requestField("interested_in", value);
      return this;
    }
    public APIRequestGetFamily requestIsFamedeeplinkinguserField () {
      return this.requestIsFamedeeplinkinguserField(true);
    }
    public APIRequestGetFamily requestIsFamedeeplinkinguserField (boolean value) {
      this.requestField("is_famedeeplinkinguser", value);
      return this;
    }
    public APIRequestGetFamily requestIsSharedLoginField () {
      return this.requestIsSharedLoginField(true);
    }
    public APIRequestGetFamily requestIsSharedLoginField (boolean value) {
      this.requestField("is_shared_login", value);
      return this;
    }
    public APIRequestGetFamily requestIsVerifiedField () {
      return this.requestIsVerifiedField(true);
    }
    public APIRequestGetFamily requestIsVerifiedField (boolean value) {
      this.requestField("is_verified", value);
      return this;
    }
    public APIRequestGetFamily requestLabelsField () {
      return this.requestLabelsField(true);
    }
    public APIRequestGetFamily requestLabelsField (boolean value) {
      this.requestField("labels", value);
      return this;
    }
    public APIRequestGetFamily requestLanguagesField () {
      return this.requestLanguagesField(true);
    }
    public APIRequestGetFamily requestLanguagesField (boolean value) {
      this.requestField("languages", value);
      return this;
    }
    public APIRequestGetFamily requestLastNameField () {
      return this.requestLastNameField(true);
    }
    public APIRequestGetFamily requestLastNameField (boolean value) {
      this.requestField("last_name", value);
      return this;
    }
    public APIRequestGetFamily requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetFamily requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetFamily requestLocalNewsMegaphoneDismissStatusField () {
      return this.requestLocalNewsMegaphoneDismissStatusField(true);
    }
    public APIRequestGetFamily requestLocalNewsMegaphoneDismissStatusField (boolean value) {
      this.requestField("local_news_megaphone_dismiss_status", value);
      return this;
    }
    public APIRequestGetFamily requestLocalNewsSubscriptionStatusField () {
      return this.requestLocalNewsSubscriptionStatusField(true);
    }
    public APIRequestGetFamily requestLocalNewsSubscriptionStatusField (boolean value) {
      this.requestField("local_news_subscription_status", value);
      return this;
    }
    public APIRequestGetFamily requestLocaleField () {
      return this.requestLocaleField(true);
    }
    public APIRequestGetFamily requestLocaleField (boolean value) {
      this.requestField("locale", value);
      return this;
    }
    public APIRequestGetFamily requestLocationField () {
      return this.requestLocationField(true);
    }
    public APIRequestGetFamily requestLocationField (boolean value) {
      this.requestField("location", value);
      return this;
    }
    public APIRequestGetFamily requestMeetingForField () {
      return this.requestMeetingForField(true);
    }
    public APIRequestGetFamily requestMeetingForField (boolean value) {
      this.requestField("meeting_for", value);
      return this;
    }
    public APIRequestGetFamily requestMiddleNameField () {
      return this.requestMiddleNameField(true);
    }
    public APIRequestGetFamily requestMiddleNameField (boolean value) {
      this.requestField("middle_name", value);
      return this;
    }
    public APIRequestGetFamily requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetFamily requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetFamily requestNameFormatField () {
      return this.requestNameFormatField(true);
    }
    public APIRequestGetFamily requestNameFormatField (boolean value) {
      this.requestField("name_format", value);
      return this;
    }
    public APIRequestGetFamily requestPaymentPricepointsField () {
      return this.requestPaymentPricepointsField(true);
    }
    public APIRequestGetFamily requestPaymentPricepointsField (boolean value) {
      this.requestField("payment_pricepoints", value);
      return this;
    }
    public APIRequestGetFamily requestPoliticalField () {
      return this.requestPoliticalField(true);
    }
    public APIRequestGetFamily requestPoliticalField (boolean value) {
      this.requestField("political", value);
      return this;
    }
    public APIRequestGetFamily requestProfilePicField () {
      return this.requestProfilePicField(true);
    }
    public APIRequestGetFamily requestProfilePicField (boolean value) {
      this.requestField("profile_pic", value);
      return this;
    }
    public APIRequestGetFamily requestPublicKeyField () {
      return this.requestPublicKeyField(true);
    }
    public APIRequestGetFamily requestPublicKeyField (boolean value) {
      this.requestField("public_key", value);
      return this;
    }
    public APIRequestGetFamily requestQuotesField () {
      return this.requestQuotesField(true);
    }
    public APIRequestGetFamily requestQuotesField (boolean value) {
      this.requestField("quotes", value);
      return this;
    }
    public APIRequestGetFamily requestRelationshipStatusField () {
      return this.requestRelationshipStatusField(true);
    }
    public APIRequestGetFamily requestRelationshipStatusField (boolean value) {
      this.requestField("relationship_status", value);
      return this;
    }
    public APIRequestGetFamily requestReligionField () {
      return this.requestReligionField(true);
    }
    public APIRequestGetFamily requestReligionField (boolean value) {
      this.requestField("religion", value);
      return this;
    }
    public APIRequestGetFamily requestSecuritySettingsField () {
      return this.requestSecuritySettingsField(true);
    }
    public APIRequestGetFamily requestSecuritySettingsField (boolean value) {
      this.requestField("security_settings", value);
      return this;
    }
    public APIRequestGetFamily requestSharedLoginUpgradeRequiredByField () {
      return this.requestSharedLoginUpgradeRequiredByField(true);
    }
    public APIRequestGetFamily requestSharedLoginUpgradeRequiredByField (boolean value) {
      this.requestField("shared_login_upgrade_required_by", value);
      return this;
    }
    public APIRequestGetFamily requestShortNameField () {
      return this.requestShortNameField(true);
    }
    public APIRequestGetFamily requestShortNameField (boolean value) {
      this.requestField("short_name", value);
      return this;
    }
    public APIRequestGetFamily requestSignificantOtherField () {
      return this.requestSignificantOtherField(true);
    }
    public APIRequestGetFamily requestSignificantOtherField (boolean value) {
      this.requestField("significant_other", value);
      return this;
    }
    public APIRequestGetFamily requestSportsField () {
      return this.requestSportsField(true);
    }
    public APIRequestGetFamily requestSportsField (boolean value) {
      this.requestField("sports", value);
      return this;
    }
    public APIRequestGetFamily requestTestGroupField () {
      return this.requestTestGroupField(true);
    }
    public APIRequestGetFamily requestTestGroupField (boolean value) {
      this.requestField("test_group", value);
      return this;
    }
    public APIRequestGetFamily requestThirdPartyIdField () {
      return this.requestThirdPartyIdField(true);
    }
    public APIRequestGetFamily requestThirdPartyIdField (boolean value) {
      this.requestField("third_party_id", value);
      return this;
    }
    public APIRequestGetFamily requestTimezoneField () {
      return this.requestTimezoneField(true);
    }
    public APIRequestGetFamily requestTimezoneField (boolean value) {
      this.requestField("timezone", value);
      return this;
    }
    public APIRequestGetFamily requestTokenForBusinessField () {
      return this.requestTokenForBusinessField(true);
    }
    public APIRequestGetFamily requestTokenForBusinessField (boolean value) {
      this.requestField("token_for_business", value);
      return this;
    }
    public APIRequestGetFamily requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetFamily requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
    public APIRequestGetFamily requestVerifiedField () {
      return this.requestVerifiedField(true);
    }
    public APIRequestGetFamily requestVerifiedField (boolean value) {
      this.requestField("verified", value);
      return this;
    }
    public APIRequestGetFamily requestVideoUploadLimitsField () {
      return this.requestVideoUploadLimitsField(true);
    }
    public APIRequestGetFamily requestVideoUploadLimitsField (boolean value) {
      this.requestField("video_upload_limits", value);
      return this;
    }
    public APIRequestGetFamily requestViewerCanSendGiftField () {
      return this.requestViewerCanSendGiftField(true);
    }
    public APIRequestGetFamily requestViewerCanSendGiftField (boolean value) {
      this.requestField("viewer_can_send_gift", value);
      return this;
    }
    public APIRequestGetFamily requestWebsiteField () {
      return this.requestWebsiteField(true);
    }
    public APIRequestGetFamily requestWebsiteField (boolean value) {
      this.requestField("website", value);
      return this;
    }
    public APIRequestGetFamily requestWorkField () {
      return this.requestWorkField(true);
    }
    public APIRequestGetFamily requestWorkField (boolean value) {
      this.requestField("work", value);
      return this;
    }
  }

  public static class APIRequestGetFavoriteRequests extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestGetFavoriteRequests.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetFavoriteRequests(String nodeId, APIContext context) {
      super(context, nodeId, "/favorite_requests", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetFavoriteRequests setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetFavoriteRequests setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetFavoriteRequests requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetFavoriteRequests requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetFavoriteRequests requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetFavoriteRequests requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetFavoriteRequests requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetFavoriteRequests requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateFeed extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "actions",
      "adaptive_type",
      "album_id",
      "android_key_hash",
      "animated_effect_id",
      "application_id",
      "asked_fun_fact_prompt_id",
      "asset3d_id",
      "associated_id",
      "attach_place_suggestion",
      "attached_media",
      "audience_exp",
      "backdated_time",
      "backdated_time_granularity",
      "call_to_action",
      "caption",
      "checkin_entry_point",
      "child_attachments",
      "client_mutation_id",
      "composer_entry_picker",
      "composer_entry_point",
      "composer_entry_time",
      "composer_session_events_log",
      "composer_session_id",
      "composer_source_surface",
      "composer_type",
      "connection_class",
      "content_attachment",
      "coordinates",
      "cta_link",
      "cta_type",
      "description",
      "direct_share_status",
      "expanded_height",
      "expanded_width",
      "feed_targeting",
      "formatting",
      "fun_fact_prompt_id",
      "fun_fact_toastee_id",
      "has_nickname",
      "height",
      "holiday_card",
      "home_checkin_city_id",
      "image_crops",
      "implicit_with_tags",
      "instant_game_entry_point_data",
      "ios_bundle_id",
      "is_backout_draft",
      "is_boost_intended",
      "is_explicit_location",
      "is_explicit_share",
      "is_group_linking_post",
      "is_photo_container",
      "link",
      "location_source_id",
      "manual_privacy",
      "message",
      "multi_share_end_card",
      "multi_share_optimized",
      "name",
      "nectar_module",
      "object_attachment",
      "offer_like_post_id",
      "og_action_type_id",
      "og_hide_object_attachment",
      "og_icon_id",
      "og_object_id",
      "og_phrase",
      "og_set_profile_badge",
      "og_suggestion_mechanism",
      "page_recommendation",
      "picture",
      "place",
      "place_attachment_setting",
      "place_list",
      "place_list_data",
      "post_surfaces_blacklist",
      "posting_to_redspace",
      "privacy",
      "prompt_id",
      "prompt_tracking_string",
      "properties",
      "proxied_app_id",
      "publish_event_id",
      "published",
      "quote",
      "react_mode_metadata",
      "ref",
      "referenceable_image_ids",
      "referral_id",
      "sales_promo_id",
      "scheduled_publish_time",
      "source",
      "sponsor_id",
      "sponsor_relationship",
      "suggested_place_id",
      "tags",
      "target_surface",
      "targeting",
      "text_format_metadata",
      "text_format_preset_id",
      "text_only_place",
      "throwback_camera_roll_media",
      "thumbnail",
      "time_since_original_post",
      "title",
      "tracking_info",
      "unpublished_content_type",
      "user_selected_tags",
      "video_start_time_ms",
      "viewer_coordinates",
      "width",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestCreateFeed.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateFeed(String nodeId, APIContext context) {
      super(context, nodeId, "/feed", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateFeed setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateFeed setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateFeed setActions (Object actions) {
      this.setParam("actions", actions);
      return this;
    }
    public APIRequestCreateFeed setActions (String actions) {
      this.setParam("actions", actions);
      return this;
    }

    public APIRequestCreateFeed setAdaptiveType (String adaptiveType) {
      this.setParam("adaptive_type", adaptiveType);
      return this;
    }

    public APIRequestCreateFeed setAlbumId (String albumId) {
      this.setParam("album_id", albumId);
      return this;
    }

    public APIRequestCreateFeed setAndroidKeyHash (String androidKeyHash) {
      this.setParam("android_key_hash", androidKeyHash);
      return this;
    }

    public APIRequestCreateFeed setAnimatedEffectId (Long animatedEffectId) {
      this.setParam("animated_effect_id", animatedEffectId);
      return this;
    }
    public APIRequestCreateFeed setAnimatedEffectId (String animatedEffectId) {
      this.setParam("animated_effect_id", animatedEffectId);
      return this;
    }

    public APIRequestCreateFeed setApplicationId (String applicationId) {
      this.setParam("application_id", applicationId);
      return this;
    }

    public APIRequestCreateFeed setAskedFunFactPromptId (Long askedFunFactPromptId) {
      this.setParam("asked_fun_fact_prompt_id", askedFunFactPromptId);
      return this;
    }
    public APIRequestCreateFeed setAskedFunFactPromptId (String askedFunFactPromptId) {
      this.setParam("asked_fun_fact_prompt_id", askedFunFactPromptId);
      return this;
    }

    public APIRequestCreateFeed setAsset3dId (Long asset3dId) {
      this.setParam("asset3d_id", asset3dId);
      return this;
    }
    public APIRequestCreateFeed setAsset3dId (String asset3dId) {
      this.setParam("asset3d_id", asset3dId);
      return this;
    }

    public APIRequestCreateFeed setAssociatedId (String associatedId) {
      this.setParam("associated_id", associatedId);
      return this;
    }

    public APIRequestCreateFeed setAttachPlaceSuggestion (Boolean attachPlaceSuggestion) {
      this.setParam("attach_place_suggestion", attachPlaceSuggestion);
      return this;
    }
    public APIRequestCreateFeed setAttachPlaceSuggestion (String attachPlaceSuggestion) {
      this.setParam("attach_place_suggestion", attachPlaceSuggestion);
      return this;
    }

    public APIRequestCreateFeed setAttachedMedia (List<Object> attachedMedia) {
      this.setParam("attached_media", attachedMedia);
      return this;
    }
    public APIRequestCreateFeed setAttachedMedia (String attachedMedia) {
      this.setParam("attached_media", attachedMedia);
      return this;
    }

    public APIRequestCreateFeed setAudienceExp (Boolean audienceExp) {
      this.setParam("audience_exp", audienceExp);
      return this;
    }
    public APIRequestCreateFeed setAudienceExp (String audienceExp) {
      this.setParam("audience_exp", audienceExp);
      return this;
    }

    public APIRequestCreateFeed setBackdatedTime (String backdatedTime) {
      this.setParam("backdated_time", backdatedTime);
      return this;
    }

    public APIRequestCreateFeed setBackdatedTimeGranularity (EnumBackdatedTimeGranularity backdatedTimeGranularity) {
      this.setParam("backdated_time_granularity", backdatedTimeGranularity);
      return this;
    }
    public APIRequestCreateFeed setBackdatedTimeGranularity (String backdatedTimeGranularity) {
      this.setParam("backdated_time_granularity", backdatedTimeGranularity);
      return this;
    }

    public APIRequestCreateFeed setCallToAction (Object callToAction) {
      this.setParam("call_to_action", callToAction);
      return this;
    }
    public APIRequestCreateFeed setCallToAction (String callToAction) {
      this.setParam("call_to_action", callToAction);
      return this;
    }

    public APIRequestCreateFeed setCaption (String caption) {
      this.setParam("caption", caption);
      return this;
    }

    public APIRequestCreateFeed setCheckinEntryPoint (EnumCheckinEntryPoint checkinEntryPoint) {
      this.setParam("checkin_entry_point", checkinEntryPoint);
      return this;
    }
    public APIRequestCreateFeed setCheckinEntryPoint (String checkinEntryPoint) {
      this.setParam("checkin_entry_point", checkinEntryPoint);
      return this;
    }

    public APIRequestCreateFeed setChildAttachments (List<Object> childAttachments) {
      this.setParam("child_attachments", childAttachments);
      return this;
    }
    public APIRequestCreateFeed setChildAttachments (String childAttachments) {
      this.setParam("child_attachments", childAttachments);
      return this;
    }

    public APIRequestCreateFeed setClientMutationId (String clientMutationId) {
      this.setParam("client_mutation_id", clientMutationId);
      return this;
    }

    public APIRequestCreateFeed setComposerEntryPicker (String composerEntryPicker) {
      this.setParam("composer_entry_picker", composerEntryPicker);
      return this;
    }

    public APIRequestCreateFeed setComposerEntryPoint (String composerEntryPoint) {
      this.setParam("composer_entry_point", composerEntryPoint);
      return this;
    }

    public APIRequestCreateFeed setComposerEntryTime (Long composerEntryTime) {
      this.setParam("composer_entry_time", composerEntryTime);
      return this;
    }
    public APIRequestCreateFeed setComposerEntryTime (String composerEntryTime) {
      this.setParam("composer_entry_time", composerEntryTime);
      return this;
    }

    public APIRequestCreateFeed setComposerSessionEventsLog (String composerSessionEventsLog) {
      this.setParam("composer_session_events_log", composerSessionEventsLog);
      return this;
    }

    public APIRequestCreateFeed setComposerSessionId (String composerSessionId) {
      this.setParam("composer_session_id", composerSessionId);
      return this;
    }

    public APIRequestCreateFeed setComposerSourceSurface (String composerSourceSurface) {
      this.setParam("composer_source_surface", composerSourceSurface);
      return this;
    }

    public APIRequestCreateFeed setComposerType (String composerType) {
      this.setParam("composer_type", composerType);
      return this;
    }

    public APIRequestCreateFeed setConnectionClass (String connectionClass) {
      this.setParam("connection_class", connectionClass);
      return this;
    }

    public APIRequestCreateFeed setContentAttachment (String contentAttachment) {
      this.setParam("content_attachment", contentAttachment);
      return this;
    }

    public APIRequestCreateFeed setCoordinates (Object coordinates) {
      this.setParam("coordinates", coordinates);
      return this;
    }
    public APIRequestCreateFeed setCoordinates (String coordinates) {
      this.setParam("coordinates", coordinates);
      return this;
    }

    public APIRequestCreateFeed setCtaLink (String ctaLink) {
      this.setParam("cta_link", ctaLink);
      return this;
    }

    public APIRequestCreateFeed setCtaType (String ctaType) {
      this.setParam("cta_type", ctaType);
      return this;
    }

    public APIRequestCreateFeed setDescription (String description) {
      this.setParam("description", description);
      return this;
    }

    public APIRequestCreateFeed setDirectShareStatus (Long directShareStatus) {
      this.setParam("direct_share_status", directShareStatus);
      return this;
    }
    public APIRequestCreateFeed setDirectShareStatus (String directShareStatus) {
      this.setParam("direct_share_status", directShareStatus);
      return this;
    }

    public APIRequestCreateFeed setExpandedHeight (Long expandedHeight) {
      this.setParam("expanded_height", expandedHeight);
      return this;
    }
    public APIRequestCreateFeed setExpandedHeight (String expandedHeight) {
      this.setParam("expanded_height", expandedHeight);
      return this;
    }

    public APIRequestCreateFeed setExpandedWidth (Long expandedWidth) {
      this.setParam("expanded_width", expandedWidth);
      return this;
    }
    public APIRequestCreateFeed setExpandedWidth (String expandedWidth) {
      this.setParam("expanded_width", expandedWidth);
      return this;
    }

    public APIRequestCreateFeed setFeedTargeting (Object feedTargeting) {
      this.setParam("feed_targeting", feedTargeting);
      return this;
    }
    public APIRequestCreateFeed setFeedTargeting (String feedTargeting) {
      this.setParam("feed_targeting", feedTargeting);
      return this;
    }

    public APIRequestCreateFeed setFormatting (EnumFormatting formatting) {
      this.setParam("formatting", formatting);
      return this;
    }
    public APIRequestCreateFeed setFormatting (String formatting) {
      this.setParam("formatting", formatting);
      return this;
    }

    public APIRequestCreateFeed setFunFactPromptId (Long funFactPromptId) {
      this.setParam("fun_fact_prompt_id", funFactPromptId);
      return this;
    }
    public APIRequestCreateFeed setFunFactPromptId (String funFactPromptId) {
      this.setParam("fun_fact_prompt_id", funFactPromptId);
      return this;
    }

    public APIRequestCreateFeed setFunFactToasteeId (Long funFactToasteeId) {
      this.setParam("fun_fact_toastee_id", funFactToasteeId);
      return this;
    }
    public APIRequestCreateFeed setFunFactToasteeId (String funFactToasteeId) {
      this.setParam("fun_fact_toastee_id", funFactToasteeId);
      return this;
    }

    public APIRequestCreateFeed setHasNickname (Boolean hasNickname) {
      this.setParam("has_nickname", hasNickname);
      return this;
    }
    public APIRequestCreateFeed setHasNickname (String hasNickname) {
      this.setParam("has_nickname", hasNickname);
      return this;
    }

    public APIRequestCreateFeed setHeight (Long height) {
      this.setParam("height", height);
      return this;
    }
    public APIRequestCreateFeed setHeight (String height) {
      this.setParam("height", height);
      return this;
    }

    public APIRequestCreateFeed setHolidayCard (String holidayCard) {
      this.setParam("holiday_card", holidayCard);
      return this;
    }

    public APIRequestCreateFeed setHomeCheckinCityId (Object homeCheckinCityId) {
      this.setParam("home_checkin_city_id", homeCheckinCityId);
      return this;
    }
    public APIRequestCreateFeed setHomeCheckinCityId (String homeCheckinCityId) {
      this.setParam("home_checkin_city_id", homeCheckinCityId);
      return this;
    }

    public APIRequestCreateFeed setImageCrops (Map<String, String> imageCrops) {
      this.setParam("image_crops", imageCrops);
      return this;
    }
    public APIRequestCreateFeed setImageCrops (String imageCrops) {
      this.setParam("image_crops", imageCrops);
      return this;
    }

    public APIRequestCreateFeed setImplicitWithTags (List<Long> implicitWithTags) {
      this.setParam("implicit_with_tags", implicitWithTags);
      return this;
    }
    public APIRequestCreateFeed setImplicitWithTags (String implicitWithTags) {
      this.setParam("implicit_with_tags", implicitWithTags);
      return this;
    }

    public APIRequestCreateFeed setInstantGameEntryPointData (String instantGameEntryPointData) {
      this.setParam("instant_game_entry_point_data", instantGameEntryPointData);
      return this;
    }

    public APIRequestCreateFeed setIosBundleId (String iosBundleId) {
      this.setParam("ios_bundle_id", iosBundleId);
      return this;
    }

    public APIRequestCreateFeed setIsBackoutDraft (Boolean isBackoutDraft) {
      this.setParam("is_backout_draft", isBackoutDraft);
      return this;
    }
    public APIRequestCreateFeed setIsBackoutDraft (String isBackoutDraft) {
      this.setParam("is_backout_draft", isBackoutDraft);
      return this;
    }

    public APIRequestCreateFeed setIsBoostIntended (Boolean isBoostIntended) {
      this.setParam("is_boost_intended", isBoostIntended);
      return this;
    }
    public APIRequestCreateFeed setIsBoostIntended (String isBoostIntended) {
      this.setParam("is_boost_intended", isBoostIntended);
      return this;
    }

    public APIRequestCreateFeed setIsExplicitLocation (Boolean isExplicitLocation) {
      this.setParam("is_explicit_location", isExplicitLocation);
      return this;
    }
    public APIRequestCreateFeed setIsExplicitLocation (String isExplicitLocation) {
      this.setParam("is_explicit_location", isExplicitLocation);
      return this;
    }

    public APIRequestCreateFeed setIsExplicitShare (Boolean isExplicitShare) {
      this.setParam("is_explicit_share", isExplicitShare);
      return this;
    }
    public APIRequestCreateFeed setIsExplicitShare (String isExplicitShare) {
      this.setParam("is_explicit_share", isExplicitShare);
      return this;
    }

    public APIRequestCreateFeed setIsGroupLinkingPost (Boolean isGroupLinkingPost) {
      this.setParam("is_group_linking_post", isGroupLinkingPost);
      return this;
    }
    public APIRequestCreateFeed setIsGroupLinkingPost (String isGroupLinkingPost) {
      this.setParam("is_group_linking_post", isGroupLinkingPost);
      return this;
    }

    public APIRequestCreateFeed setIsPhotoContainer (Boolean isPhotoContainer) {
      this.setParam("is_photo_container", isPhotoContainer);
      return this;
    }
    public APIRequestCreateFeed setIsPhotoContainer (String isPhotoContainer) {
      this.setParam("is_photo_container", isPhotoContainer);
      return this;
    }

    public APIRequestCreateFeed setLink (String link) {
      this.setParam("link", link);
      return this;
    }

    public APIRequestCreateFeed setLocationSourceId (String locationSourceId) {
      this.setParam("location_source_id", locationSourceId);
      return this;
    }

    public APIRequestCreateFeed setManualPrivacy (Boolean manualPrivacy) {
      this.setParam("manual_privacy", manualPrivacy);
      return this;
    }
    public APIRequestCreateFeed setManualPrivacy (String manualPrivacy) {
      this.setParam("manual_privacy", manualPrivacy);
      return this;
    }

    public APIRequestCreateFeed setMessage (String message) {
      this.setParam("message", message);
      return this;
    }

    public APIRequestCreateFeed setMultiShareEndCard (Boolean multiShareEndCard) {
      this.setParam("multi_share_end_card", multiShareEndCard);
      return this;
    }
    public APIRequestCreateFeed setMultiShareEndCard (String multiShareEndCard) {
      this.setParam("multi_share_end_card", multiShareEndCard);
      return this;
    }

    public APIRequestCreateFeed setMultiShareOptimized (Boolean multiShareOptimized) {
      this.setParam("multi_share_optimized", multiShareOptimized);
      return this;
    }
    public APIRequestCreateFeed setMultiShareOptimized (String multiShareOptimized) {
      this.setParam("multi_share_optimized", multiShareOptimized);
      return this;
    }

    public APIRequestCreateFeed setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateFeed setNectarModule (String nectarModule) {
      this.setParam("nectar_module", nectarModule);
      return this;
    }

    public APIRequestCreateFeed setObjectAttachment (String objectAttachment) {
      this.setParam("object_attachment", objectAttachment);
      return this;
    }

    public APIRequestCreateFeed setOfferLikePostId (Long offerLikePostId) {
      this.setParam("offer_like_post_id", offerLikePostId);
      return this;
    }
    public APIRequestCreateFeed setOfferLikePostId (String offerLikePostId) {
      this.setParam("offer_like_post_id", offerLikePostId);
      return this;
    }

    public APIRequestCreateFeed setOgActionTypeId (String ogActionTypeId) {
      this.setParam("og_action_type_id", ogActionTypeId);
      return this;
    }

    public APIRequestCreateFeed setOgHideObjectAttachment (Boolean ogHideObjectAttachment) {
      this.setParam("og_hide_object_attachment", ogHideObjectAttachment);
      return this;
    }
    public APIRequestCreateFeed setOgHideObjectAttachment (String ogHideObjectAttachment) {
      this.setParam("og_hide_object_attachment", ogHideObjectAttachment);
      return this;
    }

    public APIRequestCreateFeed setOgIconId (String ogIconId) {
      this.setParam("og_icon_id", ogIconId);
      return this;
    }

    public APIRequestCreateFeed setOgObjectId (String ogObjectId) {
      this.setParam("og_object_id", ogObjectId);
      return this;
    }

    public APIRequestCreateFeed setOgPhrase (String ogPhrase) {
      this.setParam("og_phrase", ogPhrase);
      return this;
    }

    public APIRequestCreateFeed setOgSetProfileBadge (Boolean ogSetProfileBadge) {
      this.setParam("og_set_profile_badge", ogSetProfileBadge);
      return this;
    }
    public APIRequestCreateFeed setOgSetProfileBadge (String ogSetProfileBadge) {
      this.setParam("og_set_profile_badge", ogSetProfileBadge);
      return this;
    }

    public APIRequestCreateFeed setOgSuggestionMechanism (String ogSuggestionMechanism) {
      this.setParam("og_suggestion_mechanism", ogSuggestionMechanism);
      return this;
    }

    public APIRequestCreateFeed setPageRecommendation (String pageRecommendation) {
      this.setParam("page_recommendation", pageRecommendation);
      return this;
    }

    public APIRequestCreateFeed setPicture (String picture) {
      this.setParam("picture", picture);
      return this;
    }

    public APIRequestCreateFeed setPlace (Object place) {
      this.setParam("place", place);
      return this;
    }
    public APIRequestCreateFeed setPlace (String place) {
      this.setParam("place", place);
      return this;
    }

    public APIRequestCreateFeed setPlaceAttachmentSetting (EnumPlaceAttachmentSetting placeAttachmentSetting) {
      this.setParam("place_attachment_setting", placeAttachmentSetting);
      return this;
    }
    public APIRequestCreateFeed setPlaceAttachmentSetting (String placeAttachmentSetting) {
      this.setParam("place_attachment_setting", placeAttachmentSetting);
      return this;
    }

    public APIRequestCreateFeed setPlaceList (String placeList) {
      this.setParam("place_list", placeList);
      return this;
    }

    public APIRequestCreateFeed setPlaceListData (JsonArray placeListData) {
      this.setParam("place_list_data", placeListData);
      return this;
    }
    public APIRequestCreateFeed setPlaceListData (String placeListData) {
      this.setParam("place_list_data", placeListData);
      return this;
    }

    public APIRequestCreateFeed setPostSurfacesBlacklist (List<EnumPostSurfacesBlacklist> postSurfacesBlacklist) {
      this.setParam("post_surfaces_blacklist", postSurfacesBlacklist);
      return this;
    }
    public APIRequestCreateFeed setPostSurfacesBlacklist (String postSurfacesBlacklist) {
      this.setParam("post_surfaces_blacklist", postSurfacesBlacklist);
      return this;
    }

    public APIRequestCreateFeed setPostingToRedspace (EnumPostingToRedspace postingToRedspace) {
      this.setParam("posting_to_redspace", postingToRedspace);
      return this;
    }
    public APIRequestCreateFeed setPostingToRedspace (String postingToRedspace) {
      this.setParam("posting_to_redspace", postingToRedspace);
      return this;
    }

    public APIRequestCreateFeed setPrivacy (String privacy) {
      this.setParam("privacy", privacy);
      return this;
    }

    public APIRequestCreateFeed setPromptId (String promptId) {
      this.setParam("prompt_id", promptId);
      return this;
    }

    public APIRequestCreateFeed setPromptTrackingString (String promptTrackingString) {
      this.setParam("prompt_tracking_string", promptTrackingString);
      return this;
    }

    public APIRequestCreateFeed setProperties (Object properties) {
      this.setParam("properties", properties);
      return this;
    }
    public APIRequestCreateFeed setProperties (String properties) {
      this.setParam("properties", properties);
      return this;
    }

    public APIRequestCreateFeed setProxiedAppId (String proxiedAppId) {
      this.setParam("proxied_app_id", proxiedAppId);
      return this;
    }

    public APIRequestCreateFeed setPublishEventId (Long publishEventId) {
      this.setParam("publish_event_id", publishEventId);
      return this;
    }
    public APIRequestCreateFeed setPublishEventId (String publishEventId) {
      this.setParam("publish_event_id", publishEventId);
      return this;
    }

    public APIRequestCreateFeed setPublished (Boolean published) {
      this.setParam("published", published);
      return this;
    }
    public APIRequestCreateFeed setPublished (String published) {
      this.setParam("published", published);
      return this;
    }

    public APIRequestCreateFeed setQuote (String quote) {
      this.setParam("quote", quote);
      return this;
    }

    public APIRequestCreateFeed setReactModeMetadata (String reactModeMetadata) {
      this.setParam("react_mode_metadata", reactModeMetadata);
      return this;
    }

    public APIRequestCreateFeed setRef (List<String> ref) {
      this.setParam("ref", ref);
      return this;
    }
    public APIRequestCreateFeed setRef (String ref) {
      this.setParam("ref", ref);
      return this;
    }

    public APIRequestCreateFeed setReferenceableImageIds (List<String> referenceableImageIds) {
      this.setParam("referenceable_image_ids", referenceableImageIds);
      return this;
    }
    public APIRequestCreateFeed setReferenceableImageIds (String referenceableImageIds) {
      this.setParam("referenceable_image_ids", referenceableImageIds);
      return this;
    }

    public APIRequestCreateFeed setReferralId (String referralId) {
      this.setParam("referral_id", referralId);
      return this;
    }

    public APIRequestCreateFeed setSalesPromoId (Long salesPromoId) {
      this.setParam("sales_promo_id", salesPromoId);
      return this;
    }
    public APIRequestCreateFeed setSalesPromoId (String salesPromoId) {
      this.setParam("sales_promo_id", salesPromoId);
      return this;
    }

    public APIRequestCreateFeed setScheduledPublishTime (String scheduledPublishTime) {
      this.setParam("scheduled_publish_time", scheduledPublishTime);
      return this;
    }

    public APIRequestCreateFeed setSource (String source) {
      this.setParam("source", source);
      return this;
    }

    public APIRequestCreateFeed setSponsorId (String sponsorId) {
      this.setParam("sponsor_id", sponsorId);
      return this;
    }

    public APIRequestCreateFeed setSponsorRelationship (Long sponsorRelationship) {
      this.setParam("sponsor_relationship", sponsorRelationship);
      return this;
    }
    public APIRequestCreateFeed setSponsorRelationship (String sponsorRelationship) {
      this.setParam("sponsor_relationship", sponsorRelationship);
      return this;
    }

    public APIRequestCreateFeed setSuggestedPlaceId (Object suggestedPlaceId) {
      this.setParam("suggested_place_id", suggestedPlaceId);
      return this;
    }
    public APIRequestCreateFeed setSuggestedPlaceId (String suggestedPlaceId) {
      this.setParam("suggested_place_id", suggestedPlaceId);
      return this;
    }

    public APIRequestCreateFeed setTags (List<Long> tags) {
      this.setParam("tags", tags);
      return this;
    }
    public APIRequestCreateFeed setTags (String tags) {
      this.setParam("tags", tags);
      return this;
    }

    public APIRequestCreateFeed setTargetSurface (EnumTargetSurface targetSurface) {
      this.setParam("target_surface", targetSurface);
      return this;
    }
    public APIRequestCreateFeed setTargetSurface (String targetSurface) {
      this.setParam("target_surface", targetSurface);
      return this;
    }

    public APIRequestCreateFeed setTargeting (Object targeting) {
      this.setParam("targeting", targeting);
      return this;
    }
    public APIRequestCreateFeed setTargeting (String targeting) {
      this.setParam("targeting", targeting);
      return this;
    }

    public APIRequestCreateFeed setTextFormatMetadata (String textFormatMetadata) {
      this.setParam("text_format_metadata", textFormatMetadata);
      return this;
    }

    public APIRequestCreateFeed setTextFormatPresetId (String textFormatPresetId) {
      this.setParam("text_format_preset_id", textFormatPresetId);
      return this;
    }

    public APIRequestCreateFeed setTextOnlyPlace (String textOnlyPlace) {
      this.setParam("text_only_place", textOnlyPlace);
      return this;
    }

    public APIRequestCreateFeed setThrowbackCameraRollMedia (String throwbackCameraRollMedia) {
      this.setParam("throwback_camera_roll_media", throwbackCameraRollMedia);
      return this;
    }

    public APIRequestCreateFeed setThumbnail (File thumbnail) {
      this.setParam("thumbnail", thumbnail);
      return this;
    }
    public APIRequestCreateFeed setThumbnail (String thumbnail) {
      this.setParam("thumbnail", thumbnail);
      return this;
    }

    public APIRequestCreateFeed setTimeSinceOriginalPost (Long timeSinceOriginalPost) {
      this.setParam("time_since_original_post", timeSinceOriginalPost);
      return this;
    }
    public APIRequestCreateFeed setTimeSinceOriginalPost (String timeSinceOriginalPost) {
      this.setParam("time_since_original_post", timeSinceOriginalPost);
      return this;
    }

    public APIRequestCreateFeed setTitle (String title) {
      this.setParam("title", title);
      return this;
    }

    public APIRequestCreateFeed setTrackingInfo (String trackingInfo) {
      this.setParam("tracking_info", trackingInfo);
      return this;
    }

    public APIRequestCreateFeed setUnpublishedContentType (EnumUnpublishedContentType unpublishedContentType) {
      this.setParam("unpublished_content_type", unpublishedContentType);
      return this;
    }
    public APIRequestCreateFeed setUnpublishedContentType (String unpublishedContentType) {
      this.setParam("unpublished_content_type", unpublishedContentType);
      return this;
    }

    public APIRequestCreateFeed setUserSelectedTags (Boolean userSelectedTags) {
      this.setParam("user_selected_tags", userSelectedTags);
      return this;
    }
    public APIRequestCreateFeed setUserSelectedTags (String userSelectedTags) {
      this.setParam("user_selected_tags", userSelectedTags);
      return this;
    }

    public APIRequestCreateFeed setVideoStartTimeMs (Long videoStartTimeMs) {
      this.setParam("video_start_time_ms", videoStartTimeMs);
      return this;
    }
    public APIRequestCreateFeed setVideoStartTimeMs (String videoStartTimeMs) {
      this.setParam("video_start_time_ms", videoStartTimeMs);
      return this;
    }

    public APIRequestCreateFeed setViewerCoordinates (Object viewerCoordinates) {
      this.setParam("viewer_coordinates", viewerCoordinates);
      return this;
    }
    public APIRequestCreateFeed setViewerCoordinates (String viewerCoordinates) {
      this.setParam("viewer_coordinates", viewerCoordinates);
      return this;
    }

    public APIRequestCreateFeed setWidth (Long width) {
      this.setParam("width", width);
      return this;
    }
    public APIRequestCreateFeed setWidth (String width) {
      this.setParam("width", width);
      return this;
    }

    public APIRequestCreateFeed requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateFeed requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateFeed requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateFeed requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateFeed requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateFeed requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetFriendLists extends APIRequest<FriendList> {

    APINodeList<FriendList> lastResponse = null;
    @Override
    public APINodeList<FriendList> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "id",
      "list_type",
      "name",
      "owner",
    };

    @Override
    public APINodeList<FriendList> parseResponse(String response, String header) throws APIException {
      return FriendList.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<FriendList> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<FriendList> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<FriendList>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<FriendList>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<FriendList>>() {
           public APINodeList<FriendList> apply(ResponseWrapper result) {
             try {
               return APIRequestGetFriendLists.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetFriendLists(String nodeId, APIContext context) {
      super(context, nodeId, "/friendlists", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetFriendLists setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetFriendLists setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetFriendLists requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetFriendLists requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetFriendLists requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetFriendLists requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetFriendLists requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetFriendLists requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetFriendLists requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetFriendLists requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetFriendLists requestListTypeField () {
      return this.requestListTypeField(true);
    }
    public APIRequestGetFriendLists requestListTypeField (boolean value) {
      this.requestField("list_type", value);
      return this;
    }
    public APIRequestGetFriendLists requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetFriendLists requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetFriendLists requestOwnerField () {
      return this.requestOwnerField(true);
    }
    public APIRequestGetFriendLists requestOwnerField (boolean value) {
      this.requestField("owner", value);
      return this;
    }
  }

  public static class APIRequestGetFriends extends APIRequest<User> {

    APINodeList<User> lastResponse = null;
    @Override
    public APINodeList<User> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "uid",
    };

    public static final String[] FIELDS = {
      "about",
      "address",
      "admin_notes",
      "age_range",
      "birthday",
      "can_review_measurement_request",
      "cover",
      "currency",
      "devices",
      "education",
      "email",
      "employee_number",
      "favorite_athletes",
      "favorite_teams",
      "first_name",
      "gender",
      "hometown",
      "id",
      "inspirational_people",
      "install_type",
      "installed",
      "interested_in",
      "is_famedeeplinkinguser",
      "is_shared_login",
      "is_verified",
      "labels",
      "languages",
      "last_name",
      "link",
      "local_news_megaphone_dismiss_status",
      "local_news_subscription_status",
      "locale",
      "location",
      "meeting_for",
      "middle_name",
      "name",
      "name_format",
      "payment_pricepoints",
      "political",
      "profile_pic",
      "public_key",
      "quotes",
      "relationship_status",
      "religion",
      "security_settings",
      "shared_login_upgrade_required_by",
      "short_name",
      "significant_other",
      "sports",
      "test_group",
      "third_party_id",
      "timezone",
      "token_for_business",
      "updated_time",
      "verified",
      "video_upload_limits",
      "viewer_can_send_gift",
      "website",
      "work",
    };

    @Override
    public APINodeList<User> parseResponse(String response, String header) throws APIException {
      return User.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<User> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<User> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<User>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<User>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<User>>() {
           public APINodeList<User> apply(ResponseWrapper result) {
             try {
               return APIRequestGetFriends.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetFriends(String nodeId, APIContext context) {
      super(context, nodeId, "/friends", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetFriends setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetFriends setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetFriends setUid (Long uid) {
      this.setParam("uid", uid);
      return this;
    }
    public APIRequestGetFriends setUid (String uid) {
      this.setParam("uid", uid);
      return this;
    }

    public APIRequestGetFriends requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetFriends requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetFriends requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetFriends requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetFriends requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetFriends requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetFriends requestAboutField () {
      return this.requestAboutField(true);
    }
    public APIRequestGetFriends requestAboutField (boolean value) {
      this.requestField("about", value);
      return this;
    }
    public APIRequestGetFriends requestAddressField () {
      return this.requestAddressField(true);
    }
    public APIRequestGetFriends requestAddressField (boolean value) {
      this.requestField("address", value);
      return this;
    }
    public APIRequestGetFriends requestAdminNotesField () {
      return this.requestAdminNotesField(true);
    }
    public APIRequestGetFriends requestAdminNotesField (boolean value) {
      this.requestField("admin_notes", value);
      return this;
    }
    public APIRequestGetFriends requestAgeRangeField () {
      return this.requestAgeRangeField(true);
    }
    public APIRequestGetFriends requestAgeRangeField (boolean value) {
      this.requestField("age_range", value);
      return this;
    }
    public APIRequestGetFriends requestBirthdayField () {
      return this.requestBirthdayField(true);
    }
    public APIRequestGetFriends requestBirthdayField (boolean value) {
      this.requestField("birthday", value);
      return this;
    }
    public APIRequestGetFriends requestCanReviewMeasurementRequestField () {
      return this.requestCanReviewMeasurementRequestField(true);
    }
    public APIRequestGetFriends requestCanReviewMeasurementRequestField (boolean value) {
      this.requestField("can_review_measurement_request", value);
      return this;
    }
    public APIRequestGetFriends requestCoverField () {
      return this.requestCoverField(true);
    }
    public APIRequestGetFriends requestCoverField (boolean value) {
      this.requestField("cover", value);
      return this;
    }
    public APIRequestGetFriends requestCurrencyField () {
      return this.requestCurrencyField(true);
    }
    public APIRequestGetFriends requestCurrencyField (boolean value) {
      this.requestField("currency", value);
      return this;
    }
    public APIRequestGetFriends requestDevicesField () {
      return this.requestDevicesField(true);
    }
    public APIRequestGetFriends requestDevicesField (boolean value) {
      this.requestField("devices", value);
      return this;
    }
    public APIRequestGetFriends requestEducationField () {
      return this.requestEducationField(true);
    }
    public APIRequestGetFriends requestEducationField (boolean value) {
      this.requestField("education", value);
      return this;
    }
    public APIRequestGetFriends requestEmailField () {
      return this.requestEmailField(true);
    }
    public APIRequestGetFriends requestEmailField (boolean value) {
      this.requestField("email", value);
      return this;
    }
    public APIRequestGetFriends requestEmployeeNumberField () {
      return this.requestEmployeeNumberField(true);
    }
    public APIRequestGetFriends requestEmployeeNumberField (boolean value) {
      this.requestField("employee_number", value);
      return this;
    }
    public APIRequestGetFriends requestFavoriteAthletesField () {
      return this.requestFavoriteAthletesField(true);
    }
    public APIRequestGetFriends requestFavoriteAthletesField (boolean value) {
      this.requestField("favorite_athletes", value);
      return this;
    }
    public APIRequestGetFriends requestFavoriteTeamsField () {
      return this.requestFavoriteTeamsField(true);
    }
    public APIRequestGetFriends requestFavoriteTeamsField (boolean value) {
      this.requestField("favorite_teams", value);
      return this;
    }
    public APIRequestGetFriends requestFirstNameField () {
      return this.requestFirstNameField(true);
    }
    public APIRequestGetFriends requestFirstNameField (boolean value) {
      this.requestField("first_name", value);
      return this;
    }
    public APIRequestGetFriends requestGenderField () {
      return this.requestGenderField(true);
    }
    public APIRequestGetFriends requestGenderField (boolean value) {
      this.requestField("gender", value);
      return this;
    }
    public APIRequestGetFriends requestHometownField () {
      return this.requestHometownField(true);
    }
    public APIRequestGetFriends requestHometownField (boolean value) {
      this.requestField("hometown", value);
      return this;
    }
    public APIRequestGetFriends requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetFriends requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetFriends requestInspirationalPeopleField () {
      return this.requestInspirationalPeopleField(true);
    }
    public APIRequestGetFriends requestInspirationalPeopleField (boolean value) {
      this.requestField("inspirational_people", value);
      return this;
    }
    public APIRequestGetFriends requestInstallTypeField () {
      return this.requestInstallTypeField(true);
    }
    public APIRequestGetFriends requestInstallTypeField (boolean value) {
      this.requestField("install_type", value);
      return this;
    }
    public APIRequestGetFriends requestInstalledField () {
      return this.requestInstalledField(true);
    }
    public APIRequestGetFriends requestInstalledField (boolean value) {
      this.requestField("installed", value);
      return this;
    }
    public APIRequestGetFriends requestInterestedInField () {
      return this.requestInterestedInField(true);
    }
    public APIRequestGetFriends requestInterestedInField (boolean value) {
      this.requestField("interested_in", value);
      return this;
    }
    public APIRequestGetFriends requestIsFamedeeplinkinguserField () {
      return this.requestIsFamedeeplinkinguserField(true);
    }
    public APIRequestGetFriends requestIsFamedeeplinkinguserField (boolean value) {
      this.requestField("is_famedeeplinkinguser", value);
      return this;
    }
    public APIRequestGetFriends requestIsSharedLoginField () {
      return this.requestIsSharedLoginField(true);
    }
    public APIRequestGetFriends requestIsSharedLoginField (boolean value) {
      this.requestField("is_shared_login", value);
      return this;
    }
    public APIRequestGetFriends requestIsVerifiedField () {
      return this.requestIsVerifiedField(true);
    }
    public APIRequestGetFriends requestIsVerifiedField (boolean value) {
      this.requestField("is_verified", value);
      return this;
    }
    public APIRequestGetFriends requestLabelsField () {
      return this.requestLabelsField(true);
    }
    public APIRequestGetFriends requestLabelsField (boolean value) {
      this.requestField("labels", value);
      return this;
    }
    public APIRequestGetFriends requestLanguagesField () {
      return this.requestLanguagesField(true);
    }
    public APIRequestGetFriends requestLanguagesField (boolean value) {
      this.requestField("languages", value);
      return this;
    }
    public APIRequestGetFriends requestLastNameField () {
      return this.requestLastNameField(true);
    }
    public APIRequestGetFriends requestLastNameField (boolean value) {
      this.requestField("last_name", value);
      return this;
    }
    public APIRequestGetFriends requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetFriends requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetFriends requestLocalNewsMegaphoneDismissStatusField () {
      return this.requestLocalNewsMegaphoneDismissStatusField(true);
    }
    public APIRequestGetFriends requestLocalNewsMegaphoneDismissStatusField (boolean value) {
      this.requestField("local_news_megaphone_dismiss_status", value);
      return this;
    }
    public APIRequestGetFriends requestLocalNewsSubscriptionStatusField () {
      return this.requestLocalNewsSubscriptionStatusField(true);
    }
    public APIRequestGetFriends requestLocalNewsSubscriptionStatusField (boolean value) {
      this.requestField("local_news_subscription_status", value);
      return this;
    }
    public APIRequestGetFriends requestLocaleField () {
      return this.requestLocaleField(true);
    }
    public APIRequestGetFriends requestLocaleField (boolean value) {
      this.requestField("locale", value);
      return this;
    }
    public APIRequestGetFriends requestLocationField () {
      return this.requestLocationField(true);
    }
    public APIRequestGetFriends requestLocationField (boolean value) {
      this.requestField("location", value);
      return this;
    }
    public APIRequestGetFriends requestMeetingForField () {
      return this.requestMeetingForField(true);
    }
    public APIRequestGetFriends requestMeetingForField (boolean value) {
      this.requestField("meeting_for", value);
      return this;
    }
    public APIRequestGetFriends requestMiddleNameField () {
      return this.requestMiddleNameField(true);
    }
    public APIRequestGetFriends requestMiddleNameField (boolean value) {
      this.requestField("middle_name", value);
      return this;
    }
    public APIRequestGetFriends requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetFriends requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetFriends requestNameFormatField () {
      return this.requestNameFormatField(true);
    }
    public APIRequestGetFriends requestNameFormatField (boolean value) {
      this.requestField("name_format", value);
      return this;
    }
    public APIRequestGetFriends requestPaymentPricepointsField () {
      return this.requestPaymentPricepointsField(true);
    }
    public APIRequestGetFriends requestPaymentPricepointsField (boolean value) {
      this.requestField("payment_pricepoints", value);
      return this;
    }
    public APIRequestGetFriends requestPoliticalField () {
      return this.requestPoliticalField(true);
    }
    public APIRequestGetFriends requestPoliticalField (boolean value) {
      this.requestField("political", value);
      return this;
    }
    public APIRequestGetFriends requestProfilePicField () {
      return this.requestProfilePicField(true);
    }
    public APIRequestGetFriends requestProfilePicField (boolean value) {
      this.requestField("profile_pic", value);
      return this;
    }
    public APIRequestGetFriends requestPublicKeyField () {
      return this.requestPublicKeyField(true);
    }
    public APIRequestGetFriends requestPublicKeyField (boolean value) {
      this.requestField("public_key", value);
      return this;
    }
    public APIRequestGetFriends requestQuotesField () {
      return this.requestQuotesField(true);
    }
    public APIRequestGetFriends requestQuotesField (boolean value) {
      this.requestField("quotes", value);
      return this;
    }
    public APIRequestGetFriends requestRelationshipStatusField () {
      return this.requestRelationshipStatusField(true);
    }
    public APIRequestGetFriends requestRelationshipStatusField (boolean value) {
      this.requestField("relationship_status", value);
      return this;
    }
    public APIRequestGetFriends requestReligionField () {
      return this.requestReligionField(true);
    }
    public APIRequestGetFriends requestReligionField (boolean value) {
      this.requestField("religion", value);
      return this;
    }
    public APIRequestGetFriends requestSecuritySettingsField () {
      return this.requestSecuritySettingsField(true);
    }
    public APIRequestGetFriends requestSecuritySettingsField (boolean value) {
      this.requestField("security_settings", value);
      return this;
    }
    public APIRequestGetFriends requestSharedLoginUpgradeRequiredByField () {
      return this.requestSharedLoginUpgradeRequiredByField(true);
    }
    public APIRequestGetFriends requestSharedLoginUpgradeRequiredByField (boolean value) {
      this.requestField("shared_login_upgrade_required_by", value);
      return this;
    }
    public APIRequestGetFriends requestShortNameField () {
      return this.requestShortNameField(true);
    }
    public APIRequestGetFriends requestShortNameField (boolean value) {
      this.requestField("short_name", value);
      return this;
    }
    public APIRequestGetFriends requestSignificantOtherField () {
      return this.requestSignificantOtherField(true);
    }
    public APIRequestGetFriends requestSignificantOtherField (boolean value) {
      this.requestField("significant_other", value);
      return this;
    }
    public APIRequestGetFriends requestSportsField () {
      return this.requestSportsField(true);
    }
    public APIRequestGetFriends requestSportsField (boolean value) {
      this.requestField("sports", value);
      return this;
    }
    public APIRequestGetFriends requestTestGroupField () {
      return this.requestTestGroupField(true);
    }
    public APIRequestGetFriends requestTestGroupField (boolean value) {
      this.requestField("test_group", value);
      return this;
    }
    public APIRequestGetFriends requestThirdPartyIdField () {
      return this.requestThirdPartyIdField(true);
    }
    public APIRequestGetFriends requestThirdPartyIdField (boolean value) {
      this.requestField("third_party_id", value);
      return this;
    }
    public APIRequestGetFriends requestTimezoneField () {
      return this.requestTimezoneField(true);
    }
    public APIRequestGetFriends requestTimezoneField (boolean value) {
      this.requestField("timezone", value);
      return this;
    }
    public APIRequestGetFriends requestTokenForBusinessField () {
      return this.requestTokenForBusinessField(true);
    }
    public APIRequestGetFriends requestTokenForBusinessField (boolean value) {
      this.requestField("token_for_business", value);
      return this;
    }
    public APIRequestGetFriends requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetFriends requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
    public APIRequestGetFriends requestVerifiedField () {
      return this.requestVerifiedField(true);
    }
    public APIRequestGetFriends requestVerifiedField (boolean value) {
      this.requestField("verified", value);
      return this;
    }
    public APIRequestGetFriends requestVideoUploadLimitsField () {
      return this.requestVideoUploadLimitsField(true);
    }
    public APIRequestGetFriends requestVideoUploadLimitsField (boolean value) {
      this.requestField("video_upload_limits", value);
      return this;
    }
    public APIRequestGetFriends requestViewerCanSendGiftField () {
      return this.requestViewerCanSendGiftField(true);
    }
    public APIRequestGetFriends requestViewerCanSendGiftField (boolean value) {
      this.requestField("viewer_can_send_gift", value);
      return this;
    }
    public APIRequestGetFriends requestWebsiteField () {
      return this.requestWebsiteField(true);
    }
    public APIRequestGetFriends requestWebsiteField (boolean value) {
      this.requestField("website", value);
      return this;
    }
    public APIRequestGetFriends requestWorkField () {
      return this.requestWorkField(true);
    }
    public APIRequestGetFriends requestWorkField (boolean value) {
      this.requestField("work", value);
      return this;
    }
  }

  public static class APIRequestCreateGameItem extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "action",
      "app_id",
      "drop_table_id",
      "ext_id",
      "item_id",
      "quantity",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestCreateGameItem.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateGameItem(String nodeId, APIContext context) {
      super(context, nodeId, "/game_items", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateGameItem setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateGameItem setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateGameItem setAction (EnumAction action) {
      this.setParam("action", action);
      return this;
    }
    public APIRequestCreateGameItem setAction (String action) {
      this.setParam("action", action);
      return this;
    }

    public APIRequestCreateGameItem setAppId (String appId) {
      this.setParam("app_id", appId);
      return this;
    }

    public APIRequestCreateGameItem setDropTableId (String dropTableId) {
      this.setParam("drop_table_id", dropTableId);
      return this;
    }

    public APIRequestCreateGameItem setExtId (String extId) {
      this.setParam("ext_id", extId);
      return this;
    }

    public APIRequestCreateGameItem setItemId (String itemId) {
      this.setParam("item_id", itemId);
      return this;
    }

    public APIRequestCreateGameItem setQuantity (Long quantity) {
      this.setParam("quantity", quantity);
      return this;
    }
    public APIRequestCreateGameItem setQuantity (String quantity) {
      this.setParam("quantity", quantity);
      return this;
    }

    public APIRequestCreateGameItem requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateGameItem requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateGameItem requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateGameItem requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateGameItem requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateGameItem requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateGameTime extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "action",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestCreateGameTime.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateGameTime(String nodeId, APIContext context) {
      super(context, nodeId, "/game_times", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateGameTime setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateGameTime setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateGameTime setAction (EnumAction action) {
      this.setParam("action", action);
      return this;
    }
    public APIRequestCreateGameTime setAction (String action) {
      this.setParam("action", action);
      return this;
    }

    public APIRequestCreateGameTime requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateGameTime requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateGameTime requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateGameTime requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateGameTime requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateGameTime requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetGames extends APIRequest<Page> {

    APINodeList<Page> lastResponse = null;
    @Override
    public APINodeList<Page> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "target_id",
    };

    public static final String[] FIELDS = {
      "about",
      "access_token",
      "ad_campaign",
      "affiliation",
      "app_id",
      "app_links",
      "artists_we_like",
      "attire",
      "awards",
      "band_interests",
      "band_members",
      "best_page",
      "bio",
      "birthday",
      "booking_agent",
      "built",
      "business",
      "can_checkin",
      "can_post",
      "category",
      "category_list",
      "checkins",
      "company_overview",
      "connected_instagram_account",
      "contact_address",
      "copyright_attribution_insights",
      "copyright_whitelisted_ig_partners",
      "country_page_likes",
      "cover",
      "culinary_team",
      "current_location",
      "description",
      "description_html",
      "directed_by",
      "display_subtext",
      "displayed_message_response_time",
      "emails",
      "engagement",
      "fan_count",
      "featured_video",
      "features",
      "food_styles",
      "founded",
      "general_info",
      "general_manager",
      "genre",
      "global_brand_page_name",
      "global_brand_root_id",
      "has_added_app",
      "has_whatsapp_business_number",
      "has_whatsapp_number",
      "hometown",
      "hours",
      "id",
      "impressum",
      "influences",
      "instagram_business_account",
      "instant_articles_review_status",
      "is_always_open",
      "is_chain",
      "is_community_page",
      "is_eligible_for_branded_content",
      "is_messenger_bot_get_started_enabled",
      "is_messenger_platform_bot",
      "is_owned",
      "is_permanently_closed",
      "is_published",
      "is_unclaimed",
      "is_verified",
      "is_webhooks_subscribed",
      "keywords",
      "leadgen_form_preview_details",
      "leadgen_has_crm_integration",
      "leadgen_has_fat_ping_crm_integration",
      "leadgen_tos_acceptance_time",
      "leadgen_tos_accepted",
      "leadgen_tos_accepting_user",
      "link",
      "location",
      "members",
      "merchant_id",
      "merchant_review_status",
      "messenger_ads_default_icebreakers",
      "messenger_ads_default_page_welcome_message",
      "messenger_ads_default_quick_replies",
      "messenger_ads_quick_replies_type",
      "mission",
      "mpg",
      "name",
      "name_with_location_descriptor",
      "network",
      "new_like_count",
      "offer_eligible",
      "overall_star_rating",
      "page_about_story",
      "page_token",
      "parent_page",
      "parking",
      "payment_options",
      "personal_info",
      "personal_interests",
      "pharma_safety_info",
      "phone",
      "place_type",
      "plot_outline",
      "preferred_audience",
      "press_contact",
      "price_range",
      "privacy_info_url",
      "produced_by",
      "products",
      "promotion_eligible",
      "promotion_ineligible_reason",
      "public_transit",
      "rating_count",
      "recipient",
      "record_label",
      "release_date",
      "restaurant_services",
      "restaurant_specialties",
      "schedule",
      "screenplay_by",
      "season",
      "single_line_address",
      "starring",
      "start_info",
      "store_code",
      "store_location_descriptor",
      "store_number",
      "studio",
      "supports_instant_articles",
      "talking_about_count",
      "unread_message_count",
      "unread_notif_count",
      "unseen_message_count",
      "username",
      "verification_status",
      "voip_info",
      "website",
      "were_here_count",
      "whatsapp_number",
      "written_by",
    };

    @Override
    public APINodeList<Page> parseResponse(String response, String header) throws APIException {
      return Page.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Page> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Page> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Page>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Page>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Page>>() {
           public APINodeList<Page> apply(ResponseWrapper result) {
             try {
               return APIRequestGetGames.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetGames(String nodeId, APIContext context) {
      super(context, nodeId, "/games", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetGames setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetGames setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetGames setTargetId (String targetId) {
      this.setParam("target_id", targetId);
      return this;
    }

    public APIRequestGetGames requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetGames requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetGames requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetGames requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetGames requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetGames requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetGames requestAboutField () {
      return this.requestAboutField(true);
    }
    public APIRequestGetGames requestAboutField (boolean value) {
      this.requestField("about", value);
      return this;
    }
    public APIRequestGetGames requestAccessTokenField () {
      return this.requestAccessTokenField(true);
    }
    public APIRequestGetGames requestAccessTokenField (boolean value) {
      this.requestField("access_token", value);
      return this;
    }
    public APIRequestGetGames requestAdCampaignField () {
      return this.requestAdCampaignField(true);
    }
    public APIRequestGetGames requestAdCampaignField (boolean value) {
      this.requestField("ad_campaign", value);
      return this;
    }
    public APIRequestGetGames requestAffiliationField () {
      return this.requestAffiliationField(true);
    }
    public APIRequestGetGames requestAffiliationField (boolean value) {
      this.requestField("affiliation", value);
      return this;
    }
    public APIRequestGetGames requestAppIdField () {
      return this.requestAppIdField(true);
    }
    public APIRequestGetGames requestAppIdField (boolean value) {
      this.requestField("app_id", value);
      return this;
    }
    public APIRequestGetGames requestAppLinksField () {
      return this.requestAppLinksField(true);
    }
    public APIRequestGetGames requestAppLinksField (boolean value) {
      this.requestField("app_links", value);
      return this;
    }
    public APIRequestGetGames requestArtistsWeLikeField () {
      return this.requestArtistsWeLikeField(true);
    }
    public APIRequestGetGames requestArtistsWeLikeField (boolean value) {
      this.requestField("artists_we_like", value);
      return this;
    }
    public APIRequestGetGames requestAttireField () {
      return this.requestAttireField(true);
    }
    public APIRequestGetGames requestAttireField (boolean value) {
      this.requestField("attire", value);
      return this;
    }
    public APIRequestGetGames requestAwardsField () {
      return this.requestAwardsField(true);
    }
    public APIRequestGetGames requestAwardsField (boolean value) {
      this.requestField("awards", value);
      return this;
    }
    public APIRequestGetGames requestBandInterestsField () {
      return this.requestBandInterestsField(true);
    }
    public APIRequestGetGames requestBandInterestsField (boolean value) {
      this.requestField("band_interests", value);
      return this;
    }
    public APIRequestGetGames requestBandMembersField () {
      return this.requestBandMembersField(true);
    }
    public APIRequestGetGames requestBandMembersField (boolean value) {
      this.requestField("band_members", value);
      return this;
    }
    public APIRequestGetGames requestBestPageField () {
      return this.requestBestPageField(true);
    }
    public APIRequestGetGames requestBestPageField (boolean value) {
      this.requestField("best_page", value);
      return this;
    }
    public APIRequestGetGames requestBioField () {
      return this.requestBioField(true);
    }
    public APIRequestGetGames requestBioField (boolean value) {
      this.requestField("bio", value);
      return this;
    }
    public APIRequestGetGames requestBirthdayField () {
      return this.requestBirthdayField(true);
    }
    public APIRequestGetGames requestBirthdayField (boolean value) {
      this.requestField("birthday", value);
      return this;
    }
    public APIRequestGetGames requestBookingAgentField () {
      return this.requestBookingAgentField(true);
    }
    public APIRequestGetGames requestBookingAgentField (boolean value) {
      this.requestField("booking_agent", value);
      return this;
    }
    public APIRequestGetGames requestBuiltField () {
      return this.requestBuiltField(true);
    }
    public APIRequestGetGames requestBuiltField (boolean value) {
      this.requestField("built", value);
      return this;
    }
    public APIRequestGetGames requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetGames requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetGames requestCanCheckinField () {
      return this.requestCanCheckinField(true);
    }
    public APIRequestGetGames requestCanCheckinField (boolean value) {
      this.requestField("can_checkin", value);
      return this;
    }
    public APIRequestGetGames requestCanPostField () {
      return this.requestCanPostField(true);
    }
    public APIRequestGetGames requestCanPostField (boolean value) {
      this.requestField("can_post", value);
      return this;
    }
    public APIRequestGetGames requestCategoryField () {
      return this.requestCategoryField(true);
    }
    public APIRequestGetGames requestCategoryField (boolean value) {
      this.requestField("category", value);
      return this;
    }
    public APIRequestGetGames requestCategoryListField () {
      return this.requestCategoryListField(true);
    }
    public APIRequestGetGames requestCategoryListField (boolean value) {
      this.requestField("category_list", value);
      return this;
    }
    public APIRequestGetGames requestCheckinsField () {
      return this.requestCheckinsField(true);
    }
    public APIRequestGetGames requestCheckinsField (boolean value) {
      this.requestField("checkins", value);
      return this;
    }
    public APIRequestGetGames requestCompanyOverviewField () {
      return this.requestCompanyOverviewField(true);
    }
    public APIRequestGetGames requestCompanyOverviewField (boolean value) {
      this.requestField("company_overview", value);
      return this;
    }
    public APIRequestGetGames requestConnectedInstagramAccountField () {
      return this.requestConnectedInstagramAccountField(true);
    }
    public APIRequestGetGames requestConnectedInstagramAccountField (boolean value) {
      this.requestField("connected_instagram_account", value);
      return this;
    }
    public APIRequestGetGames requestContactAddressField () {
      return this.requestContactAddressField(true);
    }
    public APIRequestGetGames requestContactAddressField (boolean value) {
      this.requestField("contact_address", value);
      return this;
    }
    public APIRequestGetGames requestCopyrightAttributionInsightsField () {
      return this.requestCopyrightAttributionInsightsField(true);
    }
    public APIRequestGetGames requestCopyrightAttributionInsightsField (boolean value) {
      this.requestField("copyright_attribution_insights", value);
      return this;
    }
    public APIRequestGetGames requestCopyrightWhitelistedIgPartnersField () {
      return this.requestCopyrightWhitelistedIgPartnersField(true);
    }
    public APIRequestGetGames requestCopyrightWhitelistedIgPartnersField (boolean value) {
      this.requestField("copyright_whitelisted_ig_partners", value);
      return this;
    }
    public APIRequestGetGames requestCountryPageLikesField () {
      return this.requestCountryPageLikesField(true);
    }
    public APIRequestGetGames requestCountryPageLikesField (boolean value) {
      this.requestField("country_page_likes", value);
      return this;
    }
    public APIRequestGetGames requestCoverField () {
      return this.requestCoverField(true);
    }
    public APIRequestGetGames requestCoverField (boolean value) {
      this.requestField("cover", value);
      return this;
    }
    public APIRequestGetGames requestCulinaryTeamField () {
      return this.requestCulinaryTeamField(true);
    }
    public APIRequestGetGames requestCulinaryTeamField (boolean value) {
      this.requestField("culinary_team", value);
      return this;
    }
    public APIRequestGetGames requestCurrentLocationField () {
      return this.requestCurrentLocationField(true);
    }
    public APIRequestGetGames requestCurrentLocationField (boolean value) {
      this.requestField("current_location", value);
      return this;
    }
    public APIRequestGetGames requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetGames requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetGames requestDescriptionHtmlField () {
      return this.requestDescriptionHtmlField(true);
    }
    public APIRequestGetGames requestDescriptionHtmlField (boolean value) {
      this.requestField("description_html", value);
      return this;
    }
    public APIRequestGetGames requestDirectedByField () {
      return this.requestDirectedByField(true);
    }
    public APIRequestGetGames requestDirectedByField (boolean value) {
      this.requestField("directed_by", value);
      return this;
    }
    public APIRequestGetGames requestDisplaySubtextField () {
      return this.requestDisplaySubtextField(true);
    }
    public APIRequestGetGames requestDisplaySubtextField (boolean value) {
      this.requestField("display_subtext", value);
      return this;
    }
    public APIRequestGetGames requestDisplayedMessageResponseTimeField () {
      return this.requestDisplayedMessageResponseTimeField(true);
    }
    public APIRequestGetGames requestDisplayedMessageResponseTimeField (boolean value) {
      this.requestField("displayed_message_response_time", value);
      return this;
    }
    public APIRequestGetGames requestEmailsField () {
      return this.requestEmailsField(true);
    }
    public APIRequestGetGames requestEmailsField (boolean value) {
      this.requestField("emails", value);
      return this;
    }
    public APIRequestGetGames requestEngagementField () {
      return this.requestEngagementField(true);
    }
    public APIRequestGetGames requestEngagementField (boolean value) {
      this.requestField("engagement", value);
      return this;
    }
    public APIRequestGetGames requestFanCountField () {
      return this.requestFanCountField(true);
    }
    public APIRequestGetGames requestFanCountField (boolean value) {
      this.requestField("fan_count", value);
      return this;
    }
    public APIRequestGetGames requestFeaturedVideoField () {
      return this.requestFeaturedVideoField(true);
    }
    public APIRequestGetGames requestFeaturedVideoField (boolean value) {
      this.requestField("featured_video", value);
      return this;
    }
    public APIRequestGetGames requestFeaturesField () {
      return this.requestFeaturesField(true);
    }
    public APIRequestGetGames requestFeaturesField (boolean value) {
      this.requestField("features", value);
      return this;
    }
    public APIRequestGetGames requestFoodStylesField () {
      return this.requestFoodStylesField(true);
    }
    public APIRequestGetGames requestFoodStylesField (boolean value) {
      this.requestField("food_styles", value);
      return this;
    }
    public APIRequestGetGames requestFoundedField () {
      return this.requestFoundedField(true);
    }
    public APIRequestGetGames requestFoundedField (boolean value) {
      this.requestField("founded", value);
      return this;
    }
    public APIRequestGetGames requestGeneralInfoField () {
      return this.requestGeneralInfoField(true);
    }
    public APIRequestGetGames requestGeneralInfoField (boolean value) {
      this.requestField("general_info", value);
      return this;
    }
    public APIRequestGetGames requestGeneralManagerField () {
      return this.requestGeneralManagerField(true);
    }
    public APIRequestGetGames requestGeneralManagerField (boolean value) {
      this.requestField("general_manager", value);
      return this;
    }
    public APIRequestGetGames requestGenreField () {
      return this.requestGenreField(true);
    }
    public APIRequestGetGames requestGenreField (boolean value) {
      this.requestField("genre", value);
      return this;
    }
    public APIRequestGetGames requestGlobalBrandPageNameField () {
      return this.requestGlobalBrandPageNameField(true);
    }
    public APIRequestGetGames requestGlobalBrandPageNameField (boolean value) {
      this.requestField("global_brand_page_name", value);
      return this;
    }
    public APIRequestGetGames requestGlobalBrandRootIdField () {
      return this.requestGlobalBrandRootIdField(true);
    }
    public APIRequestGetGames requestGlobalBrandRootIdField (boolean value) {
      this.requestField("global_brand_root_id", value);
      return this;
    }
    public APIRequestGetGames requestHasAddedAppField () {
      return this.requestHasAddedAppField(true);
    }
    public APIRequestGetGames requestHasAddedAppField (boolean value) {
      this.requestField("has_added_app", value);
      return this;
    }
    public APIRequestGetGames requestHasWhatsappBusinessNumberField () {
      return this.requestHasWhatsappBusinessNumberField(true);
    }
    public APIRequestGetGames requestHasWhatsappBusinessNumberField (boolean value) {
      this.requestField("has_whatsapp_business_number", value);
      return this;
    }
    public APIRequestGetGames requestHasWhatsappNumberField () {
      return this.requestHasWhatsappNumberField(true);
    }
    public APIRequestGetGames requestHasWhatsappNumberField (boolean value) {
      this.requestField("has_whatsapp_number", value);
      return this;
    }
    public APIRequestGetGames requestHometownField () {
      return this.requestHometownField(true);
    }
    public APIRequestGetGames requestHometownField (boolean value) {
      this.requestField("hometown", value);
      return this;
    }
    public APIRequestGetGames requestHoursField () {
      return this.requestHoursField(true);
    }
    public APIRequestGetGames requestHoursField (boolean value) {
      this.requestField("hours", value);
      return this;
    }
    public APIRequestGetGames requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetGames requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetGames requestImpressumField () {
      return this.requestImpressumField(true);
    }
    public APIRequestGetGames requestImpressumField (boolean value) {
      this.requestField("impressum", value);
      return this;
    }
    public APIRequestGetGames requestInfluencesField () {
      return this.requestInfluencesField(true);
    }
    public APIRequestGetGames requestInfluencesField (boolean value) {
      this.requestField("influences", value);
      return this;
    }
    public APIRequestGetGames requestInstagramBusinessAccountField () {
      return this.requestInstagramBusinessAccountField(true);
    }
    public APIRequestGetGames requestInstagramBusinessAccountField (boolean value) {
      this.requestField("instagram_business_account", value);
      return this;
    }
    public APIRequestGetGames requestInstantArticlesReviewStatusField () {
      return this.requestInstantArticlesReviewStatusField(true);
    }
    public APIRequestGetGames requestInstantArticlesReviewStatusField (boolean value) {
      this.requestField("instant_articles_review_status", value);
      return this;
    }
    public APIRequestGetGames requestIsAlwaysOpenField () {
      return this.requestIsAlwaysOpenField(true);
    }
    public APIRequestGetGames requestIsAlwaysOpenField (boolean value) {
      this.requestField("is_always_open", value);
      return this;
    }
    public APIRequestGetGames requestIsChainField () {
      return this.requestIsChainField(true);
    }
    public APIRequestGetGames requestIsChainField (boolean value) {
      this.requestField("is_chain", value);
      return this;
    }
    public APIRequestGetGames requestIsCommunityPageField () {
      return this.requestIsCommunityPageField(true);
    }
    public APIRequestGetGames requestIsCommunityPageField (boolean value) {
      this.requestField("is_community_page", value);
      return this;
    }
    public APIRequestGetGames requestIsEligibleForBrandedContentField () {
      return this.requestIsEligibleForBrandedContentField(true);
    }
    public APIRequestGetGames requestIsEligibleForBrandedContentField (boolean value) {
      this.requestField("is_eligible_for_branded_content", value);
      return this;
    }
    public APIRequestGetGames requestIsMessengerBotGetStartedEnabledField () {
      return this.requestIsMessengerBotGetStartedEnabledField(true);
    }
    public APIRequestGetGames requestIsMessengerBotGetStartedEnabledField (boolean value) {
      this.requestField("is_messenger_bot_get_started_enabled", value);
      return this;
    }
    public APIRequestGetGames requestIsMessengerPlatformBotField () {
      return this.requestIsMessengerPlatformBotField(true);
    }
    public APIRequestGetGames requestIsMessengerPlatformBotField (boolean value) {
      this.requestField("is_messenger_platform_bot", value);
      return this;
    }
    public APIRequestGetGames requestIsOwnedField () {
      return this.requestIsOwnedField(true);
    }
    public APIRequestGetGames requestIsOwnedField (boolean value) {
      this.requestField("is_owned", value);
      return this;
    }
    public APIRequestGetGames requestIsPermanentlyClosedField () {
      return this.requestIsPermanentlyClosedField(true);
    }
    public APIRequestGetGames requestIsPermanentlyClosedField (boolean value) {
      this.requestField("is_permanently_closed", value);
      return this;
    }
    public APIRequestGetGames requestIsPublishedField () {
      return this.requestIsPublishedField(true);
    }
    public APIRequestGetGames requestIsPublishedField (boolean value) {
      this.requestField("is_published", value);
      return this;
    }
    public APIRequestGetGames requestIsUnclaimedField () {
      return this.requestIsUnclaimedField(true);
    }
    public APIRequestGetGames requestIsUnclaimedField (boolean value) {
      this.requestField("is_unclaimed", value);
      return this;
    }
    public APIRequestGetGames requestIsVerifiedField () {
      return this.requestIsVerifiedField(true);
    }
    public APIRequestGetGames requestIsVerifiedField (boolean value) {
      this.requestField("is_verified", value);
      return this;
    }
    public APIRequestGetGames requestIsWebhooksSubscribedField () {
      return this.requestIsWebhooksSubscribedField(true);
    }
    public APIRequestGetGames requestIsWebhooksSubscribedField (boolean value) {
      this.requestField("is_webhooks_subscribed", value);
      return this;
    }
    public APIRequestGetGames requestKeywordsField () {
      return this.requestKeywordsField(true);
    }
    public APIRequestGetGames requestKeywordsField (boolean value) {
      this.requestField("keywords", value);
      return this;
    }
    public APIRequestGetGames requestLeadgenFormPreviewDetailsField () {
      return this.requestLeadgenFormPreviewDetailsField(true);
    }
    public APIRequestGetGames requestLeadgenFormPreviewDetailsField (boolean value) {
      this.requestField("leadgen_form_preview_details", value);
      return this;
    }
    public APIRequestGetGames requestLeadgenHasCrmIntegrationField () {
      return this.requestLeadgenHasCrmIntegrationField(true);
    }
    public APIRequestGetGames requestLeadgenHasCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_crm_integration", value);
      return this;
    }
    public APIRequestGetGames requestLeadgenHasFatPingCrmIntegrationField () {
      return this.requestLeadgenHasFatPingCrmIntegrationField(true);
    }
    public APIRequestGetGames requestLeadgenHasFatPingCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_fat_ping_crm_integration", value);
      return this;
    }
    public APIRequestGetGames requestLeadgenTosAcceptanceTimeField () {
      return this.requestLeadgenTosAcceptanceTimeField(true);
    }
    public APIRequestGetGames requestLeadgenTosAcceptanceTimeField (boolean value) {
      this.requestField("leadgen_tos_acceptance_time", value);
      return this;
    }
    public APIRequestGetGames requestLeadgenTosAcceptedField () {
      return this.requestLeadgenTosAcceptedField(true);
    }
    public APIRequestGetGames requestLeadgenTosAcceptedField (boolean value) {
      this.requestField("leadgen_tos_accepted", value);
      return this;
    }
    public APIRequestGetGames requestLeadgenTosAcceptingUserField () {
      return this.requestLeadgenTosAcceptingUserField(true);
    }
    public APIRequestGetGames requestLeadgenTosAcceptingUserField (boolean value) {
      this.requestField("leadgen_tos_accepting_user", value);
      return this;
    }
    public APIRequestGetGames requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetGames requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetGames requestLocationField () {
      return this.requestLocationField(true);
    }
    public APIRequestGetGames requestLocationField (boolean value) {
      this.requestField("location", value);
      return this;
    }
    public APIRequestGetGames requestMembersField () {
      return this.requestMembersField(true);
    }
    public APIRequestGetGames requestMembersField (boolean value) {
      this.requestField("members", value);
      return this;
    }
    public APIRequestGetGames requestMerchantIdField () {
      return this.requestMerchantIdField(true);
    }
    public APIRequestGetGames requestMerchantIdField (boolean value) {
      this.requestField("merchant_id", value);
      return this;
    }
    public APIRequestGetGames requestMerchantReviewStatusField () {
      return this.requestMerchantReviewStatusField(true);
    }
    public APIRequestGetGames requestMerchantReviewStatusField (boolean value) {
      this.requestField("merchant_review_status", value);
      return this;
    }
    public APIRequestGetGames requestMessengerAdsDefaultIcebreakersField () {
      return this.requestMessengerAdsDefaultIcebreakersField(true);
    }
    public APIRequestGetGames requestMessengerAdsDefaultIcebreakersField (boolean value) {
      this.requestField("messenger_ads_default_icebreakers", value);
      return this;
    }
    public APIRequestGetGames requestMessengerAdsDefaultPageWelcomeMessageField () {
      return this.requestMessengerAdsDefaultPageWelcomeMessageField(true);
    }
    public APIRequestGetGames requestMessengerAdsDefaultPageWelcomeMessageField (boolean value) {
      this.requestField("messenger_ads_default_page_welcome_message", value);
      return this;
    }
    public APIRequestGetGames requestMessengerAdsDefaultQuickRepliesField () {
      return this.requestMessengerAdsDefaultQuickRepliesField(true);
    }
    public APIRequestGetGames requestMessengerAdsDefaultQuickRepliesField (boolean value) {
      this.requestField("messenger_ads_default_quick_replies", value);
      return this;
    }
    public APIRequestGetGames requestMessengerAdsQuickRepliesTypeField () {
      return this.requestMessengerAdsQuickRepliesTypeField(true);
    }
    public APIRequestGetGames requestMessengerAdsQuickRepliesTypeField (boolean value) {
      this.requestField("messenger_ads_quick_replies_type", value);
      return this;
    }
    public APIRequestGetGames requestMissionField () {
      return this.requestMissionField(true);
    }
    public APIRequestGetGames requestMissionField (boolean value) {
      this.requestField("mission", value);
      return this;
    }
    public APIRequestGetGames requestMpgField () {
      return this.requestMpgField(true);
    }
    public APIRequestGetGames requestMpgField (boolean value) {
      this.requestField("mpg", value);
      return this;
    }
    public APIRequestGetGames requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetGames requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetGames requestNameWithLocationDescriptorField () {
      return this.requestNameWithLocationDescriptorField(true);
    }
    public APIRequestGetGames requestNameWithLocationDescriptorField (boolean value) {
      this.requestField("name_with_location_descriptor", value);
      return this;
    }
    public APIRequestGetGames requestNetworkField () {
      return this.requestNetworkField(true);
    }
    public APIRequestGetGames requestNetworkField (boolean value) {
      this.requestField("network", value);
      return this;
    }
    public APIRequestGetGames requestNewLikeCountField () {
      return this.requestNewLikeCountField(true);
    }
    public APIRequestGetGames requestNewLikeCountField (boolean value) {
      this.requestField("new_like_count", value);
      return this;
    }
    public APIRequestGetGames requestOfferEligibleField () {
      return this.requestOfferEligibleField(true);
    }
    public APIRequestGetGames requestOfferEligibleField (boolean value) {
      this.requestField("offer_eligible", value);
      return this;
    }
    public APIRequestGetGames requestOverallStarRatingField () {
      return this.requestOverallStarRatingField(true);
    }
    public APIRequestGetGames requestOverallStarRatingField (boolean value) {
      this.requestField("overall_star_rating", value);
      return this;
    }
    public APIRequestGetGames requestPageAboutStoryField () {
      return this.requestPageAboutStoryField(true);
    }
    public APIRequestGetGames requestPageAboutStoryField (boolean value) {
      this.requestField("page_about_story", value);
      return this;
    }
    public APIRequestGetGames requestPageTokenField () {
      return this.requestPageTokenField(true);
    }
    public APIRequestGetGames requestPageTokenField (boolean value) {
      this.requestField("page_token", value);
      return this;
    }
    public APIRequestGetGames requestParentPageField () {
      return this.requestParentPageField(true);
    }
    public APIRequestGetGames requestParentPageField (boolean value) {
      this.requestField("parent_page", value);
      return this;
    }
    public APIRequestGetGames requestParkingField () {
      return this.requestParkingField(true);
    }
    public APIRequestGetGames requestParkingField (boolean value) {
      this.requestField("parking", value);
      return this;
    }
    public APIRequestGetGames requestPaymentOptionsField () {
      return this.requestPaymentOptionsField(true);
    }
    public APIRequestGetGames requestPaymentOptionsField (boolean value) {
      this.requestField("payment_options", value);
      return this;
    }
    public APIRequestGetGames requestPersonalInfoField () {
      return this.requestPersonalInfoField(true);
    }
    public APIRequestGetGames requestPersonalInfoField (boolean value) {
      this.requestField("personal_info", value);
      return this;
    }
    public APIRequestGetGames requestPersonalInterestsField () {
      return this.requestPersonalInterestsField(true);
    }
    public APIRequestGetGames requestPersonalInterestsField (boolean value) {
      this.requestField("personal_interests", value);
      return this;
    }
    public APIRequestGetGames requestPharmaSafetyInfoField () {
      return this.requestPharmaSafetyInfoField(true);
    }
    public APIRequestGetGames requestPharmaSafetyInfoField (boolean value) {
      this.requestField("pharma_safety_info", value);
      return this;
    }
    public APIRequestGetGames requestPhoneField () {
      return this.requestPhoneField(true);
    }
    public APIRequestGetGames requestPhoneField (boolean value) {
      this.requestField("phone", value);
      return this;
    }
    public APIRequestGetGames requestPlaceTypeField () {
      return this.requestPlaceTypeField(true);
    }
    public APIRequestGetGames requestPlaceTypeField (boolean value) {
      this.requestField("place_type", value);
      return this;
    }
    public APIRequestGetGames requestPlotOutlineField () {
      return this.requestPlotOutlineField(true);
    }
    public APIRequestGetGames requestPlotOutlineField (boolean value) {
      this.requestField("plot_outline", value);
      return this;
    }
    public APIRequestGetGames requestPreferredAudienceField () {
      return this.requestPreferredAudienceField(true);
    }
    public APIRequestGetGames requestPreferredAudienceField (boolean value) {
      this.requestField("preferred_audience", value);
      return this;
    }
    public APIRequestGetGames requestPressContactField () {
      return this.requestPressContactField(true);
    }
    public APIRequestGetGames requestPressContactField (boolean value) {
      this.requestField("press_contact", value);
      return this;
    }
    public APIRequestGetGames requestPriceRangeField () {
      return this.requestPriceRangeField(true);
    }
    public APIRequestGetGames requestPriceRangeField (boolean value) {
      this.requestField("price_range", value);
      return this;
    }
    public APIRequestGetGames requestPrivacyInfoUrlField () {
      return this.requestPrivacyInfoUrlField(true);
    }
    public APIRequestGetGames requestPrivacyInfoUrlField (boolean value) {
      this.requestField("privacy_info_url", value);
      return this;
    }
    public APIRequestGetGames requestProducedByField () {
      return this.requestProducedByField(true);
    }
    public APIRequestGetGames requestProducedByField (boolean value) {
      this.requestField("produced_by", value);
      return this;
    }
    public APIRequestGetGames requestProductsField () {
      return this.requestProductsField(true);
    }
    public APIRequestGetGames requestProductsField (boolean value) {
      this.requestField("products", value);
      return this;
    }
    public APIRequestGetGames requestPromotionEligibleField () {
      return this.requestPromotionEligibleField(true);
    }
    public APIRequestGetGames requestPromotionEligibleField (boolean value) {
      this.requestField("promotion_eligible", value);
      return this;
    }
    public APIRequestGetGames requestPromotionIneligibleReasonField () {
      return this.requestPromotionIneligibleReasonField(true);
    }
    public APIRequestGetGames requestPromotionIneligibleReasonField (boolean value) {
      this.requestField("promotion_ineligible_reason", value);
      return this;
    }
    public APIRequestGetGames requestPublicTransitField () {
      return this.requestPublicTransitField(true);
    }
    public APIRequestGetGames requestPublicTransitField (boolean value) {
      this.requestField("public_transit", value);
      return this;
    }
    public APIRequestGetGames requestRatingCountField () {
      return this.requestRatingCountField(true);
    }
    public APIRequestGetGames requestRatingCountField (boolean value) {
      this.requestField("rating_count", value);
      return this;
    }
    public APIRequestGetGames requestRecipientField () {
      return this.requestRecipientField(true);
    }
    public APIRequestGetGames requestRecipientField (boolean value) {
      this.requestField("recipient", value);
      return this;
    }
    public APIRequestGetGames requestRecordLabelField () {
      return this.requestRecordLabelField(true);
    }
    public APIRequestGetGames requestRecordLabelField (boolean value) {
      this.requestField("record_label", value);
      return this;
    }
    public APIRequestGetGames requestReleaseDateField () {
      return this.requestReleaseDateField(true);
    }
    public APIRequestGetGames requestReleaseDateField (boolean value) {
      this.requestField("release_date", value);
      return this;
    }
    public APIRequestGetGames requestRestaurantServicesField () {
      return this.requestRestaurantServicesField(true);
    }
    public APIRequestGetGames requestRestaurantServicesField (boolean value) {
      this.requestField("restaurant_services", value);
      return this;
    }
    public APIRequestGetGames requestRestaurantSpecialtiesField () {
      return this.requestRestaurantSpecialtiesField(true);
    }
    public APIRequestGetGames requestRestaurantSpecialtiesField (boolean value) {
      this.requestField("restaurant_specialties", value);
      return this;
    }
    public APIRequestGetGames requestScheduleField () {
      return this.requestScheduleField(true);
    }
    public APIRequestGetGames requestScheduleField (boolean value) {
      this.requestField("schedule", value);
      return this;
    }
    public APIRequestGetGames requestScreenplayByField () {
      return this.requestScreenplayByField(true);
    }
    public APIRequestGetGames requestScreenplayByField (boolean value) {
      this.requestField("screenplay_by", value);
      return this;
    }
    public APIRequestGetGames requestSeasonField () {
      return this.requestSeasonField(true);
    }
    public APIRequestGetGames requestSeasonField (boolean value) {
      this.requestField("season", value);
      return this;
    }
    public APIRequestGetGames requestSingleLineAddressField () {
      return this.requestSingleLineAddressField(true);
    }
    public APIRequestGetGames requestSingleLineAddressField (boolean value) {
      this.requestField("single_line_address", value);
      return this;
    }
    public APIRequestGetGames requestStarringField () {
      return this.requestStarringField(true);
    }
    public APIRequestGetGames requestStarringField (boolean value) {
      this.requestField("starring", value);
      return this;
    }
    public APIRequestGetGames requestStartInfoField () {
      return this.requestStartInfoField(true);
    }
    public APIRequestGetGames requestStartInfoField (boolean value) {
      this.requestField("start_info", value);
      return this;
    }
    public APIRequestGetGames requestStoreCodeField () {
      return this.requestStoreCodeField(true);
    }
    public APIRequestGetGames requestStoreCodeField (boolean value) {
      this.requestField("store_code", value);
      return this;
    }
    public APIRequestGetGames requestStoreLocationDescriptorField () {
      return this.requestStoreLocationDescriptorField(true);
    }
    public APIRequestGetGames requestStoreLocationDescriptorField (boolean value) {
      this.requestField("store_location_descriptor", value);
      return this;
    }
    public APIRequestGetGames requestStoreNumberField () {
      return this.requestStoreNumberField(true);
    }
    public APIRequestGetGames requestStoreNumberField (boolean value) {
      this.requestField("store_number", value);
      return this;
    }
    public APIRequestGetGames requestStudioField () {
      return this.requestStudioField(true);
    }
    public APIRequestGetGames requestStudioField (boolean value) {
      this.requestField("studio", value);
      return this;
    }
    public APIRequestGetGames requestSupportsInstantArticlesField () {
      return this.requestSupportsInstantArticlesField(true);
    }
    public APIRequestGetGames requestSupportsInstantArticlesField (boolean value) {
      this.requestField("supports_instant_articles", value);
      return this;
    }
    public APIRequestGetGames requestTalkingAboutCountField () {
      return this.requestTalkingAboutCountField(true);
    }
    public APIRequestGetGames requestTalkingAboutCountField (boolean value) {
      this.requestField("talking_about_count", value);
      return this;
    }
    public APIRequestGetGames requestUnreadMessageCountField () {
      return this.requestUnreadMessageCountField(true);
    }
    public APIRequestGetGames requestUnreadMessageCountField (boolean value) {
      this.requestField("unread_message_count", value);
      return this;
    }
    public APIRequestGetGames requestUnreadNotifCountField () {
      return this.requestUnreadNotifCountField(true);
    }
    public APIRequestGetGames requestUnreadNotifCountField (boolean value) {
      this.requestField("unread_notif_count", value);
      return this;
    }
    public APIRequestGetGames requestUnseenMessageCountField () {
      return this.requestUnseenMessageCountField(true);
    }
    public APIRequestGetGames requestUnseenMessageCountField (boolean value) {
      this.requestField("unseen_message_count", value);
      return this;
    }
    public APIRequestGetGames requestUsernameField () {
      return this.requestUsernameField(true);
    }
    public APIRequestGetGames requestUsernameField (boolean value) {
      this.requestField("username", value);
      return this;
    }
    public APIRequestGetGames requestVerificationStatusField () {
      return this.requestVerificationStatusField(true);
    }
    public APIRequestGetGames requestVerificationStatusField (boolean value) {
      this.requestField("verification_status", value);
      return this;
    }
    public APIRequestGetGames requestVoipInfoField () {
      return this.requestVoipInfoField(true);
    }
    public APIRequestGetGames requestVoipInfoField (boolean value) {
      this.requestField("voip_info", value);
      return this;
    }
    public APIRequestGetGames requestWebsiteField () {
      return this.requestWebsiteField(true);
    }
    public APIRequestGetGames requestWebsiteField (boolean value) {
      this.requestField("website", value);
      return this;
    }
    public APIRequestGetGames requestWereHereCountField () {
      return this.requestWereHereCountField(true);
    }
    public APIRequestGetGames requestWereHereCountField (boolean value) {
      this.requestField("were_here_count", value);
      return this;
    }
    public APIRequestGetGames requestWhatsappNumberField () {
      return this.requestWhatsappNumberField(true);
    }
    public APIRequestGetGames requestWhatsappNumberField (boolean value) {
      this.requestField("whatsapp_number", value);
      return this;
    }
    public APIRequestGetGames requestWrittenByField () {
      return this.requestWrittenByField(true);
    }
    public APIRequestGetGames requestWrittenByField (boolean value) {
      this.requestField("written_by", value);
      return this;
    }
  }

  public static class APIRequestCreateGamesAchieve extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "added",
      "alias",
      "android_key_hash",
      "client_secret",
      "created_time",
      "end_time",
      "expires_in",
      "fb:channel",
      "fb:explicitly_shared",
      "image:height",
      "image:secure_url",
      "image:type",
      "image:url",
      "image:user_generated",
      "image:width",
      "ios_bundle_id",
      "message",
      "no_action_link",
      "no_feed_story",
      "notify",
      "place",
      "preview",
      "privacy",
      "proxied_app_id",
      "ref",
      "scrape",
      "start_time",
      "tags",
      "to",
      "user_selected_place",
      "user_selected_tags",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestCreateGamesAchieve.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateGamesAchieve(String nodeId, APIContext context) {
      super(context, nodeId, "/games.achieves", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateGamesAchieve setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateGamesAchieve setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateGamesAchieve setAdded (String added) {
      this.setParam("added", added);
      return this;
    }

    public APIRequestCreateGamesAchieve setAlias (String alias) {
      this.setParam("alias", alias);
      return this;
    }

    public APIRequestCreateGamesAchieve setAndroidKeyHash (String androidKeyHash) {
      this.setParam("android_key_hash", androidKeyHash);
      return this;
    }

    public APIRequestCreateGamesAchieve setClientSecret (String clientSecret) {
      this.setParam("client_secret", clientSecret);
      return this;
    }

    public APIRequestCreateGamesAchieve setCreatedTime (String createdTime) {
      this.setParam("created_time", createdTime);
      return this;
    }

    public APIRequestCreateGamesAchieve setEndTime (String endTime) {
      this.setParam("end_time", endTime);
      return this;
    }

    public APIRequestCreateGamesAchieve setExpiresIn (Long expiresIn) {
      this.setParam("expires_in", expiresIn);
      return this;
    }
    public APIRequestCreateGamesAchieve setExpiresIn (String expiresIn) {
      this.setParam("expires_in", expiresIn);
      return this;
    }

    public APIRequestCreateGamesAchieve setFbChannel (String fbChannel) {
      this.setParam("fb:channel", fbChannel);
      return this;
    }

    public APIRequestCreateGamesAchieve setFbExplicitlyShared (Boolean fbExplicitlyShared) {
      this.setParam("fb:explicitly_shared", fbExplicitlyShared);
      return this;
    }
    public APIRequestCreateGamesAchieve setFbExplicitlyShared (String fbExplicitlyShared) {
      this.setParam("fb:explicitly_shared", fbExplicitlyShared);
      return this;
    }

    public APIRequestCreateGamesAchieve setImageHeight (Long imageHeight) {
      this.setParam("image:height", imageHeight);
      return this;
    }
    public APIRequestCreateGamesAchieve setImageHeight (String imageHeight) {
      this.setParam("image:height", imageHeight);
      return this;
    }

    public APIRequestCreateGamesAchieve setImageSecureUrl (String imageSecureUrl) {
      this.setParam("image:secure_url", imageSecureUrl);
      return this;
    }

    public APIRequestCreateGamesAchieve setImageType (String imageType) {
      this.setParam("image:type", imageType);
      return this;
    }

    public APIRequestCreateGamesAchieve setImageUrl (String imageUrl) {
      this.setParam("image:url", imageUrl);
      return this;
    }

    public APIRequestCreateGamesAchieve setImageUserGenerated (Boolean imageUserGenerated) {
      this.setParam("image:user_generated", imageUserGenerated);
      return this;
    }
    public APIRequestCreateGamesAchieve setImageUserGenerated (String imageUserGenerated) {
      this.setParam("image:user_generated", imageUserGenerated);
      return this;
    }

    public APIRequestCreateGamesAchieve setImageWidth (Long imageWidth) {
      this.setParam("image:width", imageWidth);
      return this;
    }
    public APIRequestCreateGamesAchieve setImageWidth (String imageWidth) {
      this.setParam("image:width", imageWidth);
      return this;
    }

    public APIRequestCreateGamesAchieve setIosBundleId (String iosBundleId) {
      this.setParam("ios_bundle_id", iosBundleId);
      return this;
    }

    public APIRequestCreateGamesAchieve setMessage (String message) {
      this.setParam("message", message);
      return this;
    }

    public APIRequestCreateGamesAchieve setNoActionLink (Boolean noActionLink) {
      this.setParam("no_action_link", noActionLink);
      return this;
    }
    public APIRequestCreateGamesAchieve setNoActionLink (String noActionLink) {
      this.setParam("no_action_link", noActionLink);
      return this;
    }

    public APIRequestCreateGamesAchieve setNoFeedStory (Boolean noFeedStory) {
      this.setParam("no_feed_story", noFeedStory);
      return this;
    }
    public APIRequestCreateGamesAchieve setNoFeedStory (String noFeedStory) {
      this.setParam("no_feed_story", noFeedStory);
      return this;
    }

    public APIRequestCreateGamesAchieve setNotify (Boolean notify) {
      this.setParam("notify", notify);
      return this;
    }
    public APIRequestCreateGamesAchieve setNotify (String notify) {
      this.setParam("notify", notify);
      return this;
    }

    public APIRequestCreateGamesAchieve setPlace (String place) {
      this.setParam("place", place);
      return this;
    }

    public APIRequestCreateGamesAchieve setPreview (Boolean preview) {
      this.setParam("preview", preview);
      return this;
    }
    public APIRequestCreateGamesAchieve setPreview (String preview) {
      this.setParam("preview", preview);
      return this;
    }

    public APIRequestCreateGamesAchieve setPrivacy (String privacy) {
      this.setParam("privacy", privacy);
      return this;
    }

    public APIRequestCreateGamesAchieve setProxiedAppId (String proxiedAppId) {
      this.setParam("proxied_app_id", proxiedAppId);
      return this;
    }

    public APIRequestCreateGamesAchieve setRef (String ref) {
      this.setParam("ref", ref);
      return this;
    }

    public APIRequestCreateGamesAchieve setScrape (Boolean scrape) {
      this.setParam("scrape", scrape);
      return this;
    }
    public APIRequestCreateGamesAchieve setScrape (String scrape) {
      this.setParam("scrape", scrape);
      return this;
    }

    public APIRequestCreateGamesAchieve setStartTime (String startTime) {
      this.setParam("start_time", startTime);
      return this;
    }

    public APIRequestCreateGamesAchieve setTags (List<Long> tags) {
      this.setParam("tags", tags);
      return this;
    }
    public APIRequestCreateGamesAchieve setTags (String tags) {
      this.setParam("tags", tags);
      return this;
    }

    public APIRequestCreateGamesAchieve setTo (String to) {
      this.setParam("to", to);
      return this;
    }

    public APIRequestCreateGamesAchieve setUserSelectedPlace (Boolean userSelectedPlace) {
      this.setParam("user_selected_place", userSelectedPlace);
      return this;
    }
    public APIRequestCreateGamesAchieve setUserSelectedPlace (String userSelectedPlace) {
      this.setParam("user_selected_place", userSelectedPlace);
      return this;
    }

    public APIRequestCreateGamesAchieve setUserSelectedTags (Boolean userSelectedTags) {
      this.setParam("user_selected_tags", userSelectedTags);
      return this;
    }
    public APIRequestCreateGamesAchieve setUserSelectedTags (String userSelectedTags) {
      this.setParam("user_selected_tags", userSelectedTags);
      return this;
    }

    public APIRequestCreateGamesAchieve requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateGamesAchieve requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateGamesAchieve requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateGamesAchieve requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateGamesAchieve requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateGamesAchieve requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateGamesStat extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "inc",
      "set",
      "stat_name",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestCreateGamesStat.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateGamesStat(String nodeId, APIContext context) {
      super(context, nodeId, "/games_stats", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateGamesStat setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateGamesStat setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateGamesStat setInc (Long inc) {
      this.setParam("inc", inc);
      return this;
    }
    public APIRequestCreateGamesStat setInc (String inc) {
      this.setParam("inc", inc);
      return this;
    }

    public APIRequestCreateGamesStat setSet (Long set) {
      this.setParam("set", set);
      return this;
    }
    public APIRequestCreateGamesStat setSet (String set) {
      this.setParam("set", set);
      return this;
    }

    public APIRequestCreateGamesStat setStatName (String statName) {
      this.setParam("stat_name", statName);
      return this;
    }

    public APIRequestCreateGamesStat requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateGamesStat requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateGamesStat requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateGamesStat requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateGamesStat requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateGamesStat requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateGamesPlay extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "added",
      "alias",
      "android_key_hash",
      "client_secret",
      "created_time",
      "end_time",
      "expires_in",
      "fb:channel",
      "fb:explicitly_shared",
      "image:height",
      "image:secure_url",
      "image:type",
      "image:url",
      "image:user_generated",
      "image:width",
      "ios_bundle_id",
      "message",
      "no_action_link",
      "no_feed_story",
      "notify",
      "place",
      "preview",
      "privacy",
      "proxied_app_id",
      "ref",
      "scrape",
      "start_time",
      "tags",
      "to",
      "user_selected_place",
      "user_selected_tags",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestCreateGamesPlay.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateGamesPlay(String nodeId, APIContext context) {
      super(context, nodeId, "/gamesplays", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateGamesPlay setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateGamesPlay setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateGamesPlay setAdded (String added) {
      this.setParam("added", added);
      return this;
    }

    public APIRequestCreateGamesPlay setAlias (String alias) {
      this.setParam("alias", alias);
      return this;
    }

    public APIRequestCreateGamesPlay setAndroidKeyHash (String androidKeyHash) {
      this.setParam("android_key_hash", androidKeyHash);
      return this;
    }

    public APIRequestCreateGamesPlay setClientSecret (String clientSecret) {
      this.setParam("client_secret", clientSecret);
      return this;
    }

    public APIRequestCreateGamesPlay setCreatedTime (String createdTime) {
      this.setParam("created_time", createdTime);
      return this;
    }

    public APIRequestCreateGamesPlay setEndTime (String endTime) {
      this.setParam("end_time", endTime);
      return this;
    }

    public APIRequestCreateGamesPlay setExpiresIn (Long expiresIn) {
      this.setParam("expires_in", expiresIn);
      return this;
    }
    public APIRequestCreateGamesPlay setExpiresIn (String expiresIn) {
      this.setParam("expires_in", expiresIn);
      return this;
    }

    public APIRequestCreateGamesPlay setFbChannel (String fbChannel) {
      this.setParam("fb:channel", fbChannel);
      return this;
    }

    public APIRequestCreateGamesPlay setFbExplicitlyShared (Boolean fbExplicitlyShared) {
      this.setParam("fb:explicitly_shared", fbExplicitlyShared);
      return this;
    }
    public APIRequestCreateGamesPlay setFbExplicitlyShared (String fbExplicitlyShared) {
      this.setParam("fb:explicitly_shared", fbExplicitlyShared);
      return this;
    }

    public APIRequestCreateGamesPlay setImageHeight (Long imageHeight) {
      this.setParam("image:height", imageHeight);
      return this;
    }
    public APIRequestCreateGamesPlay setImageHeight (String imageHeight) {
      this.setParam("image:height", imageHeight);
      return this;
    }

    public APIRequestCreateGamesPlay setImageSecureUrl (String imageSecureUrl) {
      this.setParam("image:secure_url", imageSecureUrl);
      return this;
    }

    public APIRequestCreateGamesPlay setImageType (String imageType) {
      this.setParam("image:type", imageType);
      return this;
    }

    public APIRequestCreateGamesPlay setImageUrl (String imageUrl) {
      this.setParam("image:url", imageUrl);
      return this;
    }

    public APIRequestCreateGamesPlay setImageUserGenerated (Boolean imageUserGenerated) {
      this.setParam("image:user_generated", imageUserGenerated);
      return this;
    }
    public APIRequestCreateGamesPlay setImageUserGenerated (String imageUserGenerated) {
      this.setParam("image:user_generated", imageUserGenerated);
      return this;
    }

    public APIRequestCreateGamesPlay setImageWidth (Long imageWidth) {
      this.setParam("image:width", imageWidth);
      return this;
    }
    public APIRequestCreateGamesPlay setImageWidth (String imageWidth) {
      this.setParam("image:width", imageWidth);
      return this;
    }

    public APIRequestCreateGamesPlay setIosBundleId (String iosBundleId) {
      this.setParam("ios_bundle_id", iosBundleId);
      return this;
    }

    public APIRequestCreateGamesPlay setMessage (String message) {
      this.setParam("message", message);
      return this;
    }

    public APIRequestCreateGamesPlay setNoActionLink (Boolean noActionLink) {
      this.setParam("no_action_link", noActionLink);
      return this;
    }
    public APIRequestCreateGamesPlay setNoActionLink (String noActionLink) {
      this.setParam("no_action_link", noActionLink);
      return this;
    }

    public APIRequestCreateGamesPlay setNoFeedStory (Boolean noFeedStory) {
      this.setParam("no_feed_story", noFeedStory);
      return this;
    }
    public APIRequestCreateGamesPlay setNoFeedStory (String noFeedStory) {
      this.setParam("no_feed_story", noFeedStory);
      return this;
    }

    public APIRequestCreateGamesPlay setNotify (Boolean notify) {
      this.setParam("notify", notify);
      return this;
    }
    public APIRequestCreateGamesPlay setNotify (String notify) {
      this.setParam("notify", notify);
      return this;
    }

    public APIRequestCreateGamesPlay setPlace (String place) {
      this.setParam("place", place);
      return this;
    }

    public APIRequestCreateGamesPlay setPreview (Boolean preview) {
      this.setParam("preview", preview);
      return this;
    }
    public APIRequestCreateGamesPlay setPreview (String preview) {
      this.setParam("preview", preview);
      return this;
    }

    public APIRequestCreateGamesPlay setPrivacy (String privacy) {
      this.setParam("privacy", privacy);
      return this;
    }

    public APIRequestCreateGamesPlay setProxiedAppId (String proxiedAppId) {
      this.setParam("proxied_app_id", proxiedAppId);
      return this;
    }

    public APIRequestCreateGamesPlay setRef (String ref) {
      this.setParam("ref", ref);
      return this;
    }

    public APIRequestCreateGamesPlay setScrape (Boolean scrape) {
      this.setParam("scrape", scrape);
      return this;
    }
    public APIRequestCreateGamesPlay setScrape (String scrape) {
      this.setParam("scrape", scrape);
      return this;
    }

    public APIRequestCreateGamesPlay setStartTime (String startTime) {
      this.setParam("start_time", startTime);
      return this;
    }

    public APIRequestCreateGamesPlay setTags (List<Long> tags) {
      this.setParam("tags", tags);
      return this;
    }
    public APIRequestCreateGamesPlay setTags (String tags) {
      this.setParam("tags", tags);
      return this;
    }

    public APIRequestCreateGamesPlay setTo (String to) {
      this.setParam("to", to);
      return this;
    }

    public APIRequestCreateGamesPlay setUserSelectedPlace (Boolean userSelectedPlace) {
      this.setParam("user_selected_place", userSelectedPlace);
      return this;
    }
    public APIRequestCreateGamesPlay setUserSelectedPlace (String userSelectedPlace) {
      this.setParam("user_selected_place", userSelectedPlace);
      return this;
    }

    public APIRequestCreateGamesPlay setUserSelectedTags (Boolean userSelectedTags) {
      this.setParam("user_selected_tags", userSelectedTags);
      return this;
    }
    public APIRequestCreateGamesPlay setUserSelectedTags (String userSelectedTags) {
      this.setParam("user_selected_tags", userSelectedTags);
      return this;
    }

    public APIRequestCreateGamesPlay requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateGamesPlay requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateGamesPlay requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateGamesPlay requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateGamesPlay requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateGamesPlay requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetGroups extends APIRequest<Group> {

    APINodeList<Group> lastResponse = null;
    @Override
    public APINodeList<Group> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "admin_only",
      "parent",
    };

    public static final String[] FIELDS = {
      "archived",
      "cover",
      "created_time",
      "description",
      "email",
      "icon",
      "id",
      "link",
      "member_count",
      "member_request_count",
      "name",
      "owner",
      "parent",
      "permissions",
      "privacy",
      "purpose",
      "subdomain",
      "updated_time",
      "venue",
    };

    @Override
    public APINodeList<Group> parseResponse(String response, String header) throws APIException {
      return Group.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Group> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Group> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Group>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Group>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Group>>() {
           public APINodeList<Group> apply(ResponseWrapper result) {
             try {
               return APIRequestGetGroups.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetGroups(String nodeId, APIContext context) {
      super(context, nodeId, "/groups", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetGroups setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetGroups setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetGroups setAdminOnly (Boolean adminOnly) {
      this.setParam("admin_only", adminOnly);
      return this;
    }
    public APIRequestGetGroups setAdminOnly (String adminOnly) {
      this.setParam("admin_only", adminOnly);
      return this;
    }

    public APIRequestGetGroups setParent (String parent) {
      this.setParam("parent", parent);
      return this;
    }

    public APIRequestGetGroups requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetGroups requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetGroups requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetGroups requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetGroups requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetGroups requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetGroups requestArchivedField () {
      return this.requestArchivedField(true);
    }
    public APIRequestGetGroups requestArchivedField (boolean value) {
      this.requestField("archived", value);
      return this;
    }
    public APIRequestGetGroups requestCoverField () {
      return this.requestCoverField(true);
    }
    public APIRequestGetGroups requestCoverField (boolean value) {
      this.requestField("cover", value);
      return this;
    }
    public APIRequestGetGroups requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetGroups requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetGroups requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetGroups requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetGroups requestEmailField () {
      return this.requestEmailField(true);
    }
    public APIRequestGetGroups requestEmailField (boolean value) {
      this.requestField("email", value);
      return this;
    }
    public APIRequestGetGroups requestIconField () {
      return this.requestIconField(true);
    }
    public APIRequestGetGroups requestIconField (boolean value) {
      this.requestField("icon", value);
      return this;
    }
    public APIRequestGetGroups requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetGroups requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetGroups requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetGroups requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetGroups requestMemberCountField () {
      return this.requestMemberCountField(true);
    }
    public APIRequestGetGroups requestMemberCountField (boolean value) {
      this.requestField("member_count", value);
      return this;
    }
    public APIRequestGetGroups requestMemberRequestCountField () {
      return this.requestMemberRequestCountField(true);
    }
    public APIRequestGetGroups requestMemberRequestCountField (boolean value) {
      this.requestField("member_request_count", value);
      return this;
    }
    public APIRequestGetGroups requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetGroups requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetGroups requestOwnerField () {
      return this.requestOwnerField(true);
    }
    public APIRequestGetGroups requestOwnerField (boolean value) {
      this.requestField("owner", value);
      return this;
    }
    public APIRequestGetGroups requestParentField () {
      return this.requestParentField(true);
    }
    public APIRequestGetGroups requestParentField (boolean value) {
      this.requestField("parent", value);
      return this;
    }
    public APIRequestGetGroups requestPermissionsField () {
      return this.requestPermissionsField(true);
    }
    public APIRequestGetGroups requestPermissionsField (boolean value) {
      this.requestField("permissions", value);
      return this;
    }
    public APIRequestGetGroups requestPrivacyField () {
      return this.requestPrivacyField(true);
    }
    public APIRequestGetGroups requestPrivacyField (boolean value) {
      this.requestField("privacy", value);
      return this;
    }
    public APIRequestGetGroups requestPurposeField () {
      return this.requestPurposeField(true);
    }
    public APIRequestGetGroups requestPurposeField (boolean value) {
      this.requestField("purpose", value);
      return this;
    }
    public APIRequestGetGroups requestSubdomainField () {
      return this.requestSubdomainField(true);
    }
    public APIRequestGetGroups requestSubdomainField (boolean value) {
      this.requestField("subdomain", value);
      return this;
    }
    public APIRequestGetGroups requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetGroups requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
    public APIRequestGetGroups requestVenueField () {
      return this.requestVenueField(true);
    }
    public APIRequestGetGroups requestVenueField (boolean value) {
      this.requestField("venue", value);
      return this;
    }
  }

  public static class APIRequestGetIdsForApps extends APIRequest<UserIDForApp> {

    APINodeList<UserIDForApp> lastResponse = null;
    @Override
    public APINodeList<UserIDForApp> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "app",
    };

    public static final String[] FIELDS = {
      "app",
      "id",
    };

    @Override
    public APINodeList<UserIDForApp> parseResponse(String response, String header) throws APIException {
      return UserIDForApp.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<UserIDForApp> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<UserIDForApp> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<UserIDForApp>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<UserIDForApp>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<UserIDForApp>>() {
           public APINodeList<UserIDForApp> apply(ResponseWrapper result) {
             try {
               return APIRequestGetIdsForApps.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetIdsForApps(String nodeId, APIContext context) {
      super(context, nodeId, "/ids_for_apps", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetIdsForApps setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetIdsForApps setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetIdsForApps setApp (Long app) {
      this.setParam("app", app);
      return this;
    }
    public APIRequestGetIdsForApps setApp (String app) {
      this.setParam("app", app);
      return this;
    }

    public APIRequestGetIdsForApps requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetIdsForApps requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetIdsForApps requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetIdsForApps requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetIdsForApps requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetIdsForApps requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetIdsForApps requestAppField () {
      return this.requestAppField(true);
    }
    public APIRequestGetIdsForApps requestAppField (boolean value) {
      this.requestField("app", value);
      return this;
    }
    public APIRequestGetIdsForApps requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetIdsForApps requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
  }

  public static class APIRequestGetIdsForBusiness extends APIRequest<UserIDForApp> {

    APINodeList<UserIDForApp> lastResponse = null;
    @Override
    public APINodeList<UserIDForApp> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "app",
    };

    public static final String[] FIELDS = {
      "app",
      "id",
    };

    @Override
    public APINodeList<UserIDForApp> parseResponse(String response, String header) throws APIException {
      return UserIDForApp.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<UserIDForApp> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<UserIDForApp> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<UserIDForApp>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<UserIDForApp>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<UserIDForApp>>() {
           public APINodeList<UserIDForApp> apply(ResponseWrapper result) {
             try {
               return APIRequestGetIdsForBusiness.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetIdsForBusiness(String nodeId, APIContext context) {
      super(context, nodeId, "/ids_for_business", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetIdsForBusiness setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetIdsForBusiness setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetIdsForBusiness setApp (Long app) {
      this.setParam("app", app);
      return this;
    }
    public APIRequestGetIdsForBusiness setApp (String app) {
      this.setParam("app", app);
      return this;
    }

    public APIRequestGetIdsForBusiness requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetIdsForBusiness requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetIdsForBusiness requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetIdsForBusiness requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetIdsForBusiness requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetIdsForBusiness requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetIdsForBusiness requestAppField () {
      return this.requestAppField(true);
    }
    public APIRequestGetIdsForBusiness requestAppField (boolean value) {
      this.requestField("app", value);
      return this;
    }
    public APIRequestGetIdsForBusiness requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetIdsForBusiness requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
  }

  public static class APIRequestGetIdsForPages extends APIRequest<UserIDForPage> {

    APINodeList<UserIDForPage> lastResponse = null;
    @Override
    public APINodeList<UserIDForPage> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "page",
    };

    public static final String[] FIELDS = {
      "id",
      "page",
    };

    @Override
    public APINodeList<UserIDForPage> parseResponse(String response, String header) throws APIException {
      return UserIDForPage.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<UserIDForPage> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<UserIDForPage> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<UserIDForPage>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<UserIDForPage>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<UserIDForPage>>() {
           public APINodeList<UserIDForPage> apply(ResponseWrapper result) {
             try {
               return APIRequestGetIdsForPages.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetIdsForPages(String nodeId, APIContext context) {
      super(context, nodeId, "/ids_for_pages", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetIdsForPages setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetIdsForPages setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetIdsForPages setPage (Long page) {
      this.setParam("page", page);
      return this;
    }
    public APIRequestGetIdsForPages setPage (String page) {
      this.setParam("page", page);
      return this;
    }

    public APIRequestGetIdsForPages requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetIdsForPages requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetIdsForPages requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetIdsForPages requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetIdsForPages requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetIdsForPages requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetIdsForPages requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetIdsForPages requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetIdsForPages requestPageField () {
      return this.requestPageField(true);
    }
    public APIRequestGetIdsForPages requestPageField (boolean value) {
      this.requestField("page", value);
      return this;
    }
  }

  public static class APIRequestGetLikes extends APIRequest<Page> {

    APINodeList<Page> lastResponse = null;
    @Override
    public APINodeList<Page> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "target_id",
    };

    public static final String[] FIELDS = {
      "about",
      "access_token",
      "ad_campaign",
      "affiliation",
      "app_id",
      "app_links",
      "artists_we_like",
      "attire",
      "awards",
      "band_interests",
      "band_members",
      "best_page",
      "bio",
      "birthday",
      "booking_agent",
      "built",
      "business",
      "can_checkin",
      "can_post",
      "category",
      "category_list",
      "checkins",
      "company_overview",
      "connected_instagram_account",
      "contact_address",
      "copyright_attribution_insights",
      "copyright_whitelisted_ig_partners",
      "country_page_likes",
      "cover",
      "culinary_team",
      "current_location",
      "description",
      "description_html",
      "directed_by",
      "display_subtext",
      "displayed_message_response_time",
      "emails",
      "engagement",
      "fan_count",
      "featured_video",
      "features",
      "food_styles",
      "founded",
      "general_info",
      "general_manager",
      "genre",
      "global_brand_page_name",
      "global_brand_root_id",
      "has_added_app",
      "has_whatsapp_business_number",
      "has_whatsapp_number",
      "hometown",
      "hours",
      "id",
      "impressum",
      "influences",
      "instagram_business_account",
      "instant_articles_review_status",
      "is_always_open",
      "is_chain",
      "is_community_page",
      "is_eligible_for_branded_content",
      "is_messenger_bot_get_started_enabled",
      "is_messenger_platform_bot",
      "is_owned",
      "is_permanently_closed",
      "is_published",
      "is_unclaimed",
      "is_verified",
      "is_webhooks_subscribed",
      "keywords",
      "leadgen_form_preview_details",
      "leadgen_has_crm_integration",
      "leadgen_has_fat_ping_crm_integration",
      "leadgen_tos_acceptance_time",
      "leadgen_tos_accepted",
      "leadgen_tos_accepting_user",
      "link",
      "location",
      "members",
      "merchant_id",
      "merchant_review_status",
      "messenger_ads_default_icebreakers",
      "messenger_ads_default_page_welcome_message",
      "messenger_ads_default_quick_replies",
      "messenger_ads_quick_replies_type",
      "mission",
      "mpg",
      "name",
      "name_with_location_descriptor",
      "network",
      "new_like_count",
      "offer_eligible",
      "overall_star_rating",
      "page_about_story",
      "page_token",
      "parent_page",
      "parking",
      "payment_options",
      "personal_info",
      "personal_interests",
      "pharma_safety_info",
      "phone",
      "place_type",
      "plot_outline",
      "preferred_audience",
      "press_contact",
      "price_range",
      "privacy_info_url",
      "produced_by",
      "products",
      "promotion_eligible",
      "promotion_ineligible_reason",
      "public_transit",
      "rating_count",
      "recipient",
      "record_label",
      "release_date",
      "restaurant_services",
      "restaurant_specialties",
      "schedule",
      "screenplay_by",
      "season",
      "single_line_address",
      "starring",
      "start_info",
      "store_code",
      "store_location_descriptor",
      "store_number",
      "studio",
      "supports_instant_articles",
      "talking_about_count",
      "unread_message_count",
      "unread_notif_count",
      "unseen_message_count",
      "username",
      "verification_status",
      "voip_info",
      "website",
      "were_here_count",
      "whatsapp_number",
      "written_by",
    };

    @Override
    public APINodeList<Page> parseResponse(String response, String header) throws APIException {
      return Page.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Page> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Page> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Page>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Page>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Page>>() {
           public APINodeList<Page> apply(ResponseWrapper result) {
             try {
               return APIRequestGetLikes.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetLikes(String nodeId, APIContext context) {
      super(context, nodeId, "/likes", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetLikes setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetLikes setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetLikes setTargetId (String targetId) {
      this.setParam("target_id", targetId);
      return this;
    }

    public APIRequestGetLikes requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetLikes requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetLikes requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetLikes requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetLikes requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetLikes requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetLikes requestAboutField () {
      return this.requestAboutField(true);
    }
    public APIRequestGetLikes requestAboutField (boolean value) {
      this.requestField("about", value);
      return this;
    }
    public APIRequestGetLikes requestAccessTokenField () {
      return this.requestAccessTokenField(true);
    }
    public APIRequestGetLikes requestAccessTokenField (boolean value) {
      this.requestField("access_token", value);
      return this;
    }
    public APIRequestGetLikes requestAdCampaignField () {
      return this.requestAdCampaignField(true);
    }
    public APIRequestGetLikes requestAdCampaignField (boolean value) {
      this.requestField("ad_campaign", value);
      return this;
    }
    public APIRequestGetLikes requestAffiliationField () {
      return this.requestAffiliationField(true);
    }
    public APIRequestGetLikes requestAffiliationField (boolean value) {
      this.requestField("affiliation", value);
      return this;
    }
    public APIRequestGetLikes requestAppIdField () {
      return this.requestAppIdField(true);
    }
    public APIRequestGetLikes requestAppIdField (boolean value) {
      this.requestField("app_id", value);
      return this;
    }
    public APIRequestGetLikes requestAppLinksField () {
      return this.requestAppLinksField(true);
    }
    public APIRequestGetLikes requestAppLinksField (boolean value) {
      this.requestField("app_links", value);
      return this;
    }
    public APIRequestGetLikes requestArtistsWeLikeField () {
      return this.requestArtistsWeLikeField(true);
    }
    public APIRequestGetLikes requestArtistsWeLikeField (boolean value) {
      this.requestField("artists_we_like", value);
      return this;
    }
    public APIRequestGetLikes requestAttireField () {
      return this.requestAttireField(true);
    }
    public APIRequestGetLikes requestAttireField (boolean value) {
      this.requestField("attire", value);
      return this;
    }
    public APIRequestGetLikes requestAwardsField () {
      return this.requestAwardsField(true);
    }
    public APIRequestGetLikes requestAwardsField (boolean value) {
      this.requestField("awards", value);
      return this;
    }
    public APIRequestGetLikes requestBandInterestsField () {
      return this.requestBandInterestsField(true);
    }
    public APIRequestGetLikes requestBandInterestsField (boolean value) {
      this.requestField("band_interests", value);
      return this;
    }
    public APIRequestGetLikes requestBandMembersField () {
      return this.requestBandMembersField(true);
    }
    public APIRequestGetLikes requestBandMembersField (boolean value) {
      this.requestField("band_members", value);
      return this;
    }
    public APIRequestGetLikes requestBestPageField () {
      return this.requestBestPageField(true);
    }
    public APIRequestGetLikes requestBestPageField (boolean value) {
      this.requestField("best_page", value);
      return this;
    }
    public APIRequestGetLikes requestBioField () {
      return this.requestBioField(true);
    }
    public APIRequestGetLikes requestBioField (boolean value) {
      this.requestField("bio", value);
      return this;
    }
    public APIRequestGetLikes requestBirthdayField () {
      return this.requestBirthdayField(true);
    }
    public APIRequestGetLikes requestBirthdayField (boolean value) {
      this.requestField("birthday", value);
      return this;
    }
    public APIRequestGetLikes requestBookingAgentField () {
      return this.requestBookingAgentField(true);
    }
    public APIRequestGetLikes requestBookingAgentField (boolean value) {
      this.requestField("booking_agent", value);
      return this;
    }
    public APIRequestGetLikes requestBuiltField () {
      return this.requestBuiltField(true);
    }
    public APIRequestGetLikes requestBuiltField (boolean value) {
      this.requestField("built", value);
      return this;
    }
    public APIRequestGetLikes requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetLikes requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetLikes requestCanCheckinField () {
      return this.requestCanCheckinField(true);
    }
    public APIRequestGetLikes requestCanCheckinField (boolean value) {
      this.requestField("can_checkin", value);
      return this;
    }
    public APIRequestGetLikes requestCanPostField () {
      return this.requestCanPostField(true);
    }
    public APIRequestGetLikes requestCanPostField (boolean value) {
      this.requestField("can_post", value);
      return this;
    }
    public APIRequestGetLikes requestCategoryField () {
      return this.requestCategoryField(true);
    }
    public APIRequestGetLikes requestCategoryField (boolean value) {
      this.requestField("category", value);
      return this;
    }
    public APIRequestGetLikes requestCategoryListField () {
      return this.requestCategoryListField(true);
    }
    public APIRequestGetLikes requestCategoryListField (boolean value) {
      this.requestField("category_list", value);
      return this;
    }
    public APIRequestGetLikes requestCheckinsField () {
      return this.requestCheckinsField(true);
    }
    public APIRequestGetLikes requestCheckinsField (boolean value) {
      this.requestField("checkins", value);
      return this;
    }
    public APIRequestGetLikes requestCompanyOverviewField () {
      return this.requestCompanyOverviewField(true);
    }
    public APIRequestGetLikes requestCompanyOverviewField (boolean value) {
      this.requestField("company_overview", value);
      return this;
    }
    public APIRequestGetLikes requestConnectedInstagramAccountField () {
      return this.requestConnectedInstagramAccountField(true);
    }
    public APIRequestGetLikes requestConnectedInstagramAccountField (boolean value) {
      this.requestField("connected_instagram_account", value);
      return this;
    }
    public APIRequestGetLikes requestContactAddressField () {
      return this.requestContactAddressField(true);
    }
    public APIRequestGetLikes requestContactAddressField (boolean value) {
      this.requestField("contact_address", value);
      return this;
    }
    public APIRequestGetLikes requestCopyrightAttributionInsightsField () {
      return this.requestCopyrightAttributionInsightsField(true);
    }
    public APIRequestGetLikes requestCopyrightAttributionInsightsField (boolean value) {
      this.requestField("copyright_attribution_insights", value);
      return this;
    }
    public APIRequestGetLikes requestCopyrightWhitelistedIgPartnersField () {
      return this.requestCopyrightWhitelistedIgPartnersField(true);
    }
    public APIRequestGetLikes requestCopyrightWhitelistedIgPartnersField (boolean value) {
      this.requestField("copyright_whitelisted_ig_partners", value);
      return this;
    }
    public APIRequestGetLikes requestCountryPageLikesField () {
      return this.requestCountryPageLikesField(true);
    }
    public APIRequestGetLikes requestCountryPageLikesField (boolean value) {
      this.requestField("country_page_likes", value);
      return this;
    }
    public APIRequestGetLikes requestCoverField () {
      return this.requestCoverField(true);
    }
    public APIRequestGetLikes requestCoverField (boolean value) {
      this.requestField("cover", value);
      return this;
    }
    public APIRequestGetLikes requestCulinaryTeamField () {
      return this.requestCulinaryTeamField(true);
    }
    public APIRequestGetLikes requestCulinaryTeamField (boolean value) {
      this.requestField("culinary_team", value);
      return this;
    }
    public APIRequestGetLikes requestCurrentLocationField () {
      return this.requestCurrentLocationField(true);
    }
    public APIRequestGetLikes requestCurrentLocationField (boolean value) {
      this.requestField("current_location", value);
      return this;
    }
    public APIRequestGetLikes requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetLikes requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetLikes requestDescriptionHtmlField () {
      return this.requestDescriptionHtmlField(true);
    }
    public APIRequestGetLikes requestDescriptionHtmlField (boolean value) {
      this.requestField("description_html", value);
      return this;
    }
    public APIRequestGetLikes requestDirectedByField () {
      return this.requestDirectedByField(true);
    }
    public APIRequestGetLikes requestDirectedByField (boolean value) {
      this.requestField("directed_by", value);
      return this;
    }
    public APIRequestGetLikes requestDisplaySubtextField () {
      return this.requestDisplaySubtextField(true);
    }
    public APIRequestGetLikes requestDisplaySubtextField (boolean value) {
      this.requestField("display_subtext", value);
      return this;
    }
    public APIRequestGetLikes requestDisplayedMessageResponseTimeField () {
      return this.requestDisplayedMessageResponseTimeField(true);
    }
    public APIRequestGetLikes requestDisplayedMessageResponseTimeField (boolean value) {
      this.requestField("displayed_message_response_time", value);
      return this;
    }
    public APIRequestGetLikes requestEmailsField () {
      return this.requestEmailsField(true);
    }
    public APIRequestGetLikes requestEmailsField (boolean value) {
      this.requestField("emails", value);
      return this;
    }
    public APIRequestGetLikes requestEngagementField () {
      return this.requestEngagementField(true);
    }
    public APIRequestGetLikes requestEngagementField (boolean value) {
      this.requestField("engagement", value);
      return this;
    }
    public APIRequestGetLikes requestFanCountField () {
      return this.requestFanCountField(true);
    }
    public APIRequestGetLikes requestFanCountField (boolean value) {
      this.requestField("fan_count", value);
      return this;
    }
    public APIRequestGetLikes requestFeaturedVideoField () {
      return this.requestFeaturedVideoField(true);
    }
    public APIRequestGetLikes requestFeaturedVideoField (boolean value) {
      this.requestField("featured_video", value);
      return this;
    }
    public APIRequestGetLikes requestFeaturesField () {
      return this.requestFeaturesField(true);
    }
    public APIRequestGetLikes requestFeaturesField (boolean value) {
      this.requestField("features", value);
      return this;
    }
    public APIRequestGetLikes requestFoodStylesField () {
      return this.requestFoodStylesField(true);
    }
    public APIRequestGetLikes requestFoodStylesField (boolean value) {
      this.requestField("food_styles", value);
      return this;
    }
    public APIRequestGetLikes requestFoundedField () {
      return this.requestFoundedField(true);
    }
    public APIRequestGetLikes requestFoundedField (boolean value) {
      this.requestField("founded", value);
      return this;
    }
    public APIRequestGetLikes requestGeneralInfoField () {
      return this.requestGeneralInfoField(true);
    }
    public APIRequestGetLikes requestGeneralInfoField (boolean value) {
      this.requestField("general_info", value);
      return this;
    }
    public APIRequestGetLikes requestGeneralManagerField () {
      return this.requestGeneralManagerField(true);
    }
    public APIRequestGetLikes requestGeneralManagerField (boolean value) {
      this.requestField("general_manager", value);
      return this;
    }
    public APIRequestGetLikes requestGenreField () {
      return this.requestGenreField(true);
    }
    public APIRequestGetLikes requestGenreField (boolean value) {
      this.requestField("genre", value);
      return this;
    }
    public APIRequestGetLikes requestGlobalBrandPageNameField () {
      return this.requestGlobalBrandPageNameField(true);
    }
    public APIRequestGetLikes requestGlobalBrandPageNameField (boolean value) {
      this.requestField("global_brand_page_name", value);
      return this;
    }
    public APIRequestGetLikes requestGlobalBrandRootIdField () {
      return this.requestGlobalBrandRootIdField(true);
    }
    public APIRequestGetLikes requestGlobalBrandRootIdField (boolean value) {
      this.requestField("global_brand_root_id", value);
      return this;
    }
    public APIRequestGetLikes requestHasAddedAppField () {
      return this.requestHasAddedAppField(true);
    }
    public APIRequestGetLikes requestHasAddedAppField (boolean value) {
      this.requestField("has_added_app", value);
      return this;
    }
    public APIRequestGetLikes requestHasWhatsappBusinessNumberField () {
      return this.requestHasWhatsappBusinessNumberField(true);
    }
    public APIRequestGetLikes requestHasWhatsappBusinessNumberField (boolean value) {
      this.requestField("has_whatsapp_business_number", value);
      return this;
    }
    public APIRequestGetLikes requestHasWhatsappNumberField () {
      return this.requestHasWhatsappNumberField(true);
    }
    public APIRequestGetLikes requestHasWhatsappNumberField (boolean value) {
      this.requestField("has_whatsapp_number", value);
      return this;
    }
    public APIRequestGetLikes requestHometownField () {
      return this.requestHometownField(true);
    }
    public APIRequestGetLikes requestHometownField (boolean value) {
      this.requestField("hometown", value);
      return this;
    }
    public APIRequestGetLikes requestHoursField () {
      return this.requestHoursField(true);
    }
    public APIRequestGetLikes requestHoursField (boolean value) {
      this.requestField("hours", value);
      return this;
    }
    public APIRequestGetLikes requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetLikes requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetLikes requestImpressumField () {
      return this.requestImpressumField(true);
    }
    public APIRequestGetLikes requestImpressumField (boolean value) {
      this.requestField("impressum", value);
      return this;
    }
    public APIRequestGetLikes requestInfluencesField () {
      return this.requestInfluencesField(true);
    }
    public APIRequestGetLikes requestInfluencesField (boolean value) {
      this.requestField("influences", value);
      return this;
    }
    public APIRequestGetLikes requestInstagramBusinessAccountField () {
      return this.requestInstagramBusinessAccountField(true);
    }
    public APIRequestGetLikes requestInstagramBusinessAccountField (boolean value) {
      this.requestField("instagram_business_account", value);
      return this;
    }
    public APIRequestGetLikes requestInstantArticlesReviewStatusField () {
      return this.requestInstantArticlesReviewStatusField(true);
    }
    public APIRequestGetLikes requestInstantArticlesReviewStatusField (boolean value) {
      this.requestField("instant_articles_review_status", value);
      return this;
    }
    public APIRequestGetLikes requestIsAlwaysOpenField () {
      return this.requestIsAlwaysOpenField(true);
    }
    public APIRequestGetLikes requestIsAlwaysOpenField (boolean value) {
      this.requestField("is_always_open", value);
      return this;
    }
    public APIRequestGetLikes requestIsChainField () {
      return this.requestIsChainField(true);
    }
    public APIRequestGetLikes requestIsChainField (boolean value) {
      this.requestField("is_chain", value);
      return this;
    }
    public APIRequestGetLikes requestIsCommunityPageField () {
      return this.requestIsCommunityPageField(true);
    }
    public APIRequestGetLikes requestIsCommunityPageField (boolean value) {
      this.requestField("is_community_page", value);
      return this;
    }
    public APIRequestGetLikes requestIsEligibleForBrandedContentField () {
      return this.requestIsEligibleForBrandedContentField(true);
    }
    public APIRequestGetLikes requestIsEligibleForBrandedContentField (boolean value) {
      this.requestField("is_eligible_for_branded_content", value);
      return this;
    }
    public APIRequestGetLikes requestIsMessengerBotGetStartedEnabledField () {
      return this.requestIsMessengerBotGetStartedEnabledField(true);
    }
    public APIRequestGetLikes requestIsMessengerBotGetStartedEnabledField (boolean value) {
      this.requestField("is_messenger_bot_get_started_enabled", value);
      return this;
    }
    public APIRequestGetLikes requestIsMessengerPlatformBotField () {
      return this.requestIsMessengerPlatformBotField(true);
    }
    public APIRequestGetLikes requestIsMessengerPlatformBotField (boolean value) {
      this.requestField("is_messenger_platform_bot", value);
      return this;
    }
    public APIRequestGetLikes requestIsOwnedField () {
      return this.requestIsOwnedField(true);
    }
    public APIRequestGetLikes requestIsOwnedField (boolean value) {
      this.requestField("is_owned", value);
      return this;
    }
    public APIRequestGetLikes requestIsPermanentlyClosedField () {
      return this.requestIsPermanentlyClosedField(true);
    }
    public APIRequestGetLikes requestIsPermanentlyClosedField (boolean value) {
      this.requestField("is_permanently_closed", value);
      return this;
    }
    public APIRequestGetLikes requestIsPublishedField () {
      return this.requestIsPublishedField(true);
    }
    public APIRequestGetLikes requestIsPublishedField (boolean value) {
      this.requestField("is_published", value);
      return this;
    }
    public APIRequestGetLikes requestIsUnclaimedField () {
      return this.requestIsUnclaimedField(true);
    }
    public APIRequestGetLikes requestIsUnclaimedField (boolean value) {
      this.requestField("is_unclaimed", value);
      return this;
    }
    public APIRequestGetLikes requestIsVerifiedField () {
      return this.requestIsVerifiedField(true);
    }
    public APIRequestGetLikes requestIsVerifiedField (boolean value) {
      this.requestField("is_verified", value);
      return this;
    }
    public APIRequestGetLikes requestIsWebhooksSubscribedField () {
      return this.requestIsWebhooksSubscribedField(true);
    }
    public APIRequestGetLikes requestIsWebhooksSubscribedField (boolean value) {
      this.requestField("is_webhooks_subscribed", value);
      return this;
    }
    public APIRequestGetLikes requestKeywordsField () {
      return this.requestKeywordsField(true);
    }
    public APIRequestGetLikes requestKeywordsField (boolean value) {
      this.requestField("keywords", value);
      return this;
    }
    public APIRequestGetLikes requestLeadgenFormPreviewDetailsField () {
      return this.requestLeadgenFormPreviewDetailsField(true);
    }
    public APIRequestGetLikes requestLeadgenFormPreviewDetailsField (boolean value) {
      this.requestField("leadgen_form_preview_details", value);
      return this;
    }
    public APIRequestGetLikes requestLeadgenHasCrmIntegrationField () {
      return this.requestLeadgenHasCrmIntegrationField(true);
    }
    public APIRequestGetLikes requestLeadgenHasCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_crm_integration", value);
      return this;
    }
    public APIRequestGetLikes requestLeadgenHasFatPingCrmIntegrationField () {
      return this.requestLeadgenHasFatPingCrmIntegrationField(true);
    }
    public APIRequestGetLikes requestLeadgenHasFatPingCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_fat_ping_crm_integration", value);
      return this;
    }
    public APIRequestGetLikes requestLeadgenTosAcceptanceTimeField () {
      return this.requestLeadgenTosAcceptanceTimeField(true);
    }
    public APIRequestGetLikes requestLeadgenTosAcceptanceTimeField (boolean value) {
      this.requestField("leadgen_tos_acceptance_time", value);
      return this;
    }
    public APIRequestGetLikes requestLeadgenTosAcceptedField () {
      return this.requestLeadgenTosAcceptedField(true);
    }
    public APIRequestGetLikes requestLeadgenTosAcceptedField (boolean value) {
      this.requestField("leadgen_tos_accepted", value);
      return this;
    }
    public APIRequestGetLikes requestLeadgenTosAcceptingUserField () {
      return this.requestLeadgenTosAcceptingUserField(true);
    }
    public APIRequestGetLikes requestLeadgenTosAcceptingUserField (boolean value) {
      this.requestField("leadgen_tos_accepting_user", value);
      return this;
    }
    public APIRequestGetLikes requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetLikes requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetLikes requestLocationField () {
      return this.requestLocationField(true);
    }
    public APIRequestGetLikes requestLocationField (boolean value) {
      this.requestField("location", value);
      return this;
    }
    public APIRequestGetLikes requestMembersField () {
      return this.requestMembersField(true);
    }
    public APIRequestGetLikes requestMembersField (boolean value) {
      this.requestField("members", value);
      return this;
    }
    public APIRequestGetLikes requestMerchantIdField () {
      return this.requestMerchantIdField(true);
    }
    public APIRequestGetLikes requestMerchantIdField (boolean value) {
      this.requestField("merchant_id", value);
      return this;
    }
    public APIRequestGetLikes requestMerchantReviewStatusField () {
      return this.requestMerchantReviewStatusField(true);
    }
    public APIRequestGetLikes requestMerchantReviewStatusField (boolean value) {
      this.requestField("merchant_review_status", value);
      return this;
    }
    public APIRequestGetLikes requestMessengerAdsDefaultIcebreakersField () {
      return this.requestMessengerAdsDefaultIcebreakersField(true);
    }
    public APIRequestGetLikes requestMessengerAdsDefaultIcebreakersField (boolean value) {
      this.requestField("messenger_ads_default_icebreakers", value);
      return this;
    }
    public APIRequestGetLikes requestMessengerAdsDefaultPageWelcomeMessageField () {
      return this.requestMessengerAdsDefaultPageWelcomeMessageField(true);
    }
    public APIRequestGetLikes requestMessengerAdsDefaultPageWelcomeMessageField (boolean value) {
      this.requestField("messenger_ads_default_page_welcome_message", value);
      return this;
    }
    public APIRequestGetLikes requestMessengerAdsDefaultQuickRepliesField () {
      return this.requestMessengerAdsDefaultQuickRepliesField(true);
    }
    public APIRequestGetLikes requestMessengerAdsDefaultQuickRepliesField (boolean value) {
      this.requestField("messenger_ads_default_quick_replies", value);
      return this;
    }
    public APIRequestGetLikes requestMessengerAdsQuickRepliesTypeField () {
      return this.requestMessengerAdsQuickRepliesTypeField(true);
    }
    public APIRequestGetLikes requestMessengerAdsQuickRepliesTypeField (boolean value) {
      this.requestField("messenger_ads_quick_replies_type", value);
      return this;
    }
    public APIRequestGetLikes requestMissionField () {
      return this.requestMissionField(true);
    }
    public APIRequestGetLikes requestMissionField (boolean value) {
      this.requestField("mission", value);
      return this;
    }
    public APIRequestGetLikes requestMpgField () {
      return this.requestMpgField(true);
    }
    public APIRequestGetLikes requestMpgField (boolean value) {
      this.requestField("mpg", value);
      return this;
    }
    public APIRequestGetLikes requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetLikes requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetLikes requestNameWithLocationDescriptorField () {
      return this.requestNameWithLocationDescriptorField(true);
    }
    public APIRequestGetLikes requestNameWithLocationDescriptorField (boolean value) {
      this.requestField("name_with_location_descriptor", value);
      return this;
    }
    public APIRequestGetLikes requestNetworkField () {
      return this.requestNetworkField(true);
    }
    public APIRequestGetLikes requestNetworkField (boolean value) {
      this.requestField("network", value);
      return this;
    }
    public APIRequestGetLikes requestNewLikeCountField () {
      return this.requestNewLikeCountField(true);
    }
    public APIRequestGetLikes requestNewLikeCountField (boolean value) {
      this.requestField("new_like_count", value);
      return this;
    }
    public APIRequestGetLikes requestOfferEligibleField () {
      return this.requestOfferEligibleField(true);
    }
    public APIRequestGetLikes requestOfferEligibleField (boolean value) {
      this.requestField("offer_eligible", value);
      return this;
    }
    public APIRequestGetLikes requestOverallStarRatingField () {
      return this.requestOverallStarRatingField(true);
    }
    public APIRequestGetLikes requestOverallStarRatingField (boolean value) {
      this.requestField("overall_star_rating", value);
      return this;
    }
    public APIRequestGetLikes requestPageAboutStoryField () {
      return this.requestPageAboutStoryField(true);
    }
    public APIRequestGetLikes requestPageAboutStoryField (boolean value) {
      this.requestField("page_about_story", value);
      return this;
    }
    public APIRequestGetLikes requestPageTokenField () {
      return this.requestPageTokenField(true);
    }
    public APIRequestGetLikes requestPageTokenField (boolean value) {
      this.requestField("page_token", value);
      return this;
    }
    public APIRequestGetLikes requestParentPageField () {
      return this.requestParentPageField(true);
    }
    public APIRequestGetLikes requestParentPageField (boolean value) {
      this.requestField("parent_page", value);
      return this;
    }
    public APIRequestGetLikes requestParkingField () {
      return this.requestParkingField(true);
    }
    public APIRequestGetLikes requestParkingField (boolean value) {
      this.requestField("parking", value);
      return this;
    }
    public APIRequestGetLikes requestPaymentOptionsField () {
      return this.requestPaymentOptionsField(true);
    }
    public APIRequestGetLikes requestPaymentOptionsField (boolean value) {
      this.requestField("payment_options", value);
      return this;
    }
    public APIRequestGetLikes requestPersonalInfoField () {
      return this.requestPersonalInfoField(true);
    }
    public APIRequestGetLikes requestPersonalInfoField (boolean value) {
      this.requestField("personal_info", value);
      return this;
    }
    public APIRequestGetLikes requestPersonalInterestsField () {
      return this.requestPersonalInterestsField(true);
    }
    public APIRequestGetLikes requestPersonalInterestsField (boolean value) {
      this.requestField("personal_interests", value);
      return this;
    }
    public APIRequestGetLikes requestPharmaSafetyInfoField () {
      return this.requestPharmaSafetyInfoField(true);
    }
    public APIRequestGetLikes requestPharmaSafetyInfoField (boolean value) {
      this.requestField("pharma_safety_info", value);
      return this;
    }
    public APIRequestGetLikes requestPhoneField () {
      return this.requestPhoneField(true);
    }
    public APIRequestGetLikes requestPhoneField (boolean value) {
      this.requestField("phone", value);
      return this;
    }
    public APIRequestGetLikes requestPlaceTypeField () {
      return this.requestPlaceTypeField(true);
    }
    public APIRequestGetLikes requestPlaceTypeField (boolean value) {
      this.requestField("place_type", value);
      return this;
    }
    public APIRequestGetLikes requestPlotOutlineField () {
      return this.requestPlotOutlineField(true);
    }
    public APIRequestGetLikes requestPlotOutlineField (boolean value) {
      this.requestField("plot_outline", value);
      return this;
    }
    public APIRequestGetLikes requestPreferredAudienceField () {
      return this.requestPreferredAudienceField(true);
    }
    public APIRequestGetLikes requestPreferredAudienceField (boolean value) {
      this.requestField("preferred_audience", value);
      return this;
    }
    public APIRequestGetLikes requestPressContactField () {
      return this.requestPressContactField(true);
    }
    public APIRequestGetLikes requestPressContactField (boolean value) {
      this.requestField("press_contact", value);
      return this;
    }
    public APIRequestGetLikes requestPriceRangeField () {
      return this.requestPriceRangeField(true);
    }
    public APIRequestGetLikes requestPriceRangeField (boolean value) {
      this.requestField("price_range", value);
      return this;
    }
    public APIRequestGetLikes requestPrivacyInfoUrlField () {
      return this.requestPrivacyInfoUrlField(true);
    }
    public APIRequestGetLikes requestPrivacyInfoUrlField (boolean value) {
      this.requestField("privacy_info_url", value);
      return this;
    }
    public APIRequestGetLikes requestProducedByField () {
      return this.requestProducedByField(true);
    }
    public APIRequestGetLikes requestProducedByField (boolean value) {
      this.requestField("produced_by", value);
      return this;
    }
    public APIRequestGetLikes requestProductsField () {
      return this.requestProductsField(true);
    }
    public APIRequestGetLikes requestProductsField (boolean value) {
      this.requestField("products", value);
      return this;
    }
    public APIRequestGetLikes requestPromotionEligibleField () {
      return this.requestPromotionEligibleField(true);
    }
    public APIRequestGetLikes requestPromotionEligibleField (boolean value) {
      this.requestField("promotion_eligible", value);
      return this;
    }
    public APIRequestGetLikes requestPromotionIneligibleReasonField () {
      return this.requestPromotionIneligibleReasonField(true);
    }
    public APIRequestGetLikes requestPromotionIneligibleReasonField (boolean value) {
      this.requestField("promotion_ineligible_reason", value);
      return this;
    }
    public APIRequestGetLikes requestPublicTransitField () {
      return this.requestPublicTransitField(true);
    }
    public APIRequestGetLikes requestPublicTransitField (boolean value) {
      this.requestField("public_transit", value);
      return this;
    }
    public APIRequestGetLikes requestRatingCountField () {
      return this.requestRatingCountField(true);
    }
    public APIRequestGetLikes requestRatingCountField (boolean value) {
      this.requestField("rating_count", value);
      return this;
    }
    public APIRequestGetLikes requestRecipientField () {
      return this.requestRecipientField(true);
    }
    public APIRequestGetLikes requestRecipientField (boolean value) {
      this.requestField("recipient", value);
      return this;
    }
    public APIRequestGetLikes requestRecordLabelField () {
      return this.requestRecordLabelField(true);
    }
    public APIRequestGetLikes requestRecordLabelField (boolean value) {
      this.requestField("record_label", value);
      return this;
    }
    public APIRequestGetLikes requestReleaseDateField () {
      return this.requestReleaseDateField(true);
    }
    public APIRequestGetLikes requestReleaseDateField (boolean value) {
      this.requestField("release_date", value);
      return this;
    }
    public APIRequestGetLikes requestRestaurantServicesField () {
      return this.requestRestaurantServicesField(true);
    }
    public APIRequestGetLikes requestRestaurantServicesField (boolean value) {
      this.requestField("restaurant_services", value);
      return this;
    }
    public APIRequestGetLikes requestRestaurantSpecialtiesField () {
      return this.requestRestaurantSpecialtiesField(true);
    }
    public APIRequestGetLikes requestRestaurantSpecialtiesField (boolean value) {
      this.requestField("restaurant_specialties", value);
      return this;
    }
    public APIRequestGetLikes requestScheduleField () {
      return this.requestScheduleField(true);
    }
    public APIRequestGetLikes requestScheduleField (boolean value) {
      this.requestField("schedule", value);
      return this;
    }
    public APIRequestGetLikes requestScreenplayByField () {
      return this.requestScreenplayByField(true);
    }
    public APIRequestGetLikes requestScreenplayByField (boolean value) {
      this.requestField("screenplay_by", value);
      return this;
    }
    public APIRequestGetLikes requestSeasonField () {
      return this.requestSeasonField(true);
    }
    public APIRequestGetLikes requestSeasonField (boolean value) {
      this.requestField("season", value);
      return this;
    }
    public APIRequestGetLikes requestSingleLineAddressField () {
      return this.requestSingleLineAddressField(true);
    }
    public APIRequestGetLikes requestSingleLineAddressField (boolean value) {
      this.requestField("single_line_address", value);
      return this;
    }
    public APIRequestGetLikes requestStarringField () {
      return this.requestStarringField(true);
    }
    public APIRequestGetLikes requestStarringField (boolean value) {
      this.requestField("starring", value);
      return this;
    }
    public APIRequestGetLikes requestStartInfoField () {
      return this.requestStartInfoField(true);
    }
    public APIRequestGetLikes requestStartInfoField (boolean value) {
      this.requestField("start_info", value);
      return this;
    }
    public APIRequestGetLikes requestStoreCodeField () {
      return this.requestStoreCodeField(true);
    }
    public APIRequestGetLikes requestStoreCodeField (boolean value) {
      this.requestField("store_code", value);
      return this;
    }
    public APIRequestGetLikes requestStoreLocationDescriptorField () {
      return this.requestStoreLocationDescriptorField(true);
    }
    public APIRequestGetLikes requestStoreLocationDescriptorField (boolean value) {
      this.requestField("store_location_descriptor", value);
      return this;
    }
    public APIRequestGetLikes requestStoreNumberField () {
      return this.requestStoreNumberField(true);
    }
    public APIRequestGetLikes requestStoreNumberField (boolean value) {
      this.requestField("store_number", value);
      return this;
    }
    public APIRequestGetLikes requestStudioField () {
      return this.requestStudioField(true);
    }
    public APIRequestGetLikes requestStudioField (boolean value) {
      this.requestField("studio", value);
      return this;
    }
    public APIRequestGetLikes requestSupportsInstantArticlesField () {
      return this.requestSupportsInstantArticlesField(true);
    }
    public APIRequestGetLikes requestSupportsInstantArticlesField (boolean value) {
      this.requestField("supports_instant_articles", value);
      return this;
    }
    public APIRequestGetLikes requestTalkingAboutCountField () {
      return this.requestTalkingAboutCountField(true);
    }
    public APIRequestGetLikes requestTalkingAboutCountField (boolean value) {
      this.requestField("talking_about_count", value);
      return this;
    }
    public APIRequestGetLikes requestUnreadMessageCountField () {
      return this.requestUnreadMessageCountField(true);
    }
    public APIRequestGetLikes requestUnreadMessageCountField (boolean value) {
      this.requestField("unread_message_count", value);
      return this;
    }
    public APIRequestGetLikes requestUnreadNotifCountField () {
      return this.requestUnreadNotifCountField(true);
    }
    public APIRequestGetLikes requestUnreadNotifCountField (boolean value) {
      this.requestField("unread_notif_count", value);
      return this;
    }
    public APIRequestGetLikes requestUnseenMessageCountField () {
      return this.requestUnseenMessageCountField(true);
    }
    public APIRequestGetLikes requestUnseenMessageCountField (boolean value) {
      this.requestField("unseen_message_count", value);
      return this;
    }
    public APIRequestGetLikes requestUsernameField () {
      return this.requestUsernameField(true);
    }
    public APIRequestGetLikes requestUsernameField (boolean value) {
      this.requestField("username", value);
      return this;
    }
    public APIRequestGetLikes requestVerificationStatusField () {
      return this.requestVerificationStatusField(true);
    }
    public APIRequestGetLikes requestVerificationStatusField (boolean value) {
      this.requestField("verification_status", value);
      return this;
    }
    public APIRequestGetLikes requestVoipInfoField () {
      return this.requestVoipInfoField(true);
    }
    public APIRequestGetLikes requestVoipInfoField (boolean value) {
      this.requestField("voip_info", value);
      return this;
    }
    public APIRequestGetLikes requestWebsiteField () {
      return this.requestWebsiteField(true);
    }
    public APIRequestGetLikes requestWebsiteField (boolean value) {
      this.requestField("website", value);
      return this;
    }
    public APIRequestGetLikes requestWereHereCountField () {
      return this.requestWereHereCountField(true);
    }
    public APIRequestGetLikes requestWereHereCountField (boolean value) {
      this.requestField("were_here_count", value);
      return this;
    }
    public APIRequestGetLikes requestWhatsappNumberField () {
      return this.requestWhatsappNumberField(true);
    }
    public APIRequestGetLikes requestWhatsappNumberField (boolean value) {
      this.requestField("whatsapp_number", value);
      return this;
    }
    public APIRequestGetLikes requestWrittenByField () {
      return this.requestWrittenByField(true);
    }
    public APIRequestGetLikes requestWrittenByField (boolean value) {
      this.requestField("written_by", value);
      return this;
    }
  }

  public static class APIRequestGetLiveEncoders extends APIRequest<LiveEncoder> {

    APINodeList<LiveEncoder> lastResponse = null;
    @Override
    public APINodeList<LiveEncoder> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "brand",
      "creation_time",
      "current_broadcast",
      "current_input_stream",
      "device_id",
      "id",
      "last_heartbeat_time",
      "model",
      "name",
      "status",
      "version",
    };

    @Override
    public APINodeList<LiveEncoder> parseResponse(String response, String header) throws APIException {
      return LiveEncoder.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<LiveEncoder> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<LiveEncoder> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<LiveEncoder>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<LiveEncoder>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<LiveEncoder>>() {
           public APINodeList<LiveEncoder> apply(ResponseWrapper result) {
             try {
               return APIRequestGetLiveEncoders.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetLiveEncoders(String nodeId, APIContext context) {
      super(context, nodeId, "/live_encoders", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetLiveEncoders setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetLiveEncoders setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetLiveEncoders requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetLiveEncoders requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetLiveEncoders requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetLiveEncoders requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetLiveEncoders requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetLiveEncoders requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetLiveEncoders requestBrandField () {
      return this.requestBrandField(true);
    }
    public APIRequestGetLiveEncoders requestBrandField (boolean value) {
      this.requestField("brand", value);
      return this;
    }
    public APIRequestGetLiveEncoders requestCreationTimeField () {
      return this.requestCreationTimeField(true);
    }
    public APIRequestGetLiveEncoders requestCreationTimeField (boolean value) {
      this.requestField("creation_time", value);
      return this;
    }
    public APIRequestGetLiveEncoders requestCurrentBroadcastField () {
      return this.requestCurrentBroadcastField(true);
    }
    public APIRequestGetLiveEncoders requestCurrentBroadcastField (boolean value) {
      this.requestField("current_broadcast", value);
      return this;
    }
    public APIRequestGetLiveEncoders requestCurrentInputStreamField () {
      return this.requestCurrentInputStreamField(true);
    }
    public APIRequestGetLiveEncoders requestCurrentInputStreamField (boolean value) {
      this.requestField("current_input_stream", value);
      return this;
    }
    public APIRequestGetLiveEncoders requestDeviceIdField () {
      return this.requestDeviceIdField(true);
    }
    public APIRequestGetLiveEncoders requestDeviceIdField (boolean value) {
      this.requestField("device_id", value);
      return this;
    }
    public APIRequestGetLiveEncoders requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetLiveEncoders requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetLiveEncoders requestLastHeartbeatTimeField () {
      return this.requestLastHeartbeatTimeField(true);
    }
    public APIRequestGetLiveEncoders requestLastHeartbeatTimeField (boolean value) {
      this.requestField("last_heartbeat_time", value);
      return this;
    }
    public APIRequestGetLiveEncoders requestModelField () {
      return this.requestModelField(true);
    }
    public APIRequestGetLiveEncoders requestModelField (boolean value) {
      this.requestField("model", value);
      return this;
    }
    public APIRequestGetLiveEncoders requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetLiveEncoders requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetLiveEncoders requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetLiveEncoders requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetLiveEncoders requestVersionField () {
      return this.requestVersionField(true);
    }
    public APIRequestGetLiveEncoders requestVersionField (boolean value) {
      this.requestField("version", value);
      return this;
    }
  }

  public static class APIRequestCreateLiveEncoder extends APIRequest<LiveEncoder> {

    LiveEncoder lastResponse = null;
    @Override
    public LiveEncoder getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "brand",
      "device_id",
      "model",
      "name",
      "version",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public LiveEncoder parseResponse(String response, String header) throws APIException {
      return LiveEncoder.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public LiveEncoder execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public LiveEncoder execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<LiveEncoder> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<LiveEncoder> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, LiveEncoder>() {
           public LiveEncoder apply(ResponseWrapper result) {
             try {
               return APIRequestCreateLiveEncoder.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateLiveEncoder(String nodeId, APIContext context) {
      super(context, nodeId, "/live_encoders", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateLiveEncoder setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateLiveEncoder setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateLiveEncoder setBrand (String brand) {
      this.setParam("brand", brand);
      return this;
    }

    public APIRequestCreateLiveEncoder setDeviceId (String deviceId) {
      this.setParam("device_id", deviceId);
      return this;
    }

    public APIRequestCreateLiveEncoder setModel (String model) {
      this.setParam("model", model);
      return this;
    }

    public APIRequestCreateLiveEncoder setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreateLiveEncoder setVersion (String version) {
      this.setParam("version", version);
      return this;
    }

    public APIRequestCreateLiveEncoder requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateLiveEncoder requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateLiveEncoder requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateLiveEncoder requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateLiveEncoder requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateLiveEncoder requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetLiveVideos extends APIRequest<LiveVideo> {

    APINodeList<LiveVideo> lastResponse = null;
    @Override
    public APINodeList<LiveVideo> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "broadcast_status",
      "source",
    };

    public static final String[] FIELDS = {
      "ad_break_config",
      "ad_break_failure_reason",
      "broadcast_start_time",
      "copyright",
      "creation_time",
      "dash_ingest_url",
      "dash_preview_url",
      "description",
      "embed_html",
      "from",
      "id",
      "ingest_streams",
      "is_manual_mode",
      "is_reference_only",
      "live_encoders",
      "live_views",
      "permalink_url",
      "planned_start_time",
      "seconds_left",
      "secure_stream_url",
      "status",
      "stream_url",
      "targeting",
      "title",
      "total_views",
      "video",
    };

    @Override
    public APINodeList<LiveVideo> parseResponse(String response, String header) throws APIException {
      return LiveVideo.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<LiveVideo> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<LiveVideo> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<LiveVideo>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<LiveVideo>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<LiveVideo>>() {
           public APINodeList<LiveVideo> apply(ResponseWrapper result) {
             try {
               return APIRequestGetLiveVideos.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetLiveVideos(String nodeId, APIContext context) {
      super(context, nodeId, "/live_videos", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetLiveVideos setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetLiveVideos setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetLiveVideos setBroadcastStatus (List<LiveVideo.EnumBroadcastStatus> broadcastStatus) {
      this.setParam("broadcast_status", broadcastStatus);
      return this;
    }
    public APIRequestGetLiveVideos setBroadcastStatus (String broadcastStatus) {
      this.setParam("broadcast_status", broadcastStatus);
      return this;
    }

    public APIRequestGetLiveVideos setSource (LiveVideo.EnumSource source) {
      this.setParam("source", source);
      return this;
    }
    public APIRequestGetLiveVideos setSource (String source) {
      this.setParam("source", source);
      return this;
    }

    public APIRequestGetLiveVideos requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetLiveVideos requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetLiveVideos requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetLiveVideos requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetLiveVideos requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetLiveVideos requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetLiveVideos requestAdBreakConfigField () {
      return this.requestAdBreakConfigField(true);
    }
    public APIRequestGetLiveVideos requestAdBreakConfigField (boolean value) {
      this.requestField("ad_break_config", value);
      return this;
    }
    public APIRequestGetLiveVideos requestAdBreakFailureReasonField () {
      return this.requestAdBreakFailureReasonField(true);
    }
    public APIRequestGetLiveVideos requestAdBreakFailureReasonField (boolean value) {
      this.requestField("ad_break_failure_reason", value);
      return this;
    }
    public APIRequestGetLiveVideos requestBroadcastStartTimeField () {
      return this.requestBroadcastStartTimeField(true);
    }
    public APIRequestGetLiveVideos requestBroadcastStartTimeField (boolean value) {
      this.requestField("broadcast_start_time", value);
      return this;
    }
    public APIRequestGetLiveVideos requestCopyrightField () {
      return this.requestCopyrightField(true);
    }
    public APIRequestGetLiveVideos requestCopyrightField (boolean value) {
      this.requestField("copyright", value);
      return this;
    }
    public APIRequestGetLiveVideos requestCreationTimeField () {
      return this.requestCreationTimeField(true);
    }
    public APIRequestGetLiveVideos requestCreationTimeField (boolean value) {
      this.requestField("creation_time", value);
      return this;
    }
    public APIRequestGetLiveVideos requestDashIngestUrlField () {
      return this.requestDashIngestUrlField(true);
    }
    public APIRequestGetLiveVideos requestDashIngestUrlField (boolean value) {
      this.requestField("dash_ingest_url", value);
      return this;
    }
    public APIRequestGetLiveVideos requestDashPreviewUrlField () {
      return this.requestDashPreviewUrlField(true);
    }
    public APIRequestGetLiveVideos requestDashPreviewUrlField (boolean value) {
      this.requestField("dash_preview_url", value);
      return this;
    }
    public APIRequestGetLiveVideos requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetLiveVideos requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetLiveVideos requestEmbedHtmlField () {
      return this.requestEmbedHtmlField(true);
    }
    public APIRequestGetLiveVideos requestEmbedHtmlField (boolean value) {
      this.requestField("embed_html", value);
      return this;
    }
    public APIRequestGetLiveVideos requestFromField () {
      return this.requestFromField(true);
    }
    public APIRequestGetLiveVideos requestFromField (boolean value) {
      this.requestField("from", value);
      return this;
    }
    public APIRequestGetLiveVideos requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetLiveVideos requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetLiveVideos requestIngestStreamsField () {
      return this.requestIngestStreamsField(true);
    }
    public APIRequestGetLiveVideos requestIngestStreamsField (boolean value) {
      this.requestField("ingest_streams", value);
      return this;
    }
    public APIRequestGetLiveVideos requestIsManualModeField () {
      return this.requestIsManualModeField(true);
    }
    public APIRequestGetLiveVideos requestIsManualModeField (boolean value) {
      this.requestField("is_manual_mode", value);
      return this;
    }
    public APIRequestGetLiveVideos requestIsReferenceOnlyField () {
      return this.requestIsReferenceOnlyField(true);
    }
    public APIRequestGetLiveVideos requestIsReferenceOnlyField (boolean value) {
      this.requestField("is_reference_only", value);
      return this;
    }
    public APIRequestGetLiveVideos requestLiveEncodersField () {
      return this.requestLiveEncodersField(true);
    }
    public APIRequestGetLiveVideos requestLiveEncodersField (boolean value) {
      this.requestField("live_encoders", value);
      return this;
    }
    public APIRequestGetLiveVideos requestLiveViewsField () {
      return this.requestLiveViewsField(true);
    }
    public APIRequestGetLiveVideos requestLiveViewsField (boolean value) {
      this.requestField("live_views", value);
      return this;
    }
    public APIRequestGetLiveVideos requestPermalinkUrlField () {
      return this.requestPermalinkUrlField(true);
    }
    public APIRequestGetLiveVideos requestPermalinkUrlField (boolean value) {
      this.requestField("permalink_url", value);
      return this;
    }
    public APIRequestGetLiveVideos requestPlannedStartTimeField () {
      return this.requestPlannedStartTimeField(true);
    }
    public APIRequestGetLiveVideos requestPlannedStartTimeField (boolean value) {
      this.requestField("planned_start_time", value);
      return this;
    }
    public APIRequestGetLiveVideos requestSecondsLeftField () {
      return this.requestSecondsLeftField(true);
    }
    public APIRequestGetLiveVideos requestSecondsLeftField (boolean value) {
      this.requestField("seconds_left", value);
      return this;
    }
    public APIRequestGetLiveVideos requestSecureStreamUrlField () {
      return this.requestSecureStreamUrlField(true);
    }
    public APIRequestGetLiveVideos requestSecureStreamUrlField (boolean value) {
      this.requestField("secure_stream_url", value);
      return this;
    }
    public APIRequestGetLiveVideos requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetLiveVideos requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetLiveVideos requestStreamUrlField () {
      return this.requestStreamUrlField(true);
    }
    public APIRequestGetLiveVideos requestStreamUrlField (boolean value) {
      this.requestField("stream_url", value);
      return this;
    }
    public APIRequestGetLiveVideos requestTargetingField () {
      return this.requestTargetingField(true);
    }
    public APIRequestGetLiveVideos requestTargetingField (boolean value) {
      this.requestField("targeting", value);
      return this;
    }
    public APIRequestGetLiveVideos requestTitleField () {
      return this.requestTitleField(true);
    }
    public APIRequestGetLiveVideos requestTitleField (boolean value) {
      this.requestField("title", value);
      return this;
    }
    public APIRequestGetLiveVideos requestTotalViewsField () {
      return this.requestTotalViewsField(true);
    }
    public APIRequestGetLiveVideos requestTotalViewsField (boolean value) {
      this.requestField("total_views", value);
      return this;
    }
    public APIRequestGetLiveVideos requestVideoField () {
      return this.requestVideoField(true);
    }
    public APIRequestGetLiveVideos requestVideoField (boolean value) {
      this.requestField("video", value);
      return this;
    }
  }

  public static class APIRequestCreateLiveVideo extends APIRequest<LiveVideo> {

    LiveVideo lastResponse = null;
    @Override
    public LiveVideo getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "attribution_app_id",
      "content_tags",
      "description",
      "encoding_settings",
      "fisheye_video_cropped",
      "front_z_rotation",
      "is_audio_only",
      "is_spherical",
      "live_encoders",
      "original_fov",
      "planned_start_time",
      "privacy",
      "projection",
      "published",
      "save_vod",
      "schedule_custom_profile_image",
      "spatial_audio_format",
      "status",
      "stereoscopic_mode",
      "stop_on_delete_stream",
      "stream_type",
      "title",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public LiveVideo parseResponse(String response, String header) throws APIException {
      return LiveVideo.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public LiveVideo execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public LiveVideo execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<LiveVideo> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<LiveVideo> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, LiveVideo>() {
           public LiveVideo apply(ResponseWrapper result) {
             try {
               return APIRequestCreateLiveVideo.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateLiveVideo(String nodeId, APIContext context) {
      super(context, nodeId, "/live_videos", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateLiveVideo setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateLiveVideo setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateLiveVideo setAttributionAppId (String attributionAppId) {
      this.setParam("attribution_app_id", attributionAppId);
      return this;
    }

    public APIRequestCreateLiveVideo setContentTags (List<String> contentTags) {
      this.setParam("content_tags", contentTags);
      return this;
    }
    public APIRequestCreateLiveVideo setContentTags (String contentTags) {
      this.setParam("content_tags", contentTags);
      return this;
    }

    public APIRequestCreateLiveVideo setDescription (String description) {
      this.setParam("description", description);
      return this;
    }

    public APIRequestCreateLiveVideo setEncodingSettings (String encodingSettings) {
      this.setParam("encoding_settings", encodingSettings);
      return this;
    }

    public APIRequestCreateLiveVideo setFisheyeVideoCropped (Boolean fisheyeVideoCropped) {
      this.setParam("fisheye_video_cropped", fisheyeVideoCropped);
      return this;
    }
    public APIRequestCreateLiveVideo setFisheyeVideoCropped (String fisheyeVideoCropped) {
      this.setParam("fisheye_video_cropped", fisheyeVideoCropped);
      return this;
    }

    public APIRequestCreateLiveVideo setFrontZRotation (Double frontZRotation) {
      this.setParam("front_z_rotation", frontZRotation);
      return this;
    }
    public APIRequestCreateLiveVideo setFrontZRotation (String frontZRotation) {
      this.setParam("front_z_rotation", frontZRotation);
      return this;
    }

    public APIRequestCreateLiveVideo setIsAudioOnly (Boolean isAudioOnly) {
      this.setParam("is_audio_only", isAudioOnly);
      return this;
    }
    public APIRequestCreateLiveVideo setIsAudioOnly (String isAudioOnly) {
      this.setParam("is_audio_only", isAudioOnly);
      return this;
    }

    public APIRequestCreateLiveVideo setIsSpherical (Boolean isSpherical) {
      this.setParam("is_spherical", isSpherical);
      return this;
    }
    public APIRequestCreateLiveVideo setIsSpherical (String isSpherical) {
      this.setParam("is_spherical", isSpherical);
      return this;
    }

    public APIRequestCreateLiveVideo setLiveEncoders (List<String> liveEncoders) {
      this.setParam("live_encoders", liveEncoders);
      return this;
    }
    public APIRequestCreateLiveVideo setLiveEncoders (String liveEncoders) {
      this.setParam("live_encoders", liveEncoders);
      return this;
    }

    public APIRequestCreateLiveVideo setOriginalFov (Long originalFov) {
      this.setParam("original_fov", originalFov);
      return this;
    }
    public APIRequestCreateLiveVideo setOriginalFov (String originalFov) {
      this.setParam("original_fov", originalFov);
      return this;
    }

    public APIRequestCreateLiveVideo setPlannedStartTime (Long plannedStartTime) {
      this.setParam("planned_start_time", plannedStartTime);
      return this;
    }
    public APIRequestCreateLiveVideo setPlannedStartTime (String plannedStartTime) {
      this.setParam("planned_start_time", plannedStartTime);
      return this;
    }

    public APIRequestCreateLiveVideo setPrivacy (String privacy) {
      this.setParam("privacy", privacy);
      return this;
    }

    public APIRequestCreateLiveVideo setProjection (LiveVideo.EnumProjection projection) {
      this.setParam("projection", projection);
      return this;
    }
    public APIRequestCreateLiveVideo setProjection (String projection) {
      this.setParam("projection", projection);
      return this;
    }

    public APIRequestCreateLiveVideo setPublished (Boolean published) {
      this.setParam("published", published);
      return this;
    }
    public APIRequestCreateLiveVideo setPublished (String published) {
      this.setParam("published", published);
      return this;
    }

    public APIRequestCreateLiveVideo setSaveVod (Boolean saveVod) {
      this.setParam("save_vod", saveVod);
      return this;
    }
    public APIRequestCreateLiveVideo setSaveVod (String saveVod) {
      this.setParam("save_vod", saveVod);
      return this;
    }

    public APIRequestCreateLiveVideo setScheduleCustomProfileImage (File scheduleCustomProfileImage) {
      this.setParam("schedule_custom_profile_image", scheduleCustomProfileImage);
      return this;
    }
    public APIRequestCreateLiveVideo setScheduleCustomProfileImage (String scheduleCustomProfileImage) {
      this.setParam("schedule_custom_profile_image", scheduleCustomProfileImage);
      return this;
    }

    public APIRequestCreateLiveVideo setSpatialAudioFormat (LiveVideo.EnumSpatialAudioFormat spatialAudioFormat) {
      this.setParam("spatial_audio_format", spatialAudioFormat);
      return this;
    }
    public APIRequestCreateLiveVideo setSpatialAudioFormat (String spatialAudioFormat) {
      this.setParam("spatial_audio_format", spatialAudioFormat);
      return this;
    }

    public APIRequestCreateLiveVideo setStatus (LiveVideo.EnumStatus status) {
      this.setParam("status", status);
      return this;
    }
    public APIRequestCreateLiveVideo setStatus (String status) {
      this.setParam("status", status);
      return this;
    }

    public APIRequestCreateLiveVideo setStereoscopicMode (LiveVideo.EnumStereoscopicMode stereoscopicMode) {
      this.setParam("stereoscopic_mode", stereoscopicMode);
      return this;
    }
    public APIRequestCreateLiveVideo setStereoscopicMode (String stereoscopicMode) {
      this.setParam("stereoscopic_mode", stereoscopicMode);
      return this;
    }

    public APIRequestCreateLiveVideo setStopOnDeleteStream (Boolean stopOnDeleteStream) {
      this.setParam("stop_on_delete_stream", stopOnDeleteStream);
      return this;
    }
    public APIRequestCreateLiveVideo setStopOnDeleteStream (String stopOnDeleteStream) {
      this.setParam("stop_on_delete_stream", stopOnDeleteStream);
      return this;
    }

    public APIRequestCreateLiveVideo setStreamType (LiveVideo.EnumStreamType streamType) {
      this.setParam("stream_type", streamType);
      return this;
    }
    public APIRequestCreateLiveVideo setStreamType (String streamType) {
      this.setParam("stream_type", streamType);
      return this;
    }

    public APIRequestCreateLiveVideo setTitle (String title) {
      this.setParam("title", title);
      return this;
    }

    public APIRequestCreateLiveVideo requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateLiveVideo requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateLiveVideo requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateLiveVideo requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateLiveVideo requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateLiveVideo requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateMfsAccountPinReset extends APIRequest<User> {

    User lastResponse = null;
    @Override
    public User getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "password_token",
      "provider_id",
      "resume_payload",
      "resume_type",
      "should_bypass_token_proxy",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public User parseResponse(String response, String header) throws APIException {
      return User.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public User execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public User execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<User> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<User> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, User>() {
           public User apply(ResponseWrapper result) {
             try {
               return APIRequestCreateMfsAccountPinReset.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateMfsAccountPinReset(String nodeId, APIContext context) {
      super(context, nodeId, "/mfs_account_pin_reset", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateMfsAccountPinReset setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateMfsAccountPinReset setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateMfsAccountPinReset setPasswordToken (String passwordToken) {
      this.setParam("password_token", passwordToken);
      return this;
    }

    public APIRequestCreateMfsAccountPinReset setProviderId (String providerId) {
      this.setParam("provider_id", providerId);
      return this;
    }

    public APIRequestCreateMfsAccountPinReset setResumePayload (String resumePayload) {
      this.setParam("resume_payload", resumePayload);
      return this;
    }

    public APIRequestCreateMfsAccountPinReset setResumeType (User.EnumResumeType resumeType) {
      this.setParam("resume_type", resumeType);
      return this;
    }
    public APIRequestCreateMfsAccountPinReset setResumeType (String resumeType) {
      this.setParam("resume_type", resumeType);
      return this;
    }

    public APIRequestCreateMfsAccountPinReset setShouldBypassTokenProxy (Boolean shouldBypassTokenProxy) {
      this.setParam("should_bypass_token_proxy", shouldBypassTokenProxy);
      return this;
    }
    public APIRequestCreateMfsAccountPinReset setShouldBypassTokenProxy (String shouldBypassTokenProxy) {
      this.setParam("should_bypass_token_proxy", shouldBypassTokenProxy);
      return this;
    }

    public APIRequestCreateMfsAccountPinReset requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateMfsAccountPinReset requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateMfsAccountPinReset requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateMfsAccountPinReset requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateMfsAccountPinReset requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateMfsAccountPinReset requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateMomentsLinkInviteConvert extends APIRequest<User> {

    User lastResponse = null;
    @Override
    public User getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "encoded_invite_id",
      "funnel_id",
      "invite_nonce",
      "invite_source",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public User parseResponse(String response, String header) throws APIException {
      return User.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public User execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public User execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<User> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<User> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, User>() {
           public User apply(ResponseWrapper result) {
             try {
               return APIRequestCreateMomentsLinkInviteConvert.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateMomentsLinkInviteConvert(String nodeId, APIContext context) {
      super(context, nodeId, "/moments_link_invite_convert", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateMomentsLinkInviteConvert setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateMomentsLinkInviteConvert setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateMomentsLinkInviteConvert setEncodedInviteId (String encodedInviteId) {
      this.setParam("encoded_invite_id", encodedInviteId);
      return this;
    }

    public APIRequestCreateMomentsLinkInviteConvert setFunnelId (String funnelId) {
      this.setParam("funnel_id", funnelId);
      return this;
    }

    public APIRequestCreateMomentsLinkInviteConvert setInviteNonce (String inviteNonce) {
      this.setParam("invite_nonce", inviteNonce);
      return this;
    }

    public APIRequestCreateMomentsLinkInviteConvert setInviteSource (String inviteSource) {
      this.setParam("invite_source", inviteSource);
      return this;
    }

    public APIRequestCreateMomentsLinkInviteConvert requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateMomentsLinkInviteConvert requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateMomentsLinkInviteConvert requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateMomentsLinkInviteConvert requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateMomentsLinkInviteConvert requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateMomentsLinkInviteConvert requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateMomentsUniversalLinkInvite extends APIRequest<User> {

    User lastResponse = null;
    @Override
    public User getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "invite_url",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public User parseResponse(String response, String header) throws APIException {
      return User.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public User execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public User execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<User> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<User> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, User>() {
           public User apply(ResponseWrapper result) {
             try {
               return APIRequestCreateMomentsUniversalLinkInvite.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateMomentsUniversalLinkInvite(String nodeId, APIContext context) {
      super(context, nodeId, "/moments_universal_link_invite", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateMomentsUniversalLinkInvite setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateMomentsUniversalLinkInvite setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateMomentsUniversalLinkInvite setInviteUrl (String inviteUrl) {
      this.setParam("invite_url", inviteUrl);
      return this;
    }

    public APIRequestCreateMomentsUniversalLinkInvite requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateMomentsUniversalLinkInvite requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateMomentsUniversalLinkInvite requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateMomentsUniversalLinkInvite requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateMomentsUniversalLinkInvite requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateMomentsUniversalLinkInvite requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetMovies extends APIRequest<Page> {

    APINodeList<Page> lastResponse = null;
    @Override
    public APINodeList<Page> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "target_id",
    };

    public static final String[] FIELDS = {
      "about",
      "access_token",
      "ad_campaign",
      "affiliation",
      "app_id",
      "app_links",
      "artists_we_like",
      "attire",
      "awards",
      "band_interests",
      "band_members",
      "best_page",
      "bio",
      "birthday",
      "booking_agent",
      "built",
      "business",
      "can_checkin",
      "can_post",
      "category",
      "category_list",
      "checkins",
      "company_overview",
      "connected_instagram_account",
      "contact_address",
      "copyright_attribution_insights",
      "copyright_whitelisted_ig_partners",
      "country_page_likes",
      "cover",
      "culinary_team",
      "current_location",
      "description",
      "description_html",
      "directed_by",
      "display_subtext",
      "displayed_message_response_time",
      "emails",
      "engagement",
      "fan_count",
      "featured_video",
      "features",
      "food_styles",
      "founded",
      "general_info",
      "general_manager",
      "genre",
      "global_brand_page_name",
      "global_brand_root_id",
      "has_added_app",
      "has_whatsapp_business_number",
      "has_whatsapp_number",
      "hometown",
      "hours",
      "id",
      "impressum",
      "influences",
      "instagram_business_account",
      "instant_articles_review_status",
      "is_always_open",
      "is_chain",
      "is_community_page",
      "is_eligible_for_branded_content",
      "is_messenger_bot_get_started_enabled",
      "is_messenger_platform_bot",
      "is_owned",
      "is_permanently_closed",
      "is_published",
      "is_unclaimed",
      "is_verified",
      "is_webhooks_subscribed",
      "keywords",
      "leadgen_form_preview_details",
      "leadgen_has_crm_integration",
      "leadgen_has_fat_ping_crm_integration",
      "leadgen_tos_acceptance_time",
      "leadgen_tos_accepted",
      "leadgen_tos_accepting_user",
      "link",
      "location",
      "members",
      "merchant_id",
      "merchant_review_status",
      "messenger_ads_default_icebreakers",
      "messenger_ads_default_page_welcome_message",
      "messenger_ads_default_quick_replies",
      "messenger_ads_quick_replies_type",
      "mission",
      "mpg",
      "name",
      "name_with_location_descriptor",
      "network",
      "new_like_count",
      "offer_eligible",
      "overall_star_rating",
      "page_about_story",
      "page_token",
      "parent_page",
      "parking",
      "payment_options",
      "personal_info",
      "personal_interests",
      "pharma_safety_info",
      "phone",
      "place_type",
      "plot_outline",
      "preferred_audience",
      "press_contact",
      "price_range",
      "privacy_info_url",
      "produced_by",
      "products",
      "promotion_eligible",
      "promotion_ineligible_reason",
      "public_transit",
      "rating_count",
      "recipient",
      "record_label",
      "release_date",
      "restaurant_services",
      "restaurant_specialties",
      "schedule",
      "screenplay_by",
      "season",
      "single_line_address",
      "starring",
      "start_info",
      "store_code",
      "store_location_descriptor",
      "store_number",
      "studio",
      "supports_instant_articles",
      "talking_about_count",
      "unread_message_count",
      "unread_notif_count",
      "unseen_message_count",
      "username",
      "verification_status",
      "voip_info",
      "website",
      "were_here_count",
      "whatsapp_number",
      "written_by",
    };

    @Override
    public APINodeList<Page> parseResponse(String response, String header) throws APIException {
      return Page.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Page> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Page> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Page>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Page>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Page>>() {
           public APINodeList<Page> apply(ResponseWrapper result) {
             try {
               return APIRequestGetMovies.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetMovies(String nodeId, APIContext context) {
      super(context, nodeId, "/movies", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetMovies setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetMovies setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetMovies setTargetId (String targetId) {
      this.setParam("target_id", targetId);
      return this;
    }

    public APIRequestGetMovies requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetMovies requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetMovies requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetMovies requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetMovies requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetMovies requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetMovies requestAboutField () {
      return this.requestAboutField(true);
    }
    public APIRequestGetMovies requestAboutField (boolean value) {
      this.requestField("about", value);
      return this;
    }
    public APIRequestGetMovies requestAccessTokenField () {
      return this.requestAccessTokenField(true);
    }
    public APIRequestGetMovies requestAccessTokenField (boolean value) {
      this.requestField("access_token", value);
      return this;
    }
    public APIRequestGetMovies requestAdCampaignField () {
      return this.requestAdCampaignField(true);
    }
    public APIRequestGetMovies requestAdCampaignField (boolean value) {
      this.requestField("ad_campaign", value);
      return this;
    }
    public APIRequestGetMovies requestAffiliationField () {
      return this.requestAffiliationField(true);
    }
    public APIRequestGetMovies requestAffiliationField (boolean value) {
      this.requestField("affiliation", value);
      return this;
    }
    public APIRequestGetMovies requestAppIdField () {
      return this.requestAppIdField(true);
    }
    public APIRequestGetMovies requestAppIdField (boolean value) {
      this.requestField("app_id", value);
      return this;
    }
    public APIRequestGetMovies requestAppLinksField () {
      return this.requestAppLinksField(true);
    }
    public APIRequestGetMovies requestAppLinksField (boolean value) {
      this.requestField("app_links", value);
      return this;
    }
    public APIRequestGetMovies requestArtistsWeLikeField () {
      return this.requestArtistsWeLikeField(true);
    }
    public APIRequestGetMovies requestArtistsWeLikeField (boolean value) {
      this.requestField("artists_we_like", value);
      return this;
    }
    public APIRequestGetMovies requestAttireField () {
      return this.requestAttireField(true);
    }
    public APIRequestGetMovies requestAttireField (boolean value) {
      this.requestField("attire", value);
      return this;
    }
    public APIRequestGetMovies requestAwardsField () {
      return this.requestAwardsField(true);
    }
    public APIRequestGetMovies requestAwardsField (boolean value) {
      this.requestField("awards", value);
      return this;
    }
    public APIRequestGetMovies requestBandInterestsField () {
      return this.requestBandInterestsField(true);
    }
    public APIRequestGetMovies requestBandInterestsField (boolean value) {
      this.requestField("band_interests", value);
      return this;
    }
    public APIRequestGetMovies requestBandMembersField () {
      return this.requestBandMembersField(true);
    }
    public APIRequestGetMovies requestBandMembersField (boolean value) {
      this.requestField("band_members", value);
      return this;
    }
    public APIRequestGetMovies requestBestPageField () {
      return this.requestBestPageField(true);
    }
    public APIRequestGetMovies requestBestPageField (boolean value) {
      this.requestField("best_page", value);
      return this;
    }
    public APIRequestGetMovies requestBioField () {
      return this.requestBioField(true);
    }
    public APIRequestGetMovies requestBioField (boolean value) {
      this.requestField("bio", value);
      return this;
    }
    public APIRequestGetMovies requestBirthdayField () {
      return this.requestBirthdayField(true);
    }
    public APIRequestGetMovies requestBirthdayField (boolean value) {
      this.requestField("birthday", value);
      return this;
    }
    public APIRequestGetMovies requestBookingAgentField () {
      return this.requestBookingAgentField(true);
    }
    public APIRequestGetMovies requestBookingAgentField (boolean value) {
      this.requestField("booking_agent", value);
      return this;
    }
    public APIRequestGetMovies requestBuiltField () {
      return this.requestBuiltField(true);
    }
    public APIRequestGetMovies requestBuiltField (boolean value) {
      this.requestField("built", value);
      return this;
    }
    public APIRequestGetMovies requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetMovies requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetMovies requestCanCheckinField () {
      return this.requestCanCheckinField(true);
    }
    public APIRequestGetMovies requestCanCheckinField (boolean value) {
      this.requestField("can_checkin", value);
      return this;
    }
    public APIRequestGetMovies requestCanPostField () {
      return this.requestCanPostField(true);
    }
    public APIRequestGetMovies requestCanPostField (boolean value) {
      this.requestField("can_post", value);
      return this;
    }
    public APIRequestGetMovies requestCategoryField () {
      return this.requestCategoryField(true);
    }
    public APIRequestGetMovies requestCategoryField (boolean value) {
      this.requestField("category", value);
      return this;
    }
    public APIRequestGetMovies requestCategoryListField () {
      return this.requestCategoryListField(true);
    }
    public APIRequestGetMovies requestCategoryListField (boolean value) {
      this.requestField("category_list", value);
      return this;
    }
    public APIRequestGetMovies requestCheckinsField () {
      return this.requestCheckinsField(true);
    }
    public APIRequestGetMovies requestCheckinsField (boolean value) {
      this.requestField("checkins", value);
      return this;
    }
    public APIRequestGetMovies requestCompanyOverviewField () {
      return this.requestCompanyOverviewField(true);
    }
    public APIRequestGetMovies requestCompanyOverviewField (boolean value) {
      this.requestField("company_overview", value);
      return this;
    }
    public APIRequestGetMovies requestConnectedInstagramAccountField () {
      return this.requestConnectedInstagramAccountField(true);
    }
    public APIRequestGetMovies requestConnectedInstagramAccountField (boolean value) {
      this.requestField("connected_instagram_account", value);
      return this;
    }
    public APIRequestGetMovies requestContactAddressField () {
      return this.requestContactAddressField(true);
    }
    public APIRequestGetMovies requestContactAddressField (boolean value) {
      this.requestField("contact_address", value);
      return this;
    }
    public APIRequestGetMovies requestCopyrightAttributionInsightsField () {
      return this.requestCopyrightAttributionInsightsField(true);
    }
    public APIRequestGetMovies requestCopyrightAttributionInsightsField (boolean value) {
      this.requestField("copyright_attribution_insights", value);
      return this;
    }
    public APIRequestGetMovies requestCopyrightWhitelistedIgPartnersField () {
      return this.requestCopyrightWhitelistedIgPartnersField(true);
    }
    public APIRequestGetMovies requestCopyrightWhitelistedIgPartnersField (boolean value) {
      this.requestField("copyright_whitelisted_ig_partners", value);
      return this;
    }
    public APIRequestGetMovies requestCountryPageLikesField () {
      return this.requestCountryPageLikesField(true);
    }
    public APIRequestGetMovies requestCountryPageLikesField (boolean value) {
      this.requestField("country_page_likes", value);
      return this;
    }
    public APIRequestGetMovies requestCoverField () {
      return this.requestCoverField(true);
    }
    public APIRequestGetMovies requestCoverField (boolean value) {
      this.requestField("cover", value);
      return this;
    }
    public APIRequestGetMovies requestCulinaryTeamField () {
      return this.requestCulinaryTeamField(true);
    }
    public APIRequestGetMovies requestCulinaryTeamField (boolean value) {
      this.requestField("culinary_team", value);
      return this;
    }
    public APIRequestGetMovies requestCurrentLocationField () {
      return this.requestCurrentLocationField(true);
    }
    public APIRequestGetMovies requestCurrentLocationField (boolean value) {
      this.requestField("current_location", value);
      return this;
    }
    public APIRequestGetMovies requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetMovies requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetMovies requestDescriptionHtmlField () {
      return this.requestDescriptionHtmlField(true);
    }
    public APIRequestGetMovies requestDescriptionHtmlField (boolean value) {
      this.requestField("description_html", value);
      return this;
    }
    public APIRequestGetMovies requestDirectedByField () {
      return this.requestDirectedByField(true);
    }
    public APIRequestGetMovies requestDirectedByField (boolean value) {
      this.requestField("directed_by", value);
      return this;
    }
    public APIRequestGetMovies requestDisplaySubtextField () {
      return this.requestDisplaySubtextField(true);
    }
    public APIRequestGetMovies requestDisplaySubtextField (boolean value) {
      this.requestField("display_subtext", value);
      return this;
    }
    public APIRequestGetMovies requestDisplayedMessageResponseTimeField () {
      return this.requestDisplayedMessageResponseTimeField(true);
    }
    public APIRequestGetMovies requestDisplayedMessageResponseTimeField (boolean value) {
      this.requestField("displayed_message_response_time", value);
      return this;
    }
    public APIRequestGetMovies requestEmailsField () {
      return this.requestEmailsField(true);
    }
    public APIRequestGetMovies requestEmailsField (boolean value) {
      this.requestField("emails", value);
      return this;
    }
    public APIRequestGetMovies requestEngagementField () {
      return this.requestEngagementField(true);
    }
    public APIRequestGetMovies requestEngagementField (boolean value) {
      this.requestField("engagement", value);
      return this;
    }
    public APIRequestGetMovies requestFanCountField () {
      return this.requestFanCountField(true);
    }
    public APIRequestGetMovies requestFanCountField (boolean value) {
      this.requestField("fan_count", value);
      return this;
    }
    public APIRequestGetMovies requestFeaturedVideoField () {
      return this.requestFeaturedVideoField(true);
    }
    public APIRequestGetMovies requestFeaturedVideoField (boolean value) {
      this.requestField("featured_video", value);
      return this;
    }
    public APIRequestGetMovies requestFeaturesField () {
      return this.requestFeaturesField(true);
    }
    public APIRequestGetMovies requestFeaturesField (boolean value) {
      this.requestField("features", value);
      return this;
    }
    public APIRequestGetMovies requestFoodStylesField () {
      return this.requestFoodStylesField(true);
    }
    public APIRequestGetMovies requestFoodStylesField (boolean value) {
      this.requestField("food_styles", value);
      return this;
    }
    public APIRequestGetMovies requestFoundedField () {
      return this.requestFoundedField(true);
    }
    public APIRequestGetMovies requestFoundedField (boolean value) {
      this.requestField("founded", value);
      return this;
    }
    public APIRequestGetMovies requestGeneralInfoField () {
      return this.requestGeneralInfoField(true);
    }
    public APIRequestGetMovies requestGeneralInfoField (boolean value) {
      this.requestField("general_info", value);
      return this;
    }
    public APIRequestGetMovies requestGeneralManagerField () {
      return this.requestGeneralManagerField(true);
    }
    public APIRequestGetMovies requestGeneralManagerField (boolean value) {
      this.requestField("general_manager", value);
      return this;
    }
    public APIRequestGetMovies requestGenreField () {
      return this.requestGenreField(true);
    }
    public APIRequestGetMovies requestGenreField (boolean value) {
      this.requestField("genre", value);
      return this;
    }
    public APIRequestGetMovies requestGlobalBrandPageNameField () {
      return this.requestGlobalBrandPageNameField(true);
    }
    public APIRequestGetMovies requestGlobalBrandPageNameField (boolean value) {
      this.requestField("global_brand_page_name", value);
      return this;
    }
    public APIRequestGetMovies requestGlobalBrandRootIdField () {
      return this.requestGlobalBrandRootIdField(true);
    }
    public APIRequestGetMovies requestGlobalBrandRootIdField (boolean value) {
      this.requestField("global_brand_root_id", value);
      return this;
    }
    public APIRequestGetMovies requestHasAddedAppField () {
      return this.requestHasAddedAppField(true);
    }
    public APIRequestGetMovies requestHasAddedAppField (boolean value) {
      this.requestField("has_added_app", value);
      return this;
    }
    public APIRequestGetMovies requestHasWhatsappBusinessNumberField () {
      return this.requestHasWhatsappBusinessNumberField(true);
    }
    public APIRequestGetMovies requestHasWhatsappBusinessNumberField (boolean value) {
      this.requestField("has_whatsapp_business_number", value);
      return this;
    }
    public APIRequestGetMovies requestHasWhatsappNumberField () {
      return this.requestHasWhatsappNumberField(true);
    }
    public APIRequestGetMovies requestHasWhatsappNumberField (boolean value) {
      this.requestField("has_whatsapp_number", value);
      return this;
    }
    public APIRequestGetMovies requestHometownField () {
      return this.requestHometownField(true);
    }
    public APIRequestGetMovies requestHometownField (boolean value) {
      this.requestField("hometown", value);
      return this;
    }
    public APIRequestGetMovies requestHoursField () {
      return this.requestHoursField(true);
    }
    public APIRequestGetMovies requestHoursField (boolean value) {
      this.requestField("hours", value);
      return this;
    }
    public APIRequestGetMovies requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetMovies requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetMovies requestImpressumField () {
      return this.requestImpressumField(true);
    }
    public APIRequestGetMovies requestImpressumField (boolean value) {
      this.requestField("impressum", value);
      return this;
    }
    public APIRequestGetMovies requestInfluencesField () {
      return this.requestInfluencesField(true);
    }
    public APIRequestGetMovies requestInfluencesField (boolean value) {
      this.requestField("influences", value);
      return this;
    }
    public APIRequestGetMovies requestInstagramBusinessAccountField () {
      return this.requestInstagramBusinessAccountField(true);
    }
    public APIRequestGetMovies requestInstagramBusinessAccountField (boolean value) {
      this.requestField("instagram_business_account", value);
      return this;
    }
    public APIRequestGetMovies requestInstantArticlesReviewStatusField () {
      return this.requestInstantArticlesReviewStatusField(true);
    }
    public APIRequestGetMovies requestInstantArticlesReviewStatusField (boolean value) {
      this.requestField("instant_articles_review_status", value);
      return this;
    }
    public APIRequestGetMovies requestIsAlwaysOpenField () {
      return this.requestIsAlwaysOpenField(true);
    }
    public APIRequestGetMovies requestIsAlwaysOpenField (boolean value) {
      this.requestField("is_always_open", value);
      return this;
    }
    public APIRequestGetMovies requestIsChainField () {
      return this.requestIsChainField(true);
    }
    public APIRequestGetMovies requestIsChainField (boolean value) {
      this.requestField("is_chain", value);
      return this;
    }
    public APIRequestGetMovies requestIsCommunityPageField () {
      return this.requestIsCommunityPageField(true);
    }
    public APIRequestGetMovies requestIsCommunityPageField (boolean value) {
      this.requestField("is_community_page", value);
      return this;
    }
    public APIRequestGetMovies requestIsEligibleForBrandedContentField () {
      return this.requestIsEligibleForBrandedContentField(true);
    }
    public APIRequestGetMovies requestIsEligibleForBrandedContentField (boolean value) {
      this.requestField("is_eligible_for_branded_content", value);
      return this;
    }
    public APIRequestGetMovies requestIsMessengerBotGetStartedEnabledField () {
      return this.requestIsMessengerBotGetStartedEnabledField(true);
    }
    public APIRequestGetMovies requestIsMessengerBotGetStartedEnabledField (boolean value) {
      this.requestField("is_messenger_bot_get_started_enabled", value);
      return this;
    }
    public APIRequestGetMovies requestIsMessengerPlatformBotField () {
      return this.requestIsMessengerPlatformBotField(true);
    }
    public APIRequestGetMovies requestIsMessengerPlatformBotField (boolean value) {
      this.requestField("is_messenger_platform_bot", value);
      return this;
    }
    public APIRequestGetMovies requestIsOwnedField () {
      return this.requestIsOwnedField(true);
    }
    public APIRequestGetMovies requestIsOwnedField (boolean value) {
      this.requestField("is_owned", value);
      return this;
    }
    public APIRequestGetMovies requestIsPermanentlyClosedField () {
      return this.requestIsPermanentlyClosedField(true);
    }
    public APIRequestGetMovies requestIsPermanentlyClosedField (boolean value) {
      this.requestField("is_permanently_closed", value);
      return this;
    }
    public APIRequestGetMovies requestIsPublishedField () {
      return this.requestIsPublishedField(true);
    }
    public APIRequestGetMovies requestIsPublishedField (boolean value) {
      this.requestField("is_published", value);
      return this;
    }
    public APIRequestGetMovies requestIsUnclaimedField () {
      return this.requestIsUnclaimedField(true);
    }
    public APIRequestGetMovies requestIsUnclaimedField (boolean value) {
      this.requestField("is_unclaimed", value);
      return this;
    }
    public APIRequestGetMovies requestIsVerifiedField () {
      return this.requestIsVerifiedField(true);
    }
    public APIRequestGetMovies requestIsVerifiedField (boolean value) {
      this.requestField("is_verified", value);
      return this;
    }
    public APIRequestGetMovies requestIsWebhooksSubscribedField () {
      return this.requestIsWebhooksSubscribedField(true);
    }
    public APIRequestGetMovies requestIsWebhooksSubscribedField (boolean value) {
      this.requestField("is_webhooks_subscribed", value);
      return this;
    }
    public APIRequestGetMovies requestKeywordsField () {
      return this.requestKeywordsField(true);
    }
    public APIRequestGetMovies requestKeywordsField (boolean value) {
      this.requestField("keywords", value);
      return this;
    }
    public APIRequestGetMovies requestLeadgenFormPreviewDetailsField () {
      return this.requestLeadgenFormPreviewDetailsField(true);
    }
    public APIRequestGetMovies requestLeadgenFormPreviewDetailsField (boolean value) {
      this.requestField("leadgen_form_preview_details", value);
      return this;
    }
    public APIRequestGetMovies requestLeadgenHasCrmIntegrationField () {
      return this.requestLeadgenHasCrmIntegrationField(true);
    }
    public APIRequestGetMovies requestLeadgenHasCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_crm_integration", value);
      return this;
    }
    public APIRequestGetMovies requestLeadgenHasFatPingCrmIntegrationField () {
      return this.requestLeadgenHasFatPingCrmIntegrationField(true);
    }
    public APIRequestGetMovies requestLeadgenHasFatPingCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_fat_ping_crm_integration", value);
      return this;
    }
    public APIRequestGetMovies requestLeadgenTosAcceptanceTimeField () {
      return this.requestLeadgenTosAcceptanceTimeField(true);
    }
    public APIRequestGetMovies requestLeadgenTosAcceptanceTimeField (boolean value) {
      this.requestField("leadgen_tos_acceptance_time", value);
      return this;
    }
    public APIRequestGetMovies requestLeadgenTosAcceptedField () {
      return this.requestLeadgenTosAcceptedField(true);
    }
    public APIRequestGetMovies requestLeadgenTosAcceptedField (boolean value) {
      this.requestField("leadgen_tos_accepted", value);
      return this;
    }
    public APIRequestGetMovies requestLeadgenTosAcceptingUserField () {
      return this.requestLeadgenTosAcceptingUserField(true);
    }
    public APIRequestGetMovies requestLeadgenTosAcceptingUserField (boolean value) {
      this.requestField("leadgen_tos_accepting_user", value);
      return this;
    }
    public APIRequestGetMovies requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetMovies requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetMovies requestLocationField () {
      return this.requestLocationField(true);
    }
    public APIRequestGetMovies requestLocationField (boolean value) {
      this.requestField("location", value);
      return this;
    }
    public APIRequestGetMovies requestMembersField () {
      return this.requestMembersField(true);
    }
    public APIRequestGetMovies requestMembersField (boolean value) {
      this.requestField("members", value);
      return this;
    }
    public APIRequestGetMovies requestMerchantIdField () {
      return this.requestMerchantIdField(true);
    }
    public APIRequestGetMovies requestMerchantIdField (boolean value) {
      this.requestField("merchant_id", value);
      return this;
    }
    public APIRequestGetMovies requestMerchantReviewStatusField () {
      return this.requestMerchantReviewStatusField(true);
    }
    public APIRequestGetMovies requestMerchantReviewStatusField (boolean value) {
      this.requestField("merchant_review_status", value);
      return this;
    }
    public APIRequestGetMovies requestMessengerAdsDefaultIcebreakersField () {
      return this.requestMessengerAdsDefaultIcebreakersField(true);
    }
    public APIRequestGetMovies requestMessengerAdsDefaultIcebreakersField (boolean value) {
      this.requestField("messenger_ads_default_icebreakers", value);
      return this;
    }
    public APIRequestGetMovies requestMessengerAdsDefaultPageWelcomeMessageField () {
      return this.requestMessengerAdsDefaultPageWelcomeMessageField(true);
    }
    public APIRequestGetMovies requestMessengerAdsDefaultPageWelcomeMessageField (boolean value) {
      this.requestField("messenger_ads_default_page_welcome_message", value);
      return this;
    }
    public APIRequestGetMovies requestMessengerAdsDefaultQuickRepliesField () {
      return this.requestMessengerAdsDefaultQuickRepliesField(true);
    }
    public APIRequestGetMovies requestMessengerAdsDefaultQuickRepliesField (boolean value) {
      this.requestField("messenger_ads_default_quick_replies", value);
      return this;
    }
    public APIRequestGetMovies requestMessengerAdsQuickRepliesTypeField () {
      return this.requestMessengerAdsQuickRepliesTypeField(true);
    }
    public APIRequestGetMovies requestMessengerAdsQuickRepliesTypeField (boolean value) {
      this.requestField("messenger_ads_quick_replies_type", value);
      return this;
    }
    public APIRequestGetMovies requestMissionField () {
      return this.requestMissionField(true);
    }
    public APIRequestGetMovies requestMissionField (boolean value) {
      this.requestField("mission", value);
      return this;
    }
    public APIRequestGetMovies requestMpgField () {
      return this.requestMpgField(true);
    }
    public APIRequestGetMovies requestMpgField (boolean value) {
      this.requestField("mpg", value);
      return this;
    }
    public APIRequestGetMovies requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetMovies requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetMovies requestNameWithLocationDescriptorField () {
      return this.requestNameWithLocationDescriptorField(true);
    }
    public APIRequestGetMovies requestNameWithLocationDescriptorField (boolean value) {
      this.requestField("name_with_location_descriptor", value);
      return this;
    }
    public APIRequestGetMovies requestNetworkField () {
      return this.requestNetworkField(true);
    }
    public APIRequestGetMovies requestNetworkField (boolean value) {
      this.requestField("network", value);
      return this;
    }
    public APIRequestGetMovies requestNewLikeCountField () {
      return this.requestNewLikeCountField(true);
    }
    public APIRequestGetMovies requestNewLikeCountField (boolean value) {
      this.requestField("new_like_count", value);
      return this;
    }
    public APIRequestGetMovies requestOfferEligibleField () {
      return this.requestOfferEligibleField(true);
    }
    public APIRequestGetMovies requestOfferEligibleField (boolean value) {
      this.requestField("offer_eligible", value);
      return this;
    }
    public APIRequestGetMovies requestOverallStarRatingField () {
      return this.requestOverallStarRatingField(true);
    }
    public APIRequestGetMovies requestOverallStarRatingField (boolean value) {
      this.requestField("overall_star_rating", value);
      return this;
    }
    public APIRequestGetMovies requestPageAboutStoryField () {
      return this.requestPageAboutStoryField(true);
    }
    public APIRequestGetMovies requestPageAboutStoryField (boolean value) {
      this.requestField("page_about_story", value);
      return this;
    }
    public APIRequestGetMovies requestPageTokenField () {
      return this.requestPageTokenField(true);
    }
    public APIRequestGetMovies requestPageTokenField (boolean value) {
      this.requestField("page_token", value);
      return this;
    }
    public APIRequestGetMovies requestParentPageField () {
      return this.requestParentPageField(true);
    }
    public APIRequestGetMovies requestParentPageField (boolean value) {
      this.requestField("parent_page", value);
      return this;
    }
    public APIRequestGetMovies requestParkingField () {
      return this.requestParkingField(true);
    }
    public APIRequestGetMovies requestParkingField (boolean value) {
      this.requestField("parking", value);
      return this;
    }
    public APIRequestGetMovies requestPaymentOptionsField () {
      return this.requestPaymentOptionsField(true);
    }
    public APIRequestGetMovies requestPaymentOptionsField (boolean value) {
      this.requestField("payment_options", value);
      return this;
    }
    public APIRequestGetMovies requestPersonalInfoField () {
      return this.requestPersonalInfoField(true);
    }
    public APIRequestGetMovies requestPersonalInfoField (boolean value) {
      this.requestField("personal_info", value);
      return this;
    }
    public APIRequestGetMovies requestPersonalInterestsField () {
      return this.requestPersonalInterestsField(true);
    }
    public APIRequestGetMovies requestPersonalInterestsField (boolean value) {
      this.requestField("personal_interests", value);
      return this;
    }
    public APIRequestGetMovies requestPharmaSafetyInfoField () {
      return this.requestPharmaSafetyInfoField(true);
    }
    public APIRequestGetMovies requestPharmaSafetyInfoField (boolean value) {
      this.requestField("pharma_safety_info", value);
      return this;
    }
    public APIRequestGetMovies requestPhoneField () {
      return this.requestPhoneField(true);
    }
    public APIRequestGetMovies requestPhoneField (boolean value) {
      this.requestField("phone", value);
      return this;
    }
    public APIRequestGetMovies requestPlaceTypeField () {
      return this.requestPlaceTypeField(true);
    }
    public APIRequestGetMovies requestPlaceTypeField (boolean value) {
      this.requestField("place_type", value);
      return this;
    }
    public APIRequestGetMovies requestPlotOutlineField () {
      return this.requestPlotOutlineField(true);
    }
    public APIRequestGetMovies requestPlotOutlineField (boolean value) {
      this.requestField("plot_outline", value);
      return this;
    }
    public APIRequestGetMovies requestPreferredAudienceField () {
      return this.requestPreferredAudienceField(true);
    }
    public APIRequestGetMovies requestPreferredAudienceField (boolean value) {
      this.requestField("preferred_audience", value);
      return this;
    }
    public APIRequestGetMovies requestPressContactField () {
      return this.requestPressContactField(true);
    }
    public APIRequestGetMovies requestPressContactField (boolean value) {
      this.requestField("press_contact", value);
      return this;
    }
    public APIRequestGetMovies requestPriceRangeField () {
      return this.requestPriceRangeField(true);
    }
    public APIRequestGetMovies requestPriceRangeField (boolean value) {
      this.requestField("price_range", value);
      return this;
    }
    public APIRequestGetMovies requestPrivacyInfoUrlField () {
      return this.requestPrivacyInfoUrlField(true);
    }
    public APIRequestGetMovies requestPrivacyInfoUrlField (boolean value) {
      this.requestField("privacy_info_url", value);
      return this;
    }
    public APIRequestGetMovies requestProducedByField () {
      return this.requestProducedByField(true);
    }
    public APIRequestGetMovies requestProducedByField (boolean value) {
      this.requestField("produced_by", value);
      return this;
    }
    public APIRequestGetMovies requestProductsField () {
      return this.requestProductsField(true);
    }
    public APIRequestGetMovies requestProductsField (boolean value) {
      this.requestField("products", value);
      return this;
    }
    public APIRequestGetMovies requestPromotionEligibleField () {
      return this.requestPromotionEligibleField(true);
    }
    public APIRequestGetMovies requestPromotionEligibleField (boolean value) {
      this.requestField("promotion_eligible", value);
      return this;
    }
    public APIRequestGetMovies requestPromotionIneligibleReasonField () {
      return this.requestPromotionIneligibleReasonField(true);
    }
    public APIRequestGetMovies requestPromotionIneligibleReasonField (boolean value) {
      this.requestField("promotion_ineligible_reason", value);
      return this;
    }
    public APIRequestGetMovies requestPublicTransitField () {
      return this.requestPublicTransitField(true);
    }
    public APIRequestGetMovies requestPublicTransitField (boolean value) {
      this.requestField("public_transit", value);
      return this;
    }
    public APIRequestGetMovies requestRatingCountField () {
      return this.requestRatingCountField(true);
    }
    public APIRequestGetMovies requestRatingCountField (boolean value) {
      this.requestField("rating_count", value);
      return this;
    }
    public APIRequestGetMovies requestRecipientField () {
      return this.requestRecipientField(true);
    }
    public APIRequestGetMovies requestRecipientField (boolean value) {
      this.requestField("recipient", value);
      return this;
    }
    public APIRequestGetMovies requestRecordLabelField () {
      return this.requestRecordLabelField(true);
    }
    public APIRequestGetMovies requestRecordLabelField (boolean value) {
      this.requestField("record_label", value);
      return this;
    }
    public APIRequestGetMovies requestReleaseDateField () {
      return this.requestReleaseDateField(true);
    }
    public APIRequestGetMovies requestReleaseDateField (boolean value) {
      this.requestField("release_date", value);
      return this;
    }
    public APIRequestGetMovies requestRestaurantServicesField () {
      return this.requestRestaurantServicesField(true);
    }
    public APIRequestGetMovies requestRestaurantServicesField (boolean value) {
      this.requestField("restaurant_services", value);
      return this;
    }
    public APIRequestGetMovies requestRestaurantSpecialtiesField () {
      return this.requestRestaurantSpecialtiesField(true);
    }
    public APIRequestGetMovies requestRestaurantSpecialtiesField (boolean value) {
      this.requestField("restaurant_specialties", value);
      return this;
    }
    public APIRequestGetMovies requestScheduleField () {
      return this.requestScheduleField(true);
    }
    public APIRequestGetMovies requestScheduleField (boolean value) {
      this.requestField("schedule", value);
      return this;
    }
    public APIRequestGetMovies requestScreenplayByField () {
      return this.requestScreenplayByField(true);
    }
    public APIRequestGetMovies requestScreenplayByField (boolean value) {
      this.requestField("screenplay_by", value);
      return this;
    }
    public APIRequestGetMovies requestSeasonField () {
      return this.requestSeasonField(true);
    }
    public APIRequestGetMovies requestSeasonField (boolean value) {
      this.requestField("season", value);
      return this;
    }
    public APIRequestGetMovies requestSingleLineAddressField () {
      return this.requestSingleLineAddressField(true);
    }
    public APIRequestGetMovies requestSingleLineAddressField (boolean value) {
      this.requestField("single_line_address", value);
      return this;
    }
    public APIRequestGetMovies requestStarringField () {
      return this.requestStarringField(true);
    }
    public APIRequestGetMovies requestStarringField (boolean value) {
      this.requestField("starring", value);
      return this;
    }
    public APIRequestGetMovies requestStartInfoField () {
      return this.requestStartInfoField(true);
    }
    public APIRequestGetMovies requestStartInfoField (boolean value) {
      this.requestField("start_info", value);
      return this;
    }
    public APIRequestGetMovies requestStoreCodeField () {
      return this.requestStoreCodeField(true);
    }
    public APIRequestGetMovies requestStoreCodeField (boolean value) {
      this.requestField("store_code", value);
      return this;
    }
    public APIRequestGetMovies requestStoreLocationDescriptorField () {
      return this.requestStoreLocationDescriptorField(true);
    }
    public APIRequestGetMovies requestStoreLocationDescriptorField (boolean value) {
      this.requestField("store_location_descriptor", value);
      return this;
    }
    public APIRequestGetMovies requestStoreNumberField () {
      return this.requestStoreNumberField(true);
    }
    public APIRequestGetMovies requestStoreNumberField (boolean value) {
      this.requestField("store_number", value);
      return this;
    }
    public APIRequestGetMovies requestStudioField () {
      return this.requestStudioField(true);
    }
    public APIRequestGetMovies requestStudioField (boolean value) {
      this.requestField("studio", value);
      return this;
    }
    public APIRequestGetMovies requestSupportsInstantArticlesField () {
      return this.requestSupportsInstantArticlesField(true);
    }
    public APIRequestGetMovies requestSupportsInstantArticlesField (boolean value) {
      this.requestField("supports_instant_articles", value);
      return this;
    }
    public APIRequestGetMovies requestTalkingAboutCountField () {
      return this.requestTalkingAboutCountField(true);
    }
    public APIRequestGetMovies requestTalkingAboutCountField (boolean value) {
      this.requestField("talking_about_count", value);
      return this;
    }
    public APIRequestGetMovies requestUnreadMessageCountField () {
      return this.requestUnreadMessageCountField(true);
    }
    public APIRequestGetMovies requestUnreadMessageCountField (boolean value) {
      this.requestField("unread_message_count", value);
      return this;
    }
    public APIRequestGetMovies requestUnreadNotifCountField () {
      return this.requestUnreadNotifCountField(true);
    }
    public APIRequestGetMovies requestUnreadNotifCountField (boolean value) {
      this.requestField("unread_notif_count", value);
      return this;
    }
    public APIRequestGetMovies requestUnseenMessageCountField () {
      return this.requestUnseenMessageCountField(true);
    }
    public APIRequestGetMovies requestUnseenMessageCountField (boolean value) {
      this.requestField("unseen_message_count", value);
      return this;
    }
    public APIRequestGetMovies requestUsernameField () {
      return this.requestUsernameField(true);
    }
    public APIRequestGetMovies requestUsernameField (boolean value) {
      this.requestField("username", value);
      return this;
    }
    public APIRequestGetMovies requestVerificationStatusField () {
      return this.requestVerificationStatusField(true);
    }
    public APIRequestGetMovies requestVerificationStatusField (boolean value) {
      this.requestField("verification_status", value);
      return this;
    }
    public APIRequestGetMovies requestVoipInfoField () {
      return this.requestVoipInfoField(true);
    }
    public APIRequestGetMovies requestVoipInfoField (boolean value) {
      this.requestField("voip_info", value);
      return this;
    }
    public APIRequestGetMovies requestWebsiteField () {
      return this.requestWebsiteField(true);
    }
    public APIRequestGetMovies requestWebsiteField (boolean value) {
      this.requestField("website", value);
      return this;
    }
    public APIRequestGetMovies requestWereHereCountField () {
      return this.requestWereHereCountField(true);
    }
    public APIRequestGetMovies requestWereHereCountField (boolean value) {
      this.requestField("were_here_count", value);
      return this;
    }
    public APIRequestGetMovies requestWhatsappNumberField () {
      return this.requestWhatsappNumberField(true);
    }
    public APIRequestGetMovies requestWhatsappNumberField (boolean value) {
      this.requestField("whatsapp_number", value);
      return this;
    }
    public APIRequestGetMovies requestWrittenByField () {
      return this.requestWrittenByField(true);
    }
    public APIRequestGetMovies requestWrittenByField (boolean value) {
      this.requestField("written_by", value);
      return this;
    }
  }

  public static class APIRequestGetMusic extends APIRequest<Page> {

    APINodeList<Page> lastResponse = null;
    @Override
    public APINodeList<Page> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "target_id",
    };

    public static final String[] FIELDS = {
      "about",
      "access_token",
      "ad_campaign",
      "affiliation",
      "app_id",
      "app_links",
      "artists_we_like",
      "attire",
      "awards",
      "band_interests",
      "band_members",
      "best_page",
      "bio",
      "birthday",
      "booking_agent",
      "built",
      "business",
      "can_checkin",
      "can_post",
      "category",
      "category_list",
      "checkins",
      "company_overview",
      "connected_instagram_account",
      "contact_address",
      "copyright_attribution_insights",
      "copyright_whitelisted_ig_partners",
      "country_page_likes",
      "cover",
      "culinary_team",
      "current_location",
      "description",
      "description_html",
      "directed_by",
      "display_subtext",
      "displayed_message_response_time",
      "emails",
      "engagement",
      "fan_count",
      "featured_video",
      "features",
      "food_styles",
      "founded",
      "general_info",
      "general_manager",
      "genre",
      "global_brand_page_name",
      "global_brand_root_id",
      "has_added_app",
      "has_whatsapp_business_number",
      "has_whatsapp_number",
      "hometown",
      "hours",
      "id",
      "impressum",
      "influences",
      "instagram_business_account",
      "instant_articles_review_status",
      "is_always_open",
      "is_chain",
      "is_community_page",
      "is_eligible_for_branded_content",
      "is_messenger_bot_get_started_enabled",
      "is_messenger_platform_bot",
      "is_owned",
      "is_permanently_closed",
      "is_published",
      "is_unclaimed",
      "is_verified",
      "is_webhooks_subscribed",
      "keywords",
      "leadgen_form_preview_details",
      "leadgen_has_crm_integration",
      "leadgen_has_fat_ping_crm_integration",
      "leadgen_tos_acceptance_time",
      "leadgen_tos_accepted",
      "leadgen_tos_accepting_user",
      "link",
      "location",
      "members",
      "merchant_id",
      "merchant_review_status",
      "messenger_ads_default_icebreakers",
      "messenger_ads_default_page_welcome_message",
      "messenger_ads_default_quick_replies",
      "messenger_ads_quick_replies_type",
      "mission",
      "mpg",
      "name",
      "name_with_location_descriptor",
      "network",
      "new_like_count",
      "offer_eligible",
      "overall_star_rating",
      "page_about_story",
      "page_token",
      "parent_page",
      "parking",
      "payment_options",
      "personal_info",
      "personal_interests",
      "pharma_safety_info",
      "phone",
      "place_type",
      "plot_outline",
      "preferred_audience",
      "press_contact",
      "price_range",
      "privacy_info_url",
      "produced_by",
      "products",
      "promotion_eligible",
      "promotion_ineligible_reason",
      "public_transit",
      "rating_count",
      "recipient",
      "record_label",
      "release_date",
      "restaurant_services",
      "restaurant_specialties",
      "schedule",
      "screenplay_by",
      "season",
      "single_line_address",
      "starring",
      "start_info",
      "store_code",
      "store_location_descriptor",
      "store_number",
      "studio",
      "supports_instant_articles",
      "talking_about_count",
      "unread_message_count",
      "unread_notif_count",
      "unseen_message_count",
      "username",
      "verification_status",
      "voip_info",
      "website",
      "were_here_count",
      "whatsapp_number",
      "written_by",
    };

    @Override
    public APINodeList<Page> parseResponse(String response, String header) throws APIException {
      return Page.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Page> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Page> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Page>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Page>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Page>>() {
           public APINodeList<Page> apply(ResponseWrapper result) {
             try {
               return APIRequestGetMusic.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetMusic(String nodeId, APIContext context) {
      super(context, nodeId, "/music", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetMusic setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetMusic setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetMusic setTargetId (String targetId) {
      this.setParam("target_id", targetId);
      return this;
    }

    public APIRequestGetMusic requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetMusic requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetMusic requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetMusic requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetMusic requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetMusic requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetMusic requestAboutField () {
      return this.requestAboutField(true);
    }
    public APIRequestGetMusic requestAboutField (boolean value) {
      this.requestField("about", value);
      return this;
    }
    public APIRequestGetMusic requestAccessTokenField () {
      return this.requestAccessTokenField(true);
    }
    public APIRequestGetMusic requestAccessTokenField (boolean value) {
      this.requestField("access_token", value);
      return this;
    }
    public APIRequestGetMusic requestAdCampaignField () {
      return this.requestAdCampaignField(true);
    }
    public APIRequestGetMusic requestAdCampaignField (boolean value) {
      this.requestField("ad_campaign", value);
      return this;
    }
    public APIRequestGetMusic requestAffiliationField () {
      return this.requestAffiliationField(true);
    }
    public APIRequestGetMusic requestAffiliationField (boolean value) {
      this.requestField("affiliation", value);
      return this;
    }
    public APIRequestGetMusic requestAppIdField () {
      return this.requestAppIdField(true);
    }
    public APIRequestGetMusic requestAppIdField (boolean value) {
      this.requestField("app_id", value);
      return this;
    }
    public APIRequestGetMusic requestAppLinksField () {
      return this.requestAppLinksField(true);
    }
    public APIRequestGetMusic requestAppLinksField (boolean value) {
      this.requestField("app_links", value);
      return this;
    }
    public APIRequestGetMusic requestArtistsWeLikeField () {
      return this.requestArtistsWeLikeField(true);
    }
    public APIRequestGetMusic requestArtistsWeLikeField (boolean value) {
      this.requestField("artists_we_like", value);
      return this;
    }
    public APIRequestGetMusic requestAttireField () {
      return this.requestAttireField(true);
    }
    public APIRequestGetMusic requestAttireField (boolean value) {
      this.requestField("attire", value);
      return this;
    }
    public APIRequestGetMusic requestAwardsField () {
      return this.requestAwardsField(true);
    }
    public APIRequestGetMusic requestAwardsField (boolean value) {
      this.requestField("awards", value);
      return this;
    }
    public APIRequestGetMusic requestBandInterestsField () {
      return this.requestBandInterestsField(true);
    }
    public APIRequestGetMusic requestBandInterestsField (boolean value) {
      this.requestField("band_interests", value);
      return this;
    }
    public APIRequestGetMusic requestBandMembersField () {
      return this.requestBandMembersField(true);
    }
    public APIRequestGetMusic requestBandMembersField (boolean value) {
      this.requestField("band_members", value);
      return this;
    }
    public APIRequestGetMusic requestBestPageField () {
      return this.requestBestPageField(true);
    }
    public APIRequestGetMusic requestBestPageField (boolean value) {
      this.requestField("best_page", value);
      return this;
    }
    public APIRequestGetMusic requestBioField () {
      return this.requestBioField(true);
    }
    public APIRequestGetMusic requestBioField (boolean value) {
      this.requestField("bio", value);
      return this;
    }
    public APIRequestGetMusic requestBirthdayField () {
      return this.requestBirthdayField(true);
    }
    public APIRequestGetMusic requestBirthdayField (boolean value) {
      this.requestField("birthday", value);
      return this;
    }
    public APIRequestGetMusic requestBookingAgentField () {
      return this.requestBookingAgentField(true);
    }
    public APIRequestGetMusic requestBookingAgentField (boolean value) {
      this.requestField("booking_agent", value);
      return this;
    }
    public APIRequestGetMusic requestBuiltField () {
      return this.requestBuiltField(true);
    }
    public APIRequestGetMusic requestBuiltField (boolean value) {
      this.requestField("built", value);
      return this;
    }
    public APIRequestGetMusic requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetMusic requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetMusic requestCanCheckinField () {
      return this.requestCanCheckinField(true);
    }
    public APIRequestGetMusic requestCanCheckinField (boolean value) {
      this.requestField("can_checkin", value);
      return this;
    }
    public APIRequestGetMusic requestCanPostField () {
      return this.requestCanPostField(true);
    }
    public APIRequestGetMusic requestCanPostField (boolean value) {
      this.requestField("can_post", value);
      return this;
    }
    public APIRequestGetMusic requestCategoryField () {
      return this.requestCategoryField(true);
    }
    public APIRequestGetMusic requestCategoryField (boolean value) {
      this.requestField("category", value);
      return this;
    }
    public APIRequestGetMusic requestCategoryListField () {
      return this.requestCategoryListField(true);
    }
    public APIRequestGetMusic requestCategoryListField (boolean value) {
      this.requestField("category_list", value);
      return this;
    }
    public APIRequestGetMusic requestCheckinsField () {
      return this.requestCheckinsField(true);
    }
    public APIRequestGetMusic requestCheckinsField (boolean value) {
      this.requestField("checkins", value);
      return this;
    }
    public APIRequestGetMusic requestCompanyOverviewField () {
      return this.requestCompanyOverviewField(true);
    }
    public APIRequestGetMusic requestCompanyOverviewField (boolean value) {
      this.requestField("company_overview", value);
      return this;
    }
    public APIRequestGetMusic requestConnectedInstagramAccountField () {
      return this.requestConnectedInstagramAccountField(true);
    }
    public APIRequestGetMusic requestConnectedInstagramAccountField (boolean value) {
      this.requestField("connected_instagram_account", value);
      return this;
    }
    public APIRequestGetMusic requestContactAddressField () {
      return this.requestContactAddressField(true);
    }
    public APIRequestGetMusic requestContactAddressField (boolean value) {
      this.requestField("contact_address", value);
      return this;
    }
    public APIRequestGetMusic requestCopyrightAttributionInsightsField () {
      return this.requestCopyrightAttributionInsightsField(true);
    }
    public APIRequestGetMusic requestCopyrightAttributionInsightsField (boolean value) {
      this.requestField("copyright_attribution_insights", value);
      return this;
    }
    public APIRequestGetMusic requestCopyrightWhitelistedIgPartnersField () {
      return this.requestCopyrightWhitelistedIgPartnersField(true);
    }
    public APIRequestGetMusic requestCopyrightWhitelistedIgPartnersField (boolean value) {
      this.requestField("copyright_whitelisted_ig_partners", value);
      return this;
    }
    public APIRequestGetMusic requestCountryPageLikesField () {
      return this.requestCountryPageLikesField(true);
    }
    public APIRequestGetMusic requestCountryPageLikesField (boolean value) {
      this.requestField("country_page_likes", value);
      return this;
    }
    public APIRequestGetMusic requestCoverField () {
      return this.requestCoverField(true);
    }
    public APIRequestGetMusic requestCoverField (boolean value) {
      this.requestField("cover", value);
      return this;
    }
    public APIRequestGetMusic requestCulinaryTeamField () {
      return this.requestCulinaryTeamField(true);
    }
    public APIRequestGetMusic requestCulinaryTeamField (boolean value) {
      this.requestField("culinary_team", value);
      return this;
    }
    public APIRequestGetMusic requestCurrentLocationField () {
      return this.requestCurrentLocationField(true);
    }
    public APIRequestGetMusic requestCurrentLocationField (boolean value) {
      this.requestField("current_location", value);
      return this;
    }
    public APIRequestGetMusic requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetMusic requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetMusic requestDescriptionHtmlField () {
      return this.requestDescriptionHtmlField(true);
    }
    public APIRequestGetMusic requestDescriptionHtmlField (boolean value) {
      this.requestField("description_html", value);
      return this;
    }
    public APIRequestGetMusic requestDirectedByField () {
      return this.requestDirectedByField(true);
    }
    public APIRequestGetMusic requestDirectedByField (boolean value) {
      this.requestField("directed_by", value);
      return this;
    }
    public APIRequestGetMusic requestDisplaySubtextField () {
      return this.requestDisplaySubtextField(true);
    }
    public APIRequestGetMusic requestDisplaySubtextField (boolean value) {
      this.requestField("display_subtext", value);
      return this;
    }
    public APIRequestGetMusic requestDisplayedMessageResponseTimeField () {
      return this.requestDisplayedMessageResponseTimeField(true);
    }
    public APIRequestGetMusic requestDisplayedMessageResponseTimeField (boolean value) {
      this.requestField("displayed_message_response_time", value);
      return this;
    }
    public APIRequestGetMusic requestEmailsField () {
      return this.requestEmailsField(true);
    }
    public APIRequestGetMusic requestEmailsField (boolean value) {
      this.requestField("emails", value);
      return this;
    }
    public APIRequestGetMusic requestEngagementField () {
      return this.requestEngagementField(true);
    }
    public APIRequestGetMusic requestEngagementField (boolean value) {
      this.requestField("engagement", value);
      return this;
    }
    public APIRequestGetMusic requestFanCountField () {
      return this.requestFanCountField(true);
    }
    public APIRequestGetMusic requestFanCountField (boolean value) {
      this.requestField("fan_count", value);
      return this;
    }
    public APIRequestGetMusic requestFeaturedVideoField () {
      return this.requestFeaturedVideoField(true);
    }
    public APIRequestGetMusic requestFeaturedVideoField (boolean value) {
      this.requestField("featured_video", value);
      return this;
    }
    public APIRequestGetMusic requestFeaturesField () {
      return this.requestFeaturesField(true);
    }
    public APIRequestGetMusic requestFeaturesField (boolean value) {
      this.requestField("features", value);
      return this;
    }
    public APIRequestGetMusic requestFoodStylesField () {
      return this.requestFoodStylesField(true);
    }
    public APIRequestGetMusic requestFoodStylesField (boolean value) {
      this.requestField("food_styles", value);
      return this;
    }
    public APIRequestGetMusic requestFoundedField () {
      return this.requestFoundedField(true);
    }
    public APIRequestGetMusic requestFoundedField (boolean value) {
      this.requestField("founded", value);
      return this;
    }
    public APIRequestGetMusic requestGeneralInfoField () {
      return this.requestGeneralInfoField(true);
    }
    public APIRequestGetMusic requestGeneralInfoField (boolean value) {
      this.requestField("general_info", value);
      return this;
    }
    public APIRequestGetMusic requestGeneralManagerField () {
      return this.requestGeneralManagerField(true);
    }
    public APIRequestGetMusic requestGeneralManagerField (boolean value) {
      this.requestField("general_manager", value);
      return this;
    }
    public APIRequestGetMusic requestGenreField () {
      return this.requestGenreField(true);
    }
    public APIRequestGetMusic requestGenreField (boolean value) {
      this.requestField("genre", value);
      return this;
    }
    public APIRequestGetMusic requestGlobalBrandPageNameField () {
      return this.requestGlobalBrandPageNameField(true);
    }
    public APIRequestGetMusic requestGlobalBrandPageNameField (boolean value) {
      this.requestField("global_brand_page_name", value);
      return this;
    }
    public APIRequestGetMusic requestGlobalBrandRootIdField () {
      return this.requestGlobalBrandRootIdField(true);
    }
    public APIRequestGetMusic requestGlobalBrandRootIdField (boolean value) {
      this.requestField("global_brand_root_id", value);
      return this;
    }
    public APIRequestGetMusic requestHasAddedAppField () {
      return this.requestHasAddedAppField(true);
    }
    public APIRequestGetMusic requestHasAddedAppField (boolean value) {
      this.requestField("has_added_app", value);
      return this;
    }
    public APIRequestGetMusic requestHasWhatsappBusinessNumberField () {
      return this.requestHasWhatsappBusinessNumberField(true);
    }
    public APIRequestGetMusic requestHasWhatsappBusinessNumberField (boolean value) {
      this.requestField("has_whatsapp_business_number", value);
      return this;
    }
    public APIRequestGetMusic requestHasWhatsappNumberField () {
      return this.requestHasWhatsappNumberField(true);
    }
    public APIRequestGetMusic requestHasWhatsappNumberField (boolean value) {
      this.requestField("has_whatsapp_number", value);
      return this;
    }
    public APIRequestGetMusic requestHometownField () {
      return this.requestHometownField(true);
    }
    public APIRequestGetMusic requestHometownField (boolean value) {
      this.requestField("hometown", value);
      return this;
    }
    public APIRequestGetMusic requestHoursField () {
      return this.requestHoursField(true);
    }
    public APIRequestGetMusic requestHoursField (boolean value) {
      this.requestField("hours", value);
      return this;
    }
    public APIRequestGetMusic requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetMusic requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetMusic requestImpressumField () {
      return this.requestImpressumField(true);
    }
    public APIRequestGetMusic requestImpressumField (boolean value) {
      this.requestField("impressum", value);
      return this;
    }
    public APIRequestGetMusic requestInfluencesField () {
      return this.requestInfluencesField(true);
    }
    public APIRequestGetMusic requestInfluencesField (boolean value) {
      this.requestField("influences", value);
      return this;
    }
    public APIRequestGetMusic requestInstagramBusinessAccountField () {
      return this.requestInstagramBusinessAccountField(true);
    }
    public APIRequestGetMusic requestInstagramBusinessAccountField (boolean value) {
      this.requestField("instagram_business_account", value);
      return this;
    }
    public APIRequestGetMusic requestInstantArticlesReviewStatusField () {
      return this.requestInstantArticlesReviewStatusField(true);
    }
    public APIRequestGetMusic requestInstantArticlesReviewStatusField (boolean value) {
      this.requestField("instant_articles_review_status", value);
      return this;
    }
    public APIRequestGetMusic requestIsAlwaysOpenField () {
      return this.requestIsAlwaysOpenField(true);
    }
    public APIRequestGetMusic requestIsAlwaysOpenField (boolean value) {
      this.requestField("is_always_open", value);
      return this;
    }
    public APIRequestGetMusic requestIsChainField () {
      return this.requestIsChainField(true);
    }
    public APIRequestGetMusic requestIsChainField (boolean value) {
      this.requestField("is_chain", value);
      return this;
    }
    public APIRequestGetMusic requestIsCommunityPageField () {
      return this.requestIsCommunityPageField(true);
    }
    public APIRequestGetMusic requestIsCommunityPageField (boolean value) {
      this.requestField("is_community_page", value);
      return this;
    }
    public APIRequestGetMusic requestIsEligibleForBrandedContentField () {
      return this.requestIsEligibleForBrandedContentField(true);
    }
    public APIRequestGetMusic requestIsEligibleForBrandedContentField (boolean value) {
      this.requestField("is_eligible_for_branded_content", value);
      return this;
    }
    public APIRequestGetMusic requestIsMessengerBotGetStartedEnabledField () {
      return this.requestIsMessengerBotGetStartedEnabledField(true);
    }
    public APIRequestGetMusic requestIsMessengerBotGetStartedEnabledField (boolean value) {
      this.requestField("is_messenger_bot_get_started_enabled", value);
      return this;
    }
    public APIRequestGetMusic requestIsMessengerPlatformBotField () {
      return this.requestIsMessengerPlatformBotField(true);
    }
    public APIRequestGetMusic requestIsMessengerPlatformBotField (boolean value) {
      this.requestField("is_messenger_platform_bot", value);
      return this;
    }
    public APIRequestGetMusic requestIsOwnedField () {
      return this.requestIsOwnedField(true);
    }
    public APIRequestGetMusic requestIsOwnedField (boolean value) {
      this.requestField("is_owned", value);
      return this;
    }
    public APIRequestGetMusic requestIsPermanentlyClosedField () {
      return this.requestIsPermanentlyClosedField(true);
    }
    public APIRequestGetMusic requestIsPermanentlyClosedField (boolean value) {
      this.requestField("is_permanently_closed", value);
      return this;
    }
    public APIRequestGetMusic requestIsPublishedField () {
      return this.requestIsPublishedField(true);
    }
    public APIRequestGetMusic requestIsPublishedField (boolean value) {
      this.requestField("is_published", value);
      return this;
    }
    public APIRequestGetMusic requestIsUnclaimedField () {
      return this.requestIsUnclaimedField(true);
    }
    public APIRequestGetMusic requestIsUnclaimedField (boolean value) {
      this.requestField("is_unclaimed", value);
      return this;
    }
    public APIRequestGetMusic requestIsVerifiedField () {
      return this.requestIsVerifiedField(true);
    }
    public APIRequestGetMusic requestIsVerifiedField (boolean value) {
      this.requestField("is_verified", value);
      return this;
    }
    public APIRequestGetMusic requestIsWebhooksSubscribedField () {
      return this.requestIsWebhooksSubscribedField(true);
    }
    public APIRequestGetMusic requestIsWebhooksSubscribedField (boolean value) {
      this.requestField("is_webhooks_subscribed", value);
      return this;
    }
    public APIRequestGetMusic requestKeywordsField () {
      return this.requestKeywordsField(true);
    }
    public APIRequestGetMusic requestKeywordsField (boolean value) {
      this.requestField("keywords", value);
      return this;
    }
    public APIRequestGetMusic requestLeadgenFormPreviewDetailsField () {
      return this.requestLeadgenFormPreviewDetailsField(true);
    }
    public APIRequestGetMusic requestLeadgenFormPreviewDetailsField (boolean value) {
      this.requestField("leadgen_form_preview_details", value);
      return this;
    }
    public APIRequestGetMusic requestLeadgenHasCrmIntegrationField () {
      return this.requestLeadgenHasCrmIntegrationField(true);
    }
    public APIRequestGetMusic requestLeadgenHasCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_crm_integration", value);
      return this;
    }
    public APIRequestGetMusic requestLeadgenHasFatPingCrmIntegrationField () {
      return this.requestLeadgenHasFatPingCrmIntegrationField(true);
    }
    public APIRequestGetMusic requestLeadgenHasFatPingCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_fat_ping_crm_integration", value);
      return this;
    }
    public APIRequestGetMusic requestLeadgenTosAcceptanceTimeField () {
      return this.requestLeadgenTosAcceptanceTimeField(true);
    }
    public APIRequestGetMusic requestLeadgenTosAcceptanceTimeField (boolean value) {
      this.requestField("leadgen_tos_acceptance_time", value);
      return this;
    }
    public APIRequestGetMusic requestLeadgenTosAcceptedField () {
      return this.requestLeadgenTosAcceptedField(true);
    }
    public APIRequestGetMusic requestLeadgenTosAcceptedField (boolean value) {
      this.requestField("leadgen_tos_accepted", value);
      return this;
    }
    public APIRequestGetMusic requestLeadgenTosAcceptingUserField () {
      return this.requestLeadgenTosAcceptingUserField(true);
    }
    public APIRequestGetMusic requestLeadgenTosAcceptingUserField (boolean value) {
      this.requestField("leadgen_tos_accepting_user", value);
      return this;
    }
    public APIRequestGetMusic requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetMusic requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetMusic requestLocationField () {
      return this.requestLocationField(true);
    }
    public APIRequestGetMusic requestLocationField (boolean value) {
      this.requestField("location", value);
      return this;
    }
    public APIRequestGetMusic requestMembersField () {
      return this.requestMembersField(true);
    }
    public APIRequestGetMusic requestMembersField (boolean value) {
      this.requestField("members", value);
      return this;
    }
    public APIRequestGetMusic requestMerchantIdField () {
      return this.requestMerchantIdField(true);
    }
    public APIRequestGetMusic requestMerchantIdField (boolean value) {
      this.requestField("merchant_id", value);
      return this;
    }
    public APIRequestGetMusic requestMerchantReviewStatusField () {
      return this.requestMerchantReviewStatusField(true);
    }
    public APIRequestGetMusic requestMerchantReviewStatusField (boolean value) {
      this.requestField("merchant_review_status", value);
      return this;
    }
    public APIRequestGetMusic requestMessengerAdsDefaultIcebreakersField () {
      return this.requestMessengerAdsDefaultIcebreakersField(true);
    }
    public APIRequestGetMusic requestMessengerAdsDefaultIcebreakersField (boolean value) {
      this.requestField("messenger_ads_default_icebreakers", value);
      return this;
    }
    public APIRequestGetMusic requestMessengerAdsDefaultPageWelcomeMessageField () {
      return this.requestMessengerAdsDefaultPageWelcomeMessageField(true);
    }
    public APIRequestGetMusic requestMessengerAdsDefaultPageWelcomeMessageField (boolean value) {
      this.requestField("messenger_ads_default_page_welcome_message", value);
      return this;
    }
    public APIRequestGetMusic requestMessengerAdsDefaultQuickRepliesField () {
      return this.requestMessengerAdsDefaultQuickRepliesField(true);
    }
    public APIRequestGetMusic requestMessengerAdsDefaultQuickRepliesField (boolean value) {
      this.requestField("messenger_ads_default_quick_replies", value);
      return this;
    }
    public APIRequestGetMusic requestMessengerAdsQuickRepliesTypeField () {
      return this.requestMessengerAdsQuickRepliesTypeField(true);
    }
    public APIRequestGetMusic requestMessengerAdsQuickRepliesTypeField (boolean value) {
      this.requestField("messenger_ads_quick_replies_type", value);
      return this;
    }
    public APIRequestGetMusic requestMissionField () {
      return this.requestMissionField(true);
    }
    public APIRequestGetMusic requestMissionField (boolean value) {
      this.requestField("mission", value);
      return this;
    }
    public APIRequestGetMusic requestMpgField () {
      return this.requestMpgField(true);
    }
    public APIRequestGetMusic requestMpgField (boolean value) {
      this.requestField("mpg", value);
      return this;
    }
    public APIRequestGetMusic requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetMusic requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetMusic requestNameWithLocationDescriptorField () {
      return this.requestNameWithLocationDescriptorField(true);
    }
    public APIRequestGetMusic requestNameWithLocationDescriptorField (boolean value) {
      this.requestField("name_with_location_descriptor", value);
      return this;
    }
    public APIRequestGetMusic requestNetworkField () {
      return this.requestNetworkField(true);
    }
    public APIRequestGetMusic requestNetworkField (boolean value) {
      this.requestField("network", value);
      return this;
    }
    public APIRequestGetMusic requestNewLikeCountField () {
      return this.requestNewLikeCountField(true);
    }
    public APIRequestGetMusic requestNewLikeCountField (boolean value) {
      this.requestField("new_like_count", value);
      return this;
    }
    public APIRequestGetMusic requestOfferEligibleField () {
      return this.requestOfferEligibleField(true);
    }
    public APIRequestGetMusic requestOfferEligibleField (boolean value) {
      this.requestField("offer_eligible", value);
      return this;
    }
    public APIRequestGetMusic requestOverallStarRatingField () {
      return this.requestOverallStarRatingField(true);
    }
    public APIRequestGetMusic requestOverallStarRatingField (boolean value) {
      this.requestField("overall_star_rating", value);
      return this;
    }
    public APIRequestGetMusic requestPageAboutStoryField () {
      return this.requestPageAboutStoryField(true);
    }
    public APIRequestGetMusic requestPageAboutStoryField (boolean value) {
      this.requestField("page_about_story", value);
      return this;
    }
    public APIRequestGetMusic requestPageTokenField () {
      return this.requestPageTokenField(true);
    }
    public APIRequestGetMusic requestPageTokenField (boolean value) {
      this.requestField("page_token", value);
      return this;
    }
    public APIRequestGetMusic requestParentPageField () {
      return this.requestParentPageField(true);
    }
    public APIRequestGetMusic requestParentPageField (boolean value) {
      this.requestField("parent_page", value);
      return this;
    }
    public APIRequestGetMusic requestParkingField () {
      return this.requestParkingField(true);
    }
    public APIRequestGetMusic requestParkingField (boolean value) {
      this.requestField("parking", value);
      return this;
    }
    public APIRequestGetMusic requestPaymentOptionsField () {
      return this.requestPaymentOptionsField(true);
    }
    public APIRequestGetMusic requestPaymentOptionsField (boolean value) {
      this.requestField("payment_options", value);
      return this;
    }
    public APIRequestGetMusic requestPersonalInfoField () {
      return this.requestPersonalInfoField(true);
    }
    public APIRequestGetMusic requestPersonalInfoField (boolean value) {
      this.requestField("personal_info", value);
      return this;
    }
    public APIRequestGetMusic requestPersonalInterestsField () {
      return this.requestPersonalInterestsField(true);
    }
    public APIRequestGetMusic requestPersonalInterestsField (boolean value) {
      this.requestField("personal_interests", value);
      return this;
    }
    public APIRequestGetMusic requestPharmaSafetyInfoField () {
      return this.requestPharmaSafetyInfoField(true);
    }
    public APIRequestGetMusic requestPharmaSafetyInfoField (boolean value) {
      this.requestField("pharma_safety_info", value);
      return this;
    }
    public APIRequestGetMusic requestPhoneField () {
      return this.requestPhoneField(true);
    }
    public APIRequestGetMusic requestPhoneField (boolean value) {
      this.requestField("phone", value);
      return this;
    }
    public APIRequestGetMusic requestPlaceTypeField () {
      return this.requestPlaceTypeField(true);
    }
    public APIRequestGetMusic requestPlaceTypeField (boolean value) {
      this.requestField("place_type", value);
      return this;
    }
    public APIRequestGetMusic requestPlotOutlineField () {
      return this.requestPlotOutlineField(true);
    }
    public APIRequestGetMusic requestPlotOutlineField (boolean value) {
      this.requestField("plot_outline", value);
      return this;
    }
    public APIRequestGetMusic requestPreferredAudienceField () {
      return this.requestPreferredAudienceField(true);
    }
    public APIRequestGetMusic requestPreferredAudienceField (boolean value) {
      this.requestField("preferred_audience", value);
      return this;
    }
    public APIRequestGetMusic requestPressContactField () {
      return this.requestPressContactField(true);
    }
    public APIRequestGetMusic requestPressContactField (boolean value) {
      this.requestField("press_contact", value);
      return this;
    }
    public APIRequestGetMusic requestPriceRangeField () {
      return this.requestPriceRangeField(true);
    }
    public APIRequestGetMusic requestPriceRangeField (boolean value) {
      this.requestField("price_range", value);
      return this;
    }
    public APIRequestGetMusic requestPrivacyInfoUrlField () {
      return this.requestPrivacyInfoUrlField(true);
    }
    public APIRequestGetMusic requestPrivacyInfoUrlField (boolean value) {
      this.requestField("privacy_info_url", value);
      return this;
    }
    public APIRequestGetMusic requestProducedByField () {
      return this.requestProducedByField(true);
    }
    public APIRequestGetMusic requestProducedByField (boolean value) {
      this.requestField("produced_by", value);
      return this;
    }
    public APIRequestGetMusic requestProductsField () {
      return this.requestProductsField(true);
    }
    public APIRequestGetMusic requestProductsField (boolean value) {
      this.requestField("products", value);
      return this;
    }
    public APIRequestGetMusic requestPromotionEligibleField () {
      return this.requestPromotionEligibleField(true);
    }
    public APIRequestGetMusic requestPromotionEligibleField (boolean value) {
      this.requestField("promotion_eligible", value);
      return this;
    }
    public APIRequestGetMusic requestPromotionIneligibleReasonField () {
      return this.requestPromotionIneligibleReasonField(true);
    }
    public APIRequestGetMusic requestPromotionIneligibleReasonField (boolean value) {
      this.requestField("promotion_ineligible_reason", value);
      return this;
    }
    public APIRequestGetMusic requestPublicTransitField () {
      return this.requestPublicTransitField(true);
    }
    public APIRequestGetMusic requestPublicTransitField (boolean value) {
      this.requestField("public_transit", value);
      return this;
    }
    public APIRequestGetMusic requestRatingCountField () {
      return this.requestRatingCountField(true);
    }
    public APIRequestGetMusic requestRatingCountField (boolean value) {
      this.requestField("rating_count", value);
      return this;
    }
    public APIRequestGetMusic requestRecipientField () {
      return this.requestRecipientField(true);
    }
    public APIRequestGetMusic requestRecipientField (boolean value) {
      this.requestField("recipient", value);
      return this;
    }
    public APIRequestGetMusic requestRecordLabelField () {
      return this.requestRecordLabelField(true);
    }
    public APIRequestGetMusic requestRecordLabelField (boolean value) {
      this.requestField("record_label", value);
      return this;
    }
    public APIRequestGetMusic requestReleaseDateField () {
      return this.requestReleaseDateField(true);
    }
    public APIRequestGetMusic requestReleaseDateField (boolean value) {
      this.requestField("release_date", value);
      return this;
    }
    public APIRequestGetMusic requestRestaurantServicesField () {
      return this.requestRestaurantServicesField(true);
    }
    public APIRequestGetMusic requestRestaurantServicesField (boolean value) {
      this.requestField("restaurant_services", value);
      return this;
    }
    public APIRequestGetMusic requestRestaurantSpecialtiesField () {
      return this.requestRestaurantSpecialtiesField(true);
    }
    public APIRequestGetMusic requestRestaurantSpecialtiesField (boolean value) {
      this.requestField("restaurant_specialties", value);
      return this;
    }
    public APIRequestGetMusic requestScheduleField () {
      return this.requestScheduleField(true);
    }
    public APIRequestGetMusic requestScheduleField (boolean value) {
      this.requestField("schedule", value);
      return this;
    }
    public APIRequestGetMusic requestScreenplayByField () {
      return this.requestScreenplayByField(true);
    }
    public APIRequestGetMusic requestScreenplayByField (boolean value) {
      this.requestField("screenplay_by", value);
      return this;
    }
    public APIRequestGetMusic requestSeasonField () {
      return this.requestSeasonField(true);
    }
    public APIRequestGetMusic requestSeasonField (boolean value) {
      this.requestField("season", value);
      return this;
    }
    public APIRequestGetMusic requestSingleLineAddressField () {
      return this.requestSingleLineAddressField(true);
    }
    public APIRequestGetMusic requestSingleLineAddressField (boolean value) {
      this.requestField("single_line_address", value);
      return this;
    }
    public APIRequestGetMusic requestStarringField () {
      return this.requestStarringField(true);
    }
    public APIRequestGetMusic requestStarringField (boolean value) {
      this.requestField("starring", value);
      return this;
    }
    public APIRequestGetMusic requestStartInfoField () {
      return this.requestStartInfoField(true);
    }
    public APIRequestGetMusic requestStartInfoField (boolean value) {
      this.requestField("start_info", value);
      return this;
    }
    public APIRequestGetMusic requestStoreCodeField () {
      return this.requestStoreCodeField(true);
    }
    public APIRequestGetMusic requestStoreCodeField (boolean value) {
      this.requestField("store_code", value);
      return this;
    }
    public APIRequestGetMusic requestStoreLocationDescriptorField () {
      return this.requestStoreLocationDescriptorField(true);
    }
    public APIRequestGetMusic requestStoreLocationDescriptorField (boolean value) {
      this.requestField("store_location_descriptor", value);
      return this;
    }
    public APIRequestGetMusic requestStoreNumberField () {
      return this.requestStoreNumberField(true);
    }
    public APIRequestGetMusic requestStoreNumberField (boolean value) {
      this.requestField("store_number", value);
      return this;
    }
    public APIRequestGetMusic requestStudioField () {
      return this.requestStudioField(true);
    }
    public APIRequestGetMusic requestStudioField (boolean value) {
      this.requestField("studio", value);
      return this;
    }
    public APIRequestGetMusic requestSupportsInstantArticlesField () {
      return this.requestSupportsInstantArticlesField(true);
    }
    public APIRequestGetMusic requestSupportsInstantArticlesField (boolean value) {
      this.requestField("supports_instant_articles", value);
      return this;
    }
    public APIRequestGetMusic requestTalkingAboutCountField () {
      return this.requestTalkingAboutCountField(true);
    }
    public APIRequestGetMusic requestTalkingAboutCountField (boolean value) {
      this.requestField("talking_about_count", value);
      return this;
    }
    public APIRequestGetMusic requestUnreadMessageCountField () {
      return this.requestUnreadMessageCountField(true);
    }
    public APIRequestGetMusic requestUnreadMessageCountField (boolean value) {
      this.requestField("unread_message_count", value);
      return this;
    }
    public APIRequestGetMusic requestUnreadNotifCountField () {
      return this.requestUnreadNotifCountField(true);
    }
    public APIRequestGetMusic requestUnreadNotifCountField (boolean value) {
      this.requestField("unread_notif_count", value);
      return this;
    }
    public APIRequestGetMusic requestUnseenMessageCountField () {
      return this.requestUnseenMessageCountField(true);
    }
    public APIRequestGetMusic requestUnseenMessageCountField (boolean value) {
      this.requestField("unseen_message_count", value);
      return this;
    }
    public APIRequestGetMusic requestUsernameField () {
      return this.requestUsernameField(true);
    }
    public APIRequestGetMusic requestUsernameField (boolean value) {
      this.requestField("username", value);
      return this;
    }
    public APIRequestGetMusic requestVerificationStatusField () {
      return this.requestVerificationStatusField(true);
    }
    public APIRequestGetMusic requestVerificationStatusField (boolean value) {
      this.requestField("verification_status", value);
      return this;
    }
    public APIRequestGetMusic requestVoipInfoField () {
      return this.requestVoipInfoField(true);
    }
    public APIRequestGetMusic requestVoipInfoField (boolean value) {
      this.requestField("voip_info", value);
      return this;
    }
    public APIRequestGetMusic requestWebsiteField () {
      return this.requestWebsiteField(true);
    }
    public APIRequestGetMusic requestWebsiteField (boolean value) {
      this.requestField("website", value);
      return this;
    }
    public APIRequestGetMusic requestWereHereCountField () {
      return this.requestWereHereCountField(true);
    }
    public APIRequestGetMusic requestWereHereCountField (boolean value) {
      this.requestField("were_here_count", value);
      return this;
    }
    public APIRequestGetMusic requestWhatsappNumberField () {
      return this.requestWhatsappNumberField(true);
    }
    public APIRequestGetMusic requestWhatsappNumberField (boolean value) {
      this.requestField("whatsapp_number", value);
      return this;
    }
    public APIRequestGetMusic requestWrittenByField () {
      return this.requestWrittenByField(true);
    }
    public APIRequestGetMusic requestWrittenByField (boolean value) {
      this.requestField("written_by", value);
      return this;
    }
  }

  public static class APIRequestCreateNotification extends APIRequest<User> {

    User lastResponse = null;
    @Override
    public User getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "filtering",
      "href",
      "notif_ids",
      "read",
      "ref",
      "seen",
      "template",
      "type",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public User parseResponse(String response, String header) throws APIException {
      return User.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public User execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public User execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<User> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<User> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, User>() {
           public User apply(ResponseWrapper result) {
             try {
               return APIRequestCreateNotification.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateNotification(String nodeId, APIContext context) {
      super(context, nodeId, "/notifications", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateNotification setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateNotification setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateNotification setFiltering (List<User.EnumFiltering> filtering) {
      this.setParam("filtering", filtering);
      return this;
    }
    public APIRequestCreateNotification setFiltering (String filtering) {
      this.setParam("filtering", filtering);
      return this;
    }

    public APIRequestCreateNotification setHref (Object href) {
      this.setParam("href", href);
      return this;
    }
    public APIRequestCreateNotification setHref (String href) {
      this.setParam("href", href);
      return this;
    }

    public APIRequestCreateNotification setNotifIds (List<String> notifIds) {
      this.setParam("notif_ids", notifIds);
      return this;
    }
    public APIRequestCreateNotification setNotifIds (String notifIds) {
      this.setParam("notif_ids", notifIds);
      return this;
    }

    public APIRequestCreateNotification setRead (Boolean read) {
      this.setParam("read", read);
      return this;
    }
    public APIRequestCreateNotification setRead (String read) {
      this.setParam("read", read);
      return this;
    }

    public APIRequestCreateNotification setRef (String ref) {
      this.setParam("ref", ref);
      return this;
    }

    public APIRequestCreateNotification setSeen (Boolean seen) {
      this.setParam("seen", seen);
      return this;
    }
    public APIRequestCreateNotification setSeen (String seen) {
      this.setParam("seen", seen);
      return this;
    }

    public APIRequestCreateNotification setTemplate (Object template) {
      this.setParam("template", template);
      return this;
    }
    public APIRequestCreateNotification setTemplate (String template) {
      this.setParam("template", template);
      return this;
    }

    public APIRequestCreateNotification setType (User.EnumType type) {
      this.setParam("type", type);
      return this;
    }
    public APIRequestCreateNotification setType (String type) {
      this.setParam("type", type);
      return this;
    }

    public APIRequestCreateNotification requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateNotification requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateNotification requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateNotification requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateNotification requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateNotification requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreatePaymentCurrency extends APIRequest<User> {

    User lastResponse = null;
    @Override
    public User getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "currency",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public User parseResponse(String response, String header) throws APIException {
      return User.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public User execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public User execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<User> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<User> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, User>() {
           public User apply(ResponseWrapper result) {
             try {
               return APIRequestCreatePaymentCurrency.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreatePaymentCurrency(String nodeId, APIContext context) {
      super(context, nodeId, "/payment_currencies", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreatePaymentCurrency setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreatePaymentCurrency setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreatePaymentCurrency setCurrency (String currency) {
      this.setParam("currency", currency);
      return this;
    }

    public APIRequestCreatePaymentCurrency requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreatePaymentCurrency requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreatePaymentCurrency requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreatePaymentCurrency requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreatePaymentCurrency requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreatePaymentCurrency requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestDeletePermissions extends APIRequest<APINode> {

    APINodeList<APINode> lastResponse = null;
    @Override
    public APINodeList<APINode> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "permission",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINodeList<APINode> parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<APINode> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<APINode> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<APINode>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<APINode>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<APINode>>() {
           public APINodeList<APINode> apply(ResponseWrapper result) {
             try {
               return APIRequestDeletePermissions.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestDeletePermissions(String nodeId, APIContext context) {
      super(context, nodeId, "/permissions", "DELETE", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestDeletePermissions setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestDeletePermissions setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestDeletePermissions setPermission (String permission) {
      this.setParam("permission", permission);
      return this;
    }

    public APIRequestDeletePermissions requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestDeletePermissions requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeletePermissions requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestDeletePermissions requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDeletePermissions requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestDeletePermissions requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetPermissions extends APIRequest<Permission> {

    APINodeList<Permission> lastResponse = null;
    @Override
    public APINodeList<Permission> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "permission",
      "status",
    };

    public static final String[] FIELDS = {
      "permission",
      "status",
    };

    @Override
    public APINodeList<Permission> parseResponse(String response, String header) throws APIException {
      return Permission.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Permission> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Permission> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Permission>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Permission>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Permission>>() {
           public APINodeList<Permission> apply(ResponseWrapper result) {
             try {
               return APIRequestGetPermissions.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetPermissions(String nodeId, APIContext context) {
      super(context, nodeId, "/permissions", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetPermissions setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetPermissions setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetPermissions setPermission (String permission) {
      this.setParam("permission", permission);
      return this;
    }

    public APIRequestGetPermissions setStatus (Permission.EnumStatus status) {
      this.setParam("status", status);
      return this;
    }
    public APIRequestGetPermissions setStatus (String status) {
      this.setParam("status", status);
      return this;
    }

    public APIRequestGetPermissions requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetPermissions requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPermissions requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetPermissions requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPermissions requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetPermissions requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetPermissions requestPermissionField () {
      return this.requestPermissionField(true);
    }
    public APIRequestGetPermissions requestPermissionField (boolean value) {
      this.requestField("permission", value);
      return this;
    }
    public APIRequestGetPermissions requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetPermissions requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
  }

  public static class APIRequestGetPersonalAdAccounts extends APIRequest<AdAccount> {

    APINodeList<AdAccount> lastResponse = null;
    @Override
    public APINodeList<AdAccount> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "account_id",
      "account_status",
      "ad_account_creation_request",
      "ad_account_promotable_objects",
      "age",
      "agency_client_declaration",
      "amount_spent",
      "attribution_spec",
      "balance",
      "business",
      "business_city",
      "business_country_code",
      "business_name",
      "business_state",
      "business_street",
      "business_street2",
      "business_zip",
      "capabilities",
      "created_time",
      "currency",
      "disable_reason",
      "end_advertiser",
      "end_advertiser_name",
      "failed_delivery_checks",
      "fb_entity",
      "funding_source",
      "funding_source_details",
      "has_migrated_permissions",
      "has_page_authorized_adaccount",
      "id",
      "io_number",
      "is_attribution_spec_system_default",
      "is_direct_deals_enabled",
      "is_in_3ds_authorization_enabled_market",
      "is_in_middle_of_local_entity_migration",
      "is_notifications_enabled",
      "is_personal",
      "is_prepay_account",
      "is_tax_id_required",
      "line_numbers",
      "media_agency",
      "min_campaign_group_spend_cap",
      "min_daily_budget",
      "name",
      "offsite_pixels_tos_accepted",
      "owner",
      "partner",
      "rf_spec",
      "show_checkout_experience",
      "spend_cap",
      "tax_id",
      "tax_id_status",
      "tax_id_type",
      "timezone_id",
      "timezone_name",
      "timezone_offset_hours_utc",
      "tos_accepted",
      "user_role",
      "user_tos_accepted",
    };

    @Override
    public APINodeList<AdAccount> parseResponse(String response, String header) throws APIException {
      return AdAccount.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdAccount> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdAccount> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdAccount>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdAccount>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdAccount>>() {
           public APINodeList<AdAccount> apply(ResponseWrapper result) {
             try {
               return APIRequestGetPersonalAdAccounts.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetPersonalAdAccounts(String nodeId, APIContext context) {
      super(context, nodeId, "/personal_ad_accounts", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetPersonalAdAccounts setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetPersonalAdAccounts setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetPersonalAdAccounts requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetPersonalAdAccounts requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPersonalAdAccounts requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetPersonalAdAccounts requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPersonalAdAccounts requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetPersonalAdAccounts requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetPersonalAdAccounts requestAccountIdField () {
      return this.requestAccountIdField(true);
    }
    public APIRequestGetPersonalAdAccounts requestAccountIdField (boolean value) {
      this.requestField("account_id", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestAccountStatusField () {
      return this.requestAccountStatusField(true);
    }
    public APIRequestGetPersonalAdAccounts requestAccountStatusField (boolean value) {
      this.requestField("account_status", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestAdAccountCreationRequestField () {
      return this.requestAdAccountCreationRequestField(true);
    }
    public APIRequestGetPersonalAdAccounts requestAdAccountCreationRequestField (boolean value) {
      this.requestField("ad_account_creation_request", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestAdAccountPromotableObjectsField () {
      return this.requestAdAccountPromotableObjectsField(true);
    }
    public APIRequestGetPersonalAdAccounts requestAdAccountPromotableObjectsField (boolean value) {
      this.requestField("ad_account_promotable_objects", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestAgeField () {
      return this.requestAgeField(true);
    }
    public APIRequestGetPersonalAdAccounts requestAgeField (boolean value) {
      this.requestField("age", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestAgencyClientDeclarationField () {
      return this.requestAgencyClientDeclarationField(true);
    }
    public APIRequestGetPersonalAdAccounts requestAgencyClientDeclarationField (boolean value) {
      this.requestField("agency_client_declaration", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestAmountSpentField () {
      return this.requestAmountSpentField(true);
    }
    public APIRequestGetPersonalAdAccounts requestAmountSpentField (boolean value) {
      this.requestField("amount_spent", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestAttributionSpecField () {
      return this.requestAttributionSpecField(true);
    }
    public APIRequestGetPersonalAdAccounts requestAttributionSpecField (boolean value) {
      this.requestField("attribution_spec", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestBalanceField () {
      return this.requestBalanceField(true);
    }
    public APIRequestGetPersonalAdAccounts requestBalanceField (boolean value) {
      this.requestField("balance", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetPersonalAdAccounts requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestBusinessCityField () {
      return this.requestBusinessCityField(true);
    }
    public APIRequestGetPersonalAdAccounts requestBusinessCityField (boolean value) {
      this.requestField("business_city", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestBusinessCountryCodeField () {
      return this.requestBusinessCountryCodeField(true);
    }
    public APIRequestGetPersonalAdAccounts requestBusinessCountryCodeField (boolean value) {
      this.requestField("business_country_code", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestBusinessNameField () {
      return this.requestBusinessNameField(true);
    }
    public APIRequestGetPersonalAdAccounts requestBusinessNameField (boolean value) {
      this.requestField("business_name", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestBusinessStateField () {
      return this.requestBusinessStateField(true);
    }
    public APIRequestGetPersonalAdAccounts requestBusinessStateField (boolean value) {
      this.requestField("business_state", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestBusinessStreetField () {
      return this.requestBusinessStreetField(true);
    }
    public APIRequestGetPersonalAdAccounts requestBusinessStreetField (boolean value) {
      this.requestField("business_street", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestBusinessStreet2Field () {
      return this.requestBusinessStreet2Field(true);
    }
    public APIRequestGetPersonalAdAccounts requestBusinessStreet2Field (boolean value) {
      this.requestField("business_street2", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestBusinessZipField () {
      return this.requestBusinessZipField(true);
    }
    public APIRequestGetPersonalAdAccounts requestBusinessZipField (boolean value) {
      this.requestField("business_zip", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestCapabilitiesField () {
      return this.requestCapabilitiesField(true);
    }
    public APIRequestGetPersonalAdAccounts requestCapabilitiesField (boolean value) {
      this.requestField("capabilities", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetPersonalAdAccounts requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestCurrencyField () {
      return this.requestCurrencyField(true);
    }
    public APIRequestGetPersonalAdAccounts requestCurrencyField (boolean value) {
      this.requestField("currency", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestDisableReasonField () {
      return this.requestDisableReasonField(true);
    }
    public APIRequestGetPersonalAdAccounts requestDisableReasonField (boolean value) {
      this.requestField("disable_reason", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestEndAdvertiserField () {
      return this.requestEndAdvertiserField(true);
    }
    public APIRequestGetPersonalAdAccounts requestEndAdvertiserField (boolean value) {
      this.requestField("end_advertiser", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestEndAdvertiserNameField () {
      return this.requestEndAdvertiserNameField(true);
    }
    public APIRequestGetPersonalAdAccounts requestEndAdvertiserNameField (boolean value) {
      this.requestField("end_advertiser_name", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestFailedDeliveryChecksField () {
      return this.requestFailedDeliveryChecksField(true);
    }
    public APIRequestGetPersonalAdAccounts requestFailedDeliveryChecksField (boolean value) {
      this.requestField("failed_delivery_checks", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestFbEntityField () {
      return this.requestFbEntityField(true);
    }
    public APIRequestGetPersonalAdAccounts requestFbEntityField (boolean value) {
      this.requestField("fb_entity", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestFundingSourceField () {
      return this.requestFundingSourceField(true);
    }
    public APIRequestGetPersonalAdAccounts requestFundingSourceField (boolean value) {
      this.requestField("funding_source", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestFundingSourceDetailsField () {
      return this.requestFundingSourceDetailsField(true);
    }
    public APIRequestGetPersonalAdAccounts requestFundingSourceDetailsField (boolean value) {
      this.requestField("funding_source_details", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestHasMigratedPermissionsField () {
      return this.requestHasMigratedPermissionsField(true);
    }
    public APIRequestGetPersonalAdAccounts requestHasMigratedPermissionsField (boolean value) {
      this.requestField("has_migrated_permissions", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestHasPageAuthorizedAdaccountField () {
      return this.requestHasPageAuthorizedAdaccountField(true);
    }
    public APIRequestGetPersonalAdAccounts requestHasPageAuthorizedAdaccountField (boolean value) {
      this.requestField("has_page_authorized_adaccount", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetPersonalAdAccounts requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestIoNumberField () {
      return this.requestIoNumberField(true);
    }
    public APIRequestGetPersonalAdAccounts requestIoNumberField (boolean value) {
      this.requestField("io_number", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestIsAttributionSpecSystemDefaultField () {
      return this.requestIsAttributionSpecSystemDefaultField(true);
    }
    public APIRequestGetPersonalAdAccounts requestIsAttributionSpecSystemDefaultField (boolean value) {
      this.requestField("is_attribution_spec_system_default", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestIsDirectDealsEnabledField () {
      return this.requestIsDirectDealsEnabledField(true);
    }
    public APIRequestGetPersonalAdAccounts requestIsDirectDealsEnabledField (boolean value) {
      this.requestField("is_direct_deals_enabled", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestIsIn3dsAuthorizationEnabledMarketField () {
      return this.requestIsIn3dsAuthorizationEnabledMarketField(true);
    }
    public APIRequestGetPersonalAdAccounts requestIsIn3dsAuthorizationEnabledMarketField (boolean value) {
      this.requestField("is_in_3ds_authorization_enabled_market", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestIsInMiddleOfLocalEntityMigrationField () {
      return this.requestIsInMiddleOfLocalEntityMigrationField(true);
    }
    public APIRequestGetPersonalAdAccounts requestIsInMiddleOfLocalEntityMigrationField (boolean value) {
      this.requestField("is_in_middle_of_local_entity_migration", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestIsNotificationsEnabledField () {
      return this.requestIsNotificationsEnabledField(true);
    }
    public APIRequestGetPersonalAdAccounts requestIsNotificationsEnabledField (boolean value) {
      this.requestField("is_notifications_enabled", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestIsPersonalField () {
      return this.requestIsPersonalField(true);
    }
    public APIRequestGetPersonalAdAccounts requestIsPersonalField (boolean value) {
      this.requestField("is_personal", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestIsPrepayAccountField () {
      return this.requestIsPrepayAccountField(true);
    }
    public APIRequestGetPersonalAdAccounts requestIsPrepayAccountField (boolean value) {
      this.requestField("is_prepay_account", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestIsTaxIdRequiredField () {
      return this.requestIsTaxIdRequiredField(true);
    }
    public APIRequestGetPersonalAdAccounts requestIsTaxIdRequiredField (boolean value) {
      this.requestField("is_tax_id_required", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestLineNumbersField () {
      return this.requestLineNumbersField(true);
    }
    public APIRequestGetPersonalAdAccounts requestLineNumbersField (boolean value) {
      this.requestField("line_numbers", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestMediaAgencyField () {
      return this.requestMediaAgencyField(true);
    }
    public APIRequestGetPersonalAdAccounts requestMediaAgencyField (boolean value) {
      this.requestField("media_agency", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestMinCampaignGroupSpendCapField () {
      return this.requestMinCampaignGroupSpendCapField(true);
    }
    public APIRequestGetPersonalAdAccounts requestMinCampaignGroupSpendCapField (boolean value) {
      this.requestField("min_campaign_group_spend_cap", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestMinDailyBudgetField () {
      return this.requestMinDailyBudgetField(true);
    }
    public APIRequestGetPersonalAdAccounts requestMinDailyBudgetField (boolean value) {
      this.requestField("min_daily_budget", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetPersonalAdAccounts requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestOffsitePixelsTosAcceptedField () {
      return this.requestOffsitePixelsTosAcceptedField(true);
    }
    public APIRequestGetPersonalAdAccounts requestOffsitePixelsTosAcceptedField (boolean value) {
      this.requestField("offsite_pixels_tos_accepted", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestOwnerField () {
      return this.requestOwnerField(true);
    }
    public APIRequestGetPersonalAdAccounts requestOwnerField (boolean value) {
      this.requestField("owner", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestPartnerField () {
      return this.requestPartnerField(true);
    }
    public APIRequestGetPersonalAdAccounts requestPartnerField (boolean value) {
      this.requestField("partner", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestRfSpecField () {
      return this.requestRfSpecField(true);
    }
    public APIRequestGetPersonalAdAccounts requestRfSpecField (boolean value) {
      this.requestField("rf_spec", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestShowCheckoutExperienceField () {
      return this.requestShowCheckoutExperienceField(true);
    }
    public APIRequestGetPersonalAdAccounts requestShowCheckoutExperienceField (boolean value) {
      this.requestField("show_checkout_experience", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestSpendCapField () {
      return this.requestSpendCapField(true);
    }
    public APIRequestGetPersonalAdAccounts requestSpendCapField (boolean value) {
      this.requestField("spend_cap", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestTaxIdField () {
      return this.requestTaxIdField(true);
    }
    public APIRequestGetPersonalAdAccounts requestTaxIdField (boolean value) {
      this.requestField("tax_id", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestTaxIdStatusField () {
      return this.requestTaxIdStatusField(true);
    }
    public APIRequestGetPersonalAdAccounts requestTaxIdStatusField (boolean value) {
      this.requestField("tax_id_status", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestTaxIdTypeField () {
      return this.requestTaxIdTypeField(true);
    }
    public APIRequestGetPersonalAdAccounts requestTaxIdTypeField (boolean value) {
      this.requestField("tax_id_type", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestTimezoneIdField () {
      return this.requestTimezoneIdField(true);
    }
    public APIRequestGetPersonalAdAccounts requestTimezoneIdField (boolean value) {
      this.requestField("timezone_id", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestTimezoneNameField () {
      return this.requestTimezoneNameField(true);
    }
    public APIRequestGetPersonalAdAccounts requestTimezoneNameField (boolean value) {
      this.requestField("timezone_name", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestTimezoneOffsetHoursUtcField () {
      return this.requestTimezoneOffsetHoursUtcField(true);
    }
    public APIRequestGetPersonalAdAccounts requestTimezoneOffsetHoursUtcField (boolean value) {
      this.requestField("timezone_offset_hours_utc", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestTosAcceptedField () {
      return this.requestTosAcceptedField(true);
    }
    public APIRequestGetPersonalAdAccounts requestTosAcceptedField (boolean value) {
      this.requestField("tos_accepted", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestUserRoleField () {
      return this.requestUserRoleField(true);
    }
    public APIRequestGetPersonalAdAccounts requestUserRoleField (boolean value) {
      this.requestField("user_role", value);
      return this;
    }
    public APIRequestGetPersonalAdAccounts requestUserTosAcceptedField () {
      return this.requestUserTosAcceptedField(true);
    }
    public APIRequestGetPersonalAdAccounts requestUserTosAcceptedField (boolean value) {
      this.requestField("user_tos_accepted", value);
      return this;
    }
  }

  public static class APIRequestGetPhotos extends APIRequest<Photo> {

    APINodeList<Photo> lastResponse = null;
    @Override
    public APINodeList<Photo> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "type",
    };

    public static final String[] FIELDS = {
      "album",
      "alt_text",
      "alt_text_custom",
      "backdated_time",
      "backdated_time_granularity",
      "can_backdate",
      "can_delete",
      "can_tag",
      "created_time",
      "event",
      "from",
      "height",
      "icon",
      "id",
      "images",
      "link",
      "name",
      "name_tags",
      "page_story_id",
      "picture",
      "place",
      "position",
      "source",
      "target",
      "updated_time",
      "webp_images",
      "width",
    };

    @Override
    public APINodeList<Photo> parseResponse(String response, String header) throws APIException {
      return Photo.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Photo> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Photo> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Photo>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Photo>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Photo>>() {
           public APINodeList<Photo> apply(ResponseWrapper result) {
             try {
               return APIRequestGetPhotos.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetPhotos(String nodeId, APIContext context) {
      super(context, nodeId, "/photos", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetPhotos setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetPhotos setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetPhotos setType (Photo.EnumType type) {
      this.setParam("type", type);
      return this;
    }
    public APIRequestGetPhotos setType (String type) {
      this.setParam("type", type);
      return this;
    }

    public APIRequestGetPhotos requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetPhotos requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPhotos requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetPhotos requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPhotos requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetPhotos requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetPhotos requestAlbumField () {
      return this.requestAlbumField(true);
    }
    public APIRequestGetPhotos requestAlbumField (boolean value) {
      this.requestField("album", value);
      return this;
    }
    public APIRequestGetPhotos requestAltTextField () {
      return this.requestAltTextField(true);
    }
    public APIRequestGetPhotos requestAltTextField (boolean value) {
      this.requestField("alt_text", value);
      return this;
    }
    public APIRequestGetPhotos requestAltTextCustomField () {
      return this.requestAltTextCustomField(true);
    }
    public APIRequestGetPhotos requestAltTextCustomField (boolean value) {
      this.requestField("alt_text_custom", value);
      return this;
    }
    public APIRequestGetPhotos requestBackdatedTimeField () {
      return this.requestBackdatedTimeField(true);
    }
    public APIRequestGetPhotos requestBackdatedTimeField (boolean value) {
      this.requestField("backdated_time", value);
      return this;
    }
    public APIRequestGetPhotos requestBackdatedTimeGranularityField () {
      return this.requestBackdatedTimeGranularityField(true);
    }
    public APIRequestGetPhotos requestBackdatedTimeGranularityField (boolean value) {
      this.requestField("backdated_time_granularity", value);
      return this;
    }
    public APIRequestGetPhotos requestCanBackdateField () {
      return this.requestCanBackdateField(true);
    }
    public APIRequestGetPhotos requestCanBackdateField (boolean value) {
      this.requestField("can_backdate", value);
      return this;
    }
    public APIRequestGetPhotos requestCanDeleteField () {
      return this.requestCanDeleteField(true);
    }
    public APIRequestGetPhotos requestCanDeleteField (boolean value) {
      this.requestField("can_delete", value);
      return this;
    }
    public APIRequestGetPhotos requestCanTagField () {
      return this.requestCanTagField(true);
    }
    public APIRequestGetPhotos requestCanTagField (boolean value) {
      this.requestField("can_tag", value);
      return this;
    }
    public APIRequestGetPhotos requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetPhotos requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetPhotos requestEventField () {
      return this.requestEventField(true);
    }
    public APIRequestGetPhotos requestEventField (boolean value) {
      this.requestField("event", value);
      return this;
    }
    public APIRequestGetPhotos requestFromField () {
      return this.requestFromField(true);
    }
    public APIRequestGetPhotos requestFromField (boolean value) {
      this.requestField("from", value);
      return this;
    }
    public APIRequestGetPhotos requestHeightField () {
      return this.requestHeightField(true);
    }
    public APIRequestGetPhotos requestHeightField (boolean value) {
      this.requestField("height", value);
      return this;
    }
    public APIRequestGetPhotos requestIconField () {
      return this.requestIconField(true);
    }
    public APIRequestGetPhotos requestIconField (boolean value) {
      this.requestField("icon", value);
      return this;
    }
    public APIRequestGetPhotos requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetPhotos requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetPhotos requestImagesField () {
      return this.requestImagesField(true);
    }
    public APIRequestGetPhotos requestImagesField (boolean value) {
      this.requestField("images", value);
      return this;
    }
    public APIRequestGetPhotos requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetPhotos requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetPhotos requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetPhotos requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetPhotos requestNameTagsField () {
      return this.requestNameTagsField(true);
    }
    public APIRequestGetPhotos requestNameTagsField (boolean value) {
      this.requestField("name_tags", value);
      return this;
    }
    public APIRequestGetPhotos requestPageStoryIdField () {
      return this.requestPageStoryIdField(true);
    }
    public APIRequestGetPhotos requestPageStoryIdField (boolean value) {
      this.requestField("page_story_id", value);
      return this;
    }
    public APIRequestGetPhotos requestPictureField () {
      return this.requestPictureField(true);
    }
    public APIRequestGetPhotos requestPictureField (boolean value) {
      this.requestField("picture", value);
      return this;
    }
    public APIRequestGetPhotos requestPlaceField () {
      return this.requestPlaceField(true);
    }
    public APIRequestGetPhotos requestPlaceField (boolean value) {
      this.requestField("place", value);
      return this;
    }
    public APIRequestGetPhotos requestPositionField () {
      return this.requestPositionField(true);
    }
    public APIRequestGetPhotos requestPositionField (boolean value) {
      this.requestField("position", value);
      return this;
    }
    public APIRequestGetPhotos requestSourceField () {
      return this.requestSourceField(true);
    }
    public APIRequestGetPhotos requestSourceField (boolean value) {
      this.requestField("source", value);
      return this;
    }
    public APIRequestGetPhotos requestTargetField () {
      return this.requestTargetField(true);
    }
    public APIRequestGetPhotos requestTargetField (boolean value) {
      this.requestField("target", value);
      return this;
    }
    public APIRequestGetPhotos requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetPhotos requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
    public APIRequestGetPhotos requestWebpImagesField () {
      return this.requestWebpImagesField(true);
    }
    public APIRequestGetPhotos requestWebpImagesField (boolean value) {
      this.requestField("webp_images", value);
      return this;
    }
    public APIRequestGetPhotos requestWidthField () {
      return this.requestWidthField(true);
    }
    public APIRequestGetPhotos requestWidthField (boolean value) {
      this.requestField("width", value);
      return this;
    }
  }

  public static class APIRequestCreatePhoto extends APIRequest<Photo> {

    Photo lastResponse = null;
    @Override
    public Photo getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "aid",
      "allow_spherical_photo",
      "alt_text_custom",
      "android_key_hash",
      "application_id",
      "attempt",
      "audience_exp",
      "backdated_time",
      "backdated_time_granularity",
      "caption",
      "composer_session_id",
      "direct_share_status",
      "feed_targeting",
      "filter_type",
      "full_res_is_coming_later",
      "initial_view_heading_override_degrees",
      "initial_view_pitch_override_degrees",
      "initial_view_vertical_fov_override_degrees",
      "ios_bundle_id",
      "is_explicit_location",
      "is_explicit_place",
      "manual_privacy",
      "message",
      "name",
      "no_story",
      "offline_id",
      "og_action_type_id",
      "og_icon_id",
      "og_object_id",
      "og_phrase",
      "og_set_profile_badge",
      "og_suggestion_mechanism",
      "place",
      "privacy",
      "profile_id",
      "proxied_app_id",
      "published",
      "qn",
      "scheduled_publish_time",
      "spherical_metadata",
      "sponsor_id",
      "sponsor_relationship",
      "tags",
      "target_id",
      "targeting",
      "time_since_original_post",
      "uid",
      "unpublished_content_type",
      "url",
      "user_selected_tags",
      "vault_image_id",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public Photo parseResponse(String response, String header) throws APIException {
      return Photo.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public Photo execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public Photo execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<Photo> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<Photo> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, Photo>() {
           public Photo apply(ResponseWrapper result) {
             try {
               return APIRequestCreatePhoto.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreatePhoto(String nodeId, APIContext context) {
      super(context, nodeId, "/photos", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreatePhoto setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreatePhoto setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreatePhoto setAid (String aid) {
      this.setParam("aid", aid);
      return this;
    }

    public APIRequestCreatePhoto setAllowSphericalPhoto (Boolean allowSphericalPhoto) {
      this.setParam("allow_spherical_photo", allowSphericalPhoto);
      return this;
    }
    public APIRequestCreatePhoto setAllowSphericalPhoto (String allowSphericalPhoto) {
      this.setParam("allow_spherical_photo", allowSphericalPhoto);
      return this;
    }

    public APIRequestCreatePhoto setAltTextCustom (String altTextCustom) {
      this.setParam("alt_text_custom", altTextCustom);
      return this;
    }

    public APIRequestCreatePhoto setAndroidKeyHash (String androidKeyHash) {
      this.setParam("android_key_hash", androidKeyHash);
      return this;
    }

    public APIRequestCreatePhoto setApplicationId (String applicationId) {
      this.setParam("application_id", applicationId);
      return this;
    }

    public APIRequestCreatePhoto setAttempt (Long attempt) {
      this.setParam("attempt", attempt);
      return this;
    }
    public APIRequestCreatePhoto setAttempt (String attempt) {
      this.setParam("attempt", attempt);
      return this;
    }

    public APIRequestCreatePhoto setAudienceExp (Boolean audienceExp) {
      this.setParam("audience_exp", audienceExp);
      return this;
    }
    public APIRequestCreatePhoto setAudienceExp (String audienceExp) {
      this.setParam("audience_exp", audienceExp);
      return this;
    }

    public APIRequestCreatePhoto setBackdatedTime (String backdatedTime) {
      this.setParam("backdated_time", backdatedTime);
      return this;
    }

    public APIRequestCreatePhoto setBackdatedTimeGranularity (Photo.EnumBackdatedTimeGranularity backdatedTimeGranularity) {
      this.setParam("backdated_time_granularity", backdatedTimeGranularity);
      return this;
    }
    public APIRequestCreatePhoto setBackdatedTimeGranularity (String backdatedTimeGranularity) {
      this.setParam("backdated_time_granularity", backdatedTimeGranularity);
      return this;
    }

    public APIRequestCreatePhoto setCaption (String caption) {
      this.setParam("caption", caption);
      return this;
    }

    public APIRequestCreatePhoto setComposerSessionId (String composerSessionId) {
      this.setParam("composer_session_id", composerSessionId);
      return this;
    }

    public APIRequestCreatePhoto setDirectShareStatus (Long directShareStatus) {
      this.setParam("direct_share_status", directShareStatus);
      return this;
    }
    public APIRequestCreatePhoto setDirectShareStatus (String directShareStatus) {
      this.setParam("direct_share_status", directShareStatus);
      return this;
    }

    public APIRequestCreatePhoto setFeedTargeting (Object feedTargeting) {
      this.setParam("feed_targeting", feedTargeting);
      return this;
    }
    public APIRequestCreatePhoto setFeedTargeting (String feedTargeting) {
      this.setParam("feed_targeting", feedTargeting);
      return this;
    }

    public APIRequestCreatePhoto setFilterType (Long filterType) {
      this.setParam("filter_type", filterType);
      return this;
    }
    public APIRequestCreatePhoto setFilterType (String filterType) {
      this.setParam("filter_type", filterType);
      return this;
    }

    public APIRequestCreatePhoto setFullResIsComingLater (Boolean fullResIsComingLater) {
      this.setParam("full_res_is_coming_later", fullResIsComingLater);
      return this;
    }
    public APIRequestCreatePhoto setFullResIsComingLater (String fullResIsComingLater) {
      this.setParam("full_res_is_coming_later", fullResIsComingLater);
      return this;
    }

    public APIRequestCreatePhoto setInitialViewHeadingOverrideDegrees (Long initialViewHeadingOverrideDegrees) {
      this.setParam("initial_view_heading_override_degrees", initialViewHeadingOverrideDegrees);
      return this;
    }
    public APIRequestCreatePhoto setInitialViewHeadingOverrideDegrees (String initialViewHeadingOverrideDegrees) {
      this.setParam("initial_view_heading_override_degrees", initialViewHeadingOverrideDegrees);
      return this;
    }

    public APIRequestCreatePhoto setInitialViewPitchOverrideDegrees (Long initialViewPitchOverrideDegrees) {
      this.setParam("initial_view_pitch_override_degrees", initialViewPitchOverrideDegrees);
      return this;
    }
    public APIRequestCreatePhoto setInitialViewPitchOverrideDegrees (String initialViewPitchOverrideDegrees) {
      this.setParam("initial_view_pitch_override_degrees", initialViewPitchOverrideDegrees);
      return this;
    }

    public APIRequestCreatePhoto setInitialViewVerticalFovOverrideDegrees (Long initialViewVerticalFovOverrideDegrees) {
      this.setParam("initial_view_vertical_fov_override_degrees", initialViewVerticalFovOverrideDegrees);
      return this;
    }
    public APIRequestCreatePhoto setInitialViewVerticalFovOverrideDegrees (String initialViewVerticalFovOverrideDegrees) {
      this.setParam("initial_view_vertical_fov_override_degrees", initialViewVerticalFovOverrideDegrees);
      return this;
    }

    public APIRequestCreatePhoto setIosBundleId (String iosBundleId) {
      this.setParam("ios_bundle_id", iosBundleId);
      return this;
    }

    public APIRequestCreatePhoto setIsExplicitLocation (Boolean isExplicitLocation) {
      this.setParam("is_explicit_location", isExplicitLocation);
      return this;
    }
    public APIRequestCreatePhoto setIsExplicitLocation (String isExplicitLocation) {
      this.setParam("is_explicit_location", isExplicitLocation);
      return this;
    }

    public APIRequestCreatePhoto setIsExplicitPlace (Boolean isExplicitPlace) {
      this.setParam("is_explicit_place", isExplicitPlace);
      return this;
    }
    public APIRequestCreatePhoto setIsExplicitPlace (String isExplicitPlace) {
      this.setParam("is_explicit_place", isExplicitPlace);
      return this;
    }

    public APIRequestCreatePhoto setManualPrivacy (Boolean manualPrivacy) {
      this.setParam("manual_privacy", manualPrivacy);
      return this;
    }
    public APIRequestCreatePhoto setManualPrivacy (String manualPrivacy) {
      this.setParam("manual_privacy", manualPrivacy);
      return this;
    }

    public APIRequestCreatePhoto setMessage (String message) {
      this.setParam("message", message);
      return this;
    }

    public APIRequestCreatePhoto setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreatePhoto setNoStory (Boolean noStory) {
      this.setParam("no_story", noStory);
      return this;
    }
    public APIRequestCreatePhoto setNoStory (String noStory) {
      this.setParam("no_story", noStory);
      return this;
    }

    public APIRequestCreatePhoto setOfflineId (Long offlineId) {
      this.setParam("offline_id", offlineId);
      return this;
    }
    public APIRequestCreatePhoto setOfflineId (String offlineId) {
      this.setParam("offline_id", offlineId);
      return this;
    }

    public APIRequestCreatePhoto setOgActionTypeId (String ogActionTypeId) {
      this.setParam("og_action_type_id", ogActionTypeId);
      return this;
    }

    public APIRequestCreatePhoto setOgIconId (String ogIconId) {
      this.setParam("og_icon_id", ogIconId);
      return this;
    }

    public APIRequestCreatePhoto setOgObjectId (String ogObjectId) {
      this.setParam("og_object_id", ogObjectId);
      return this;
    }

    public APIRequestCreatePhoto setOgPhrase (String ogPhrase) {
      this.setParam("og_phrase", ogPhrase);
      return this;
    }

    public APIRequestCreatePhoto setOgSetProfileBadge (Boolean ogSetProfileBadge) {
      this.setParam("og_set_profile_badge", ogSetProfileBadge);
      return this;
    }
    public APIRequestCreatePhoto setOgSetProfileBadge (String ogSetProfileBadge) {
      this.setParam("og_set_profile_badge", ogSetProfileBadge);
      return this;
    }

    public APIRequestCreatePhoto setOgSuggestionMechanism (String ogSuggestionMechanism) {
      this.setParam("og_suggestion_mechanism", ogSuggestionMechanism);
      return this;
    }

    public APIRequestCreatePhoto setPlace (Object place) {
      this.setParam("place", place);
      return this;
    }
    public APIRequestCreatePhoto setPlace (String place) {
      this.setParam("place", place);
      return this;
    }

    public APIRequestCreatePhoto setPrivacy (String privacy) {
      this.setParam("privacy", privacy);
      return this;
    }

    public APIRequestCreatePhoto setProfileId (Long profileId) {
      this.setParam("profile_id", profileId);
      return this;
    }
    public APIRequestCreatePhoto setProfileId (String profileId) {
      this.setParam("profile_id", profileId);
      return this;
    }

    public APIRequestCreatePhoto setProxiedAppId (String proxiedAppId) {
      this.setParam("proxied_app_id", proxiedAppId);
      return this;
    }

    public APIRequestCreatePhoto setPublished (Boolean published) {
      this.setParam("published", published);
      return this;
    }
    public APIRequestCreatePhoto setPublished (String published) {
      this.setParam("published", published);
      return this;
    }

    public APIRequestCreatePhoto setQn (String qn) {
      this.setParam("qn", qn);
      return this;
    }

    public APIRequestCreatePhoto setScheduledPublishTime (Long scheduledPublishTime) {
      this.setParam("scheduled_publish_time", scheduledPublishTime);
      return this;
    }
    public APIRequestCreatePhoto setScheduledPublishTime (String scheduledPublishTime) {
      this.setParam("scheduled_publish_time", scheduledPublishTime);
      return this;
    }

    public APIRequestCreatePhoto setSphericalMetadata (Map<String, String> sphericalMetadata) {
      this.setParam("spherical_metadata", sphericalMetadata);
      return this;
    }
    public APIRequestCreatePhoto setSphericalMetadata (String sphericalMetadata) {
      this.setParam("spherical_metadata", sphericalMetadata);
      return this;
    }

    public APIRequestCreatePhoto setSponsorId (String sponsorId) {
      this.setParam("sponsor_id", sponsorId);
      return this;
    }

    public APIRequestCreatePhoto setSponsorRelationship (Long sponsorRelationship) {
      this.setParam("sponsor_relationship", sponsorRelationship);
      return this;
    }
    public APIRequestCreatePhoto setSponsorRelationship (String sponsorRelationship) {
      this.setParam("sponsor_relationship", sponsorRelationship);
      return this;
    }

    public APIRequestCreatePhoto setTags (List<Object> tags) {
      this.setParam("tags", tags);
      return this;
    }
    public APIRequestCreatePhoto setTags (String tags) {
      this.setParam("tags", tags);
      return this;
    }

    public APIRequestCreatePhoto setTargetId (Long targetId) {
      this.setParam("target_id", targetId);
      return this;
    }
    public APIRequestCreatePhoto setTargetId (String targetId) {
      this.setParam("target_id", targetId);
      return this;
    }

    public APIRequestCreatePhoto setTargeting (Object targeting) {
      this.setParam("targeting", targeting);
      return this;
    }
    public APIRequestCreatePhoto setTargeting (String targeting) {
      this.setParam("targeting", targeting);
      return this;
    }

    public APIRequestCreatePhoto setTimeSinceOriginalPost (Long timeSinceOriginalPost) {
      this.setParam("time_since_original_post", timeSinceOriginalPost);
      return this;
    }
    public APIRequestCreatePhoto setTimeSinceOriginalPost (String timeSinceOriginalPost) {
      this.setParam("time_since_original_post", timeSinceOriginalPost);
      return this;
    }

    public APIRequestCreatePhoto setUid (Long uid) {
      this.setParam("uid", uid);
      return this;
    }
    public APIRequestCreatePhoto setUid (String uid) {
      this.setParam("uid", uid);
      return this;
    }

    public APIRequestCreatePhoto setUnpublishedContentType (Photo.EnumUnpublishedContentType unpublishedContentType) {
      this.setParam("unpublished_content_type", unpublishedContentType);
      return this;
    }
    public APIRequestCreatePhoto setUnpublishedContentType (String unpublishedContentType) {
      this.setParam("unpublished_content_type", unpublishedContentType);
      return this;
    }

    public APIRequestCreatePhoto setUrl (String url) {
      this.setParam("url", url);
      return this;
    }

    public APIRequestCreatePhoto setUserSelectedTags (Boolean userSelectedTags) {
      this.setParam("user_selected_tags", userSelectedTags);
      return this;
    }
    public APIRequestCreatePhoto setUserSelectedTags (String userSelectedTags) {
      this.setParam("user_selected_tags", userSelectedTags);
      return this;
    }

    public APIRequestCreatePhoto setVaultImageId (String vaultImageId) {
      this.setParam("vault_image_id", vaultImageId);
      return this;
    }

    public APIRequestCreatePhoto requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreatePhoto requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreatePhoto requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreatePhoto requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreatePhoto requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreatePhoto requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetPicture extends APIRequest<ProfilePictureSource> {

    APINodeList<ProfilePictureSource> lastResponse = null;
    @Override
    public APINodeList<ProfilePictureSource> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "height",
      "redirect",
      "type",
      "width",
    };

    public static final String[] FIELDS = {
      "bottom",
      "cache_key",
      "height",
      "is_silhouette",
      "left",
      "right",
      "top",
      "url",
      "width",
    };

    @Override
    public APINodeList<ProfilePictureSource> parseResponse(String response, String header) throws APIException {
      return ProfilePictureSource.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<ProfilePictureSource> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<ProfilePictureSource> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<ProfilePictureSource>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<ProfilePictureSource>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<ProfilePictureSource>>() {
           public APINodeList<ProfilePictureSource> apply(ResponseWrapper result) {
             try {
               return APIRequestGetPicture.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetPicture(String nodeId, APIContext context) {
      super(context, nodeId, "/picture", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetPicture setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetPicture setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetPicture setHeight (Long height) {
      this.setParam("height", height);
      return this;
    }
    public APIRequestGetPicture setHeight (String height) {
      this.setParam("height", height);
      return this;
    }

    public APIRequestGetPicture setRedirect (Boolean redirect) {
      this.setParam("redirect", redirect);
      return this;
    }
    public APIRequestGetPicture setRedirect (String redirect) {
      this.setParam("redirect", redirect);
      return this;
    }

    public APIRequestGetPicture setType (ProfilePictureSource.EnumType type) {
      this.setParam("type", type);
      return this;
    }
    public APIRequestGetPicture setType (String type) {
      this.setParam("type", type);
      return this;
    }

    public APIRequestGetPicture setWidth (Long width) {
      this.setParam("width", width);
      return this;
    }
    public APIRequestGetPicture setWidth (String width) {
      this.setParam("width", width);
      return this;
    }

    public APIRequestGetPicture requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetPicture requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPicture requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetPicture requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPicture requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetPicture requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetPicture requestBottomField () {
      return this.requestBottomField(true);
    }
    public APIRequestGetPicture requestBottomField (boolean value) {
      this.requestField("bottom", value);
      return this;
    }
    public APIRequestGetPicture requestCacheKeyField () {
      return this.requestCacheKeyField(true);
    }
    public APIRequestGetPicture requestCacheKeyField (boolean value) {
      this.requestField("cache_key", value);
      return this;
    }
    public APIRequestGetPicture requestHeightField () {
      return this.requestHeightField(true);
    }
    public APIRequestGetPicture requestHeightField (boolean value) {
      this.requestField("height", value);
      return this;
    }
    public APIRequestGetPicture requestIsSilhouetteField () {
      return this.requestIsSilhouetteField(true);
    }
    public APIRequestGetPicture requestIsSilhouetteField (boolean value) {
      this.requestField("is_silhouette", value);
      return this;
    }
    public APIRequestGetPicture requestLeftField () {
      return this.requestLeftField(true);
    }
    public APIRequestGetPicture requestLeftField (boolean value) {
      this.requestField("left", value);
      return this;
    }
    public APIRequestGetPicture requestRightField () {
      return this.requestRightField(true);
    }
    public APIRequestGetPicture requestRightField (boolean value) {
      this.requestField("right", value);
      return this;
    }
    public APIRequestGetPicture requestTopField () {
      return this.requestTopField(true);
    }
    public APIRequestGetPicture requestTopField (boolean value) {
      this.requestField("top", value);
      return this;
    }
    public APIRequestGetPicture requestUrlField () {
      return this.requestUrlField(true);
    }
    public APIRequestGetPicture requestUrlField (boolean value) {
      this.requestField("url", value);
      return this;
    }
    public APIRequestGetPicture requestWidthField () {
      return this.requestWidthField(true);
    }
    public APIRequestGetPicture requestWidthField (boolean value) {
      this.requestField("width", value);
      return this;
    }
  }

  public static class APIRequestCreatePlace extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "address",
      "city_id",
      "coords",
      "custom_provider",
      "description",
      "geometry",
      "name",
      "neighborhood_name",
      "override_ids",
      "phone",
      "pin_source",
      "privacy",
      "topics",
      "type",
      "uid",
      "website",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestCreatePlace.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreatePlace(String nodeId, APIContext context) {
      super(context, nodeId, "/places", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreatePlace setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreatePlace setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreatePlace setAddress (Object address) {
      this.setParam("address", address);
      return this;
    }
    public APIRequestCreatePlace setAddress (String address) {
      this.setParam("address", address);
      return this;
    }

    public APIRequestCreatePlace setCityId (String cityId) {
      this.setParam("city_id", cityId);
      return this;
    }

    public APIRequestCreatePlace setCoords (Object coords) {
      this.setParam("coords", coords);
      return this;
    }
    public APIRequestCreatePlace setCoords (String coords) {
      this.setParam("coords", coords);
      return this;
    }

    public APIRequestCreatePlace setCustomProvider (String customProvider) {
      this.setParam("custom_provider", customProvider);
      return this;
    }

    public APIRequestCreatePlace setDescription (String description) {
      this.setParam("description", description);
      return this;
    }

    public APIRequestCreatePlace setGeometry (Object geometry) {
      this.setParam("geometry", geometry);
      return this;
    }
    public APIRequestCreatePlace setGeometry (String geometry) {
      this.setParam("geometry", geometry);
      return this;
    }

    public APIRequestCreatePlace setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestCreatePlace setNeighborhoodName (String neighborhoodName) {
      this.setParam("neighborhood_name", neighborhoodName);
      return this;
    }

    public APIRequestCreatePlace setOverrideIds (List<Long> overrideIds) {
      this.setParam("override_ids", overrideIds);
      return this;
    }
    public APIRequestCreatePlace setOverrideIds (String overrideIds) {
      this.setParam("override_ids", overrideIds);
      return this;
    }

    public APIRequestCreatePlace setPhone (String phone) {
      this.setParam("phone", phone);
      return this;
    }

    public APIRequestCreatePlace setPinSource (String pinSource) {
      this.setParam("pin_source", pinSource);
      return this;
    }

    public APIRequestCreatePlace setPrivacy (String privacy) {
      this.setParam("privacy", privacy);
      return this;
    }

    public APIRequestCreatePlace setTopics (List<String> topics) {
      this.setParam("topics", topics);
      return this;
    }
    public APIRequestCreatePlace setTopics (String topics) {
      this.setParam("topics", topics);
      return this;
    }

    public APIRequestCreatePlace setType (EnumType type) {
      this.setParam("type", type);
      return this;
    }
    public APIRequestCreatePlace setType (String type) {
      this.setParam("type", type);
      return this;
    }

    public APIRequestCreatePlace setUid (Long uid) {
      this.setParam("uid", uid);
      return this;
    }
    public APIRequestCreatePlace setUid (String uid) {
      this.setParam("uid", uid);
      return this;
    }

    public APIRequestCreatePlace setWebsite (String website) {
      this.setParam("website", website);
      return this;
    }

    public APIRequestCreatePlace requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreatePlace requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreatePlace requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreatePlace requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreatePlace requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreatePlace requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetPromotableDomains extends APIRequest<Domain> {

    APINodeList<Domain> lastResponse = null;
    @Override
    public APINodeList<Domain> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "id",
      "name",
      "url",
    };

    @Override
    public APINodeList<Domain> parseResponse(String response, String header) throws APIException {
      return Domain.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Domain> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Domain> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Domain>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Domain>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Domain>>() {
           public APINodeList<Domain> apply(ResponseWrapper result) {
             try {
               return APIRequestGetPromotableDomains.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetPromotableDomains(String nodeId, APIContext context) {
      super(context, nodeId, "/promotable_domains", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetPromotableDomains setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetPromotableDomains setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetPromotableDomains requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetPromotableDomains requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPromotableDomains requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetPromotableDomains requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPromotableDomains requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetPromotableDomains requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetPromotableDomains requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetPromotableDomains requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetPromotableDomains requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetPromotableDomains requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetPromotableDomains requestUrlField () {
      return this.requestUrlField(true);
    }
    public APIRequestGetPromotableDomains requestUrlField (boolean value) {
      this.requestField("url", value);
      return this;
    }
  }

  public static class APIRequestGetPromotableEvents extends APIRequest<Event> {

    APINodeList<Event> lastResponse = null;
    @Override
    public APINodeList<Event> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "include_past_events",
      "is_page_event",
      "page_id",
      "promotable_event_types",
    };

    public static final String[] FIELDS = {
      "attending_count",
      "can_guests_invite",
      "category",
      "cover",
      "declined_count",
      "description",
      "discount_code_enabled",
      "end_time",
      "event_times",
      "guest_list_enabled",
      "id",
      "interested_count",
      "is_canceled",
      "is_draft",
      "is_page_owned",
      "maybe_count",
      "name",
      "noreply_count",
      "owner",
      "parent_group",
      "place",
      "scheduled_publish_time",
      "start_time",
      "ticket_uri",
      "ticket_uri_start_sales_time",
      "ticketing_privacy_uri",
      "ticketing_terms_uri",
      "timezone",
      "type",
      "updated_time",
    };

    @Override
    public APINodeList<Event> parseResponse(String response, String header) throws APIException {
      return Event.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Event> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Event> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Event>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Event>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Event>>() {
           public APINodeList<Event> apply(ResponseWrapper result) {
             try {
               return APIRequestGetPromotableEvents.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetPromotableEvents(String nodeId, APIContext context) {
      super(context, nodeId, "/promotable_events", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetPromotableEvents setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetPromotableEvents setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetPromotableEvents setIncludePastEvents (Boolean includePastEvents) {
      this.setParam("include_past_events", includePastEvents);
      return this;
    }
    public APIRequestGetPromotableEvents setIncludePastEvents (String includePastEvents) {
      this.setParam("include_past_events", includePastEvents);
      return this;
    }

    public APIRequestGetPromotableEvents setIsPageEvent (Boolean isPageEvent) {
      this.setParam("is_page_event", isPageEvent);
      return this;
    }
    public APIRequestGetPromotableEvents setIsPageEvent (String isPageEvent) {
      this.setParam("is_page_event", isPageEvent);
      return this;
    }

    public APIRequestGetPromotableEvents setPageId (Long pageId) {
      this.setParam("page_id", pageId);
      return this;
    }
    public APIRequestGetPromotableEvents setPageId (String pageId) {
      this.setParam("page_id", pageId);
      return this;
    }

    public APIRequestGetPromotableEvents setPromotableEventTypes (List<Event.EnumPromotableEventTypes> promotableEventTypes) {
      this.setParam("promotable_event_types", promotableEventTypes);
      return this;
    }
    public APIRequestGetPromotableEvents setPromotableEventTypes (String promotableEventTypes) {
      this.setParam("promotable_event_types", promotableEventTypes);
      return this;
    }

    public APIRequestGetPromotableEvents requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetPromotableEvents requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPromotableEvents requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetPromotableEvents requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetPromotableEvents requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetPromotableEvents requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetPromotableEvents requestAttendingCountField () {
      return this.requestAttendingCountField(true);
    }
    public APIRequestGetPromotableEvents requestAttendingCountField (boolean value) {
      this.requestField("attending_count", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestCanGuestsInviteField () {
      return this.requestCanGuestsInviteField(true);
    }
    public APIRequestGetPromotableEvents requestCanGuestsInviteField (boolean value) {
      this.requestField("can_guests_invite", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestCategoryField () {
      return this.requestCategoryField(true);
    }
    public APIRequestGetPromotableEvents requestCategoryField (boolean value) {
      this.requestField("category", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestCoverField () {
      return this.requestCoverField(true);
    }
    public APIRequestGetPromotableEvents requestCoverField (boolean value) {
      this.requestField("cover", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestDeclinedCountField () {
      return this.requestDeclinedCountField(true);
    }
    public APIRequestGetPromotableEvents requestDeclinedCountField (boolean value) {
      this.requestField("declined_count", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetPromotableEvents requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestDiscountCodeEnabledField () {
      return this.requestDiscountCodeEnabledField(true);
    }
    public APIRequestGetPromotableEvents requestDiscountCodeEnabledField (boolean value) {
      this.requestField("discount_code_enabled", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestEndTimeField () {
      return this.requestEndTimeField(true);
    }
    public APIRequestGetPromotableEvents requestEndTimeField (boolean value) {
      this.requestField("end_time", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestEventTimesField () {
      return this.requestEventTimesField(true);
    }
    public APIRequestGetPromotableEvents requestEventTimesField (boolean value) {
      this.requestField("event_times", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestGuestListEnabledField () {
      return this.requestGuestListEnabledField(true);
    }
    public APIRequestGetPromotableEvents requestGuestListEnabledField (boolean value) {
      this.requestField("guest_list_enabled", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetPromotableEvents requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestInterestedCountField () {
      return this.requestInterestedCountField(true);
    }
    public APIRequestGetPromotableEvents requestInterestedCountField (boolean value) {
      this.requestField("interested_count", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestIsCanceledField () {
      return this.requestIsCanceledField(true);
    }
    public APIRequestGetPromotableEvents requestIsCanceledField (boolean value) {
      this.requestField("is_canceled", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestIsDraftField () {
      return this.requestIsDraftField(true);
    }
    public APIRequestGetPromotableEvents requestIsDraftField (boolean value) {
      this.requestField("is_draft", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestIsPageOwnedField () {
      return this.requestIsPageOwnedField(true);
    }
    public APIRequestGetPromotableEvents requestIsPageOwnedField (boolean value) {
      this.requestField("is_page_owned", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestMaybeCountField () {
      return this.requestMaybeCountField(true);
    }
    public APIRequestGetPromotableEvents requestMaybeCountField (boolean value) {
      this.requestField("maybe_count", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetPromotableEvents requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestNoreplyCountField () {
      return this.requestNoreplyCountField(true);
    }
    public APIRequestGetPromotableEvents requestNoreplyCountField (boolean value) {
      this.requestField("noreply_count", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestOwnerField () {
      return this.requestOwnerField(true);
    }
    public APIRequestGetPromotableEvents requestOwnerField (boolean value) {
      this.requestField("owner", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestParentGroupField () {
      return this.requestParentGroupField(true);
    }
    public APIRequestGetPromotableEvents requestParentGroupField (boolean value) {
      this.requestField("parent_group", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestPlaceField () {
      return this.requestPlaceField(true);
    }
    public APIRequestGetPromotableEvents requestPlaceField (boolean value) {
      this.requestField("place", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestScheduledPublishTimeField () {
      return this.requestScheduledPublishTimeField(true);
    }
    public APIRequestGetPromotableEvents requestScheduledPublishTimeField (boolean value) {
      this.requestField("scheduled_publish_time", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestStartTimeField () {
      return this.requestStartTimeField(true);
    }
    public APIRequestGetPromotableEvents requestStartTimeField (boolean value) {
      this.requestField("start_time", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestTicketUriField () {
      return this.requestTicketUriField(true);
    }
    public APIRequestGetPromotableEvents requestTicketUriField (boolean value) {
      this.requestField("ticket_uri", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestTicketUriStartSalesTimeField () {
      return this.requestTicketUriStartSalesTimeField(true);
    }
    public APIRequestGetPromotableEvents requestTicketUriStartSalesTimeField (boolean value) {
      this.requestField("ticket_uri_start_sales_time", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestTicketingPrivacyUriField () {
      return this.requestTicketingPrivacyUriField(true);
    }
    public APIRequestGetPromotableEvents requestTicketingPrivacyUriField (boolean value) {
      this.requestField("ticketing_privacy_uri", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestTicketingTermsUriField () {
      return this.requestTicketingTermsUriField(true);
    }
    public APIRequestGetPromotableEvents requestTicketingTermsUriField (boolean value) {
      this.requestField("ticketing_terms_uri", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestTimezoneField () {
      return this.requestTimezoneField(true);
    }
    public APIRequestGetPromotableEvents requestTimezoneField (boolean value) {
      this.requestField("timezone", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestTypeField () {
      return this.requestTypeField(true);
    }
    public APIRequestGetPromotableEvents requestTypeField (boolean value) {
      this.requestField("type", value);
      return this;
    }
    public APIRequestGetPromotableEvents requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetPromotableEvents requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
  }

  public static class APIRequestGetRequestHistory extends APIRequest<RequestHistory> {

    APINodeList<RequestHistory> lastResponse = null;
    @Override
    public APINodeList<RequestHistory> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "api_version",
      "created_time",
      "error_code",
      "graph_path",
      "http_method",
      "post_params",
      "query_params",
    };

    @Override
    public APINodeList<RequestHistory> parseResponse(String response, String header) throws APIException {
      return RequestHistory.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<RequestHistory> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<RequestHistory> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<RequestHistory>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<RequestHistory>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<RequestHistory>>() {
           public APINodeList<RequestHistory> apply(ResponseWrapper result) {
             try {
               return APIRequestGetRequestHistory.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetRequestHistory(String nodeId, APIContext context) {
      super(context, nodeId, "/request_history", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetRequestHistory setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetRequestHistory setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetRequestHistory requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetRequestHistory requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetRequestHistory requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetRequestHistory requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetRequestHistory requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetRequestHistory requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetRequestHistory requestApiVersionField () {
      return this.requestApiVersionField(true);
    }
    public APIRequestGetRequestHistory requestApiVersionField (boolean value) {
      this.requestField("api_version", value);
      return this;
    }
    public APIRequestGetRequestHistory requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetRequestHistory requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetRequestHistory requestErrorCodeField () {
      return this.requestErrorCodeField(true);
    }
    public APIRequestGetRequestHistory requestErrorCodeField (boolean value) {
      this.requestField("error_code", value);
      return this;
    }
    public APIRequestGetRequestHistory requestGraphPathField () {
      return this.requestGraphPathField(true);
    }
    public APIRequestGetRequestHistory requestGraphPathField (boolean value) {
      this.requestField("graph_path", value);
      return this;
    }
    public APIRequestGetRequestHistory requestHttpMethodField () {
      return this.requestHttpMethodField(true);
    }
    public APIRequestGetRequestHistory requestHttpMethodField (boolean value) {
      this.requestField("http_method", value);
      return this;
    }
    public APIRequestGetRequestHistory requestPostParamsField () {
      return this.requestPostParamsField(true);
    }
    public APIRequestGetRequestHistory requestPostParamsField (boolean value) {
      this.requestField("post_params", value);
      return this;
    }
    public APIRequestGetRequestHistory requestQueryParamsField () {
      return this.requestQueryParamsField(true);
    }
    public APIRequestGetRequestHistory requestQueryParamsField (boolean value) {
      this.requestField("query_params", value);
      return this;
    }
  }

  public static class APIRequestCreateScreenName extends APIRequest<User> {

    User lastResponse = null;
    @Override
    public User getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "service_type",
      "value",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public User parseResponse(String response, String header) throws APIException {
      return User.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public User execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public User execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<User> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<User> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, User>() {
           public User apply(ResponseWrapper result) {
             try {
               return APIRequestCreateScreenName.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateScreenName(String nodeId, APIContext context) {
      super(context, nodeId, "/screennames", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateScreenName setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateScreenName setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateScreenName setServiceType (User.EnumServiceType serviceType) {
      this.setParam("service_type", serviceType);
      return this;
    }
    public APIRequestCreateScreenName setServiceType (String serviceType) {
      this.setParam("service_type", serviceType);
      return this;
    }

    public APIRequestCreateScreenName setValue (String value) {
      this.setParam("value", value);
      return this;
    }

    public APIRequestCreateScreenName requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateScreenName requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateScreenName requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateScreenName requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateScreenName requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateScreenName requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestCreateStagingResource extends APIRequest<User> {

    User lastResponse = null;
    @Override
    public User getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "file",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public User parseResponse(String response, String header) throws APIException {
      return User.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public User execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public User execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<User> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<User> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, User>() {
           public User apply(ResponseWrapper result) {
             try {
               return APIRequestCreateStagingResource.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateStagingResource(String nodeId, APIContext context) {
      super(context, nodeId, "/staging_resources", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateStagingResource setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateStagingResource setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }

    public APIRequestCreateStagingResource addUploadFile (String uploadName, File file) {
      this.setParam(uploadName, file);
      return this;
    }

    public APIRequestCreateStagingResource setUseVideoEndpoint(boolean useVideoEndpoint) {
      this.useVideoEndpoint = useVideoEndpoint;
      return this;
    }

    public APIRequestCreateStagingResource requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateStagingResource requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateStagingResource requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateStagingResource requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateStagingResource requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateStagingResource requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGetTaggableFriends extends APIRequest<UserTaggableFriend> {

    APINodeList<UserTaggableFriend> lastResponse = null;
    @Override
    public APINodeList<UserTaggableFriend> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "first_name",
      "id",
      "last_name",
      "middle_name",
      "name",
    };

    @Override
    public APINodeList<UserTaggableFriend> parseResponse(String response, String header) throws APIException {
      return UserTaggableFriend.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<UserTaggableFriend> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<UserTaggableFriend> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<UserTaggableFriend>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<UserTaggableFriend>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<UserTaggableFriend>>() {
           public APINodeList<UserTaggableFriend> apply(ResponseWrapper result) {
             try {
               return APIRequestGetTaggableFriends.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetTaggableFriends(String nodeId, APIContext context) {
      super(context, nodeId, "/taggable_friends", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetTaggableFriends setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetTaggableFriends setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetTaggableFriends requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetTaggableFriends requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTaggableFriends requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetTaggableFriends requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTaggableFriends requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetTaggableFriends requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetTaggableFriends requestFirstNameField () {
      return this.requestFirstNameField(true);
    }
    public APIRequestGetTaggableFriends requestFirstNameField (boolean value) {
      this.requestField("first_name", value);
      return this;
    }
    public APIRequestGetTaggableFriends requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetTaggableFriends requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetTaggableFriends requestLastNameField () {
      return this.requestLastNameField(true);
    }
    public APIRequestGetTaggableFriends requestLastNameField (boolean value) {
      this.requestField("last_name", value);
      return this;
    }
    public APIRequestGetTaggableFriends requestMiddleNameField () {
      return this.requestMiddleNameField(true);
    }
    public APIRequestGetTaggableFriends requestMiddleNameField (boolean value) {
      this.requestField("middle_name", value);
      return this;
    }
    public APIRequestGetTaggableFriends requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetTaggableFriends requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
  }

  public static class APIRequestGetTelevision extends APIRequest<Page> {

    APINodeList<Page> lastResponse = null;
    @Override
    public APINodeList<Page> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "target_id",
    };

    public static final String[] FIELDS = {
      "about",
      "access_token",
      "ad_campaign",
      "affiliation",
      "app_id",
      "app_links",
      "artists_we_like",
      "attire",
      "awards",
      "band_interests",
      "band_members",
      "best_page",
      "bio",
      "birthday",
      "booking_agent",
      "built",
      "business",
      "can_checkin",
      "can_post",
      "category",
      "category_list",
      "checkins",
      "company_overview",
      "connected_instagram_account",
      "contact_address",
      "copyright_attribution_insights",
      "copyright_whitelisted_ig_partners",
      "country_page_likes",
      "cover",
      "culinary_team",
      "current_location",
      "description",
      "description_html",
      "directed_by",
      "display_subtext",
      "displayed_message_response_time",
      "emails",
      "engagement",
      "fan_count",
      "featured_video",
      "features",
      "food_styles",
      "founded",
      "general_info",
      "general_manager",
      "genre",
      "global_brand_page_name",
      "global_brand_root_id",
      "has_added_app",
      "has_whatsapp_business_number",
      "has_whatsapp_number",
      "hometown",
      "hours",
      "id",
      "impressum",
      "influences",
      "instagram_business_account",
      "instant_articles_review_status",
      "is_always_open",
      "is_chain",
      "is_community_page",
      "is_eligible_for_branded_content",
      "is_messenger_bot_get_started_enabled",
      "is_messenger_platform_bot",
      "is_owned",
      "is_permanently_closed",
      "is_published",
      "is_unclaimed",
      "is_verified",
      "is_webhooks_subscribed",
      "keywords",
      "leadgen_form_preview_details",
      "leadgen_has_crm_integration",
      "leadgen_has_fat_ping_crm_integration",
      "leadgen_tos_acceptance_time",
      "leadgen_tos_accepted",
      "leadgen_tos_accepting_user",
      "link",
      "location",
      "members",
      "merchant_id",
      "merchant_review_status",
      "messenger_ads_default_icebreakers",
      "messenger_ads_default_page_welcome_message",
      "messenger_ads_default_quick_replies",
      "messenger_ads_quick_replies_type",
      "mission",
      "mpg",
      "name",
      "name_with_location_descriptor",
      "network",
      "new_like_count",
      "offer_eligible",
      "overall_star_rating",
      "page_about_story",
      "page_token",
      "parent_page",
      "parking",
      "payment_options",
      "personal_info",
      "personal_interests",
      "pharma_safety_info",
      "phone",
      "place_type",
      "plot_outline",
      "preferred_audience",
      "press_contact",
      "price_range",
      "privacy_info_url",
      "produced_by",
      "products",
      "promotion_eligible",
      "promotion_ineligible_reason",
      "public_transit",
      "rating_count",
      "recipient",
      "record_label",
      "release_date",
      "restaurant_services",
      "restaurant_specialties",
      "schedule",
      "screenplay_by",
      "season",
      "single_line_address",
      "starring",
      "start_info",
      "store_code",
      "store_location_descriptor",
      "store_number",
      "studio",
      "supports_instant_articles",
      "talking_about_count",
      "unread_message_count",
      "unread_notif_count",
      "unseen_message_count",
      "username",
      "verification_status",
      "voip_info",
      "website",
      "were_here_count",
      "whatsapp_number",
      "written_by",
    };

    @Override
    public APINodeList<Page> parseResponse(String response, String header) throws APIException {
      return Page.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<Page> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<Page> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<Page>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<Page>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<Page>>() {
           public APINodeList<Page> apply(ResponseWrapper result) {
             try {
               return APIRequestGetTelevision.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetTelevision(String nodeId, APIContext context) {
      super(context, nodeId, "/television", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetTelevision setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetTelevision setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetTelevision setTargetId (String targetId) {
      this.setParam("target_id", targetId);
      return this;
    }

    public APIRequestGetTelevision requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetTelevision requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTelevision requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetTelevision requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetTelevision requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetTelevision requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetTelevision requestAboutField () {
      return this.requestAboutField(true);
    }
    public APIRequestGetTelevision requestAboutField (boolean value) {
      this.requestField("about", value);
      return this;
    }
    public APIRequestGetTelevision requestAccessTokenField () {
      return this.requestAccessTokenField(true);
    }
    public APIRequestGetTelevision requestAccessTokenField (boolean value) {
      this.requestField("access_token", value);
      return this;
    }
    public APIRequestGetTelevision requestAdCampaignField () {
      return this.requestAdCampaignField(true);
    }
    public APIRequestGetTelevision requestAdCampaignField (boolean value) {
      this.requestField("ad_campaign", value);
      return this;
    }
    public APIRequestGetTelevision requestAffiliationField () {
      return this.requestAffiliationField(true);
    }
    public APIRequestGetTelevision requestAffiliationField (boolean value) {
      this.requestField("affiliation", value);
      return this;
    }
    public APIRequestGetTelevision requestAppIdField () {
      return this.requestAppIdField(true);
    }
    public APIRequestGetTelevision requestAppIdField (boolean value) {
      this.requestField("app_id", value);
      return this;
    }
    public APIRequestGetTelevision requestAppLinksField () {
      return this.requestAppLinksField(true);
    }
    public APIRequestGetTelevision requestAppLinksField (boolean value) {
      this.requestField("app_links", value);
      return this;
    }
    public APIRequestGetTelevision requestArtistsWeLikeField () {
      return this.requestArtistsWeLikeField(true);
    }
    public APIRequestGetTelevision requestArtistsWeLikeField (boolean value) {
      this.requestField("artists_we_like", value);
      return this;
    }
    public APIRequestGetTelevision requestAttireField () {
      return this.requestAttireField(true);
    }
    public APIRequestGetTelevision requestAttireField (boolean value) {
      this.requestField("attire", value);
      return this;
    }
    public APIRequestGetTelevision requestAwardsField () {
      return this.requestAwardsField(true);
    }
    public APIRequestGetTelevision requestAwardsField (boolean value) {
      this.requestField("awards", value);
      return this;
    }
    public APIRequestGetTelevision requestBandInterestsField () {
      return this.requestBandInterestsField(true);
    }
    public APIRequestGetTelevision requestBandInterestsField (boolean value) {
      this.requestField("band_interests", value);
      return this;
    }
    public APIRequestGetTelevision requestBandMembersField () {
      return this.requestBandMembersField(true);
    }
    public APIRequestGetTelevision requestBandMembersField (boolean value) {
      this.requestField("band_members", value);
      return this;
    }
    public APIRequestGetTelevision requestBestPageField () {
      return this.requestBestPageField(true);
    }
    public APIRequestGetTelevision requestBestPageField (boolean value) {
      this.requestField("best_page", value);
      return this;
    }
    public APIRequestGetTelevision requestBioField () {
      return this.requestBioField(true);
    }
    public APIRequestGetTelevision requestBioField (boolean value) {
      this.requestField("bio", value);
      return this;
    }
    public APIRequestGetTelevision requestBirthdayField () {
      return this.requestBirthdayField(true);
    }
    public APIRequestGetTelevision requestBirthdayField (boolean value) {
      this.requestField("birthday", value);
      return this;
    }
    public APIRequestGetTelevision requestBookingAgentField () {
      return this.requestBookingAgentField(true);
    }
    public APIRequestGetTelevision requestBookingAgentField (boolean value) {
      this.requestField("booking_agent", value);
      return this;
    }
    public APIRequestGetTelevision requestBuiltField () {
      return this.requestBuiltField(true);
    }
    public APIRequestGetTelevision requestBuiltField (boolean value) {
      this.requestField("built", value);
      return this;
    }
    public APIRequestGetTelevision requestBusinessField () {
      return this.requestBusinessField(true);
    }
    public APIRequestGetTelevision requestBusinessField (boolean value) {
      this.requestField("business", value);
      return this;
    }
    public APIRequestGetTelevision requestCanCheckinField () {
      return this.requestCanCheckinField(true);
    }
    public APIRequestGetTelevision requestCanCheckinField (boolean value) {
      this.requestField("can_checkin", value);
      return this;
    }
    public APIRequestGetTelevision requestCanPostField () {
      return this.requestCanPostField(true);
    }
    public APIRequestGetTelevision requestCanPostField (boolean value) {
      this.requestField("can_post", value);
      return this;
    }
    public APIRequestGetTelevision requestCategoryField () {
      return this.requestCategoryField(true);
    }
    public APIRequestGetTelevision requestCategoryField (boolean value) {
      this.requestField("category", value);
      return this;
    }
    public APIRequestGetTelevision requestCategoryListField () {
      return this.requestCategoryListField(true);
    }
    public APIRequestGetTelevision requestCategoryListField (boolean value) {
      this.requestField("category_list", value);
      return this;
    }
    public APIRequestGetTelevision requestCheckinsField () {
      return this.requestCheckinsField(true);
    }
    public APIRequestGetTelevision requestCheckinsField (boolean value) {
      this.requestField("checkins", value);
      return this;
    }
    public APIRequestGetTelevision requestCompanyOverviewField () {
      return this.requestCompanyOverviewField(true);
    }
    public APIRequestGetTelevision requestCompanyOverviewField (boolean value) {
      this.requestField("company_overview", value);
      return this;
    }
    public APIRequestGetTelevision requestConnectedInstagramAccountField () {
      return this.requestConnectedInstagramAccountField(true);
    }
    public APIRequestGetTelevision requestConnectedInstagramAccountField (boolean value) {
      this.requestField("connected_instagram_account", value);
      return this;
    }
    public APIRequestGetTelevision requestContactAddressField () {
      return this.requestContactAddressField(true);
    }
    public APIRequestGetTelevision requestContactAddressField (boolean value) {
      this.requestField("contact_address", value);
      return this;
    }
    public APIRequestGetTelevision requestCopyrightAttributionInsightsField () {
      return this.requestCopyrightAttributionInsightsField(true);
    }
    public APIRequestGetTelevision requestCopyrightAttributionInsightsField (boolean value) {
      this.requestField("copyright_attribution_insights", value);
      return this;
    }
    public APIRequestGetTelevision requestCopyrightWhitelistedIgPartnersField () {
      return this.requestCopyrightWhitelistedIgPartnersField(true);
    }
    public APIRequestGetTelevision requestCopyrightWhitelistedIgPartnersField (boolean value) {
      this.requestField("copyright_whitelisted_ig_partners", value);
      return this;
    }
    public APIRequestGetTelevision requestCountryPageLikesField () {
      return this.requestCountryPageLikesField(true);
    }
    public APIRequestGetTelevision requestCountryPageLikesField (boolean value) {
      this.requestField("country_page_likes", value);
      return this;
    }
    public APIRequestGetTelevision requestCoverField () {
      return this.requestCoverField(true);
    }
    public APIRequestGetTelevision requestCoverField (boolean value) {
      this.requestField("cover", value);
      return this;
    }
    public APIRequestGetTelevision requestCulinaryTeamField () {
      return this.requestCulinaryTeamField(true);
    }
    public APIRequestGetTelevision requestCulinaryTeamField (boolean value) {
      this.requestField("culinary_team", value);
      return this;
    }
    public APIRequestGetTelevision requestCurrentLocationField () {
      return this.requestCurrentLocationField(true);
    }
    public APIRequestGetTelevision requestCurrentLocationField (boolean value) {
      this.requestField("current_location", value);
      return this;
    }
    public APIRequestGetTelevision requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetTelevision requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetTelevision requestDescriptionHtmlField () {
      return this.requestDescriptionHtmlField(true);
    }
    public APIRequestGetTelevision requestDescriptionHtmlField (boolean value) {
      this.requestField("description_html", value);
      return this;
    }
    public APIRequestGetTelevision requestDirectedByField () {
      return this.requestDirectedByField(true);
    }
    public APIRequestGetTelevision requestDirectedByField (boolean value) {
      this.requestField("directed_by", value);
      return this;
    }
    public APIRequestGetTelevision requestDisplaySubtextField () {
      return this.requestDisplaySubtextField(true);
    }
    public APIRequestGetTelevision requestDisplaySubtextField (boolean value) {
      this.requestField("display_subtext", value);
      return this;
    }
    public APIRequestGetTelevision requestDisplayedMessageResponseTimeField () {
      return this.requestDisplayedMessageResponseTimeField(true);
    }
    public APIRequestGetTelevision requestDisplayedMessageResponseTimeField (boolean value) {
      this.requestField("displayed_message_response_time", value);
      return this;
    }
    public APIRequestGetTelevision requestEmailsField () {
      return this.requestEmailsField(true);
    }
    public APIRequestGetTelevision requestEmailsField (boolean value) {
      this.requestField("emails", value);
      return this;
    }
    public APIRequestGetTelevision requestEngagementField () {
      return this.requestEngagementField(true);
    }
    public APIRequestGetTelevision requestEngagementField (boolean value) {
      this.requestField("engagement", value);
      return this;
    }
    public APIRequestGetTelevision requestFanCountField () {
      return this.requestFanCountField(true);
    }
    public APIRequestGetTelevision requestFanCountField (boolean value) {
      this.requestField("fan_count", value);
      return this;
    }
    public APIRequestGetTelevision requestFeaturedVideoField () {
      return this.requestFeaturedVideoField(true);
    }
    public APIRequestGetTelevision requestFeaturedVideoField (boolean value) {
      this.requestField("featured_video", value);
      return this;
    }
    public APIRequestGetTelevision requestFeaturesField () {
      return this.requestFeaturesField(true);
    }
    public APIRequestGetTelevision requestFeaturesField (boolean value) {
      this.requestField("features", value);
      return this;
    }
    public APIRequestGetTelevision requestFoodStylesField () {
      return this.requestFoodStylesField(true);
    }
    public APIRequestGetTelevision requestFoodStylesField (boolean value) {
      this.requestField("food_styles", value);
      return this;
    }
    public APIRequestGetTelevision requestFoundedField () {
      return this.requestFoundedField(true);
    }
    public APIRequestGetTelevision requestFoundedField (boolean value) {
      this.requestField("founded", value);
      return this;
    }
    public APIRequestGetTelevision requestGeneralInfoField () {
      return this.requestGeneralInfoField(true);
    }
    public APIRequestGetTelevision requestGeneralInfoField (boolean value) {
      this.requestField("general_info", value);
      return this;
    }
    public APIRequestGetTelevision requestGeneralManagerField () {
      return this.requestGeneralManagerField(true);
    }
    public APIRequestGetTelevision requestGeneralManagerField (boolean value) {
      this.requestField("general_manager", value);
      return this;
    }
    public APIRequestGetTelevision requestGenreField () {
      return this.requestGenreField(true);
    }
    public APIRequestGetTelevision requestGenreField (boolean value) {
      this.requestField("genre", value);
      return this;
    }
    public APIRequestGetTelevision requestGlobalBrandPageNameField () {
      return this.requestGlobalBrandPageNameField(true);
    }
    public APIRequestGetTelevision requestGlobalBrandPageNameField (boolean value) {
      this.requestField("global_brand_page_name", value);
      return this;
    }
    public APIRequestGetTelevision requestGlobalBrandRootIdField () {
      return this.requestGlobalBrandRootIdField(true);
    }
    public APIRequestGetTelevision requestGlobalBrandRootIdField (boolean value) {
      this.requestField("global_brand_root_id", value);
      return this;
    }
    public APIRequestGetTelevision requestHasAddedAppField () {
      return this.requestHasAddedAppField(true);
    }
    public APIRequestGetTelevision requestHasAddedAppField (boolean value) {
      this.requestField("has_added_app", value);
      return this;
    }
    public APIRequestGetTelevision requestHasWhatsappBusinessNumberField () {
      return this.requestHasWhatsappBusinessNumberField(true);
    }
    public APIRequestGetTelevision requestHasWhatsappBusinessNumberField (boolean value) {
      this.requestField("has_whatsapp_business_number", value);
      return this;
    }
    public APIRequestGetTelevision requestHasWhatsappNumberField () {
      return this.requestHasWhatsappNumberField(true);
    }
    public APIRequestGetTelevision requestHasWhatsappNumberField (boolean value) {
      this.requestField("has_whatsapp_number", value);
      return this;
    }
    public APIRequestGetTelevision requestHometownField () {
      return this.requestHometownField(true);
    }
    public APIRequestGetTelevision requestHometownField (boolean value) {
      this.requestField("hometown", value);
      return this;
    }
    public APIRequestGetTelevision requestHoursField () {
      return this.requestHoursField(true);
    }
    public APIRequestGetTelevision requestHoursField (boolean value) {
      this.requestField("hours", value);
      return this;
    }
    public APIRequestGetTelevision requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetTelevision requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetTelevision requestImpressumField () {
      return this.requestImpressumField(true);
    }
    public APIRequestGetTelevision requestImpressumField (boolean value) {
      this.requestField("impressum", value);
      return this;
    }
    public APIRequestGetTelevision requestInfluencesField () {
      return this.requestInfluencesField(true);
    }
    public APIRequestGetTelevision requestInfluencesField (boolean value) {
      this.requestField("influences", value);
      return this;
    }
    public APIRequestGetTelevision requestInstagramBusinessAccountField () {
      return this.requestInstagramBusinessAccountField(true);
    }
    public APIRequestGetTelevision requestInstagramBusinessAccountField (boolean value) {
      this.requestField("instagram_business_account", value);
      return this;
    }
    public APIRequestGetTelevision requestInstantArticlesReviewStatusField () {
      return this.requestInstantArticlesReviewStatusField(true);
    }
    public APIRequestGetTelevision requestInstantArticlesReviewStatusField (boolean value) {
      this.requestField("instant_articles_review_status", value);
      return this;
    }
    public APIRequestGetTelevision requestIsAlwaysOpenField () {
      return this.requestIsAlwaysOpenField(true);
    }
    public APIRequestGetTelevision requestIsAlwaysOpenField (boolean value) {
      this.requestField("is_always_open", value);
      return this;
    }
    public APIRequestGetTelevision requestIsChainField () {
      return this.requestIsChainField(true);
    }
    public APIRequestGetTelevision requestIsChainField (boolean value) {
      this.requestField("is_chain", value);
      return this;
    }
    public APIRequestGetTelevision requestIsCommunityPageField () {
      return this.requestIsCommunityPageField(true);
    }
    public APIRequestGetTelevision requestIsCommunityPageField (boolean value) {
      this.requestField("is_community_page", value);
      return this;
    }
    public APIRequestGetTelevision requestIsEligibleForBrandedContentField () {
      return this.requestIsEligibleForBrandedContentField(true);
    }
    public APIRequestGetTelevision requestIsEligibleForBrandedContentField (boolean value) {
      this.requestField("is_eligible_for_branded_content", value);
      return this;
    }
    public APIRequestGetTelevision requestIsMessengerBotGetStartedEnabledField () {
      return this.requestIsMessengerBotGetStartedEnabledField(true);
    }
    public APIRequestGetTelevision requestIsMessengerBotGetStartedEnabledField (boolean value) {
      this.requestField("is_messenger_bot_get_started_enabled", value);
      return this;
    }
    public APIRequestGetTelevision requestIsMessengerPlatformBotField () {
      return this.requestIsMessengerPlatformBotField(true);
    }
    public APIRequestGetTelevision requestIsMessengerPlatformBotField (boolean value) {
      this.requestField("is_messenger_platform_bot", value);
      return this;
    }
    public APIRequestGetTelevision requestIsOwnedField () {
      return this.requestIsOwnedField(true);
    }
    public APIRequestGetTelevision requestIsOwnedField (boolean value) {
      this.requestField("is_owned", value);
      return this;
    }
    public APIRequestGetTelevision requestIsPermanentlyClosedField () {
      return this.requestIsPermanentlyClosedField(true);
    }
    public APIRequestGetTelevision requestIsPermanentlyClosedField (boolean value) {
      this.requestField("is_permanently_closed", value);
      return this;
    }
    public APIRequestGetTelevision requestIsPublishedField () {
      return this.requestIsPublishedField(true);
    }
    public APIRequestGetTelevision requestIsPublishedField (boolean value) {
      this.requestField("is_published", value);
      return this;
    }
    public APIRequestGetTelevision requestIsUnclaimedField () {
      return this.requestIsUnclaimedField(true);
    }
    public APIRequestGetTelevision requestIsUnclaimedField (boolean value) {
      this.requestField("is_unclaimed", value);
      return this;
    }
    public APIRequestGetTelevision requestIsVerifiedField () {
      return this.requestIsVerifiedField(true);
    }
    public APIRequestGetTelevision requestIsVerifiedField (boolean value) {
      this.requestField("is_verified", value);
      return this;
    }
    public APIRequestGetTelevision requestIsWebhooksSubscribedField () {
      return this.requestIsWebhooksSubscribedField(true);
    }
    public APIRequestGetTelevision requestIsWebhooksSubscribedField (boolean value) {
      this.requestField("is_webhooks_subscribed", value);
      return this;
    }
    public APIRequestGetTelevision requestKeywordsField () {
      return this.requestKeywordsField(true);
    }
    public APIRequestGetTelevision requestKeywordsField (boolean value) {
      this.requestField("keywords", value);
      return this;
    }
    public APIRequestGetTelevision requestLeadgenFormPreviewDetailsField () {
      return this.requestLeadgenFormPreviewDetailsField(true);
    }
    public APIRequestGetTelevision requestLeadgenFormPreviewDetailsField (boolean value) {
      this.requestField("leadgen_form_preview_details", value);
      return this;
    }
    public APIRequestGetTelevision requestLeadgenHasCrmIntegrationField () {
      return this.requestLeadgenHasCrmIntegrationField(true);
    }
    public APIRequestGetTelevision requestLeadgenHasCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_crm_integration", value);
      return this;
    }
    public APIRequestGetTelevision requestLeadgenHasFatPingCrmIntegrationField () {
      return this.requestLeadgenHasFatPingCrmIntegrationField(true);
    }
    public APIRequestGetTelevision requestLeadgenHasFatPingCrmIntegrationField (boolean value) {
      this.requestField("leadgen_has_fat_ping_crm_integration", value);
      return this;
    }
    public APIRequestGetTelevision requestLeadgenTosAcceptanceTimeField () {
      return this.requestLeadgenTosAcceptanceTimeField(true);
    }
    public APIRequestGetTelevision requestLeadgenTosAcceptanceTimeField (boolean value) {
      this.requestField("leadgen_tos_acceptance_time", value);
      return this;
    }
    public APIRequestGetTelevision requestLeadgenTosAcceptedField () {
      return this.requestLeadgenTosAcceptedField(true);
    }
    public APIRequestGetTelevision requestLeadgenTosAcceptedField (boolean value) {
      this.requestField("leadgen_tos_accepted", value);
      return this;
    }
    public APIRequestGetTelevision requestLeadgenTosAcceptingUserField () {
      return this.requestLeadgenTosAcceptingUserField(true);
    }
    public APIRequestGetTelevision requestLeadgenTosAcceptingUserField (boolean value) {
      this.requestField("leadgen_tos_accepting_user", value);
      return this;
    }
    public APIRequestGetTelevision requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetTelevision requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetTelevision requestLocationField () {
      return this.requestLocationField(true);
    }
    public APIRequestGetTelevision requestLocationField (boolean value) {
      this.requestField("location", value);
      return this;
    }
    public APIRequestGetTelevision requestMembersField () {
      return this.requestMembersField(true);
    }
    public APIRequestGetTelevision requestMembersField (boolean value) {
      this.requestField("members", value);
      return this;
    }
    public APIRequestGetTelevision requestMerchantIdField () {
      return this.requestMerchantIdField(true);
    }
    public APIRequestGetTelevision requestMerchantIdField (boolean value) {
      this.requestField("merchant_id", value);
      return this;
    }
    public APIRequestGetTelevision requestMerchantReviewStatusField () {
      return this.requestMerchantReviewStatusField(true);
    }
    public APIRequestGetTelevision requestMerchantReviewStatusField (boolean value) {
      this.requestField("merchant_review_status", value);
      return this;
    }
    public APIRequestGetTelevision requestMessengerAdsDefaultIcebreakersField () {
      return this.requestMessengerAdsDefaultIcebreakersField(true);
    }
    public APIRequestGetTelevision requestMessengerAdsDefaultIcebreakersField (boolean value) {
      this.requestField("messenger_ads_default_icebreakers", value);
      return this;
    }
    public APIRequestGetTelevision requestMessengerAdsDefaultPageWelcomeMessageField () {
      return this.requestMessengerAdsDefaultPageWelcomeMessageField(true);
    }
    public APIRequestGetTelevision requestMessengerAdsDefaultPageWelcomeMessageField (boolean value) {
      this.requestField("messenger_ads_default_page_welcome_message", value);
      return this;
    }
    public APIRequestGetTelevision requestMessengerAdsDefaultQuickRepliesField () {
      return this.requestMessengerAdsDefaultQuickRepliesField(true);
    }
    public APIRequestGetTelevision requestMessengerAdsDefaultQuickRepliesField (boolean value) {
      this.requestField("messenger_ads_default_quick_replies", value);
      return this;
    }
    public APIRequestGetTelevision requestMessengerAdsQuickRepliesTypeField () {
      return this.requestMessengerAdsQuickRepliesTypeField(true);
    }
    public APIRequestGetTelevision requestMessengerAdsQuickRepliesTypeField (boolean value) {
      this.requestField("messenger_ads_quick_replies_type", value);
      return this;
    }
    public APIRequestGetTelevision requestMissionField () {
      return this.requestMissionField(true);
    }
    public APIRequestGetTelevision requestMissionField (boolean value) {
      this.requestField("mission", value);
      return this;
    }
    public APIRequestGetTelevision requestMpgField () {
      return this.requestMpgField(true);
    }
    public APIRequestGetTelevision requestMpgField (boolean value) {
      this.requestField("mpg", value);
      return this;
    }
    public APIRequestGetTelevision requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetTelevision requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetTelevision requestNameWithLocationDescriptorField () {
      return this.requestNameWithLocationDescriptorField(true);
    }
    public APIRequestGetTelevision requestNameWithLocationDescriptorField (boolean value) {
      this.requestField("name_with_location_descriptor", value);
      return this;
    }
    public APIRequestGetTelevision requestNetworkField () {
      return this.requestNetworkField(true);
    }
    public APIRequestGetTelevision requestNetworkField (boolean value) {
      this.requestField("network", value);
      return this;
    }
    public APIRequestGetTelevision requestNewLikeCountField () {
      return this.requestNewLikeCountField(true);
    }
    public APIRequestGetTelevision requestNewLikeCountField (boolean value) {
      this.requestField("new_like_count", value);
      return this;
    }
    public APIRequestGetTelevision requestOfferEligibleField () {
      return this.requestOfferEligibleField(true);
    }
    public APIRequestGetTelevision requestOfferEligibleField (boolean value) {
      this.requestField("offer_eligible", value);
      return this;
    }
    public APIRequestGetTelevision requestOverallStarRatingField () {
      return this.requestOverallStarRatingField(true);
    }
    public APIRequestGetTelevision requestOverallStarRatingField (boolean value) {
      this.requestField("overall_star_rating", value);
      return this;
    }
    public APIRequestGetTelevision requestPageAboutStoryField () {
      return this.requestPageAboutStoryField(true);
    }
    public APIRequestGetTelevision requestPageAboutStoryField (boolean value) {
      this.requestField("page_about_story", value);
      return this;
    }
    public APIRequestGetTelevision requestPageTokenField () {
      return this.requestPageTokenField(true);
    }
    public APIRequestGetTelevision requestPageTokenField (boolean value) {
      this.requestField("page_token", value);
      return this;
    }
    public APIRequestGetTelevision requestParentPageField () {
      return this.requestParentPageField(true);
    }
    public APIRequestGetTelevision requestParentPageField (boolean value) {
      this.requestField("parent_page", value);
      return this;
    }
    public APIRequestGetTelevision requestParkingField () {
      return this.requestParkingField(true);
    }
    public APIRequestGetTelevision requestParkingField (boolean value) {
      this.requestField("parking", value);
      return this;
    }
    public APIRequestGetTelevision requestPaymentOptionsField () {
      return this.requestPaymentOptionsField(true);
    }
    public APIRequestGetTelevision requestPaymentOptionsField (boolean value) {
      this.requestField("payment_options", value);
      return this;
    }
    public APIRequestGetTelevision requestPersonalInfoField () {
      return this.requestPersonalInfoField(true);
    }
    public APIRequestGetTelevision requestPersonalInfoField (boolean value) {
      this.requestField("personal_info", value);
      return this;
    }
    public APIRequestGetTelevision requestPersonalInterestsField () {
      return this.requestPersonalInterestsField(true);
    }
    public APIRequestGetTelevision requestPersonalInterestsField (boolean value) {
      this.requestField("personal_interests", value);
      return this;
    }
    public APIRequestGetTelevision requestPharmaSafetyInfoField () {
      return this.requestPharmaSafetyInfoField(true);
    }
    public APIRequestGetTelevision requestPharmaSafetyInfoField (boolean value) {
      this.requestField("pharma_safety_info", value);
      return this;
    }
    public APIRequestGetTelevision requestPhoneField () {
      return this.requestPhoneField(true);
    }
    public APIRequestGetTelevision requestPhoneField (boolean value) {
      this.requestField("phone", value);
      return this;
    }
    public APIRequestGetTelevision requestPlaceTypeField () {
      return this.requestPlaceTypeField(true);
    }
    public APIRequestGetTelevision requestPlaceTypeField (boolean value) {
      this.requestField("place_type", value);
      return this;
    }
    public APIRequestGetTelevision requestPlotOutlineField () {
      return this.requestPlotOutlineField(true);
    }
    public APIRequestGetTelevision requestPlotOutlineField (boolean value) {
      this.requestField("plot_outline", value);
      return this;
    }
    public APIRequestGetTelevision requestPreferredAudienceField () {
      return this.requestPreferredAudienceField(true);
    }
    public APIRequestGetTelevision requestPreferredAudienceField (boolean value) {
      this.requestField("preferred_audience", value);
      return this;
    }
    public APIRequestGetTelevision requestPressContactField () {
      return this.requestPressContactField(true);
    }
    public APIRequestGetTelevision requestPressContactField (boolean value) {
      this.requestField("press_contact", value);
      return this;
    }
    public APIRequestGetTelevision requestPriceRangeField () {
      return this.requestPriceRangeField(true);
    }
    public APIRequestGetTelevision requestPriceRangeField (boolean value) {
      this.requestField("price_range", value);
      return this;
    }
    public APIRequestGetTelevision requestPrivacyInfoUrlField () {
      return this.requestPrivacyInfoUrlField(true);
    }
    public APIRequestGetTelevision requestPrivacyInfoUrlField (boolean value) {
      this.requestField("privacy_info_url", value);
      return this;
    }
    public APIRequestGetTelevision requestProducedByField () {
      return this.requestProducedByField(true);
    }
    public APIRequestGetTelevision requestProducedByField (boolean value) {
      this.requestField("produced_by", value);
      return this;
    }
    public APIRequestGetTelevision requestProductsField () {
      return this.requestProductsField(true);
    }
    public APIRequestGetTelevision requestProductsField (boolean value) {
      this.requestField("products", value);
      return this;
    }
    public APIRequestGetTelevision requestPromotionEligibleField () {
      return this.requestPromotionEligibleField(true);
    }
    public APIRequestGetTelevision requestPromotionEligibleField (boolean value) {
      this.requestField("promotion_eligible", value);
      return this;
    }
    public APIRequestGetTelevision requestPromotionIneligibleReasonField () {
      return this.requestPromotionIneligibleReasonField(true);
    }
    public APIRequestGetTelevision requestPromotionIneligibleReasonField (boolean value) {
      this.requestField("promotion_ineligible_reason", value);
      return this;
    }
    public APIRequestGetTelevision requestPublicTransitField () {
      return this.requestPublicTransitField(true);
    }
    public APIRequestGetTelevision requestPublicTransitField (boolean value) {
      this.requestField("public_transit", value);
      return this;
    }
    public APIRequestGetTelevision requestRatingCountField () {
      return this.requestRatingCountField(true);
    }
    public APIRequestGetTelevision requestRatingCountField (boolean value) {
      this.requestField("rating_count", value);
      return this;
    }
    public APIRequestGetTelevision requestRecipientField () {
      return this.requestRecipientField(true);
    }
    public APIRequestGetTelevision requestRecipientField (boolean value) {
      this.requestField("recipient", value);
      return this;
    }
    public APIRequestGetTelevision requestRecordLabelField () {
      return this.requestRecordLabelField(true);
    }
    public APIRequestGetTelevision requestRecordLabelField (boolean value) {
      this.requestField("record_label", value);
      return this;
    }
    public APIRequestGetTelevision requestReleaseDateField () {
      return this.requestReleaseDateField(true);
    }
    public APIRequestGetTelevision requestReleaseDateField (boolean value) {
      this.requestField("release_date", value);
      return this;
    }
    public APIRequestGetTelevision requestRestaurantServicesField () {
      return this.requestRestaurantServicesField(true);
    }
    public APIRequestGetTelevision requestRestaurantServicesField (boolean value) {
      this.requestField("restaurant_services", value);
      return this;
    }
    public APIRequestGetTelevision requestRestaurantSpecialtiesField () {
      return this.requestRestaurantSpecialtiesField(true);
    }
    public APIRequestGetTelevision requestRestaurantSpecialtiesField (boolean value) {
      this.requestField("restaurant_specialties", value);
      return this;
    }
    public APIRequestGetTelevision requestScheduleField () {
      return this.requestScheduleField(true);
    }
    public APIRequestGetTelevision requestScheduleField (boolean value) {
      this.requestField("schedule", value);
      return this;
    }
    public APIRequestGetTelevision requestScreenplayByField () {
      return this.requestScreenplayByField(true);
    }
    public APIRequestGetTelevision requestScreenplayByField (boolean value) {
      this.requestField("screenplay_by", value);
      return this;
    }
    public APIRequestGetTelevision requestSeasonField () {
      return this.requestSeasonField(true);
    }
    public APIRequestGetTelevision requestSeasonField (boolean value) {
      this.requestField("season", value);
      return this;
    }
    public APIRequestGetTelevision requestSingleLineAddressField () {
      return this.requestSingleLineAddressField(true);
    }
    public APIRequestGetTelevision requestSingleLineAddressField (boolean value) {
      this.requestField("single_line_address", value);
      return this;
    }
    public APIRequestGetTelevision requestStarringField () {
      return this.requestStarringField(true);
    }
    public APIRequestGetTelevision requestStarringField (boolean value) {
      this.requestField("starring", value);
      return this;
    }
    public APIRequestGetTelevision requestStartInfoField () {
      return this.requestStartInfoField(true);
    }
    public APIRequestGetTelevision requestStartInfoField (boolean value) {
      this.requestField("start_info", value);
      return this;
    }
    public APIRequestGetTelevision requestStoreCodeField () {
      return this.requestStoreCodeField(true);
    }
    public APIRequestGetTelevision requestStoreCodeField (boolean value) {
      this.requestField("store_code", value);
      return this;
    }
    public APIRequestGetTelevision requestStoreLocationDescriptorField () {
      return this.requestStoreLocationDescriptorField(true);
    }
    public APIRequestGetTelevision requestStoreLocationDescriptorField (boolean value) {
      this.requestField("store_location_descriptor", value);
      return this;
    }
    public APIRequestGetTelevision requestStoreNumberField () {
      return this.requestStoreNumberField(true);
    }
    public APIRequestGetTelevision requestStoreNumberField (boolean value) {
      this.requestField("store_number", value);
      return this;
    }
    public APIRequestGetTelevision requestStudioField () {
      return this.requestStudioField(true);
    }
    public APIRequestGetTelevision requestStudioField (boolean value) {
      this.requestField("studio", value);
      return this;
    }
    public APIRequestGetTelevision requestSupportsInstantArticlesField () {
      return this.requestSupportsInstantArticlesField(true);
    }
    public APIRequestGetTelevision requestSupportsInstantArticlesField (boolean value) {
      this.requestField("supports_instant_articles", value);
      return this;
    }
    public APIRequestGetTelevision requestTalkingAboutCountField () {
      return this.requestTalkingAboutCountField(true);
    }
    public APIRequestGetTelevision requestTalkingAboutCountField (boolean value) {
      this.requestField("talking_about_count", value);
      return this;
    }
    public APIRequestGetTelevision requestUnreadMessageCountField () {
      return this.requestUnreadMessageCountField(true);
    }
    public APIRequestGetTelevision requestUnreadMessageCountField (boolean value) {
      this.requestField("unread_message_count", value);
      return this;
    }
    public APIRequestGetTelevision requestUnreadNotifCountField () {
      return this.requestUnreadNotifCountField(true);
    }
    public APIRequestGetTelevision requestUnreadNotifCountField (boolean value) {
      this.requestField("unread_notif_count", value);
      return this;
    }
    public APIRequestGetTelevision requestUnseenMessageCountField () {
      return this.requestUnseenMessageCountField(true);
    }
    public APIRequestGetTelevision requestUnseenMessageCountField (boolean value) {
      this.requestField("unseen_message_count", value);
      return this;
    }
    public APIRequestGetTelevision requestUsernameField () {
      return this.requestUsernameField(true);
    }
    public APIRequestGetTelevision requestUsernameField (boolean value) {
      this.requestField("username", value);
      return this;
    }
    public APIRequestGetTelevision requestVerificationStatusField () {
      return this.requestVerificationStatusField(true);
    }
    public APIRequestGetTelevision requestVerificationStatusField (boolean value) {
      this.requestField("verification_status", value);
      return this;
    }
    public APIRequestGetTelevision requestVoipInfoField () {
      return this.requestVoipInfoField(true);
    }
    public APIRequestGetTelevision requestVoipInfoField (boolean value) {
      this.requestField("voip_info", value);
      return this;
    }
    public APIRequestGetTelevision requestWebsiteField () {
      return this.requestWebsiteField(true);
    }
    public APIRequestGetTelevision requestWebsiteField (boolean value) {
      this.requestField("website", value);
      return this;
    }
    public APIRequestGetTelevision requestWereHereCountField () {
      return this.requestWereHereCountField(true);
    }
    public APIRequestGetTelevision requestWereHereCountField (boolean value) {
      this.requestField("were_here_count", value);
      return this;
    }
    public APIRequestGetTelevision requestWhatsappNumberField () {
      return this.requestWhatsappNumberField(true);
    }
    public APIRequestGetTelevision requestWhatsappNumberField (boolean value) {
      this.requestField("whatsapp_number", value);
      return this;
    }
    public APIRequestGetTelevision requestWrittenByField () {
      return this.requestWrittenByField(true);
    }
    public APIRequestGetTelevision requestWrittenByField (boolean value) {
      this.requestField("written_by", value);
      return this;
    }
  }

  public static class APIRequestGetThreads extends APIRequest<UnifiedThread> {

    APINodeList<UnifiedThread> lastResponse = null;
    @Override
    public APINodeList<UnifiedThread> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "folder",
      "tags",
      "user_id",
    };

    public static final String[] FIELDS = {
      "can_reply",
      "former_participants",
      "id",
      "is_subscribed",
      "link",
      "message_count",
      "name",
      "participants",
      "scoped_thread_key",
      "senders",
      "snippet",
      "subject",
      "unread_count",
      "updated_time",
      "wallpaper",
    };

    @Override
    public APINodeList<UnifiedThread> parseResponse(String response, String header) throws APIException {
      return UnifiedThread.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<UnifiedThread> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<UnifiedThread> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<UnifiedThread>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<UnifiedThread>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<UnifiedThread>>() {
           public APINodeList<UnifiedThread> apply(ResponseWrapper result) {
             try {
               return APIRequestGetThreads.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetThreads(String nodeId, APIContext context) {
      super(context, nodeId, "/threads", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetThreads setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetThreads setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetThreads setFolder (String folder) {
      this.setParam("folder", folder);
      return this;
    }

    public APIRequestGetThreads setTags (List<String> tags) {
      this.setParam("tags", tags);
      return this;
    }
    public APIRequestGetThreads setTags (String tags) {
      this.setParam("tags", tags);
      return this;
    }

    public APIRequestGetThreads setUserId (String userId) {
      this.setParam("user_id", userId);
      return this;
    }

    public APIRequestGetThreads requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetThreads requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetThreads requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetThreads requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetThreads requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetThreads requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetThreads requestCanReplyField () {
      return this.requestCanReplyField(true);
    }
    public APIRequestGetThreads requestCanReplyField (boolean value) {
      this.requestField("can_reply", value);
      return this;
    }
    public APIRequestGetThreads requestFormerParticipantsField () {
      return this.requestFormerParticipantsField(true);
    }
    public APIRequestGetThreads requestFormerParticipantsField (boolean value) {
      this.requestField("former_participants", value);
      return this;
    }
    public APIRequestGetThreads requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetThreads requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetThreads requestIsSubscribedField () {
      return this.requestIsSubscribedField(true);
    }
    public APIRequestGetThreads requestIsSubscribedField (boolean value) {
      this.requestField("is_subscribed", value);
      return this;
    }
    public APIRequestGetThreads requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGetThreads requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGetThreads requestMessageCountField () {
      return this.requestMessageCountField(true);
    }
    public APIRequestGetThreads requestMessageCountField (boolean value) {
      this.requestField("message_count", value);
      return this;
    }
    public APIRequestGetThreads requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGetThreads requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGetThreads requestParticipantsField () {
      return this.requestParticipantsField(true);
    }
    public APIRequestGetThreads requestParticipantsField (boolean value) {
      this.requestField("participants", value);
      return this;
    }
    public APIRequestGetThreads requestScopedThreadKeyField () {
      return this.requestScopedThreadKeyField(true);
    }
    public APIRequestGetThreads requestScopedThreadKeyField (boolean value) {
      this.requestField("scoped_thread_key", value);
      return this;
    }
    public APIRequestGetThreads requestSendersField () {
      return this.requestSendersField(true);
    }
    public APIRequestGetThreads requestSendersField (boolean value) {
      this.requestField("senders", value);
      return this;
    }
    public APIRequestGetThreads requestSnippetField () {
      return this.requestSnippetField(true);
    }
    public APIRequestGetThreads requestSnippetField (boolean value) {
      this.requestField("snippet", value);
      return this;
    }
    public APIRequestGetThreads requestSubjectField () {
      return this.requestSubjectField(true);
    }
    public APIRequestGetThreads requestSubjectField (boolean value) {
      this.requestField("subject", value);
      return this;
    }
    public APIRequestGetThreads requestUnreadCountField () {
      return this.requestUnreadCountField(true);
    }
    public APIRequestGetThreads requestUnreadCountField (boolean value) {
      this.requestField("unread_count", value);
      return this;
    }
    public APIRequestGetThreads requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetThreads requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
    public APIRequestGetThreads requestWallpaperField () {
      return this.requestWallpaperField(true);
    }
    public APIRequestGetThreads requestWallpaperField (boolean value) {
      this.requestField("wallpaper", value);
      return this;
    }
  }

  public static class APIRequestGetVideos extends APIRequest<AdVideo> {

    APINodeList<AdVideo> lastResponse = null;
    @Override
    public APINodeList<AdVideo> getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "type",
    };

    public static final String[] FIELDS = {
      "ad_breaks",
      "backdated_time",
      "backdated_time_granularity",
      "content_category",
      "content_tags",
      "created_time",
      "custom_labels",
      "description",
      "embed_html",
      "embeddable",
      "event",
      "expiration",
      "format",
      "from",
      "icon",
      "id",
      "is_crosspost_video",
      "is_crossposting_eligible",
      "is_episode",
      "is_instagram_eligible",
      "length",
      "live_audience_count",
      "live_status",
      "permalink_url",
      "picture",
      "place",
      "premiere_living_room_status",
      "privacy",
      "published",
      "scheduled_publish_time",
      "source",
      "spherical",
      "status",
      "title",
      "tv_banner_ad",
      "universal_video_id",
      "updated_time",
    };

    @Override
    public APINodeList<AdVideo> parseResponse(String response, String header) throws APIException {
      return AdVideo.parseResponse(response, getContext(), this, header);
    }

    @Override
    public APINodeList<AdVideo> execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINodeList<AdVideo> execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(),rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINodeList<AdVideo>> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINodeList<AdVideo>> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINodeList<AdVideo>>() {
           public APINodeList<AdVideo> apply(ResponseWrapper result) {
             try {
               return APIRequestGetVideos.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGetVideos(String nodeId, APIContext context) {
      super(context, nodeId, "/videos", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGetVideos setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGetVideos setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGetVideos setType (AdVideo.EnumType type) {
      this.setParam("type", type);
      return this;
    }
    public APIRequestGetVideos setType (String type) {
      this.setParam("type", type);
      return this;
    }

    public APIRequestGetVideos requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGetVideos requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetVideos requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGetVideos requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGetVideos requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGetVideos requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGetVideos requestAdBreaksField () {
      return this.requestAdBreaksField(true);
    }
    public APIRequestGetVideos requestAdBreaksField (boolean value) {
      this.requestField("ad_breaks", value);
      return this;
    }
    public APIRequestGetVideos requestBackdatedTimeField () {
      return this.requestBackdatedTimeField(true);
    }
    public APIRequestGetVideos requestBackdatedTimeField (boolean value) {
      this.requestField("backdated_time", value);
      return this;
    }
    public APIRequestGetVideos requestBackdatedTimeGranularityField () {
      return this.requestBackdatedTimeGranularityField(true);
    }
    public APIRequestGetVideos requestBackdatedTimeGranularityField (boolean value) {
      this.requestField("backdated_time_granularity", value);
      return this;
    }
    public APIRequestGetVideos requestContentCategoryField () {
      return this.requestContentCategoryField(true);
    }
    public APIRequestGetVideos requestContentCategoryField (boolean value) {
      this.requestField("content_category", value);
      return this;
    }
    public APIRequestGetVideos requestContentTagsField () {
      return this.requestContentTagsField(true);
    }
    public APIRequestGetVideos requestContentTagsField (boolean value) {
      this.requestField("content_tags", value);
      return this;
    }
    public APIRequestGetVideos requestCreatedTimeField () {
      return this.requestCreatedTimeField(true);
    }
    public APIRequestGetVideos requestCreatedTimeField (boolean value) {
      this.requestField("created_time", value);
      return this;
    }
    public APIRequestGetVideos requestCustomLabelsField () {
      return this.requestCustomLabelsField(true);
    }
    public APIRequestGetVideos requestCustomLabelsField (boolean value) {
      this.requestField("custom_labels", value);
      return this;
    }
    public APIRequestGetVideos requestDescriptionField () {
      return this.requestDescriptionField(true);
    }
    public APIRequestGetVideos requestDescriptionField (boolean value) {
      this.requestField("description", value);
      return this;
    }
    public APIRequestGetVideos requestEmbedHtmlField () {
      return this.requestEmbedHtmlField(true);
    }
    public APIRequestGetVideos requestEmbedHtmlField (boolean value) {
      this.requestField("embed_html", value);
      return this;
    }
    public APIRequestGetVideos requestEmbeddableField () {
      return this.requestEmbeddableField(true);
    }
    public APIRequestGetVideos requestEmbeddableField (boolean value) {
      this.requestField("embeddable", value);
      return this;
    }
    public APIRequestGetVideos requestEventField () {
      return this.requestEventField(true);
    }
    public APIRequestGetVideos requestEventField (boolean value) {
      this.requestField("event", value);
      return this;
    }
    public APIRequestGetVideos requestExpirationField () {
      return this.requestExpirationField(true);
    }
    public APIRequestGetVideos requestExpirationField (boolean value) {
      this.requestField("expiration", value);
      return this;
    }
    public APIRequestGetVideos requestFormatField () {
      return this.requestFormatField(true);
    }
    public APIRequestGetVideos requestFormatField (boolean value) {
      this.requestField("format", value);
      return this;
    }
    public APIRequestGetVideos requestFromField () {
      return this.requestFromField(true);
    }
    public APIRequestGetVideos requestFromField (boolean value) {
      this.requestField("from", value);
      return this;
    }
    public APIRequestGetVideos requestIconField () {
      return this.requestIconField(true);
    }
    public APIRequestGetVideos requestIconField (boolean value) {
      this.requestField("icon", value);
      return this;
    }
    public APIRequestGetVideos requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGetVideos requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGetVideos requestIsCrosspostVideoField () {
      return this.requestIsCrosspostVideoField(true);
    }
    public APIRequestGetVideos requestIsCrosspostVideoField (boolean value) {
      this.requestField("is_crosspost_video", value);
      return this;
    }
    public APIRequestGetVideos requestIsCrosspostingEligibleField () {
      return this.requestIsCrosspostingEligibleField(true);
    }
    public APIRequestGetVideos requestIsCrosspostingEligibleField (boolean value) {
      this.requestField("is_crossposting_eligible", value);
      return this;
    }
    public APIRequestGetVideos requestIsEpisodeField () {
      return this.requestIsEpisodeField(true);
    }
    public APIRequestGetVideos requestIsEpisodeField (boolean value) {
      this.requestField("is_episode", value);
      return this;
    }
    public APIRequestGetVideos requestIsInstagramEligibleField () {
      return this.requestIsInstagramEligibleField(true);
    }
    public APIRequestGetVideos requestIsInstagramEligibleField (boolean value) {
      this.requestField("is_instagram_eligible", value);
      return this;
    }
    public APIRequestGetVideos requestLengthField () {
      return this.requestLengthField(true);
    }
    public APIRequestGetVideos requestLengthField (boolean value) {
      this.requestField("length", value);
      return this;
    }
    public APIRequestGetVideos requestLiveAudienceCountField () {
      return this.requestLiveAudienceCountField(true);
    }
    public APIRequestGetVideos requestLiveAudienceCountField (boolean value) {
      this.requestField("live_audience_count", value);
      return this;
    }
    public APIRequestGetVideos requestLiveStatusField () {
      return this.requestLiveStatusField(true);
    }
    public APIRequestGetVideos requestLiveStatusField (boolean value) {
      this.requestField("live_status", value);
      return this;
    }
    public APIRequestGetVideos requestPermalinkUrlField () {
      return this.requestPermalinkUrlField(true);
    }
    public APIRequestGetVideos requestPermalinkUrlField (boolean value) {
      this.requestField("permalink_url", value);
      return this;
    }
    public APIRequestGetVideos requestPictureField () {
      return this.requestPictureField(true);
    }
    public APIRequestGetVideos requestPictureField (boolean value) {
      this.requestField("picture", value);
      return this;
    }
    public APIRequestGetVideos requestPlaceField () {
      return this.requestPlaceField(true);
    }
    public APIRequestGetVideos requestPlaceField (boolean value) {
      this.requestField("place", value);
      return this;
    }
    public APIRequestGetVideos requestPremiereLivingRoomStatusField () {
      return this.requestPremiereLivingRoomStatusField(true);
    }
    public APIRequestGetVideos requestPremiereLivingRoomStatusField (boolean value) {
      this.requestField("premiere_living_room_status", value);
      return this;
    }
    public APIRequestGetVideos requestPrivacyField () {
      return this.requestPrivacyField(true);
    }
    public APIRequestGetVideos requestPrivacyField (boolean value) {
      this.requestField("privacy", value);
      return this;
    }
    public APIRequestGetVideos requestPublishedField () {
      return this.requestPublishedField(true);
    }
    public APIRequestGetVideos requestPublishedField (boolean value) {
      this.requestField("published", value);
      return this;
    }
    public APIRequestGetVideos requestScheduledPublishTimeField () {
      return this.requestScheduledPublishTimeField(true);
    }
    public APIRequestGetVideos requestScheduledPublishTimeField (boolean value) {
      this.requestField("scheduled_publish_time", value);
      return this;
    }
    public APIRequestGetVideos requestSourceField () {
      return this.requestSourceField(true);
    }
    public APIRequestGetVideos requestSourceField (boolean value) {
      this.requestField("source", value);
      return this;
    }
    public APIRequestGetVideos requestSphericalField () {
      return this.requestSphericalField(true);
    }
    public APIRequestGetVideos requestSphericalField (boolean value) {
      this.requestField("spherical", value);
      return this;
    }
    public APIRequestGetVideos requestStatusField () {
      return this.requestStatusField(true);
    }
    public APIRequestGetVideos requestStatusField (boolean value) {
      this.requestField("status", value);
      return this;
    }
    public APIRequestGetVideos requestTitleField () {
      return this.requestTitleField(true);
    }
    public APIRequestGetVideos requestTitleField (boolean value) {
      this.requestField("title", value);
      return this;
    }
    public APIRequestGetVideos requestTvBannerAdField () {
      return this.requestTvBannerAdField(true);
    }
    public APIRequestGetVideos requestTvBannerAdField (boolean value) {
      this.requestField("tv_banner_ad", value);
      return this;
    }
    public APIRequestGetVideos requestUniversalVideoIdField () {
      return this.requestUniversalVideoIdField(true);
    }
    public APIRequestGetVideos requestUniversalVideoIdField (boolean value) {
      this.requestField("universal_video_id", value);
      return this;
    }
    public APIRequestGetVideos requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGetVideos requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
  }

  public static class APIRequestCreateVideo extends APIRequest<AdVideo> {

    AdVideo lastResponse = null;
    @Override
    public AdVideo getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "adaptive_type",
      "animated_effect_id",
      "application_id",
      "asked_fun_fact_prompt_id",
      "attribution_app_id",
      "audio_story_wave_animation_handle",
      "composer_entry_picker",
      "composer_entry_point",
      "composer_entry_time",
      "composer_session_events_log",
      "composer_session_id",
      "composer_source_surface",
      "composer_type",
      "container_type",
      "content_category",
      "description",
      "direct_share_status",
      "embeddable",
      "end_offset",
      "fbuploader_video_file_chunk",
      "file_size",
      "file_url",
      "fisheye_video_cropped",
      "formatting",
      "fov",
      "front_z_rotation",
      "fun_fact_prompt_id",
      "fun_fact_toastee_id",
      "guide",
      "guide_enabled",
      "has_nickname",
      "holiday_card",
      "initial_heading",
      "initial_pitch",
      "instant_game_entry_point_data",
      "is_boost_intended",
      "is_explicit_share",
      "is_group_linking_post",
      "is_voice_clip",
      "location_source_id",
      "manual_privacy",
      "no_story",
      "offer_like_post_id",
      "og_action_type_id",
      "og_icon_id",
      "og_object_id",
      "og_phrase",
      "og_suggestion_mechanism",
      "original_fov",
      "original_projection_type",
      "privacy",
      "publish_event_id",
      "react_mode_metadata",
      "referenced_sticker_id",
      "replace_video_id",
      "sales_promo_id",
      "slideshow_spec",
      "source",
      "spherical",
      "sponsor_id",
      "start_offset",
      "swap_mode",
      "text_format_metadata",
      "throwback_camera_roll_media",
      "thumb",
      "time_since_original_post",
      "title",
      "transcode_setting_properties",
      "unpublished_content_type",
      "upload_phase",
      "upload_session_id",
      "upload_setting_properties",
      "video_file_chunk",
      "video_start_time_ms",
      "waterfall_id",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public AdVideo parseResponse(String response, String header) throws APIException {
      return AdVideo.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public AdVideo execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public AdVideo execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<AdVideo> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<AdVideo> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, AdVideo>() {
           public AdVideo apply(ResponseWrapper result) {
             try {
               return APIRequestCreateVideo.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestCreateVideo(String nodeId, APIContext context) {
      super(context, nodeId, "/videos", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestCreateVideo setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestCreateVideo setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestCreateVideo setAdaptiveType (String adaptiveType) {
      this.setParam("adaptive_type", adaptiveType);
      return this;
    }

    public APIRequestCreateVideo setAnimatedEffectId (Long animatedEffectId) {
      this.setParam("animated_effect_id", animatedEffectId);
      return this;
    }
    public APIRequestCreateVideo setAnimatedEffectId (String animatedEffectId) {
      this.setParam("animated_effect_id", animatedEffectId);
      return this;
    }

    public APIRequestCreateVideo setApplicationId (String applicationId) {
      this.setParam("application_id", applicationId);
      return this;
    }

    public APIRequestCreateVideo setAskedFunFactPromptId (Long askedFunFactPromptId) {
      this.setParam("asked_fun_fact_prompt_id", askedFunFactPromptId);
      return this;
    }
    public APIRequestCreateVideo setAskedFunFactPromptId (String askedFunFactPromptId) {
      this.setParam("asked_fun_fact_prompt_id", askedFunFactPromptId);
      return this;
    }

    public APIRequestCreateVideo setAttributionAppId (String attributionAppId) {
      this.setParam("attribution_app_id", attributionAppId);
      return this;
    }

    public APIRequestCreateVideo setAudioStoryWaveAnimationHandle (String audioStoryWaveAnimationHandle) {
      this.setParam("audio_story_wave_animation_handle", audioStoryWaveAnimationHandle);
      return this;
    }

    public APIRequestCreateVideo setComposerEntryPicker (String composerEntryPicker) {
      this.setParam("composer_entry_picker", composerEntryPicker);
      return this;
    }

    public APIRequestCreateVideo setComposerEntryPoint (String composerEntryPoint) {
      this.setParam("composer_entry_point", composerEntryPoint);
      return this;
    }

    public APIRequestCreateVideo setComposerEntryTime (Long composerEntryTime) {
      this.setParam("composer_entry_time", composerEntryTime);
      return this;
    }
    public APIRequestCreateVideo setComposerEntryTime (String composerEntryTime) {
      this.setParam("composer_entry_time", composerEntryTime);
      return this;
    }

    public APIRequestCreateVideo setComposerSessionEventsLog (String composerSessionEventsLog) {
      this.setParam("composer_session_events_log", composerSessionEventsLog);
      return this;
    }

    public APIRequestCreateVideo setComposerSessionId (String composerSessionId) {
      this.setParam("composer_session_id", composerSessionId);
      return this;
    }

    public APIRequestCreateVideo setComposerSourceSurface (String composerSourceSurface) {
      this.setParam("composer_source_surface", composerSourceSurface);
      return this;
    }

    public APIRequestCreateVideo setComposerType (String composerType) {
      this.setParam("composer_type", composerType);
      return this;
    }

    public APIRequestCreateVideo setContainerType (AdVideo.EnumContainerType containerType) {
      this.setParam("container_type", containerType);
      return this;
    }
    public APIRequestCreateVideo setContainerType (String containerType) {
      this.setParam("container_type", containerType);
      return this;
    }

    public APIRequestCreateVideo setContentCategory (AdVideo.EnumContentCategory contentCategory) {
      this.setParam("content_category", contentCategory);
      return this;
    }
    public APIRequestCreateVideo setContentCategory (String contentCategory) {
      this.setParam("content_category", contentCategory);
      return this;
    }

    public APIRequestCreateVideo setDescription (String description) {
      this.setParam("description", description);
      return this;
    }

    public APIRequestCreateVideo setDirectShareStatus (Long directShareStatus) {
      this.setParam("direct_share_status", directShareStatus);
      return this;
    }
    public APIRequestCreateVideo setDirectShareStatus (String directShareStatus) {
      this.setParam("direct_share_status", directShareStatus);
      return this;
    }

    public APIRequestCreateVideo setEmbeddable (Boolean embeddable) {
      this.setParam("embeddable", embeddable);
      return this;
    }
    public APIRequestCreateVideo setEmbeddable (String embeddable) {
      this.setParam("embeddable", embeddable);
      return this;
    }

    public APIRequestCreateVideo setEndOffset (Long endOffset) {
      this.setParam("end_offset", endOffset);
      return this;
    }
    public APIRequestCreateVideo setEndOffset (String endOffset) {
      this.setParam("end_offset", endOffset);
      return this;
    }

    public APIRequestCreateVideo setFbuploaderVideoFileChunk (String fbuploaderVideoFileChunk) {
      this.setParam("fbuploader_video_file_chunk", fbuploaderVideoFileChunk);
      return this;
    }

    public APIRequestCreateVideo setFileSize (Long fileSize) {
      this.setParam("file_size", fileSize);
      return this;
    }
    public APIRequestCreateVideo setFileSize (String fileSize) {
      this.setParam("file_size", fileSize);
      return this;
    }

    public APIRequestCreateVideo setFileUrl (String fileUrl) {
      this.setParam("file_url", fileUrl);
      return this;
    }

    public APIRequestCreateVideo setFisheyeVideoCropped (Boolean fisheyeVideoCropped) {
      this.setParam("fisheye_video_cropped", fisheyeVideoCropped);
      return this;
    }
    public APIRequestCreateVideo setFisheyeVideoCropped (String fisheyeVideoCropped) {
      this.setParam("fisheye_video_cropped", fisheyeVideoCropped);
      return this;
    }

    public APIRequestCreateVideo setFormatting (AdVideo.EnumFormatting formatting) {
      this.setParam("formatting", formatting);
      return this;
    }
    public APIRequestCreateVideo setFormatting (String formatting) {
      this.setParam("formatting", formatting);
      return this;
    }

    public APIRequestCreateVideo setFov (Long fov) {
      this.setParam("fov", fov);
      return this;
    }
    public APIRequestCreateVideo setFov (String fov) {
      this.setParam("fov", fov);
      return this;
    }

    public APIRequestCreateVideo setFrontZRotation (Double frontZRotation) {
      this.setParam("front_z_rotation", frontZRotation);
      return this;
    }
    public APIRequestCreateVideo setFrontZRotation (String frontZRotation) {
      this.setParam("front_z_rotation", frontZRotation);
      return this;
    }

    public APIRequestCreateVideo setFunFactPromptId (Long funFactPromptId) {
      this.setParam("fun_fact_prompt_id", funFactPromptId);
      return this;
    }
    public APIRequestCreateVideo setFunFactPromptId (String funFactPromptId) {
      this.setParam("fun_fact_prompt_id", funFactPromptId);
      return this;
    }

    public APIRequestCreateVideo setFunFactToasteeId (Long funFactToasteeId) {
      this.setParam("fun_fact_toastee_id", funFactToasteeId);
      return this;
    }
    public APIRequestCreateVideo setFunFactToasteeId (String funFactToasteeId) {
      this.setParam("fun_fact_toastee_id", funFactToasteeId);
      return this;
    }

    public APIRequestCreateVideo setGuide (List<List<Long>> guide) {
      this.setParam("guide", guide);
      return this;
    }
    public APIRequestCreateVideo setGuide (String guide) {
      this.setParam("guide", guide);
      return this;
    }

    public APIRequestCreateVideo setGuideEnabled (Boolean guideEnabled) {
      this.setParam("guide_enabled", guideEnabled);
      return this;
    }
    public APIRequestCreateVideo setGuideEnabled (String guideEnabled) {
      this.setParam("guide_enabled", guideEnabled);
      return this;
    }

    public APIRequestCreateVideo setHasNickname (Boolean hasNickname) {
      this.setParam("has_nickname", hasNickname);
      return this;
    }
    public APIRequestCreateVideo setHasNickname (String hasNickname) {
      this.setParam("has_nickname", hasNickname);
      return this;
    }

    public APIRequestCreateVideo setHolidayCard (String holidayCard) {
      this.setParam("holiday_card", holidayCard);
      return this;
    }

    public APIRequestCreateVideo setInitialHeading (Long initialHeading) {
      this.setParam("initial_heading", initialHeading);
      return this;
    }
    public APIRequestCreateVideo setInitialHeading (String initialHeading) {
      this.setParam("initial_heading", initialHeading);
      return this;
    }

    public APIRequestCreateVideo setInitialPitch (Long initialPitch) {
      this.setParam("initial_pitch", initialPitch);
      return this;
    }
    public APIRequestCreateVideo setInitialPitch (String initialPitch) {
      this.setParam("initial_pitch", initialPitch);
      return this;
    }

    public APIRequestCreateVideo setInstantGameEntryPointData (String instantGameEntryPointData) {
      this.setParam("instant_game_entry_point_data", instantGameEntryPointData);
      return this;
    }

    public APIRequestCreateVideo setIsBoostIntended (Boolean isBoostIntended) {
      this.setParam("is_boost_intended", isBoostIntended);
      return this;
    }
    public APIRequestCreateVideo setIsBoostIntended (String isBoostIntended) {
      this.setParam("is_boost_intended", isBoostIntended);
      return this;
    }

    public APIRequestCreateVideo setIsExplicitShare (Boolean isExplicitShare) {
      this.setParam("is_explicit_share", isExplicitShare);
      return this;
    }
    public APIRequestCreateVideo setIsExplicitShare (String isExplicitShare) {
      this.setParam("is_explicit_share", isExplicitShare);
      return this;
    }

    public APIRequestCreateVideo setIsGroupLinkingPost (Boolean isGroupLinkingPost) {
      this.setParam("is_group_linking_post", isGroupLinkingPost);
      return this;
    }
    public APIRequestCreateVideo setIsGroupLinkingPost (String isGroupLinkingPost) {
      this.setParam("is_group_linking_post", isGroupLinkingPost);
      return this;
    }

    public APIRequestCreateVideo setIsVoiceClip (Boolean isVoiceClip) {
      this.setParam("is_voice_clip", isVoiceClip);
      return this;
    }
    public APIRequestCreateVideo setIsVoiceClip (String isVoiceClip) {
      this.setParam("is_voice_clip", isVoiceClip);
      return this;
    }

    public APIRequestCreateVideo setLocationSourceId (String locationSourceId) {
      this.setParam("location_source_id", locationSourceId);
      return this;
    }

    public APIRequestCreateVideo setManualPrivacy (Boolean manualPrivacy) {
      this.setParam("manual_privacy", manualPrivacy);
      return this;
    }
    public APIRequestCreateVideo setManualPrivacy (String manualPrivacy) {
      this.setParam("manual_privacy", manualPrivacy);
      return this;
    }

    public APIRequestCreateVideo setNoStory (Boolean noStory) {
      this.setParam("no_story", noStory);
      return this;
    }
    public APIRequestCreateVideo setNoStory (String noStory) {
      this.setParam("no_story", noStory);
      return this;
    }

    public APIRequestCreateVideo setOfferLikePostId (Long offerLikePostId) {
      this.setParam("offer_like_post_id", offerLikePostId);
      return this;
    }
    public APIRequestCreateVideo setOfferLikePostId (String offerLikePostId) {
      this.setParam("offer_like_post_id", offerLikePostId);
      return this;
    }

    public APIRequestCreateVideo setOgActionTypeId (String ogActionTypeId) {
      this.setParam("og_action_type_id", ogActionTypeId);
      return this;
    }

    public APIRequestCreateVideo setOgIconId (String ogIconId) {
      this.setParam("og_icon_id", ogIconId);
      return this;
    }

    public APIRequestCreateVideo setOgObjectId (String ogObjectId) {
      this.setParam("og_object_id", ogObjectId);
      return this;
    }

    public APIRequestCreateVideo setOgPhrase (String ogPhrase) {
      this.setParam("og_phrase", ogPhrase);
      return this;
    }

    public APIRequestCreateVideo setOgSuggestionMechanism (String ogSuggestionMechanism) {
      this.setParam("og_suggestion_mechanism", ogSuggestionMechanism);
      return this;
    }

    public APIRequestCreateVideo setOriginalFov (Long originalFov) {
      this.setParam("original_fov", originalFov);
      return this;
    }
    public APIRequestCreateVideo setOriginalFov (String originalFov) {
      this.setParam("original_fov", originalFov);
      return this;
    }

    public APIRequestCreateVideo setOriginalProjectionType (AdVideo.EnumOriginalProjectionType originalProjectionType) {
      this.setParam("original_projection_type", originalProjectionType);
      return this;
    }
    public APIRequestCreateVideo setOriginalProjectionType (String originalProjectionType) {
      this.setParam("original_projection_type", originalProjectionType);
      return this;
    }

    public APIRequestCreateVideo setPrivacy (String privacy) {
      this.setParam("privacy", privacy);
      return this;
    }

    public APIRequestCreateVideo setPublishEventId (Long publishEventId) {
      this.setParam("publish_event_id", publishEventId);
      return this;
    }
    public APIRequestCreateVideo setPublishEventId (String publishEventId) {
      this.setParam("publish_event_id", publishEventId);
      return this;
    }

    public APIRequestCreateVideo setReactModeMetadata (String reactModeMetadata) {
      this.setParam("react_mode_metadata", reactModeMetadata);
      return this;
    }

    public APIRequestCreateVideo setReferencedStickerId (String referencedStickerId) {
      this.setParam("referenced_sticker_id", referencedStickerId);
      return this;
    }

    public APIRequestCreateVideo setReplaceVideoId (String replaceVideoId) {
      this.setParam("replace_video_id", replaceVideoId);
      return this;
    }

    public APIRequestCreateVideo setSalesPromoId (Long salesPromoId) {
      this.setParam("sales_promo_id", salesPromoId);
      return this;
    }
    public APIRequestCreateVideo setSalesPromoId (String salesPromoId) {
      this.setParam("sales_promo_id", salesPromoId);
      return this;
    }

    public APIRequestCreateVideo setSlideshowSpec (Map<String, String> slideshowSpec) {
      this.setParam("slideshow_spec", slideshowSpec);
      return this;
    }
    public APIRequestCreateVideo setSlideshowSpec (String slideshowSpec) {
      this.setParam("slideshow_spec", slideshowSpec);
      return this;
    }

    public APIRequestCreateVideo setSource (String source) {
      this.setParam("source", source);
      return this;
    }

    public APIRequestCreateVideo setSpherical (Boolean spherical) {
      this.setParam("spherical", spherical);
      return this;
    }
    public APIRequestCreateVideo setSpherical (String spherical) {
      this.setParam("spherical", spherical);
      return this;
    }

    public APIRequestCreateVideo setSponsorId (String sponsorId) {
      this.setParam("sponsor_id", sponsorId);
      return this;
    }

    public APIRequestCreateVideo setStartOffset (Long startOffset) {
      this.setParam("start_offset", startOffset);
      return this;
    }
    public APIRequestCreateVideo setStartOffset (String startOffset) {
      this.setParam("start_offset", startOffset);
      return this;
    }

    public APIRequestCreateVideo setSwapMode (AdVideo.EnumSwapMode swapMode) {
      this.setParam("swap_mode", swapMode);
      return this;
    }
    public APIRequestCreateVideo setSwapMode (String swapMode) {
      this.setParam("swap_mode", swapMode);
      return this;
    }

    public APIRequestCreateVideo setTextFormatMetadata (String textFormatMetadata) {
      this.setParam("text_format_metadata", textFormatMetadata);
      return this;
    }

    public APIRequestCreateVideo setThrowbackCameraRollMedia (String throwbackCameraRollMedia) {
      this.setParam("throwback_camera_roll_media", throwbackCameraRollMedia);
      return this;
    }

    public APIRequestCreateVideo setThumb (File thumb) {
      this.setParam("thumb", thumb);
      return this;
    }
    public APIRequestCreateVideo setThumb (String thumb) {
      this.setParam("thumb", thumb);
      return this;
    }

    public APIRequestCreateVideo setTimeSinceOriginalPost (Long timeSinceOriginalPost) {
      this.setParam("time_since_original_post", timeSinceOriginalPost);
      return this;
    }
    public APIRequestCreateVideo setTimeSinceOriginalPost (String timeSinceOriginalPost) {
      this.setParam("time_since_original_post", timeSinceOriginalPost);
      return this;
    }

    public APIRequestCreateVideo setTitle (String title) {
      this.setParam("title", title);
      return this;
    }

    public APIRequestCreateVideo setTranscodeSettingProperties (String transcodeSettingProperties) {
      this.setParam("transcode_setting_properties", transcodeSettingProperties);
      return this;
    }

    public APIRequestCreateVideo setUnpublishedContentType (AdVideo.EnumUnpublishedContentType unpublishedContentType) {
      this.setParam("unpublished_content_type", unpublishedContentType);
      return this;
    }
    public APIRequestCreateVideo setUnpublishedContentType (String unpublishedContentType) {
      this.setParam("unpublished_content_type", unpublishedContentType);
      return this;
    }

    public APIRequestCreateVideo setUploadPhase (AdVideo.EnumUploadPhase uploadPhase) {
      this.setParam("upload_phase", uploadPhase);
      return this;
    }
    public APIRequestCreateVideo setUploadPhase (String uploadPhase) {
      this.setParam("upload_phase", uploadPhase);
      return this;
    }

    public APIRequestCreateVideo setUploadSessionId (String uploadSessionId) {
      this.setParam("upload_session_id", uploadSessionId);
      return this;
    }

    public APIRequestCreateVideo setUploadSettingProperties (String uploadSettingProperties) {
      this.setParam("upload_setting_properties", uploadSettingProperties);
      return this;
    }

    public APIRequestCreateVideo setVideoFileChunk (String videoFileChunk) {
      this.setParam("video_file_chunk", videoFileChunk);
      return this;
    }

    public APIRequestCreateVideo setVideoStartTimeMs (Long videoStartTimeMs) {
      this.setParam("video_start_time_ms", videoStartTimeMs);
      return this;
    }
    public APIRequestCreateVideo setVideoStartTimeMs (String videoStartTimeMs) {
      this.setParam("video_start_time_ms", videoStartTimeMs);
      return this;
    }

    public APIRequestCreateVideo setWaterfallId (String waterfallId) {
      this.setParam("waterfall_id", waterfallId);
      return this;
    }

    public APIRequestCreateVideo requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestCreateVideo requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateVideo requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestCreateVideo requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestCreateVideo requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestCreateVideo requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestDelete extends APIRequest<APINode> {

    APINode lastResponse = null;
    @Override
    public APINode getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
    };

    @Override
    public APINode parseResponse(String response, String header) throws APIException {
      return APINode.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public APINode execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public APINode execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<APINode> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<APINode> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, APINode>() {
           public APINode apply(ResponseWrapper result) {
             try {
               return APIRequestDelete.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestDelete(String nodeId, APIContext context) {
      super(context, nodeId, "/", "DELETE", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestDelete setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestDelete setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestDelete requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestDelete requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDelete requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestDelete requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestDelete requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestDelete requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static class APIRequestGet extends APIRequest<User> {

    User lastResponse = null;
    @Override
    public User getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
    };

    public static final String[] FIELDS = {
      "about",
      "address",
      "admin_notes",
      "age_range",
      "birthday",
      "can_review_measurement_request",
      "cover",
      "currency",
      "devices",
      "education",
      "email",
      "employee_number",
      "favorite_athletes",
      "favorite_teams",
      "first_name",
      "gender",
      "hometown",
      "id",
      "inspirational_people",
      "install_type",
      "installed",
      "interested_in",
      "is_famedeeplinkinguser",
      "is_shared_login",
      "is_verified",
      "labels",
      "languages",
      "last_name",
      "link",
      "local_news_megaphone_dismiss_status",
      "local_news_subscription_status",
      "locale",
      "location",
      "meeting_for",
      "middle_name",
      "name",
      "name_format",
      "payment_pricepoints",
      "political",
      "profile_pic",
      "public_key",
      "quotes",
      "relationship_status",
      "religion",
      "security_settings",
      "shared_login_upgrade_required_by",
      "short_name",
      "significant_other",
      "sports",
      "test_group",
      "third_party_id",
      "timezone",
      "token_for_business",
      "updated_time",
      "verified",
      "video_upload_limits",
      "viewer_can_send_gift",
      "website",
      "work",
    };

    @Override
    public User parseResponse(String response, String header) throws APIException {
      return User.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public User execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public User execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<User> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<User> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, User>() {
           public User apply(ResponseWrapper result) {
             try {
               return APIRequestGet.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestGet(String nodeId, APIContext context) {
      super(context, nodeId, "/", "GET", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestGet setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestGet setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestGet requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestGet requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGet requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestGet requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestGet requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestGet requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

    public APIRequestGet requestAboutField () {
      return this.requestAboutField(true);
    }
    public APIRequestGet requestAboutField (boolean value) {
      this.requestField("about", value);
      return this;
    }
    public APIRequestGet requestAddressField () {
      return this.requestAddressField(true);
    }
    public APIRequestGet requestAddressField (boolean value) {
      this.requestField("address", value);
      return this;
    }
    public APIRequestGet requestAdminNotesField () {
      return this.requestAdminNotesField(true);
    }
    public APIRequestGet requestAdminNotesField (boolean value) {
      this.requestField("admin_notes", value);
      return this;
    }
    public APIRequestGet requestAgeRangeField () {
      return this.requestAgeRangeField(true);
    }
    public APIRequestGet requestAgeRangeField (boolean value) {
      this.requestField("age_range", value);
      return this;
    }
    public APIRequestGet requestBirthdayField () {
      return this.requestBirthdayField(true);
    }
    public APIRequestGet requestBirthdayField (boolean value) {
      this.requestField("birthday", value);
      return this;
    }
    public APIRequestGet requestCanReviewMeasurementRequestField () {
      return this.requestCanReviewMeasurementRequestField(true);
    }
    public APIRequestGet requestCanReviewMeasurementRequestField (boolean value) {
      this.requestField("can_review_measurement_request", value);
      return this;
    }
    public APIRequestGet requestCoverField () {
      return this.requestCoverField(true);
    }
    public APIRequestGet requestCoverField (boolean value) {
      this.requestField("cover", value);
      return this;
    }
    public APIRequestGet requestCurrencyField () {
      return this.requestCurrencyField(true);
    }
    public APIRequestGet requestCurrencyField (boolean value) {
      this.requestField("currency", value);
      return this;
    }
    public APIRequestGet requestDevicesField () {
      return this.requestDevicesField(true);
    }
    public APIRequestGet requestDevicesField (boolean value) {
      this.requestField("devices", value);
      return this;
    }
    public APIRequestGet requestEducationField () {
      return this.requestEducationField(true);
    }
    public APIRequestGet requestEducationField (boolean value) {
      this.requestField("education", value);
      return this;
    }
    public APIRequestGet requestEmailField () {
      return this.requestEmailField(true);
    }
    public APIRequestGet requestEmailField (boolean value) {
      this.requestField("email", value);
      return this;
    }
    public APIRequestGet requestEmployeeNumberField () {
      return this.requestEmployeeNumberField(true);
    }
    public APIRequestGet requestEmployeeNumberField (boolean value) {
      this.requestField("employee_number", value);
      return this;
    }
    public APIRequestGet requestFavoriteAthletesField () {
      return this.requestFavoriteAthletesField(true);
    }
    public APIRequestGet requestFavoriteAthletesField (boolean value) {
      this.requestField("favorite_athletes", value);
      return this;
    }
    public APIRequestGet requestFavoriteTeamsField () {
      return this.requestFavoriteTeamsField(true);
    }
    public APIRequestGet requestFavoriteTeamsField (boolean value) {
      this.requestField("favorite_teams", value);
      return this;
    }
    public APIRequestGet requestFirstNameField () {
      return this.requestFirstNameField(true);
    }
    public APIRequestGet requestFirstNameField (boolean value) {
      this.requestField("first_name", value);
      return this;
    }
    public APIRequestGet requestGenderField () {
      return this.requestGenderField(true);
    }
    public APIRequestGet requestGenderField (boolean value) {
      this.requestField("gender", value);
      return this;
    }
    public APIRequestGet requestHometownField () {
      return this.requestHometownField(true);
    }
    public APIRequestGet requestHometownField (boolean value) {
      this.requestField("hometown", value);
      return this;
    }
    public APIRequestGet requestIdField () {
      return this.requestIdField(true);
    }
    public APIRequestGet requestIdField (boolean value) {
      this.requestField("id", value);
      return this;
    }
    public APIRequestGet requestInspirationalPeopleField () {
      return this.requestInspirationalPeopleField(true);
    }
    public APIRequestGet requestInspirationalPeopleField (boolean value) {
      this.requestField("inspirational_people", value);
      return this;
    }
    public APIRequestGet requestInstallTypeField () {
      return this.requestInstallTypeField(true);
    }
    public APIRequestGet requestInstallTypeField (boolean value) {
      this.requestField("install_type", value);
      return this;
    }
    public APIRequestGet requestInstalledField () {
      return this.requestInstalledField(true);
    }
    public APIRequestGet requestInstalledField (boolean value) {
      this.requestField("installed", value);
      return this;
    }
    public APIRequestGet requestInterestedInField () {
      return this.requestInterestedInField(true);
    }
    public APIRequestGet requestInterestedInField (boolean value) {
      this.requestField("interested_in", value);
      return this;
    }
    public APIRequestGet requestIsFamedeeplinkinguserField () {
      return this.requestIsFamedeeplinkinguserField(true);
    }
    public APIRequestGet requestIsFamedeeplinkinguserField (boolean value) {
      this.requestField("is_famedeeplinkinguser", value);
      return this;
    }
    public APIRequestGet requestIsSharedLoginField () {
      return this.requestIsSharedLoginField(true);
    }
    public APIRequestGet requestIsSharedLoginField (boolean value) {
      this.requestField("is_shared_login", value);
      return this;
    }
    public APIRequestGet requestIsVerifiedField () {
      return this.requestIsVerifiedField(true);
    }
    public APIRequestGet requestIsVerifiedField (boolean value) {
      this.requestField("is_verified", value);
      return this;
    }
    public APIRequestGet requestLabelsField () {
      return this.requestLabelsField(true);
    }
    public APIRequestGet requestLabelsField (boolean value) {
      this.requestField("labels", value);
      return this;
    }
    public APIRequestGet requestLanguagesField () {
      return this.requestLanguagesField(true);
    }
    public APIRequestGet requestLanguagesField (boolean value) {
      this.requestField("languages", value);
      return this;
    }
    public APIRequestGet requestLastNameField () {
      return this.requestLastNameField(true);
    }
    public APIRequestGet requestLastNameField (boolean value) {
      this.requestField("last_name", value);
      return this;
    }
    public APIRequestGet requestLinkField () {
      return this.requestLinkField(true);
    }
    public APIRequestGet requestLinkField (boolean value) {
      this.requestField("link", value);
      return this;
    }
    public APIRequestGet requestLocalNewsMegaphoneDismissStatusField () {
      return this.requestLocalNewsMegaphoneDismissStatusField(true);
    }
    public APIRequestGet requestLocalNewsMegaphoneDismissStatusField (boolean value) {
      this.requestField("local_news_megaphone_dismiss_status", value);
      return this;
    }
    public APIRequestGet requestLocalNewsSubscriptionStatusField () {
      return this.requestLocalNewsSubscriptionStatusField(true);
    }
    public APIRequestGet requestLocalNewsSubscriptionStatusField (boolean value) {
      this.requestField("local_news_subscription_status", value);
      return this;
    }
    public APIRequestGet requestLocaleField () {
      return this.requestLocaleField(true);
    }
    public APIRequestGet requestLocaleField (boolean value) {
      this.requestField("locale", value);
      return this;
    }
    public APIRequestGet requestLocationField () {
      return this.requestLocationField(true);
    }
    public APIRequestGet requestLocationField (boolean value) {
      this.requestField("location", value);
      return this;
    }
    public APIRequestGet requestMeetingForField () {
      return this.requestMeetingForField(true);
    }
    public APIRequestGet requestMeetingForField (boolean value) {
      this.requestField("meeting_for", value);
      return this;
    }
    public APIRequestGet requestMiddleNameField () {
      return this.requestMiddleNameField(true);
    }
    public APIRequestGet requestMiddleNameField (boolean value) {
      this.requestField("middle_name", value);
      return this;
    }
    public APIRequestGet requestNameField () {
      return this.requestNameField(true);
    }
    public APIRequestGet requestNameField (boolean value) {
      this.requestField("name", value);
      return this;
    }
    public APIRequestGet requestNameFormatField () {
      return this.requestNameFormatField(true);
    }
    public APIRequestGet requestNameFormatField (boolean value) {
      this.requestField("name_format", value);
      return this;
    }
    public APIRequestGet requestPaymentPricepointsField () {
      return this.requestPaymentPricepointsField(true);
    }
    public APIRequestGet requestPaymentPricepointsField (boolean value) {
      this.requestField("payment_pricepoints", value);
      return this;
    }
    public APIRequestGet requestPoliticalField () {
      return this.requestPoliticalField(true);
    }
    public APIRequestGet requestPoliticalField (boolean value) {
      this.requestField("political", value);
      return this;
    }
    public APIRequestGet requestProfilePicField () {
      return this.requestProfilePicField(true);
    }
    public APIRequestGet requestProfilePicField (boolean value) {
      this.requestField("profile_pic", value);
      return this;
    }
    public APIRequestGet requestPublicKeyField () {
      return this.requestPublicKeyField(true);
    }
    public APIRequestGet requestPublicKeyField (boolean value) {
      this.requestField("public_key", value);
      return this;
    }
    public APIRequestGet requestQuotesField () {
      return this.requestQuotesField(true);
    }
    public APIRequestGet requestQuotesField (boolean value) {
      this.requestField("quotes", value);
      return this;
    }
    public APIRequestGet requestRelationshipStatusField () {
      return this.requestRelationshipStatusField(true);
    }
    public APIRequestGet requestRelationshipStatusField (boolean value) {
      this.requestField("relationship_status", value);
      return this;
    }
    public APIRequestGet requestReligionField () {
      return this.requestReligionField(true);
    }
    public APIRequestGet requestReligionField (boolean value) {
      this.requestField("religion", value);
      return this;
    }
    public APIRequestGet requestSecuritySettingsField () {
      return this.requestSecuritySettingsField(true);
    }
    public APIRequestGet requestSecuritySettingsField (boolean value) {
      this.requestField("security_settings", value);
      return this;
    }
    public APIRequestGet requestSharedLoginUpgradeRequiredByField () {
      return this.requestSharedLoginUpgradeRequiredByField(true);
    }
    public APIRequestGet requestSharedLoginUpgradeRequiredByField (boolean value) {
      this.requestField("shared_login_upgrade_required_by", value);
      return this;
    }
    public APIRequestGet requestShortNameField () {
      return this.requestShortNameField(true);
    }
    public APIRequestGet requestShortNameField (boolean value) {
      this.requestField("short_name", value);
      return this;
    }
    public APIRequestGet requestSignificantOtherField () {
      return this.requestSignificantOtherField(true);
    }
    public APIRequestGet requestSignificantOtherField (boolean value) {
      this.requestField("significant_other", value);
      return this;
    }
    public APIRequestGet requestSportsField () {
      return this.requestSportsField(true);
    }
    public APIRequestGet requestSportsField (boolean value) {
      this.requestField("sports", value);
      return this;
    }
    public APIRequestGet requestTestGroupField () {
      return this.requestTestGroupField(true);
    }
    public APIRequestGet requestTestGroupField (boolean value) {
      this.requestField("test_group", value);
      return this;
    }
    public APIRequestGet requestThirdPartyIdField () {
      return this.requestThirdPartyIdField(true);
    }
    public APIRequestGet requestThirdPartyIdField (boolean value) {
      this.requestField("third_party_id", value);
      return this;
    }
    public APIRequestGet requestTimezoneField () {
      return this.requestTimezoneField(true);
    }
    public APIRequestGet requestTimezoneField (boolean value) {
      this.requestField("timezone", value);
      return this;
    }
    public APIRequestGet requestTokenForBusinessField () {
      return this.requestTokenForBusinessField(true);
    }
    public APIRequestGet requestTokenForBusinessField (boolean value) {
      this.requestField("token_for_business", value);
      return this;
    }
    public APIRequestGet requestUpdatedTimeField () {
      return this.requestUpdatedTimeField(true);
    }
    public APIRequestGet requestUpdatedTimeField (boolean value) {
      this.requestField("updated_time", value);
      return this;
    }
    public APIRequestGet requestVerifiedField () {
      return this.requestVerifiedField(true);
    }
    public APIRequestGet requestVerifiedField (boolean value) {
      this.requestField("verified", value);
      return this;
    }
    public APIRequestGet requestVideoUploadLimitsField () {
      return this.requestVideoUploadLimitsField(true);
    }
    public APIRequestGet requestVideoUploadLimitsField (boolean value) {
      this.requestField("video_upload_limits", value);
      return this;
    }
    public APIRequestGet requestViewerCanSendGiftField () {
      return this.requestViewerCanSendGiftField(true);
    }
    public APIRequestGet requestViewerCanSendGiftField (boolean value) {
      this.requestField("viewer_can_send_gift", value);
      return this;
    }
    public APIRequestGet requestWebsiteField () {
      return this.requestWebsiteField(true);
    }
    public APIRequestGet requestWebsiteField (boolean value) {
      this.requestField("website", value);
      return this;
    }
    public APIRequestGet requestWorkField () {
      return this.requestWorkField(true);
    }
    public APIRequestGet requestWorkField (boolean value) {
      this.requestField("work", value);
      return this;
    }
  }

  public static class APIRequestUpdate extends APIRequest<User> {

    User lastResponse = null;
    @Override
    public User getLastResponse() {
      return lastResponse;
    }
    public static final String[] PARAMS = {
      "emoji_color_pref",
      "firstname",
      "label_cohort",
      "lastname",
      "local_news_megaphone_dismiss_status",
      "local_news_subscription_status",
      "name",
      "password",
    };

    public static final String[] FIELDS = {
    };

    @Override
    public User parseResponse(String response, String header) throws APIException {
      return User.parseResponse(response, getContext(), this, header).head();
    }

    @Override
    public User execute() throws APIException {
      return execute(new HashMap<String, Object>());
    }

    @Override
    public User execute(Map<String, Object> extraParams) throws APIException {
      ResponseWrapper rw = executeInternal(extraParams);
      lastResponse = parseResponse(rw.getBody(), rw.getHeader());
      return lastResponse;
    }

    public ListenableFuture<User> executeAsync() throws APIException {
      return executeAsync(new HashMap<String, Object>());
    };

    public ListenableFuture<User> executeAsync(Map<String, Object> extraParams) throws APIException {
      return Futures.transform(
        executeAsyncInternal(extraParams),
        new Function<ResponseWrapper, User>() {
           public User apply(ResponseWrapper result) {
             try {
               return APIRequestUpdate.this.parseResponse(result.getBody(), result.getHeader());
             } catch (Exception e) {
               throw new RuntimeException(e);
             }
           }
         }
      );
    };

    public APIRequestUpdate(String nodeId, APIContext context) {
      super(context, nodeId, "/", "POST", Arrays.asList(PARAMS));
    }

    @Override
    public APIRequestUpdate setParam(String param, Object value) {
      setParamInternal(param, value);
      return this;
    }

    @Override
    public APIRequestUpdate setParams(Map<String, Object> params) {
      setParamsInternal(params);
      return this;
    }


    public APIRequestUpdate setEmojiColorPref (Long emojiColorPref) {
      this.setParam("emoji_color_pref", emojiColorPref);
      return this;
    }
    public APIRequestUpdate setEmojiColorPref (String emojiColorPref) {
      this.setParam("emoji_color_pref", emojiColorPref);
      return this;
    }

    public APIRequestUpdate setFirstname (String firstname) {
      this.setParam("firstname", firstname);
      return this;
    }

    public APIRequestUpdate setLabelCohort (Object labelCohort) {
      this.setParam("label_cohort", labelCohort);
      return this;
    }
    public APIRequestUpdate setLabelCohort (String labelCohort) {
      this.setParam("label_cohort", labelCohort);
      return this;
    }

    public APIRequestUpdate setLastname (String lastname) {
      this.setParam("lastname", lastname);
      return this;
    }

    public APIRequestUpdate setLocalNewsMegaphoneDismissStatus (User.EnumLocalNewsMegaphoneDismissStatus localNewsMegaphoneDismissStatus) {
      this.setParam("local_news_megaphone_dismiss_status", localNewsMegaphoneDismissStatus);
      return this;
    }
    public APIRequestUpdate setLocalNewsMegaphoneDismissStatus (String localNewsMegaphoneDismissStatus) {
      this.setParam("local_news_megaphone_dismiss_status", localNewsMegaphoneDismissStatus);
      return this;
    }

    public APIRequestUpdate setLocalNewsSubscriptionStatus (User.EnumLocalNewsSubscriptionStatus localNewsSubscriptionStatus) {
      this.setParam("local_news_subscription_status", localNewsSubscriptionStatus);
      return this;
    }
    public APIRequestUpdate setLocalNewsSubscriptionStatus (String localNewsSubscriptionStatus) {
      this.setParam("local_news_subscription_status", localNewsSubscriptionStatus);
      return this;
    }

    public APIRequestUpdate setName (String name) {
      this.setParam("name", name);
      return this;
    }

    public APIRequestUpdate setPassword (String password) {
      this.setParam("password", password);
      return this;
    }

    public APIRequestUpdate requestAllFields () {
      return this.requestAllFields(true);
    }

    public APIRequestUpdate requestAllFields (boolean value) {
      for (String field : FIELDS) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestUpdate requestFields (List<String> fields) {
      return this.requestFields(fields, true);
    }

    @Override
    public APIRequestUpdate requestFields (List<String> fields, boolean value) {
      for (String field : fields) {
        this.requestField(field, value);
      }
      return this;
    }

    @Override
    public APIRequestUpdate requestField (String field) {
      this.requestField(field, true);
      return this;
    }

    @Override
    public APIRequestUpdate requestField (String field, boolean value) {
      this.requestFieldInternal(field, value);
      return this;
    }

  }

  public static enum EnumTasks {
      @SerializedName("ADVERTISE")
      VALUE_ADVERTISE("ADVERTISE"),
      @SerializedName("ANALYZE")
      VALUE_ANALYZE("ANALYZE"),
      @SerializedName("CREATE_CONTENT")
      VALUE_CREATE_CONTENT("CREATE_CONTENT"),
      @SerializedName("MANAGE")
      VALUE_MANAGE("MANAGE"),
      @SerializedName("MANAGE_JOBS")
      VALUE_MANAGE_JOBS("MANAGE_JOBS"),
      @SerializedName("MODERATE")
      VALUE_MODERATE("MODERATE"),
      @SerializedName("MODERATE_COMMUNITY")
      VALUE_MODERATE_COMMUNITY("MODERATE_COMMUNITY"),
      @SerializedName("PAGES_MESSAGING")
      VALUE_PAGES_MESSAGING("PAGES_MESSAGING"),
      @SerializedName("PAGES_MESSAGING_SUBSCRIPTIONS")
      VALUE_PAGES_MESSAGING_SUBSCRIPTIONS("PAGES_MESSAGING_SUBSCRIPTIONS"),
      @SerializedName("READ_PAGE_MAILBOXES")
      VALUE_READ_PAGE_MAILBOXES("READ_PAGE_MAILBOXES"),
      @SerializedName("VIEW_MONETIZATION_INSIGHTS")
      VALUE_VIEW_MONETIZATION_INSIGHTS("VIEW_MONETIZATION_INSIGHTS"),
      NULL(null);

      private String value;

      private EnumTasks(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumLocalNewsMegaphoneDismissStatus {
      @SerializedName("NO")
      VALUE_NO("NO"),
      @SerializedName("YES")
      VALUE_YES("YES"),
      NULL(null);

      private String value;

      private EnumLocalNewsMegaphoneDismissStatus(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumLocalNewsSubscriptionStatus {
      @SerializedName("STATUS_OFF")
      VALUE_STATUS_OFF("STATUS_OFF"),
      @SerializedName("STATUS_ON")
      VALUE_STATUS_ON("STATUS_ON"),
      NULL(null);

      private String value;

      private EnumLocalNewsSubscriptionStatus(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumResumeType {
      @SerializedName("BOT_ACTION")
      VALUE_BOT_ACTION("BOT_ACTION"),
      @SerializedName("NATIVE")
      VALUE_NATIVE("NATIVE"),
      NULL(null);

      private String value;

      private EnumResumeType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumFiltering {
      @SerializedName("ema")
      VALUE_EMA("ema"),
      @SerializedName("groups")
      VALUE_GROUPS("groups"),
      @SerializedName("groups_social")
      VALUE_GROUPS_SOCIAL("groups_social"),
      NULL(null);

      private String value;

      private EnumFiltering(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumType {
      @SerializedName("content_update")
      VALUE_CONTENT_UPDATE("content_update"),
      @SerializedName("generic")
      VALUE_GENERIC("generic"),
      NULL(null);

      private String value;

      private EnumType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumServiceType {
      @SerializedName("AIM")
      VALUE_AIM("AIM"),
      @SerializedName("ASK_FM")
      VALUE_ASK_FM("ASK_FM"),
      @SerializedName("BBM")
      VALUE_BBM("BBM"),
      @SerializedName("BBM_PPID")
      VALUE_BBM_PPID("BBM_PPID"),
      @SerializedName("CYWORLD")
      VALUE_CYWORLD("CYWORLD"),
      @SerializedName("EBUDDY")
      VALUE_EBUDDY("EBUDDY"),
      @SerializedName("FOURSQUARE")
      VALUE_FOURSQUARE("FOURSQUARE"),
      @SerializedName("GADU")
      VALUE_GADU("GADU"),
      @SerializedName("GITHUB")
      VALUE_GITHUB("GITHUB"),
      @SerializedName("GROUPWISE")
      VALUE_GROUPWISE("GROUPWISE"),
      @SerializedName("GTALK")
      VALUE_GTALK("GTALK"),
      @SerializedName("HYVES")
      VALUE_HYVES("HYVES"),
      @SerializedName("ICLOUD")
      VALUE_ICLOUD("ICLOUD"),
      @SerializedName("ICQ")
      VALUE_ICQ("ICQ"),
      @SerializedName("INSTAGRAM")
      VALUE_INSTAGRAM("INSTAGRAM"),
      @SerializedName("JABBER")
      VALUE_JABBER("JABBER"),
      @SerializedName("KAKAOTALK")
      VALUE_KAKAOTALK("KAKAOTALK"),
      @SerializedName("KIK")
      VALUE_KIK("KIK"),
      @SerializedName("LINE")
      VALUE_LINE("LINE"),
      @SerializedName("LINKED_IN")
      VALUE_LINKED_IN("LINKED_IN"),
      @SerializedName("MAILRU")
      VALUE_MAILRU("MAILRU"),
      @SerializedName("MEDIUM")
      VALUE_MEDIUM("MEDIUM"),
      @SerializedName("MIXI")
      VALUE_MIXI("MIXI"),
      @SerializedName("MSN")
      VALUE_MSN("MSN"),
      @SerializedName("MYSPACE")
      VALUE_MYSPACE("MYSPACE"),
      @SerializedName("NATEON")
      VALUE_NATEON("NATEON"),
      @SerializedName("OK")
      VALUE_OK("OK"),
      @SerializedName("ORKUT")
      VALUE_ORKUT("ORKUT"),
      @SerializedName("OTHERS")
      VALUE_OTHERS("OTHERS"),
      @SerializedName("PINTEREST")
      VALUE_PINTEREST("PINTEREST"),
      @SerializedName("QIP")
      VALUE_QIP("QIP"),
      @SerializedName("QQ")
      VALUE_QQ("QQ"),
      @SerializedName("REDIFF_BOL")
      VALUE_REDIFF_BOL("REDIFF_BOL"),
      @SerializedName("SKYPE")
      VALUE_SKYPE("SKYPE"),
      @SerializedName("SNAPCHAT")
      VALUE_SNAPCHAT("SNAPCHAT"),
      @SerializedName("SOUND_CLOUD")
      VALUE_SOUND_CLOUD("SOUND_CLOUD"),
      @SerializedName("SPOTIFY")
      VALUE_SPOTIFY("SPOTIFY"),
      @SerializedName("TUMBLR")
      VALUE_TUMBLR("TUMBLR"),
      @SerializedName("TWITCH")
      VALUE_TWITCH("TWITCH"),
      @SerializedName("TWITTER")
      VALUE_TWITTER("TWITTER"),
      @SerializedName("VIMEO")
      VALUE_VIMEO("VIMEO"),
      @SerializedName("VKONTAKTE")
      VALUE_VKONTAKTE("VKONTAKTE"),
      @SerializedName("WECHAT")
      VALUE_WECHAT("WECHAT"),
      @SerializedName("WHATSAPP")
      VALUE_WHATSAPP("WHATSAPP"),
      @SerializedName("YAHOO")
      VALUE_YAHOO("YAHOO"),
      @SerializedName("YAHOO_JP")
      VALUE_YAHOO_JP("YAHOO_JP"),
      @SerializedName("YOU_TUBE")
      VALUE_YOU_TUBE("YOU_TUBE"),
      NULL(null);

      private String value;

      private EnumServiceType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumBackdatedTimeGranularity {
      @SerializedName("day")
      VALUE_DAY("day"),
      @SerializedName("hour")
      VALUE_HOUR("hour"),
      @SerializedName("min")
      VALUE_MIN("min"),
      @SerializedName("month")
      VALUE_MONTH("month"),
      @SerializedName("none")
      VALUE_NONE("none"),
      @SerializedName("year")
      VALUE_YEAR("year"),
      NULL(null);

      private String value;

      private EnumBackdatedTimeGranularity(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumCheckinEntryPoint {
      @SerializedName("BRANDING_CHECKIN")
      VALUE_BRANDING_CHECKIN("BRANDING_CHECKIN"),
      @SerializedName("BRANDING_OTHER")
      VALUE_BRANDING_OTHER("BRANDING_OTHER"),
      @SerializedName("BRANDING_PHOTO")
      VALUE_BRANDING_PHOTO("BRANDING_PHOTO"),
      @SerializedName("BRANDING_STATUS")
      VALUE_BRANDING_STATUS("BRANDING_STATUS"),
      NULL(null);

      private String value;

      private EnumCheckinEntryPoint(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumFormatting {
      @SerializedName("MARKDOWN")
      VALUE_MARKDOWN("MARKDOWN"),
      @SerializedName("PLAINTEXT")
      VALUE_PLAINTEXT("PLAINTEXT"),
      NULL(null);

      private String value;

      private EnumFormatting(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumPlaceAttachmentSetting {
      @SerializedName("1")
      VALUE_1("1"),
      @SerializedName("2")
      VALUE_2("2"),
      NULL(null);

      private String value;

      private EnumPlaceAttachmentSetting(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumPostSurfacesBlacklist {
      @SerializedName("1")
      VALUE_1("1"),
      @SerializedName("2")
      VALUE_2("2"),
      @SerializedName("3")
      VALUE_3("3"),
      @SerializedName("4")
      VALUE_4("4"),
      @SerializedName("5")
      VALUE_5("5"),
      NULL(null);

      private String value;

      private EnumPostSurfacesBlacklist(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumPostingToRedspace {
      @SerializedName("disabled")
      VALUE_DISABLED("disabled"),
      @SerializedName("enabled")
      VALUE_ENABLED("enabled"),
      NULL(null);

      private String value;

      private EnumPostingToRedspace(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumTargetSurface {
      @SerializedName("STORY")
      VALUE_STORY("STORY"),
      @SerializedName("TIMELINE")
      VALUE_TIMELINE("TIMELINE"),
      NULL(null);

      private String value;

      private EnumTargetSurface(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumUnpublishedContentType {
      @SerializedName("ADS_POST")
      VALUE_ADS_POST("ADS_POST"),
      @SerializedName("DRAFT")
      VALUE_DRAFT("DRAFT"),
      @SerializedName("INLINE_CREATED")
      VALUE_INLINE_CREATED("INLINE_CREATED"),
      @SerializedName("PUBLISHED")
      VALUE_PUBLISHED("PUBLISHED"),
      @SerializedName("SCHEDULED")
      VALUE_SCHEDULED("SCHEDULED"),
      NULL(null);

      private String value;

      private EnumUnpublishedContentType(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }

  public static enum EnumAction {
      @SerializedName("CONSUME")
      VALUE_CONSUME("CONSUME"),
      @SerializedName("DROP")
      VALUE_DROP("DROP"),
      @SerializedName("MARK")
      VALUE_MARK("MARK"),
      NULL(null);

      private String value;

      private EnumAction(String value) {
        this.value = value;
      }

      @Override
      public String toString() {
        return value;
      }
  }


  synchronized /*package*/ static Gson getGson() {
    if (gson != null) {
      return gson;
    } else {
      gson = new GsonBuilder()
        .excludeFieldsWithModifiers(Modifier.STATIC)
        .excludeFieldsWithModifiers(Modifier.PROTECTED)
        .disableHtmlEscaping()
        .create();
    }
    return gson;
  }

  public User copyFrom(User instance) {
    this.mAbout = instance.mAbout;
    this.mAddress = instance.mAddress;
    this.mAdminNotes = instance.mAdminNotes;
    this.mAgeRange = instance.mAgeRange;
    this.mBirthday = instance.mBirthday;
    this.mCanReviewMeasurementRequest = instance.mCanReviewMeasurementRequest;
    this.mCover = instance.mCover;
    this.mCurrency = instance.mCurrency;
    this.mDevices = instance.mDevices;
    this.mEducation = instance.mEducation;
    this.mEmail = instance.mEmail;
    this.mEmployeeNumber = instance.mEmployeeNumber;
    this.mFavoriteAthletes = instance.mFavoriteAthletes;
    this.mFavoriteTeams = instance.mFavoriteTeams;
    this.mFirstName = instance.mFirstName;
    this.mGender = instance.mGender;
    this.mHometown = instance.mHometown;
    this.mId = instance.mId;
    this.mInspirationalPeople = instance.mInspirationalPeople;
    this.mInstallType = instance.mInstallType;
    this.mInstalled = instance.mInstalled;
    this.mInterestedIn = instance.mInterestedIn;
    this.mIsFamedeeplinkinguser = instance.mIsFamedeeplinkinguser;
    this.mIsSharedLogin = instance.mIsSharedLogin;
    this.mIsVerified = instance.mIsVerified;
    this.mLabels = instance.mLabels;
    this.mLanguages = instance.mLanguages;
    this.mLastName = instance.mLastName;
    this.mLink = instance.mLink;
    this.mLocalNewsMegaphoneDismissStatus = instance.mLocalNewsMegaphoneDismissStatus;
    this.mLocalNewsSubscriptionStatus = instance.mLocalNewsSubscriptionStatus;
    this.mLocale = instance.mLocale;
    this.mLocation = instance.mLocation;
    this.mMeetingFor = instance.mMeetingFor;
    this.mMiddleName = instance.mMiddleName;
    this.mName = instance.mName;
    this.mNameFormat = instance.mNameFormat;
    this.mPaymentPricepoints = instance.mPaymentPricepoints;
    this.mPolitical = instance.mPolitical;
    this.mProfilePic = instance.mProfilePic;
    this.mPublicKey = instance.mPublicKey;
    this.mQuotes = instance.mQuotes;
    this.mRelationshipStatus = instance.mRelationshipStatus;
    this.mReligion = instance.mReligion;
    this.mSecuritySettings = instance.mSecuritySettings;
    this.mSharedLoginUpgradeRequiredBy = instance.mSharedLoginUpgradeRequiredBy;
    this.mShortName = instance.mShortName;
    this.mSignificantOther = instance.mSignificantOther;
    this.mSports = instance.mSports;
    this.mTestGroup = instance.mTestGroup;
    this.mThirdPartyId = instance.mThirdPartyId;
    this.mTimezone = instance.mTimezone;
    this.mTokenForBusiness = instance.mTokenForBusiness;
    this.mUpdatedTime = instance.mUpdatedTime;
    this.mVerified = instance.mVerified;
    this.mVideoUploadLimits = instance.mVideoUploadLimits;
    this.mViewerCanSendGift = instance.mViewerCanSendGift;
    this.mWebsite = instance.mWebsite;
    this.mWork = instance.mWork;
    this.context = instance.context;
    this.rawValue = instance.rawValue;
    return this;
  }

  public static APIRequest.ResponseParser<User> getParser() {
    return new APIRequest.ResponseParser<User>() {
      public APINodeList<User> parseResponse(String response, APIContext context, APIRequest<User> request, String header) throws MalformedResponseException {
        return User.parseResponse(response, context, request, header);
      }
    };
  }
}