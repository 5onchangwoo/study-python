package hello.core.member;

public class MemberServiceImpl implements MemberService {
                                //인터페이스 의존
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    //구현체도 의존하고 있음. >> DIP위반

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findByMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
