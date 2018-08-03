import tweepy
import json
from textblob import TextBlob
from flask import Flask
app = Flask(__name__)
app.debug= True
@app.route('/')
def index():
    return"<h1 style='color: red'>hello flask app</h1>"
@app.route('/name/<name>')
def show_name(name):
    return"<h1 style='color: red'>%s</h1>" %name
@app.route('/topic/<topic>')
def api(topic):
    counter=0
    consumer_key="***********************"
    consumer_secret="***********************"
    access_token="***********************"
    access_token_secret="***********************"
    auth=tweepy.OAuthHandler(consumer_key,consumer_secret)
    auth.set_access_token(access_token,access_token_secret)
    api=tweepy.API(auth)
    public_tweets=api.search(topic,count=100)
    ptive=0.0
    ntive=0.0
    neut=0.0

    for tweet in public_tweets:
        encoded=(tweet.text)
        en=encoded.encode("utf-8", errors='ignore')
        analysis=TextBlob(tweet.text)
        if analysis.sentiment.polarity > 0:
            ptive+=1
        elif analysis.sentiment.polarity < 0:
            ntive+=1
        elif analysis.sentiment.polarity == 0:
            neut+=1
    result_dict={'TotalTweets':100,'PossitiveTweets':ptive,'NegativeTweets':ntive,'NeutralTweets':neut}
    return json.dumps(result_dict)
    
if __name__=="__main__":
    app.run()
