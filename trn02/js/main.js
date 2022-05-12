$(function () {
    /////////////////////////////////////////////////////

    $('.top_banner i').on('click', function () {
        $('.top_banner').slideUp(1000);
    });
    $('.main_slider').on('init reInit afterChange', function () {
        let current = $('.slick-current');
        current.addClass('on').siblings().removeClass('on');
    })
    $('.main_slider').slick({
        arrows: false,
        dots: true,
        autoplay: true,
        pauseOnHover: false,
        pauseOnFocus: false
    });


    $('.movie .dec i:nth-of-type(1)').on('click', function () {
        $('.movie video').trigger('play')
    });
    $('.movie .dec i:nth-of-type(2)').on('click', function () {
        $('.movie video').trigger('pause')
    });

    $("#myMovie").YTPlayer({
        videoURL: 'https://youtu.be/n9fAgIbApQ0',
        containment: '.utube',
        autoPlay: true, mute: true,
        startAt: 0, opacity: 1, showControls: false, playOnlyIfVisible: false
    });

    $('.utube i:nth-of-type(1)').on('click', function () {
        $('#myMovie').YTPPlay();
    });

    $('.utube i:nth-of-type(2)').on('click', function () {
        $('#myMovie').YTPPause();
    });


    $('.product_slider').slick({
        arrows: false,
        autoplay: true,
        autoplaySpeed: 1000,
        dots: true,
        slidesToShow: 5,
        centerMode: true,
        responsive: [
            {
                breakpoint: 768,
                settings: {
                    slidesToShow: 1,
                    centerMode: false
                }
            }
        ]
    })

    $('.product_list .s_left').on('click', function () {
        $('.product_slider').slick('slickPrev');
    })

    $('.product_list .s_right').on('click', function () {
        $('.product_slider').slick('slickNext');
    })

    $('.tab_menu>li').on('click', function () {
        var idx = $(this).index();
        $(this).addClass('on').siblings().removeClass('on');
        $('.tab_content>li').addClass('on').siblings().removeClass('on');
    })

    $('.footer #link').on('change', function () {
        var lik = $(this).val();
        if (lik) window.open(lik);
    })

    $('.mbtn').on('click', function () {
        $('nav').toggleClass('on');
        $(this).toggleClass('is-active');
    })
    ///////////////////////////////////////////
})