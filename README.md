# CU (See You)

This is the Android application for my graduation project. It is an Android video selfie app that can replace the background in real time in the studio setting. Below is the user manual of this application. Good luck and have fun!

## Main View
The two buttons on the right can be used to select the effect to be used. Below are the buttons for taking pictures and recording and the background material list bar, so that the user can browse through the materials. 
!(https://github.com/YufanWangYuki/Android_CU/blob/master/images/4.jpg?raw=true)


## Background Replacement
There are two kinds of materials in total, pre-loaded materials and materials need to be downloaded from the cloud. The first 3 of them are preloaded, which means that users can use them directly. When clicking on different materials, the corresponding background image will be loaded. You can see the replacement result is pretty good and basically no obvious stuttering.

When the user clicks on one of the additional materials which have not been downloaded, the system will first download the picture from the cloud. Just wait for serval seconds, the system will finish downloading process and store the material in the "BGMaterials" folder in the user's mobile phone. After downloading, the downloaded images will be used to replace the background automatically. When the user clicks the same element next time, it does not need to be downloaded again.

## Take Photo
When pressing the saving photo button, the image will be saved in the album. 

## Video Recording
When users press on the recoding button, the application will start recoding. At this time, users can also change their background materials. When the recording button is pressed again, the video will be generated in the background and stored in the system.

## Video Bokeh
Instead of replacing the background, the background is blurred.

## Apply Filters
Filters can be switched when the user clicks on the main interface. Currently, four filters are provided.

## Style Tranfer
The style transfer function can harmonize the whole image based on the background material.

