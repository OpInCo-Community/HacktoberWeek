# ML Contributions

![ML Contributions]()
[![first-timers](https://img.shields.io/badge/first--timers-friendly-blue.svg?style=flat-square)](https://www.firsttimersonly.com/)
![PRs-welcome](https://img.shields.io/badge/PRs---welcome-green.svg?style=flat-square)

## **Machine Learning**
Machine learning (ML) is a field of inquiry devoted to understanding and building methods that 'learn', that is, methods that leverage data to improve performance on some set of tasks.[1] It is seen as a part of artificial intelligence. Machine learning algorithms build a model based on sample data, known as training data, in order to make predictions or decisions without being explicitly programmed to do so.[2] Machine learning algorithms are used in a wide variety of applications, such as in medicine, email filtering, speech recognition, and computer vision, where it is difficult or unfeasible to develop conventional algorithms to perform the needed tasks.

A subset of machine learning is closely related to computational statistics, which focuses on making predictions using computers, but not all machine learning is statistical learning. The study of mathematical optimization delivers methods, theory and application domains to the field of machine learning. Data mining is a related field of study, focusing on exploratory data analysis through unsupervised learning. Some implementations of machine learning use data and neural networks in a way that mimics the working of a biological brain.In its application across business problems, machine learning is also referred to as predictive analytics.

### **INSTALL JupyterLab**
You can Install JupyterLab using pip:
`pip install jupyterlab`
Once installed, launch JupyterLab with:
`jupyter-lab`

*Jupyter Notebook*
Install the classic Jupyter Notebook with:
`pip install notebook`

To run the notebook:
`jupyter notebook`
<br/>
<br/>

### **INSTALL FASTAI**
CPU build
Generally, pytorch GPU build should work fine on machines that don’t have a CUDA-capable GPU, and will just use the CPU. However, you can install CPU-only versions of Pytorch if needed with fastai.

#### *pip*

The pip ways is very easy:

 `pip install http://download.pytorch.org/whl/cpu/torch-1.0.0-cp36-cp36m-linux_x86_64.whl
 pip install fastai==1.0.61`
Just make sure to pick the correct torch wheel url, according to the needed platform, python and CUDA version, which you will find here.

#### *conda*

>The conda way is more involved. Since we have only a single fastai package that relies on the default pytorch package working with and without GPU environment, if you want to install something custom you will have to manually tweak the dependencies. This is explained in detail here. So follow the instructions there, but replace pytorch with pytorch-cpu, and torchvision with torchvision-cpu.

>Also, please note, that if you have an old GPU and pytorch fails because it can’t support it, you can still use the normal (GPU) pytorch build, by setting the env var CUDA_VISIBLE_DEVICES="", in which case pytorch will not try to check if you even have a GPU.
<br/>
<br/>

## **About HACTOBERWEEK: DAY 6**
Day 5 of the hacktoberweek series was all about Machine Learning.<br>
The experienced speakers, [Kartikey Rawat](https://www.linkedin.com/in/carrycooldude/) and [Anubhav Agrawal](https://www.linkedin.com/in/anubhav-agrawal-547a3419b/), gave valuable insights covering everything from what is Machine Learning, how to contribute as well as where to contribute with hands-on sessions.


### **Resources and where to contribute:**
To ***get you started*** check these orgs out  for quality contirbutions as well as first time PRs!<br>
To spread awareness, everything from how to contribute with live contributions and lists of organisations & projects are covered.

[OpInCo](https://github.com/OpInCo-Community) <br>
[Tensorflow](https://github.com/tensorflow) <br>
[PyTorch](https://github.com/pytorch) <br>
[FastAI](https://github.com/fastai)



*We welcome all, regardless of gender or background, and not only aim to develop an urge to learn and widen knowledge but to also cultivate a sense of community spirit!*
<br>There will always be an additional edge to this because the active contributors play a crucial role in any project and their experiences will undoubtedly give a good kickstart to the enthusiasts!




## **Contributing Guidelines**

Make sure that you -

1. Start working on the pull request if and only if you are assigned the complimentary issue.
2. Create a good and valid PR. Go through the [Code of Conduct](https://github.com/OpInCo-Community/HacktoberWeek/blob/main/CODE_OF_CONDUCT.md) and follow the templates to avoid spam.
3. Make sure to go through [CONTRIBUTING.md](https://github.com/OpInCo-Community/HacktoberWeek/blob/main/Technical-Documentaion/CONTRIBUTING.md) before raising a PR.


## **Connect With OpInCo!**
[![discord-opinco](https://img.shields.io/badge/-Discord-black?style=flat-square&logo=Discord)](https://discord.gg/uG3KwXkgfG)
[![instagram-opinco](https://img.shields.io/badge/-Instagram-black?style=flat-square&logo=Instagram)](https://www.instagram.com/opincocommunity/)
[![twitter-opinco](https://img.shields.io/badge/-Twitter-black?style=flat-square&logo=Twitter)](https://twitter.com/opincocommunity)
[![linkedIn-opinco](https://img.shields.io/badge/-LinkedIn-black?style=flat-square&logo=LinkedIn)](https://www.linkedin.com/company/opincocommunity/)
[![youtube-opinco](https://img.shields.io/badge/-YouTube-black?style=flat-square&logo=YouTube)](https://www.youtube.com/c/OpInCoCommunity)


## Contributors:
<a href = "https://github.com/OpInCo-Community/HacktoberWeek/graphs/contributors">
  <img src = "https://contrib.rocks/image?repo=OpInCo-Community/HacktoberWeek"/>
</a>
